package Vp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\f¨\u0006\u0015"}, d2 = {"LVp/i;", "", "", "Lcom/meijer/mobile/shopandscan/domain/model/ShopAndScanItemLocalID;", "localId", "", "quantity", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vp.i, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class UpdateItemRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String localId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantity;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateItemRequest)) {
            return false;
        }
        UpdateItemRequest updateItemRequest = (UpdateItemRequest) other;
        return Intrinsics.e(this.localId, updateItemRequest.localId) && this.quantity == updateItemRequest.quantity;
    }

    public UpdateItemRequest(String localId, int i10) {
        Intrinsics.j(localId, "localId");
        this.localId = localId;
        this.quantity = i10;
    }

    /* renamed from: a, reason: from getter */
    public final String getLocalId() {
        return this.localId;
    }

    /* renamed from: b, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (this.localId.hashCode() * 31) + Integer.hashCode(this.quantity);
    }

    public String toString() {
        return "UpdateItemRequest(localId=" + this.localId + ", quantity=" + this.quantity + ')';
    }
}
