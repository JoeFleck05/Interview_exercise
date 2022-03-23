class CurrencyConverterPage
	
	def initialize(browser)
		@browser = browser
	end
	
	def currency_i_have_selector
		@browser.input(id: 'quote_currency_input')
	end
	
	def quote_currency_caret
		@browser.div(id: 'quote_currency_caret')
	end
	
	def base_currency_caret
		@browser.div(id: 'base_currency_caret')
	end
	
	def quote_country_to_select(country)
		@browser.text_field(id: 'quote_currency_input').set country
		@browser.text_field(id: 'quote_currency_input').send_keys :enter
	end

	def base_country_to_select(country)
		@browser.text_field(id: 'base_currency_input').set country
		@browser.text_field(id: 'base_currency_input').send_keys :enter
	end
	
	def base_currency
		@browser.div(id: 'base_currency_selector')
	end 
	
	def quote_currency
		@browser.div(id: 'quote_currency')
	end
		
	def currency_i_have_textfield
		@browser.text_field(id: 'quote_amount_input')
	end	
	
	def currency_i_want_textfield
		@browser.text_field(id: 'base_amount_input')
	end
	
	def currency_i_want_selector
		@browser.input(id: 'base_currency_input')
	end

	def flipper_image
		@browser.img(class: 'flipper_arrows')
	end
	
end