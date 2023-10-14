package lab6;

public class Lab64 {
    public static void main(String[] args) {
       /* String url = "https://google.com";
        Check http OR https; domain name, .com OR .net*/
        String url = "https://google.net";
        //initialize 2 boolean variable
        boolean isHttps;
        boolean isComDomain;

        isHttps=url.contains("https://");
        isComDomain=url.contains(".com");
        // check domain is http:// or https://
        if(isHttps)
        {
            System.out.println("Your domain is https:");
        }
        else {
            System.out.println("Your domain is http:");

        }
        // check domain name
        if(isComDomain)
        {
            System.out.println("Your domain is .com");
        }
        else {
            System.out.println("Your domain is .net");

        }
    }
}
