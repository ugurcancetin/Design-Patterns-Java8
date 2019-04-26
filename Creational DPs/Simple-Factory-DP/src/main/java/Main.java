public class Main {
    public static void main(String[] args) {
        Post newsPost = PostFactory.createPost("news");
        System.out.println(newsPost instanceof NewsPost);

        Post blogPost = PostFactory.createPost("blog");
        System.out.println(blogPost instanceof BlogPost);
    }
}
