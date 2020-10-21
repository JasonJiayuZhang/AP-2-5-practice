public static void baffle() {
 System.out.print("wug");
 ping();
}

public static void ping() {
 System.out.println(".");
 baffle();
}



//When ping is done, baffle is invoked and baffle returns ping and ping returns baffle over and over again and after 2000 time, Java declares stackoverflow.