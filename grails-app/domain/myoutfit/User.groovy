package myoutfit

enum Gender{
    UNKNOW, MALE, FEMALE, NEUTRAL
}

class User {

	transient springSecurityService
    String email
    String firstName
    String lastName
    String password
    Date birthday
    String gender = Gender.UNKNOW
    String country
    Date createDate = new Date()
    Date lastLogin = new Date()
    String fbId
    String spotLight
    String privacy
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired

	static transients = ['springSecurityService']

	static constraints = {
		password blank: false
        email nullable: false
        firstName nullable: false
        lastName nullable: false
        password nullable: false
        birthday nullable: false
        country nullable: true
        fbId nullable: true
        spotLight nullable: true
        privacy nullable: true
	}

	static mapping = {
		password column: '`password`'
	}

	Set<Role> getAuthorities() {
		UserRole.findAllByUser(this).collect { it.role } as Set
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService.encodePassword(password)
	}
}
