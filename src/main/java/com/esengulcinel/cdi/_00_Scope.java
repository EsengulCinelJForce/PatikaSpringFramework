package com.esengulcinel.cdi;


//Scope yapısı nedir? ne için kullanılır?
//Kapsam. Oluşturduğumuz objenin yaşam süresini belirler.
//Performansımızı etkiler.

import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

@Named   //cdi beans yapısı için
//@ApplicationScoped //bütün uyguluma boyunca çalışır. SErver kapatılırsa kapanır.
//@RequestScoped // bir istek boyunca yaşar. cevabı verir sonra ölür. 1 istek boyunca
//@SessionScoped //bir kullanıcı için yaşar ancak logout olduğu zaman ölür.

@Dependent //bukelemon. bulunmuş olduğu yapı hangi scope ise ona uyum sağlıyor.
            //çağırdığımız yere göre

@ConversationScoped //belli istek boyunca yaşar.
                     // Örn. bir ürünü sepete ekledikten sonra ödeme yaptıktan sonra ürünün orda durmasının bir anlamı yok.
                    //sonra ürün ölsün
public class _00_Scope {

}
