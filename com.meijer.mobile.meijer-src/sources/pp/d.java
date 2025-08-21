package pp;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u000e\u0010\u000b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0003R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lpp/d;", "", "<init>", "()V", "", "", "upcs", "", "a", "(Ljava/util/List;)V", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upc", "", "c", "(Ljava/lang/String;)Z", "b", "Ljava/util/List;", "buyAgainUpcs", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<String> buyAgainUpcs;

    public final void b() {
        this.buyAgainUpcs = null;
    }

    public final void a(List<String> upcs) {
        Intrinsics.j(upcs, "upcs");
        this.buyAgainUpcs = upcs;
    }

    public final boolean c(String upc) {
        List<String> list = this.buyAgainUpcs;
        if (list != null) {
            return CollectionsKt.h0(list, upc);
        }
        return false;
    }
}
