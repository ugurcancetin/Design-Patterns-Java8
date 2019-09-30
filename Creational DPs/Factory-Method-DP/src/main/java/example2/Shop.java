package example2;

import example2.pages.CartPage;
import example2.pages.ItemPage;
import example2.pages.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
