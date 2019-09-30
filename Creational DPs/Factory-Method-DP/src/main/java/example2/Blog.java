package example2;

import example2.pages.AboutPage;
import example2.pages.CommentPage;
import example2.pages.ContactPage;
import example2.pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
