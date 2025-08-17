package mk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0083\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lmk/j;", "Lmk/i;", "Lmk/f;", "product", "", "quantity", "<init>", "(Lmk/f;D)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/f;", "m", "()Lmk/f;", "b", "D", "getQuantity", "()D", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mk.j, reason: from toString */
/* loaded from: classes7.dex */
final /* data */ class ProductQuantityImpl implements i {
    public static final Parcelable.Creator<ProductQuantityImpl> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final f product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mk.j$a */
    public static final class a implements Parcelable.Creator<ProductQuantityImpl> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductQuantityImpl createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new ProductQuantityImpl((f) parcel.readParcelable(ProductQuantityImpl.class.getClassLoader()), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductQuantityImpl[] newArray(int i10) {
            return new ProductQuantityImpl[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductQuantityImpl)) {
            return false;
        }
        ProductQuantityImpl productQuantityImpl = (ProductQuantityImpl) other;
        return Intrinsics.e(this.product, productQuantityImpl.product) && Double.compare(this.quantity, productQuantityImpl.quantity) == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeParcelable(this.product, flags);
        dest.writeDouble(this.quantity);
    }

    public ProductQuantityImpl(f product, double d10) {
        Intrinsics.j(product, "product");
        this.product = product;
        this.quantity = d10;
    }

    @Override // mk.i
    public double getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (this.product.hashCode() * 31) + Double.hashCode(this.quantity);
    }

    @Override // mk.i
    /* renamed from: m, reason: from getter */
    public f getProduct() {
        return this.product;
    }

    public String toString() {
        return "ProductQuantityImpl(product=" + this.product + ", quantity=" + this.quantity + ')';
    }
}
