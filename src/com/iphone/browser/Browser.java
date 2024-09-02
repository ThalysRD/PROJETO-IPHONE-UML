package com.iphone.browser;

public class Browser {
    static String urlAtual = "deafault.com";
    static String previousUrl = "";
    static String nextUrl = "";
    private static boolean conectadoInternet (){
        boolean conectado = false;
        try {
        if (conectado == true){
            System.out.println("Está conectado a internet");
            return conectado;
        } else {
            throw new SemInternetExcepcion();
        }
   
    }
    catch (SemInternetExcepcion e){
        System.out.println("Sem acesso a internet");
        return conectado;
   
    }
}

    public static void abrirUrl (String url){
        previousUrl = urlAtual;
        urlAtual = url;
        conectadoInternet();
        if (!conectadoInternet()){
            return;
        }
        System.out.println("Exibindo o HTML recebido pela requisição feita no endereço: " + url.toLowerCase());
    }

    public static void refresh(){
        abrirUrl(urlAtual);
    }

    public static void back(){
        nextUrl = urlAtual;
        abrirUrl(previousUrl);
    }

    public static void next(){
        if (!nextUrl.equals("")){
            abrirUrl(nextUrl);
        } 
    }



}
