package Vv;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J)\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\f2\u0006\u0010$\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b/\u0010(J\u0017\u00100\u001a\u00020\f2\u0006\u0010$\u001a\u00020)H\u0016¢\u0006\u0004\b0\u0010+J\u0017\u00101\u001a\u00020\f2\u0006\u0010$\u001a\u00020)H\u0016¢\u0006\u0004\b1\u0010+J\u0017\u00102\u001a\u00020\f2\u0006\u0010$\u001a\u00020)H\u0016¢\u0006\u0004\b2\u0010+J\u0017\u00103\u001a\u00020\f2\u0006\u0010$\u001a\u00020)H\u0016¢\u0006\u0004\b3\u0010+J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000204H\u0016¢\u0006\u0004\b7\u00106J\u0011\u00108\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b\u0018\u0010<J%\u0010@\u001a\u00020\f2\u0006\u0010;\u001a\u00020:2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\f2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ%\u0010H\u001a\u00020\f2\u0006\u0010C\u001a\u00020B2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0=H\u0016¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010JR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010LR\u0014\u0010P\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"LVv/b;", "LVv/h;", "LVv/o;", "call", "LVv/g;", "poolConnectionListener", "LWv/g;", "chain", "<init>", "(LVv/o;LVv/g;LWv/g;)V", "LVv/f;", "connectPlan", "", "f", "(LVv/f;)V", "m", "LQv/s;", PlaceTypes.ROUTE, "k", "(LQv/s;)V", "d", "LQv/r;", "protocol", "Ljava/io/IOException;", "e", "i", "(LQv/s;LQv/r;Ljava/io/IOException;)V", "s", "()V", "Lokhttp3/i;", "handshake", "p", "(Lokhttp3/i;)V", "u", "(LQv/s;LQv/r;)V", "LQv/f;", "connection", "j", "(LQv/f;LQv/s;)V", "a", "(LQv/f;)V", "LVv/p;", "c", "(LVv/p;)V", "Ljava/net/Socket;", "t", "()Ljava/net/Socket;", "n", "h", "r", "w", "q", "", "l", "()Z", "isCanceled", "v", "()LVv/p;", "Lokhttp3/HttpUrl;", "url", "(Lokhttp3/HttpUrl;)V", "", "Ljava/net/Proxy;", "proxies", "g", "(Lokhttp3/HttpUrl;Ljava/util/List;)V", "", "socketHost", "o", "(Ljava/lang/String;)V", "Ljava/net/InetAddress;", "result", "b", "(Ljava/lang/String;Ljava/util/List;)V", "LVv/o;", "LVv/g;", "LWv/g;", "Lokhttp3/g;", "x", "()Lokhttp3/g;", "eventListener", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o call;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g poolConnectionListener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Wv.g chain;

    public b(o call, g poolConnectionListener, Wv.g chain) {
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

    @Override // Vv.h
    public void a(Qv.f connection) {
        Intrinsics.j(connection, "connection");
        x().k(this.call, connection);
    }

    @Override // Vv.h
    public void b(String socketHost, List<? extends InetAddress> result) {
        Intrinsics.j(socketHost, "socketHost");
        Intrinsics.j(result, "result");
        x().m(this.call, socketHost, result);
    }

    @Override // Vv.h
    public void c(p connection) {
        Intrinsics.j(connection, "connection");
        this.call.c(connection);
    }

    @Override // Vv.h
    public void d(Qv.s route) {
        Intrinsics.j(route, "route");
        x().j(this.call, route.getSocketAddress(), route.getProxy());
        this.poolConnectionListener.d(route, this.call);
    }

    @Override // Vv.h
    public void e(HttpUrl url) {
        Intrinsics.j(url, "url");
        x().q(this.call, url);
    }

    @Override // Vv.h
    public void f(f connectPlan) {
        Intrinsics.j(connectPlan, "connectPlan");
        this.call.p().add(connectPlan);
    }

    @Override // Vv.h
    public void g(HttpUrl url, List<? extends Proxy> proxies) {
        Intrinsics.j(url, "url");
        Intrinsics.j(proxies, "proxies");
        x().p(this.call, url, proxies);
    }

    @Override // Vv.h
    public void h(p connection) {
        Intrinsics.j(connection, "connection");
        connection.getConnectionListener().e(connection, this.call);
    }

    @Override // Vv.h
    public void i(Qv.s route, Qv.r protocol, IOException e10) {
        Intrinsics.j(route, "route");
        Intrinsics.j(e10, "e");
        x().i(this.call, route.getSocketAddress(), route.getProxy(), null, e10);
        this.poolConnectionListener.c(route, this.call, e10);
    }

    @Override // Vv.h
    public boolean isCanceled() {
        return this.call.getCanceled();
    }

    @Override // Vv.h
    public void j(Qv.f connection, Qv.s route) {
        Intrinsics.j(connection, "connection");
        Intrinsics.j(route, "route");
        this.poolConnectionListener.b(connection, route, this.call);
    }

    @Override // Vv.h
    public void k(Qv.s route) {
        Intrinsics.j(route, "route");
        this.call.getClient().getRouteDatabase().a(route);
    }

    @Override // Vv.h
    public boolean l() {
        return !Intrinsics.e(this.chain.getRequest().getMethod(), "GET");
    }

    @Override // Vv.h
    public void m(f connectPlan) {
        Intrinsics.j(connectPlan, "connectPlan");
        this.call.p().remove(connectPlan);
    }

    @Override // Vv.h
    public void n(Qv.f connection) {
        Intrinsics.j(connection, "connection");
        x().l(this.call, connection);
    }

    @Override // Vv.h
    public void o(String socketHost) {
        Intrinsics.j(socketHost, "socketHost");
        x().n(this.call, socketHost);
    }

    @Override // Vv.h
    public void q(p connection) {
        Intrinsics.j(connection, "connection");
        connection.getConnectionListener().h(connection);
    }

    @Override // Vv.h
    public void r(p connection) {
        Intrinsics.j(connection, "connection");
        connection.getConnectionListener().g(connection, this.call);
    }

    @Override // Vv.h
    public Socket t() {
        return this.call.w();
    }

    @Override // Vv.h
    public void u(Qv.s route, Qv.r protocol) {
        Intrinsics.j(route, "route");
        x().h(this.call, route.getSocketAddress(), route.getProxy(), protocol);
    }

    @Override // Vv.h
    public p v() {
        return this.call.getConnection();
    }

    @Override // Vv.h
    public void w(p connection) {
        Intrinsics.j(connection, "connection");
        connection.getConnectionListener().f(connection);
    }

    @Override // Vv.h
    public void p(okhttp3.i handshake) {
        x().D(this.call, handshake);
    }

    @Override // Vv.h
    public void s() {
        x().E(this.call);
    }
}
