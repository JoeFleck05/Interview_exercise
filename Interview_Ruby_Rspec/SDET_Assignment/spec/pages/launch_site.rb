class LaunchSite

	def initialize(browser)
		@browser = browser
	end
	
	def launch(site)
		@browser.goto site
	end
	
end