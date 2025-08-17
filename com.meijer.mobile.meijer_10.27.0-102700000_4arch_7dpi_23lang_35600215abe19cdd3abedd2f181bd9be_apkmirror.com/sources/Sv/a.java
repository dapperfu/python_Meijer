package Sv;

import Qv.e;
import Qv.k;
import Qv.m;
import Qv.s;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LSv/a;", "LQv/a;", "LQv/m;", "defaultDns", "<init>", "(LQv/m;)V", "Ljava/net/Proxy;", "Lokhttp3/HttpUrl;", "url", "dns", "Ljava/net/InetAddress;", "b", "(Ljava/net/Proxy;Lokhttp3/HttpUrl;LQv/m;)Ljava/net/InetAddress;", "LQv/s;", PlaceTypes.ROUTE, "Lokhttp3/Response;", "response", "Lokhttp3/Request;", "a", "(LQv/s;Lokhttp3/Response;)Lokhttp3/Request;", "d", "LQv/m;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements Qv.a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m defaultDns;

    public a(m defaultDns) {
        Intrinsics.j(defaultDns, "defaultDns");
        this.defaultDns = defaultDns;
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Sv.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0770a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // Qv.a
    public Request a(s route, Response response) throws IOException {
        Proxy proxy;
        m dns;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        okhttp3.a aVar;
        Intrinsics.j(response, "response");
        List<e> listC = response.c();
        Request request = response.getRequest();
        HttpUrl url = request.getUrl();
        boolean z10 = response.getCode() == 407;
        if (route == null || (proxy = route.getProxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (e eVar : listC) {
            if (StringsKt.H("Basic", eVar.getScheme(), true)) {
                if (route == null || (aVar = route.getCom.google.android.libraries.places.api.model.PlaceTypes.ADDRESS java.lang.String()) == null || (dns = aVar.getDns()) == null) {
                    dns = this.defaultDns;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    Intrinsics.h(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.g(proxy);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, url, dns), inetSocketAddress.getPort(), url.getScheme(), eVar.b(), eVar.getScheme(), url.z(), Authenticator.RequestorType.PROXY);
                } else {
                    String host = url.getHost();
                    Intrinsics.g(proxy);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(host, b(proxy, url, dns), url.getPort(), url.getScheme(), eVar.b(), eVar.getScheme(), url.z(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    Intrinsics.i(userName, "getUserName(...)");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    Intrinsics.i(password, "getPassword(...)");
                    return request.g().m(str, k.b(userName, new String(password), eVar.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ a(m mVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? m.f31470b : mVar);
    }

    private final InetAddress b(Proxy proxy, HttpUrl httpUrl, m mVar) throws IOException {
        int i10;
        Proxy.Type type = proxy.type();
        if (type == null) {
            i10 = -1;
        } else {
            i10 = C0770a.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i10 == 1) {
            return (InetAddress) CollectionsKt.s0(mVar.a(httpUrl.getHost()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        Intrinsics.h(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        Intrinsics.i(address, "getAddress(...)");
        return address;
    }
}
