package wl;

import android.os.Parcel;
import android.os.Parcelable;
import fj.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nk.f;
import nk.i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001\u001eBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b \u0010#¨\u00060"}, d2 = {"Lwl/a;", "Lnk/i;", "", "entryNumber", "", "quantity", "Lnk/f;", "product", "maxQuantity", "qtyIncrement", "totalPrice", "<init>", "(IDLnk/f;Ljava/lang/Double;DD)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "D", "getQuantity", "()D", "c", "Lnk/f;", "m", "()Lnk/f;", "d", "Ljava/lang/Double;", "getMaxQuantity", "()Ljava/lang/Double;", "e", "getQtyIncrement", "f", "g", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wl.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class CartEntry implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int entryNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final f product;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double maxQuantity;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double qtyIncrement;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalPrice;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CartEntry> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwl/a$a;", "", "<init>", "()V", "Lfj/i;", "entry", "Lwl/a;", "a", "(Lfj/i;)Lwl/a;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wl.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CartEntry a(Entry entry) {
            Intrinsics.j(entry, "entry");
            return new CartEntry(entry.getEntryNumber(), entry.getQuantity(), entry.m(), entry.m().getMaxOrderQuantity() != null ? Double.valueOf(r0.intValue()) : null, entry.m().getQtyIncrement(), entry.getTotalPrice().getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wl.a$b */
    public static final class b implements Parcelable.Creator<CartEntry> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CartEntry createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new CartEntry(parcel.readInt(), parcel.readDouble(), (f) parcel.readParcelable(CartEntry.class.getClassLoader()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CartEntry[] newArray(int i10) {
            return new CartEntry[i10];
        }
    }

    public CartEntry(int i10, double d10, f product, Double d11, double d12, double d13) {
        Intrinsics.j(product, "product");
        this.entryNumber = i10;
        this.quantity = d10;
        this.product = product;
        this.maxQuantity = d11;
        this.qtyIncrement = d12;
        this.totalPrice = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartEntry)) {
            return false;
        }
        CartEntry cartEntry = (CartEntry) other;
        return this.entryNumber == cartEntry.entryNumber && Double.compare(this.quantity, cartEntry.quantity) == 0 && Intrinsics.e(this.product, cartEntry.product) && Intrinsics.e(this.maxQuantity, cartEntry.maxQuantity) && Double.compare(this.qtyIncrement, cartEntry.qtyIncrement) == 0 && Double.compare(this.totalPrice, cartEntry.totalPrice) == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.entryNumber);
        dest.writeDouble(this.quantity);
        dest.writeParcelable(this.product, flags);
        Double d10 = this.maxQuantity;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        dest.writeDouble(this.qtyIncrement);
        dest.writeDouble(this.totalPrice);
    }

    /* renamed from: a, reason: from getter */
    public final int getEntryNumber() {
        return this.entryNumber;
    }

    /* renamed from: b, reason: from getter */
    public final double getTotalPrice() {
        return this.totalPrice;
    }

    @Override // nk.i
    public double getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.entryNumber) * 31) + Double.hashCode(this.quantity)) * 31) + this.product.hashCode()) * 31;
        Double d10 = this.maxQuantity;
        return ((((iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + Double.hashCode(this.qtyIncrement)) * 31) + Double.hashCode(this.totalPrice);
    }

    @Override // nk.i
    /* renamed from: m, reason: from getter */
    public f getProduct() {
        return this.product;
    }

    public String toString() {
        return "CartEntry(entryNumber=" + this.entryNumber + ", quantity=" + this.quantity + ", product=" + this.product + ", maxQuantity=" + this.maxQuantity + ", qtyIncrement=" + this.qtyIncrement + ", totalPrice=" + this.totalPrice + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CartEntry(int r11, double r12, nk.f r14, java.lang.Double r15, double r16, double r18, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20 & 1
            if (r0 == 0) goto L5
            r11 = -1
        L5:
            r1 = r11
            r11 = r20 & 2
            r2 = 0
            if (r11 == 0) goto Ld
            r12 = r2
        Ld:
            r11 = r20 & 8
            r0 = 0
            if (r11 == 0) goto L30
            boolean r11 = r14 instanceof nk.h
            if (r11 == 0) goto L1a
            r11 = r14
            nk.h r11 = (nk.h) r11
            goto L1b
        L1a:
            r11 = r0
        L1b:
            if (r11 == 0) goto L2d
            java.lang.Integer r11 = r11.getMaxOrderQuantity()
            if (r11 == 0) goto L2d
            int r11 = r11.intValue()
            double r5 = (double) r11
            java.lang.Double r11 = java.lang.Double.valueOf(r5)
            goto L2e
        L2d:
            r11 = r0
        L2e:
            r5 = r11
            goto L31
        L30:
            r5 = r15
        L31:
            r11 = r20 & 16
            if (r11 == 0) goto L46
            boolean r11 = r14 instanceof nk.h
            if (r11 == 0) goto L3c
            r0 = r14
            nk.h r0 = (nk.h) r0
        L3c:
            if (r0 == 0) goto L43
            double r6 = r0.getQtyIncrement()
            goto L48
        L43:
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L48
        L46:
            r6 = r16
        L48:
            r11 = r20 & 32
            if (r11 == 0) goto L51
            r8 = r2
            r0 = r10
            r4 = r14
            r2 = r12
            goto L56
        L51:
            r8 = r18
            r0 = r10
            r2 = r12
            r4 = r14
        L56:
            r0.<init>(r1, r2, r4, r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.CartEntry.<init>(int, double, nk.f, java.lang.Double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
