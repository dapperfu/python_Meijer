package pp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lpp/b;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "Lpp/a;", "entries", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pp.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class CriteoOrder {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CriteoCartEntry> entries;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CriteoOrder)) {
            return false;
        }
        CriteoOrder criteoOrder = (CriteoOrder) other;
        return this.storeId == criteoOrder.storeId && Intrinsics.e(this.orderId, criteoOrder.orderId) && Intrinsics.e(this.entries, criteoOrder.entries);
    }

    public CriteoOrder(int i10, String orderId, List<CriteoCartEntry> entries) {
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(entries, "entries");
        this.storeId = i10;
        this.orderId = orderId;
        this.entries = entries;
    }

    public final List<CriteoCartEntry> a() {
        return this.entries;
    }

    /* renamed from: b, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: c, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.storeId) * 31) + this.orderId.hashCode()) * 31) + this.entries.hashCode();
    }

    public String toString() {
        return "CriteoOrder(storeId=" + this.storeId + ", orderId=" + this.orderId + ", entries=" + this.entries + ')';
    }
}
