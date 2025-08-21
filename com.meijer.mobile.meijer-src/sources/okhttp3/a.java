package okhttp3;

import Mv.r;
import io.constructor.BuildConfig;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068G¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\b8G¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8G¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8G¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8G¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b(\u00107R\u0017\u0010\u0011\u001a\u00020\u00108G¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128G¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u0017\u0010\u001a\u001a\u00020\u00198G¢\u0006\f\n\u0004\b:\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010F\u001a\u00020B8G¢\u0006\f\n\u0004\b@\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148G¢\u0006\f\n\u0004\b.\u0010G\u001a\u0004\b8\u0010HR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00148G¢\u0006\f\n\u0004\b1\u0010G\u001a\u0004\b,\u0010H¨\u0006I"}, d2 = {"Lokhttp3/a;", "", "", "uriHost", "", "uriPort", "LMv/m;", "dns", "Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "LMv/d;", "certificatePinner", "LMv/a;", "proxyAuthenticator", "Ljava/net/Proxy;", "proxy", "", "LMv/r;", "protocols", "Lokhttp3/f;", "connectionSpecs", "Ljava/net/ProxySelector;", "proxySelector", "<init>", "(Ljava/lang/String;ILMv/m;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;LMv/d;LMv/a;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "that", "d", "(Lokhttp3/a;)Z", "toString", "()Ljava/lang/String;", "a", "LMv/m;", "c", "()LMv/m;", "b", "Ljavax/net/SocketFactory;", "j", "()Ljavax/net/SocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "k", "()Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/HostnameVerifier;", "e", "()Ljavax/net/ssl/HostnameVerifier;", "LMv/d;", "()LMv/d;", "f", "LMv/a;", "h", "()LMv/a;", "g", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "i", "()Ljava/net/ProxySelector;", "Lokhttp3/HttpUrl;", "Lokhttp3/HttpUrl;", "l", "()Lokhttp3/HttpUrl;", "url", "Ljava/util/List;", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Mv.m dns;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SocketFactory socketFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SSLSocketFactory sslSocketFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final HostnameVerifier hostnameVerifier;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Mv.d certificatePinner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Mv.a proxyAuthenticator;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Proxy proxy;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ProxySelector proxySelector;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl url;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<r> protocols;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<f> connectionSpecs;

    public a(String uriHost, int i10, Mv.m dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Mv.d dVar, Mv.a proxyAuthenticator, Proxy proxy, List<? extends r> protocols, List<f> connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.j(uriHost, "uriHost");
        Intrinsics.j(dns, "dns");
        Intrinsics.j(socketFactory, "socketFactory");
        Intrinsics.j(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.j(protocols, "protocols");
        Intrinsics.j(connectionSpecs, "connectionSpecs");
        Intrinsics.j(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = dVar;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.a().D(sSLSocketFactory != null ? BuildConfig.SERVICE_SCHEME : "http").n(uriHost).u(i10).g();
        this.protocols = Nv.k.x(protocols);
        this.connectionSpecs = Nv.k.x(connectionSpecs);
    }

    @JvmName
    /* renamed from: a, reason: from getter */
    public final Mv.d getCertificatePinner() {
        return this.certificatePinner;
    }

    @JvmName
    public final List<f> b() {
        return this.connectionSpecs;
    }

    @JvmName
    /* renamed from: c, reason: from getter */
    public final Mv.m getDns() {
        return this.dns;
    }

    public final boolean d(a that) {
        Intrinsics.j(that, "that");
        return Intrinsics.e(this.dns, that.dns) && Intrinsics.e(this.proxyAuthenticator, that.proxyAuthenticator) && Intrinsics.e(this.protocols, that.protocols) && Intrinsics.e(this.connectionSpecs, that.connectionSpecs) && Intrinsics.e(this.proxySelector, that.proxySelector) && Intrinsics.e(this.proxy, that.proxy) && Intrinsics.e(this.sslSocketFactory, that.sslSocketFactory) && Intrinsics.e(this.hostnameVerifier, that.hostnameVerifier) && Intrinsics.e(this.certificatePinner, that.certificatePinner) && this.url.getPort() == that.url.getPort();
    }

    @JvmName
    /* renamed from: e, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public boolean equals(Object other) {
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return Intrinsics.e(this.url, aVar.url) && d(aVar);
    }

    @JvmName
    public final List<r> f() {
        return this.protocols;
    }

    @JvmName
    /* renamed from: g, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @JvmName
    /* renamed from: h, reason: from getter */
    public final Mv.a getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    @JvmName
    /* renamed from: i, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @JvmName
    /* renamed from: j, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @JvmName
    /* renamed from: k, reason: from getter */
    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    @JvmName
    /* renamed from: l, reason: from getter */
    public final HttpUrl getUrl() {
        return this.url;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.url.getHost());
        sb3.append(':');
        sb3.append(this.url.getPort());
        sb3.append(", ");
        if (this.proxy != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.proxy;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }
}
