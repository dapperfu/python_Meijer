package Sv;

import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Request;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LSv/i;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "b", "(Lokhttp3/Request;Ljava/net/Proxy$Type;)Z", "", "a", "(Lokhttp3/Request;Ljava/net/Proxy$Type;)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "url", "c", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f35830a = new i();

    public final String a(Request request, Proxy.Type proxyType) {
        Intrinsics.j(request, "request");
        Intrinsics.j(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.getMethod());
        sb2.append(' ');
        i iVar = f35830a;
        if (iVar.b(request, proxyType)) {
            sb2.append(request.getUrl());
        } else {
            sb2.append(iVar.c(request.getUrl()));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    public final String c(HttpUrl url) {
        Intrinsics.j(url, "url");
        String strC = url.c();
        String strE = url.e();
        if (strE == null) {
            return strC;
        }
        return strC + '?' + strE;
    }

    private i() {
    }

    private final boolean b(Request request, Proxy.Type proxyType) {
        if (!request.f() && proxyType == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }
}
