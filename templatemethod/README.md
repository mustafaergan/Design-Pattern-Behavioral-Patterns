Soyut sınıf üzerinde genel anlamıyla yapılacaklar işlemleri yapıp bazı işlevlerin alt sınıflara devredilmesi sağlayan patern diyebiliriz.

Örneğin database işlemleri var bağlantı açma vs. gibi işlemleri soyut sınıf üzerinden yapılıp insert işlemi ilgili sınıf üzerinden yapılabilir.


Java:

All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and  java.io.Writer.


All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and  java.util.AbstractMap.


javax.servlet.http.HttpServlet, all the doXXX() methods by default send a HTTP 405 "Method Not Allowed" error as a response. You're free to override any of them.