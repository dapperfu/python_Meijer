package Rv;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b'\u0010 J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020!H&¢\u0006\u0004\b(\u0010#J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020!H&¢\u0006\u0004\b)\u0010#J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020!H&¢\u0006\u0004\b*\u0010#J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020!H&¢\u0006\u0004\b+\u0010#J\u000f\u0010-\u001a\u00020,H&¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020,H&¢\u0006\u0004\b/\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00042\u0006\u00103\u001a\u000202H&¢\u0006\u0004\b4\u00105J%\u0010\u001c\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\f\u00108\u001a\b\u0012\u0004\u0012\u00020706H&¢\u0006\u0004\b\u001c\u00109J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:H&¢\u0006\u0004\b<\u0010=J%\u0010@\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>06H&¢\u0006\u0004\b@\u0010A¨\u0006BÀ\u0006\u0003"}, d2 = {"LRv/h;", "", "LRv/f;", "connectPlan", "", "a", "(LRv/f;)V", "k", "LMv/s;", PlaceTypes.ROUTE, "s", "(LMv/s;)V", "h", "q", "()V", "Lokhttp3/i;", "handshake", "n", "(Lokhttp3/i;)V", "LMv/r;", "protocol", "l", "(LMv/s;LMv/r;)V", "LMv/f;", "connection", "p", "(LMv/f;LMv/s;)V", "Ljava/io/IOException;", "e", "u", "(LMv/s;LMv/r;Ljava/io/IOException;)V", "f", "(LMv/f;)V", "LRv/p;", "o", "(LRv/p;)V", "Ljava/net/Socket;", "r", "()Ljava/net/Socket;", "v", "c", "g", "w", "j", "", "i", "()Z", "isCanceled", "t", "()LRv/p;", "Lokhttp3/HttpUrl;", "url", "d", "(Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "proxies", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "socketHost", "m", "(Ljava/lang/String;)V", "Ljava/net/InetAddress;", "result", "b", "(Ljava/lang/String;Ljava/util/List;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface h {
    void a(f connectPlan);

    void b(String socketHost, List<? extends InetAddress> result);

    void c(p connection);

    void d(HttpUrl url);

    void e(HttpUrl url, List<? extends Proxy> proxies);

    void f(Mv.f connection);

    void g(p connection);

    void h(Mv.s route);

    boolean i();

    boolean isCanceled();

    void j(p connection);

    void k(f connectPlan);

    void l(Mv.s route, Mv.r protocol);

    void m(String socketHost);

    void n(okhttp3.i handshake);

    void o(p connection);

    void p(Mv.f connection, Mv.s route);

    void q();

    Socket r();

    void s(Mv.s route);

    p t();

    void u(Mv.s route, Mv.r protocol, IOException e10);

    void v(Mv.f connection);

    void w(p connection);
}
