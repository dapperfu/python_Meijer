package Rv;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J)\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\f2\u0006\u0010$\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b/\u0010(J\u0017\u00100\u001a\u00020\f2\u0006\u0010$\u001a\u00020)H\u0016¢\u0006\u0004\b0\u0010+J\u0017\u00101\u001a\u00020\f2\u0006\u0010$\u001a\u00020)H\u0016¢\u0006\u0004\b1\u0010+J\u0017\u00102\u001a\u00020\f2\u0006\u0010$\u001a\u00020)H\u0016¢\u0006\u0004\b2\u0010+J\u0017\u00103\u001a\u00020\f2\u0006\u0010$\u001a\u00020)H\u0016¢\u0006\u0004\b3\u0010+J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000204H\u0016¢\u0006\u0004\b7\u00106J\u0011\u00108\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J%\u0010\u0018\u001a\u00020\f2\u0006\u0010;\u001a\u00020:2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0016¢\u0006\u0004\b\u0018\u0010AJ\u0017\u0010D\u001a\u00020\f2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ%\u0010H\u001a\u00020\f2\u0006\u0010C\u001a\u00020B2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0>H\u0016¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010LR\u0014\u0010P\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"LRv/b;", "LRv/h;", "LRv/o;", "call", "LRv/g;", "poolConnectionListener", "LSv/g;", "chain", "<init>", "(LRv/o;LRv/g;LSv/g;)V", "LRv/f;", "connectPlan", "", "a", "(LRv/f;)V", "k", "LMv/s;", PlaceTypes.ROUTE, "s", "(LMv/s;)V", "h", "LMv/r;", "protocol", "Ljava/io/IOException;", "e", "u", "(LMv/s;LMv/r;Ljava/io/IOException;)V", "q", "()V", "Lokhttp3/i;", "handshake", "n", "(Lokhttp3/i;)V", "l", "(LMv/s;LMv/r;)V", "LMv/f;", "connection", "p", "(LMv/f;LMv/s;)V", "f", "(LMv/f;)V", "LRv/p;", "o", "(LRv/p;)V", "Ljava/net/Socket;", "r", "()Ljava/net/Socket;", "v", "c", "g", "w", "j", "", "i", "()Z", "isCanceled", "t", "()LRv/p;", "Lokhttp3/HttpUrl;", "url", "d", "(Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "proxies", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "socketHost", "m", "(Ljava/lang/String;)V", "Ljava/net/InetAddress;", "result", "b", "(Ljava/lang/String;Ljava/util/List;)V", "LRv/o;", "LRv/g;", "LSv/g;", "Lokhttp3/g;", "x", "()Lokhttp3/g;", "eventListener", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o call;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g poolConnectionListener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Sv.g chain;

    public b(o call, g poolConnectionListener, Sv.g chain) {
        Intrinsics.j(call, "call");
        Intrinsics.j(poolConnectionListener, "poolConnectionListener");
        Intrinsics.j(chain, "chain");
        this.call = call;
        this.poolConnectionListener = poolConnectionListener;
        this.chain = chain;
    }

    private final okhttp3.g x() {
        return this.call.getEventListener();
    }

    @Override // Rv.h
    public void a(f connectPlan) {
        Intrinsics.j(connectPlan, "connectPlan");
        this.call.p().add(connectPlan);
    }

    @Override // Rv.h
    public void b(String socketHost, List<? extends InetAddress> result) {
        Intrinsics.j(socketHost, "socketHost");
        Intrinsics.j(result, "result");
        x().m(this.call, socketHost, result);
    }

    @Override // Rv.h
    public void c(p connection) {
        Intrinsics.j(connection, "connection");
        connection.getConnectionListener().e(connection, this.call);
    }

    @Override // Rv.h
    public void d(HttpUrl url) {
        Intrinsics.j(url, "url");
        x().q(this.call, url);
    }

    @Override // Rv.h
    public void e(HttpUrl url, List<? extends Proxy> proxies) {
        Intrinsics.j(url, "url");
        Intrinsics.j(proxies, "proxies");
        x().p(this.call, url, proxies);
    }

    @Override // Rv.h
    public void f(Mv.f connection) {
        Intrinsics.j(connection, "connection");
        x().k(this.call, connection);
    }

    @Override // Rv.h
    public void g(p connection) {
        Intrinsics.j(connection, "connection");
        connection.getConnectionListener().g(connection, this.call);
    }

    @Override // Rv.h
    public void h(Mv.s route) {
        Intrinsics.j(route, "route");
        x().j(this.call, route.getSocketAddress(), route.getProxy());
        this.poolConnectionListener.d(route, this.call);
    }

    @Override // Rv.h
    public boolean i() {
        return !Intrinsics.e(this.chain.getRequest().getMethod(), "GET");
    }

    @Override // Rv.h
    public boolean isCanceled() {
        return this.call.getCanceled();
    }

    @Override // Rv.h
    public void j(p connection) {
        Intrinsics.j(connection, "connection");
        connection.getConnectionListener().h(connection);
    }

    @Override // Rv.h
    public void k(f connectPlan) {
        Intrinsics.j(connectPlan, "connectPlan");
        this.call.p().remove(connectPlan);
    }

    @Override // Rv.h
    public void l(Mv.s route, Mv.r protocol) {
        Intrinsics.j(route, "route");
        x().h(this.call, route.getSocketAddress(), route.getProxy(), protocol);
    }

    @Override // Rv.h
    public void m(String socketHost) {
        Intrinsics.j(socketHost, "socketHost");
        x().n(this.call, socketHost);
    }

    @Override // Rv.h
    public void o(p connection) {
        Intrinsics.j(connection, "connection");
        this.call.c(connection);
    }

    @Override // Rv.h
    public void p(Mv.f connection, Mv.s route) {
        Intrinsics.j(connection, "connection");
        Intrinsics.j(route, "route");
        this.poolConnectionListener.b(connection, route, this.call);
    }

    @Override // Rv.h
    public Socket r() {
        return this.call.w();
    }

    @Override // Rv.h
    public void s(Mv.s route) {
        Intrinsics.j(route, "route");
        this.call.getClient().getRouteDatabase().a(route);
    }

    @Override // Rv.h
    public p t() {
        return this.call.getConnection();
    }

    @Override // Rv.h
    public void u(Mv.s route, Mv.r protocol, IOException e10) {
        Intrinsics.j(route, "route");
        Intrinsics.j(e10, "e");
        x().i(this.call, route.getSocketAddress(), route.getProxy(), null, e10);
        this.poolConnectionListener.c(route, this.call, e10);
    }

    @Override // Rv.h
    public void v(Mv.f connection) {
        Intrinsics.j(connection, "connection");
        x().l(this.call, connection);
    }

    @Override // Rv.h
    public void w(p connection) {
        Intrinsics.j(connection, "connection");
        connection.getConnectionListener().f(connection);
    }

    @Override // Rv.h
    public void n(okhttp3.i handshake) {
        x().D(this.call, handshake);
    }

    @Override // Rv.h
    public void q() {
        x().E(this.call);
    }
}
