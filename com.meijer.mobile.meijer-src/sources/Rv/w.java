package Rv;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0002\u0013\u0019B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\u001aH\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020'0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\"R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\"¨\u0006/"}, d2 = {"LRv/w;", "", "Lokhttp3/a;", PlaceTypes.ADDRESS, "LRv/u;", "routeDatabase", "LRv/h;", "connectionUser", "", "fastFallback", "<init>", "(Lokhttp3/a;LRv/u;LRv/h;Z)V", "Lokhttp3/HttpUrl;", "url", "Ljava/net/Proxy;", "proxy", "", "f", "(Lokhttp3/HttpUrl;Ljava/net/Proxy;)V", "b", "()Z", "d", "()Ljava/net/Proxy;", "e", "(Ljava/net/Proxy;)V", "a", "LRv/w$b;", "c", "()LRv/w$b;", "Lokhttp3/a;", "LRv/u;", "LRv/h;", "Z", "", "Ljava/util/List;", "proxies", "", "I", "nextProxyIndex", "Ljava/net/InetSocketAddress;", "g", "inetSocketAddresses", "", "LMv/s;", "h", "postponedRoutes", "i", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class w {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.a address;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u routeDatabase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h connectionUser;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean fastFallback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<? extends Proxy> proxies;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int nextProxyIndex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<? extends InetSocketAddress> inetSocketAddresses;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<Mv.s> postponedRoutes;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"LRv/w$a;", "", "<init>", "()V", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Rv.w$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            Intrinsics.j(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                Intrinsics.i(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            Intrinsics.i(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"LRv/w$b;", "", "", "LMv/s;", "routes", "<init>", "(Ljava/util/List;)V", "", "b", "()Z", "c", "()LMv/s;", "a", "Ljava/util/List;", "()Ljava/util/List;", "", "I", "nextRouteIndex", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<Mv.s> routes;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int nextRouteIndex;

        public b(List<Mv.s> routes) {
            Intrinsics.j(routes, "routes");
            this.routes = routes;
        }

        public final List<Mv.s> a() {
            return this.routes;
        }

        public final boolean b() {
            return this.nextRouteIndex < this.routes.size();
        }

        public final Mv.s c() {
            if (b()) {
                List<Mv.s> list = this.routes;
                int i10 = this.nextRouteIndex;
                this.nextRouteIndex = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public w(okhttp3.a address, u routeDatabase, h connectionUser, boolean z10) {
        Intrinsics.j(address, "address");
        Intrinsics.j(routeDatabase, "routeDatabase");
        Intrinsics.j(connectionUser, "connectionUser");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.connectionUser = connectionUser;
        this.fastFallback = z10;
        this.proxies = CollectionsKt.m();
        this.inetSocketAddresses = CollectionsKt.m();
        this.postponedRoutes = new ArrayList();
        f(address.getUrl(), address.getProxy());
    }

    private final boolean b() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final void e(Proxy proxy) throws IOException {
        String host;
        int port;
        List<InetAddress> listA;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            host = this.address.getUrl().getHost();
            port = this.address.getUrl().getPort();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            host = INSTANCE.a(inetSocketAddress);
            port = inetSocketAddress.getPort();
        }
        if (1 > port || port >= 65536) {
            throw new SocketException("No route to " + host + ':' + port + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(host, port));
            return;
        }
        if (Nv.f.a(host)) {
            listA = CollectionsKt.e(InetAddress.getByName(host));
        } else {
            this.connectionUser.m(host);
            listA = this.address.getDns().a(host);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.address.getDns() + " returned no addresses for " + host);
            }
            this.connectionUser.b(host, listA);
        }
        if (this.fastFallback) {
            listA = n.a(listA);
        }
        Iterator<InetAddress> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), port));
        }
    }

    private final void f(HttpUrl url, Proxy proxy) {
        this.connectionUser.d(url);
        List<Proxy> listG = g(proxy, url, this);
        this.proxies = listG;
        this.nextProxyIndex = 0;
        this.connectionUser.e(url, listG);
    }

    private static final List<Proxy> g(Proxy proxy, HttpUrl httpUrl, w wVar) {
        if (proxy != null) {
            return CollectionsKt.e(proxy);
        }
        URI uriY = httpUrl.y();
        if (uriY.getHost() == null) {
            return Nv.k.l(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = wVar.address.getProxySelector().select(uriY);
        List<Proxy> list = listSelect;
        return (list == null || list.isEmpty()) ? Nv.k.l(Proxy.NO_PROXY) : Nv.k.x(listSelect);
    }

    private final Proxy d() throws IOException {
        if (b()) {
            List<? extends Proxy> list = this.proxies;
            int i10 = this.nextProxyIndex;
            this.nextProxyIndex = i10 + 1;
            Proxy proxy = list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.getUrl().getHost() + "; exhausted proxy configurations: " + this.proxies);
    }

    public final boolean a() {
        if (!b() && this.postponedRoutes.isEmpty()) {
            return false;
        }
        return true;
    }

    public final b c() throws IOException {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (b()) {
                Proxy proxyD = d();
                Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
                while (it.hasNext()) {
                    Mv.s sVar = new Mv.s(this.address, proxyD, it.next());
                    if (this.routeDatabase.c(sVar)) {
                        this.postponedRoutes.add(sVar);
                    } else {
                        arrayList.add(sVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                CollectionsKt.C(arrayList, this.postponedRoutes);
                this.postponedRoutes.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
