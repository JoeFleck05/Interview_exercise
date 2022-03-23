require 'spec_helper.rb'
require 'pages/launch_site.rb'
require 'pages/currency_converter_page.rb'

describe "Currency converter" do
  
  before do
  	site_url = 'https://www1.oanda.com/currency/converter/'
  	@site = LaunchSite.new(@browser)
  	@site.launch(site_url)
  	@currency_converter_page = CurrencyConverterPage.new(@browser)
  	@expected_converter_amount_eur = '15.5808'
  	@expected_converter_amount_gbp = '9.19066'
  end

  it "CAD for the 'Currency I have' and EUR 'Currency I want' confirm conversion" do
	@currency_converter_page.quote_currency_caret.click
	@currency_converter_page.quote_country_to_select('CAD')
	@currency_converter_page.base_currency_caret.click
	@currency_converter_page.base_country_to_select('EUR')
  	@currency_converter_page.currency_i_have_textfield.set '23.00'
  	expect((@currency_converter_page.currency_i_want_textfield.value).empty?).to be false
  end

  it "BZD for the 'Currency I have' and GBP 'Currency I want' confirm conversion" do
	@currency_converter_page.quote_currency_caret.click
	@currency_converter_page.quote_country_to_select('BZD')
	@currency_converter_page.base_currency_caret.click
	@currency_converter_page.base_country_to_select('GBP')
  	@currency_converter_page.currency_i_have_textfield.set '23.00'
  	expect((@currency_converter_page.currency_i_want_textfield.value).empty?).to be false
  end

  describe "Flipper testing" do
  	before do 
	  	@currency_converter_page.quote_currency_caret.click
		@currency_converter_page.quote_country_to_select('BZD')
		@currency_converter_page.base_currency_caret.click
		@currency_converter_page.base_country_to_select('GBP')
  		@currency_converter_page.currency_i_have_textfield.set '25.44'
  	end
  	
  	it "using flipper image & confirm countries switch" do
		before_i_want_country = @currency_converter_page.base_currency.text
	  	@currency_converter_page.flipper_image.click
	  	after_i_want_country = @currency_converter_page.base_currency.text
  		expect(before_i_want_country != after_i_want_country).to be true
	  	expect(before_i_want_country != after_i_want_country).to be true
  	end

	it "flipper image & confirm conversion changes" do
  		before_i_want_currency_amount = @currency_converter_page.currency_i_have_textfield.value
	  	@currency_converter_page.flipper_image.click
  		after_i_want_currency_amount = @currency_converter_page.currency_i_have_textfield.value
  		expect(before_i_want_currency_amount == after_i_want_currency_amount).to be true
  	end
  end
  
end
