class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/login/myoutfitLogin")
		"500"(view:'/error')
	}
}
