package Vp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LVp/h;", "", "", "itemId", "LXp/a;", "barcode", "<init>", "(Ljava/lang/String;LXp/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LXp/a;", "getBarcode", "()LXp/a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vp.h, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class SyncItemRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Xp.a barcode;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncItemRequest)) {
            return false;
        }
        SyncItemRequest syncItemRequest = (SyncItemRequest) other;
        return Intrinsics.e(this.itemId, syncItemRequest.itemId) && Intrinsics.e(this.barcode, syncItemRequest.barcode);
    }

    public SyncItemRequest(String itemId, Xp.a barcode) {
        Intrinsics.j(itemId, "itemId");
        Intrinsics.j(barcode, "barcode");
        this.itemId = itemId;
        this.barcode = barcode;
    }

    /* renamed from: a, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    public int hashCode() {
        return (this.itemId.hashCode() * 31) + this.barcode.hashCode();
    }

    public String toString() {
        return "SyncItemRequest(itemId=" + this.itemId + ", barcode=" + this.barcode + ')';
    }
}
