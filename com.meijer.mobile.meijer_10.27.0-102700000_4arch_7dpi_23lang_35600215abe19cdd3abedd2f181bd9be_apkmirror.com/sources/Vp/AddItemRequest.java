package Vp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LVp/b;", "", "LXp/a;", "barcode", "", "quantity", "", "isPicklist", "<init>", "(LXp/a;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LXp/a;", "()LXp/a;", "b", "I", "c", "Z", "()Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vp.b, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class AddItemRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Xp.a barcode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPicklist;

    public AddItemRequest(Xp.a barcode, int i10, boolean z10) {
        Intrinsics.j(barcode, "barcode");
        this.barcode = barcode;
        this.quantity = i10;
        this.isPicklist = z10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddItemRequest)) {
            return false;
        }
        AddItemRequest addItemRequest = (AddItemRequest) other;
        return Intrinsics.e(this.barcode, addItemRequest.barcode) && this.quantity == addItemRequest.quantity && this.isPicklist == addItemRequest.isPicklist;
    }

    /* renamed from: a, reason: from getter */
    public final Xp.a getBarcode() {
        return this.barcode;
    }

    /* renamed from: b, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsPicklist() {
        return this.isPicklist;
    }

    public int hashCode() {
        return (((this.barcode.hashCode() * 31) + Integer.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.isPicklist);
    }

    public String toString() {
        return "AddItemRequest(barcode=" + this.barcode + ", quantity=" + this.quantity + ", isPicklist=" + this.isPicklist + ')';
    }

    public /* synthetic */ AddItemRequest(Xp.a aVar, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i10, (i11 & 4) != 0 ? false : z10);
    }
}
