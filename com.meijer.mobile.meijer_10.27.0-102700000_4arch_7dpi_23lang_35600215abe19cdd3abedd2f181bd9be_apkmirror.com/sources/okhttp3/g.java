package okhttp3;

import Qv.r;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u0000 M2\u00020\u0001:\u0002KJB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u0010\u0018\u001a\r\u0012\t\u0012\u00070\u0017¢\u0006\u0002\b\u000f0\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\bJ!\u0010#\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J1\u0010'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\bJ\u001f\u00105\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b7\u0010\bJ\u001f\u0010:\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b>\u0010\bJ\u001f\u0010A\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bC\u0010\bJ\u001f\u0010D\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\bD\u0010;J\u001f\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bE\u0010=J\u0017\u0010F\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bF\u0010\bJ\u001f\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bG\u0010=J\u0017\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bH\u0010\bJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bI\u0010BJ\u001f\u0010J\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bJ\u0010BJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bK\u0010\bJ\u001f\u0010M\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010L\u001a\u00020?H\u0016¢\u0006\u0004\bM\u0010BJ'\u0010Q\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010N\u001a\u00020)2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ)\u0010U\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010S\u001a\u00020?2\b\u0010T\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lokhttp3/g;", "", "<init>", "()V", "Lokhttp3/d;", "call", "", "f", "(Lokhttp3/d;)V", "Lokhttp3/HttpUrl;", "url", "q", "(Lokhttp3/d;Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "Lkotlin/jvm/JvmSuppressWildcards;", "proxies", "p", "(Lokhttp3/d;Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "domainName", "n", "(Lokhttp3/d;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "m", "(Lokhttp3/d;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "(Lokhttp3/d;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "E", "Lokhttp3/i;", "handshake", "D", "(Lokhttp3/d;Lokhttp3/i;)V", "LQv/r;", "protocol", "h", "(Lokhttp3/d;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LQv/r;)V", "Ljava/io/IOException;", "ioe", "i", "(Lokhttp3/d;Ljava/net/InetSocketAddress;Ljava/net/Proxy;LQv/r;Ljava/io/IOException;)V", "LQv/f;", "connection", "k", "(Lokhttp3/d;LQv/f;)V", "l", "v", "Lokhttp3/Request;", "request", "u", "(Lokhttp3/d;Lokhttp3/Request;)V", "s", "", "byteCount", "r", "(Lokhttp3/d;J)V", "t", "(Lokhttp3/d;Ljava/io/IOException;)V", "A", "Lokhttp3/Response;", "response", "z", "(Lokhttp3/d;Lokhttp3/Response;)V", "x", "w", "y", "d", "e", "g", "C", "b", "c", "cachedResponse", "a", "exception", "", "retry", "B", "(Lokhttp3/d;Ljava/io/IOException;Z)V", "networkResponse", "nextRequest", "o", "(Lokhttp3/d;Lokhttp3/Response;Lokhttp3/Request;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class g {

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final g f154358b = new a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lokhttp3/g$c;", "", "Lokhttp3/d;", "call", "Lokhttp3/g;", "a", "(Lokhttp3/d;)Lokhttp3/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        g a(d call);
    }

    public void A(d call) {
        Intrinsics.j(call, "call");
    }

    public void B(d call, IOException exception, boolean retry) {
        Intrinsics.j(call, "call");
        Intrinsics.j(exception, "exception");
    }

    public void C(d call, Response response) {
        Intrinsics.j(call, "call");
        Intrinsics.j(response, "response");
    }

    public void D(d call, i handshake) {
        Intrinsics.j(call, "call");
    }

    public void E(d call) {
        Intrinsics.j(call, "call");
    }

    public void a(d call, Response cachedResponse) {
        Intrinsics.j(call, "call");
        Intrinsics.j(cachedResponse, "cachedResponse");
    }

    public void b(d call, Response response) {
        Intrinsics.j(call, "call");
        Intrinsics.j(response, "response");
    }

    public void c(d call) {
        Intrinsics.j(call, "call");
    }

    public void d(d call) {
        Intrinsics.j(call, "call");
    }

    public void e(d call, IOException ioe) {
        Intrinsics.j(call, "call");
        Intrinsics.j(ioe, "ioe");
    }

    public void f(d call) {
        Intrinsics.j(call, "call");
    }

    public void g(d call) {
        Intrinsics.j(call, "call");
    }

    public void h(d call, InetSocketAddress inetSocketAddress, Proxy proxy, r protocol) {
        Intrinsics.j(call, "call");
        Intrinsics.j(inetSocketAddress, "inetSocketAddress");
        Intrinsics.j(proxy, "proxy");
    }

    public void i(d call, InetSocketAddress inetSocketAddress, Proxy proxy, r protocol, IOException ioe) {
        Intrinsics.j(call, "call");
        Intrinsics.j(inetSocketAddress, "inetSocketAddress");
        Intrinsics.j(proxy, "proxy");
        Intrinsics.j(ioe, "ioe");
    }

    public void j(d call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        Intrinsics.j(call, "call");
        Intrinsics.j(inetSocketAddress, "inetSocketAddress");
        Intrinsics.j(proxy, "proxy");
    }

    public void k(d call, Qv.f connection) {
        Intrinsics.j(call, "call");
        Intrinsics.j(connection, "connection");
    }

    public void l(d call, Qv.f connection) {
        Intrinsics.j(call, "call");
        Intrinsics.j(connection, "connection");
    }

    public void m(d call, String domainName, List<InetAddress> inetAddressList) {
        Intrinsics.j(call, "call");
        Intrinsics.j(domainName, "domainName");
        Intrinsics.j(inetAddressList, "inetAddressList");
    }

    public void n(d call, String domainName) {
        Intrinsics.j(call, "call");
        Intrinsics.j(domainName, "domainName");
    }

    public void o(d call, Response networkResponse, Request nextRequest) {
        Intrinsics.j(call, "call");
        Intrinsics.j(networkResponse, "networkResponse");
    }

    public void p(d call, HttpUrl url, List<Proxy> proxies) {
        Intrinsics.j(call, "call");
        Intrinsics.j(url, "url");
        Intrinsics.j(proxies, "proxies");
    }

    public void q(d call, HttpUrl url) {
        Intrinsics.j(call, "call");
        Intrinsics.j(url, "url");
    }

    public void r(d call, long byteCount) {
        Intrinsics.j(call, "call");
    }

    public void s(d call) {
        Intrinsics.j(call, "call");
    }

    public void t(d call, IOException ioe) {
        Intrinsics.j(call, "call");
        Intrinsics.j(ioe, "ioe");
    }

    public void u(d call, Request request) {
        Intrinsics.j(call, "call");
        Intrinsics.j(request, "request");
    }

    public void v(d call) {
        Intrinsics.j(call, "call");
    }

    public void w(d call, long byteCount) {
        Intrinsics.j(call, "call");
    }

    public void x(d call) {
        Intrinsics.j(call, "call");
    }

    public void y(d call, IOException ioe) {
        Intrinsics.j(call, "call");
        Intrinsics.j(ioe, "ioe");
    }

    public void z(d call, Response response) {
        Intrinsics.j(call, "call");
        Intrinsics.j(response, "response");
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/g$a", "Lokhttp3/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends g {
        a() {
        }
    }
}
