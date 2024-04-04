package Sample;

import java.io.IOException;

import org.testng.annotations.Test;

public class FinalClass {
	


	@Test
	public void finalMethod() throws InterruptedException, IOException
	{

		BaseClass base=new BaseClass();
		base.BaseMethod();

		F77Page f77 = new F77Page(base.driver);
		LimitedPage Limited = new LimitedPage(base.driver);
		F99 f99 = new F99(base.driver);
		SquadronPage squadron = new SquadronPage(base.driver);
		ConfigurePage configure = new ConfigurePage(base.driver);
		TestRide testride = new TestRide(base.driver);
		Sign_In_Page signin = new Sign_In_Page(base.driver);
		EnquiryPage enquiry = new EnquiryPage(base.driver);
		FAQFeature FAQ = new FAQFeature(base.driver);
		LegalPage legal= new LegalPage(base.driver);
		PressPage press = new PressPage(base.driver);
		RetailPartnerShip retail = new RetailPartnerShip(base.driver);
		ContactPage  contact = new ContactPage(base.driver);
//		
//		f77.F77Method();
//		configure.ConfigureMethod();
		f99.F99Method();
		squadron.SquadronMethod();
		testride.TestRideMethod();
		//signin.SignInMethod();
		enquiry.EnquiryMethod();
		FAQ.FAQMethod();
		legal.LegalMethod();
	    press.PressMethod();
	    //retail.RetailPageMethod();
	    contact.ContactMethod();
		Limited.LimitedMethod();
	
		
		
		
		
		
		
		
	}

}
