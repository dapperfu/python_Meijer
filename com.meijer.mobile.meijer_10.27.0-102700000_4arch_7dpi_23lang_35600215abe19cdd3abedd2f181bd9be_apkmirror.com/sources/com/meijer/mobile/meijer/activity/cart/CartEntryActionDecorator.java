package com.meijer.mobile.meijer.activity.cart;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/k0;", "Landroid/os/Parcelable;", "", "entryNumber", "", "isEntryHasNote", "", "entryNote", "Lmk/f;", "product", "<init>", "(IZLjava/lang/String;Lmk/f;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "()Z", "c", "Ljava/lang/String;", "getEntryNote", "d", "Lmk/f;", "m", "()Lmk/f;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.cart.k0, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class CartEntryActionDecorator implements Parcelable {
    public static final Parcelable.Creator<CartEntryActionDecorator> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int entryNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEntryHasNote;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String entryNote;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.f product;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.k0$a */
    public static final class a implements Parcelable.Creator<CartEntryActionDecorator> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CartEntryActionDecorator createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new CartEntryActionDecorator(parcel.readInt(), parcel.readInt() != 0, parcel.readString(), (mk.f) parcel.readParcelable(CartEntryActionDecorator.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CartEntryActionDecorator[] newArray(int i10) {
            return new CartEntryActionDecorator[i10];
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
        if (!(other instanceof CartEntryActionDecorator)) {
            return false;
        }
        CartEntryActionDecorator cartEntryActionDecorator = (CartEntryActionDecorator) other;
        return this.entryNumber == cartEntryActionDecorator.entryNumber && this.isEntryHasNote == cartEntryActionDecorator.isEntryHasNote && Intrinsics.e(this.entryNote, cartEntryActionDecorator.entryNote) && Intrinsics.e(this.product, cartEntryActionDecorator.product);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.entryNumber) * 31) + Boolean.hashCode(this.isEntryHasNote)) * 31;
        String str = this.entryNote;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.product.hashCode();
    }

    public String toString() {
        return "CartEntryActionDecorator(entryNumber=" + this.entryNumber + ", isEntryHasNote=" + this.isEntryHasNote + ", entryNote=" + this.entryNote + ", product=" + this.product + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.entryNumber);
        dest.writeInt(this.isEntryHasNote ? 1 : 0);
        dest.writeString(this.entryNote);
        dest.writeParcelable(this.product, flags);
    }

    public CartEntryActionDecorator(int i10, boolean z10, String str, mk.f product) {
        Intrinsics.j(product, "product");
        this.entryNumber = i10;
        this.isEntryHasNote = z10;
        this.entryNote = str;
        this.product = product;
    }

    /* renamed from: a, reason: from getter */
    public final int getEntryNumber() {
        return this.entryNumber;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsEntryHasNote() {
        return this.isEntryHasNote;
    }

    /* renamed from: m, reason: from getter */
    public final mk.f getProduct() {
        return this.product;
    }
}
