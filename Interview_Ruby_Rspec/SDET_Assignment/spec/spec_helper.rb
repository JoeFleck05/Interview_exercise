require 'rspec'
require 'watir'
require 'webdrivers'
require 'watirspec'

RSpec.configure do |config|

    config.before :all do
        @browser = Watir::Browser.new
    end
    
   config.after :all do
      @browser.close if @browser
   end
   
end
