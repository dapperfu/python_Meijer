package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.ProductFullDetails;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vl.CartEntry;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001\u001bB)\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/v;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/cart/model/common/EntryNumber;", "entryNumber", "", "actualQuantity", "qtyIncrement", "<init>", "(IDD)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getEntryNumber", "b", "D", "()D", "c", "getQtyIncrement", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.v, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class ProductCartEntryDecorator implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int entryNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double actualQuantity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double qtyIncrement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ProductCartEntryDecorator> CREATOR = new b();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/v$a;", "", "<init>", "()V", "Lvl/a;", "entry", "LCo/h;", "product", "Lcom/meijer/mobile/meijer/activity/find/viewmodel/v;", "a", "(Lvl/a;LCo/h;)Lcom/meijer/mobile/meijer/activity/find/viewmodel/v;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.v$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProductCartEntryDecorator a(CartEntry entry, ProductFullDetails product) {
            Intrinsics.j(product, "product");
            return new ProductCartEntryDecorator(entry != null ? entry.getEntryNumber() : -1, entry != null ? entry.getQuantity() : 0.0d, product.getQtyIncrement());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.v$b */
    public static final class b implements Parcelable.Creator<ProductCartEntryDecorator> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductCartEntryDecorator createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new ProductCartEntryDecorator(parcel.readInt(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductCartEntryDecorator[] newArray(int i10) {
            return new ProductCartEntryDecorator[i10];
        }
    }

    public ProductCartEntryDecorator() {
        this(0, 0.0d, 0.0d, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductCartEntryDecorator)) {
            return false;
        }
        ProductCartEntryDecorator productCartEntryDecorator = (ProductCartEntryDecorator) other;
        return this.entryNumber == productCartEntryDecorator.entryNumber && Double.compare(this.actualQuantity, productCartEntryDecorator.actualQuantity) == 0 && Double.compare(this.qtyIncrement, productCartEntryDecorator.qtyIncrement) == 0;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.entryNumber) * 31) + Double.hashCode(this.actualQuantity)) * 31) + Double.hashCode(this.qtyIncrement);
    }

    public String toString() {
        return "ProductCartEntryDecorator(entryNumber=" + this.entryNumber + ", actualQuantity=" + this.actualQuantity + ", qtyIncrement=" + this.qtyIncrement + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.entryNumber);
        dest.writeDouble(this.actualQuantity);
        dest.writeDouble(this.qtyIncrement);
    }

    public ProductCartEntryDecorator(int i10, double d10, double d11) {
        this.entryNumber = i10;
        this.actualQuantity = d10;
        this.qtyIncrement = d11;
    }

    /* renamed from: a, reason: from getter */
    public final double getActualQuantity() {
        return this.actualQuantity;
    }

    public /* synthetic */ ProductCartEntryDecorator(int i10, double d10, double d11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? 0.0d : d10, (i11 & 4) != 0 ? 1.0d : d11);
    }
}
