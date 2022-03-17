package Task1.Homework;

public class Main {
    public static void main(String[] args) {
        Post post1 = new Post(1,1,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\'\n'suscipit recusandae consequuntur expedita et cum\'\n'reprehenderit molestiae ut ut quas totam\'\n'nostrum rerum est autem sunt rem eveniet architecto");
        Comment comment1 = new Comment(1,1,"id labore ex et quam laborum","Eliseo@gardner.biz","laudantium enim quasi est quidem magnam voluptate ipsam eos\'\n'tempora quo necessitatibus\'\n'dolor quam autem quasi\'\n'reiciendis et nam sapiente accusantium");
        System.out.println(post1);
        System.out.println(comment1);
    }
}