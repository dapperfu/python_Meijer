package Op;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001e"}, d2 = {"LOp/p;", "", "LOp/o;", "barcode", "Lnk/m;", "product", "", "quantity", "<init>", "(LOp/o;Lnk/m;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LOp/o;", "()LOp/o;", "b", "Lnk/m;", "getProduct", "()Lnk/m;", "c", "D", "()D", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Op.p, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ScannedItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScannedBarcode barcode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.m product;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    public ScannedItem(ScannedBarcode barcode, nk.m mVar, double d10) {
        Intrinsics.j(barcode, "barcode");
        this.barcode = barcode;
        this.product = mVar;
        this.quantity = d10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScannedItem)) {
            return false;
        }
        ScannedItem scannedItem = (ScannedItem) other;
        return Intrinsics.e(this.barcode, scannedItem.barcode) && Intrinsics.e(this.product, scannedItem.product) && Double.compare(this.quantity, scannedItem.quantity) == 0;
    }

    /* renamed from: a, reason: from getter */
    public final ScannedBarcode getBarcode() {
        return this.barcode;
    }

    /* renamed from: b, reason: from getter */
    public final double getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int iHashCode = this.barcode.hashCode() * 31;
        nk.m mVar = this.product;
        return ((iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31) + Double.hashCode(this.quantity);
    }

    public String toString() {
        return "ScannedItem(barcode=" + this.barcode + ", product=" + this.product + ", quantity=" + this.quantity + ')';
    }

    public /* synthetic */ ScannedItem(ScannedBarcode scannedBarcode, nk.m mVar, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(scannedBarcode, (i10 & 2) != 0 ? null : mVar, (i10 & 4) != 0 ? 0.0d : d10);
    }
}
