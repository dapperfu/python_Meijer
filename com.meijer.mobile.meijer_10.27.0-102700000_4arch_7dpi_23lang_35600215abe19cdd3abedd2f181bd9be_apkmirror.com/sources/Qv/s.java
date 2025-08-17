package Qv;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068G¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LQv/s;", "", "Lokhttp3/a;", PlaceTypes.ADDRESS, "Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(Lokhttp3/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "", "c", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lokhttp3/a;", "()Lokhttp3/a;", "b", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "Ljava/net/InetSocketAddress;", "d", "()Ljava/net/InetSocketAddress;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final okhttp3.a address;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Proxy proxy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InetSocketAddress socketAddress;

    public s(okhttp3.a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.j(address, "address");
        Intrinsics.j(proxy, "proxy");
        Intrinsics.j(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    @JvmName
    /* renamed from: a, reason: from getter */
    public final okhttp3.a getAddress() {
        return this.address;
    }

    @JvmName
    /* renamed from: b, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    public final boolean c() {
        if (this.proxy.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.address.getSslSocketFactory() != null || this.address.f().contains(r.f31482g);
    }

    @JvmName
    /* renamed from: d, reason: from getter */
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    public boolean equals(Object other) {
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return Intrinsics.e(sVar.address, this.address) && Intrinsics.e(sVar.proxy, this.proxy) && Intrinsics.e(sVar.socketAddress, this.socketAddress);
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    public String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        String host = this.address.getUrl().getHost();
        InetAddress address = this.socketAddress.getAddress();
        String strK = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : Rv.f.k(hostAddress);
        if (StringsKt.b0(host, ':', false, 2, null)) {
            sb2.append("[");
            sb2.append(host);
            sb2.append("]");
        } else {
            sb2.append(host);
        }
        if (this.address.getUrl().getPort() != this.socketAddress.getPort() || Intrinsics.e(host, strK)) {
            sb2.append(":");
            sb2.append(this.address.getUrl().getPort());
        }
        if (!Intrinsics.e(host, strK)) {
            if (Intrinsics.e(this.proxy, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (strK == null) {
                sb2.append("<unresolved>");
            } else if (StringsKt.b0(strK, ':', false, 2, null)) {
                sb2.append("[");
                sb2.append(strK);
                sb2.append("]");
            } else {
                sb2.append(strK);
            }
            sb2.append(":");
            sb2.append(this.socketAddress.getPort());
        }
        return sb2.toString();
    }
}
