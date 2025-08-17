package Vv;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020!H&¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H&¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b'\u0010 J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020!H&¢\u0006\u0004\b(\u0010#J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020!H&¢\u0006\u0004\b)\u0010#J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020!H&¢\u0006\u0004\b*\u0010#J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020!H&¢\u0006\u0004\b+\u0010#J\u000f\u0010-\u001a\u00020,H&¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020,H&¢\u0006\u0004\b/\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b0\u00101J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u00103\u001a\u000202H&¢\u0006\u0004\b\u001c\u00104J%\u00108\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\f\u00107\u001a\b\u0012\u0004\u0012\u00020605H&¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:H&¢\u0006\u0004\b<\u0010=J%\u0010@\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>05H&¢\u0006\u0004\b@\u0010A¨\u0006BÀ\u0006\u0003"}, d2 = {"LVv/h;", "", "LVv/f;", "connectPlan", "", "f", "(LVv/f;)V", "m", "LQv/s;", PlaceTypes.ROUTE, "k", "(LQv/s;)V", "d", "s", "()V", "Lokhttp3/i;", "handshake", "p", "(Lokhttp3/i;)V", "LQv/r;", "protocol", "u", "(LQv/s;LQv/r;)V", "LQv/f;", "connection", "j", "(LQv/f;LQv/s;)V", "Ljava/io/IOException;", "e", "i", "(LQv/s;LQv/r;Ljava/io/IOException;)V", "a", "(LQv/f;)V", "LVv/p;", "c", "(LVv/p;)V", "Ljava/net/Socket;", "t", "()Ljava/net/Socket;", "n", "h", "r", "w", "q", "", "l", "()Z", "isCanceled", "v", "()LVv/p;", "Lokhttp3/HttpUrl;", "url", "(Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "proxies", "g", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "socketHost", "o", "(Ljava/lang/String;)V", "Ljava/net/InetAddress;", "result", "b", "(Ljava/lang/String;Ljava/util/List;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface h {
    void a(Qv.f connection);

    void b(String socketHost, List<? extends InetAddress> result);

    void c(p connection);

    void d(Qv.s route);

    void e(HttpUrl url);

    void f(f connectPlan);

    void g(HttpUrl url, List<? extends Proxy> proxies);

    void h(p connection);

    void i(Qv.s route, Qv.r protocol, IOException e10);

    boolean isCanceled();

    void j(Qv.f connection, Qv.s route);

    void k(Qv.s route);

    boolean l();

    void m(f connectPlan);

    void n(Qv.f connection);

    void o(String socketHost);

    void p(okhttp3.i handshake);

    void q(p connection);

    void r(p connection);

    void s();

    Socket t();

    void u(Qv.s route, Qv.r protocol);

    p v();

    void w(p connection);
}
