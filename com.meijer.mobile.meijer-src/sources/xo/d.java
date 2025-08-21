package xo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import ol.OrderHistoryItem;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxo/d;", "", "Lokhttp3/HttpUrl;", "webBaseUrl", "<init>", "(Lokhttp3/HttpUrl;)V", "Lol/b;", "orderHistory", "a", "(Lol/b;)Lokhttp3/HttpUrl;", "Lokhttp3/HttpUrl;", "getWebBaseUrl", "()Lokhttp3/HttpUrl;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl webBaseUrl;

    public d(HttpUrl webBaseUrl) {
        Intrinsics.j(webBaseUrl, "webBaseUrl");
        this.webBaseUrl = webBaseUrl;
    }

    public final HttpUrl a(OrderHistoryItem orderHistory) {
        Intrinsics.j(orderHistory, "orderHistory");
        HttpUrl.a aVarL = this.webBaseUrl.l("shop/en/my-account/order/");
        Intrinsics.g(aVarL);
        return aVarL.c(orderHistory.getCode()).g();
    }
}
