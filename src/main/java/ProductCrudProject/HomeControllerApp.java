package ProductCrudProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeControllerApp{


	
	@RequestMapping("/app")
	public RedirectView view() {
		System.out.println("hellow wrold");
		RedirectView obj = new RedirectView();
		obj.setUrl("/productApp");
		return obj;
		
	}
	
	@RequestMapping("/productForm")
	public String formApp() {
		System.out.println("hellow");
		return "product-app.html";
	}
	

}
