package Fo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LFo/c;", "Landroid/os/Parcelable;", "", "currencyIso", "", "value", "<init>", "(Ljava/lang/String;D)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCurrencyIso", "b", "D", "getValue", "()D", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Fo.c, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class Savings implements Parcelable {
    public static final Parcelable.Creator<Savings> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currencyIso;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double value;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fo.c$a */
    public static final class a implements Parcelable.Creator<Savings> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Savings createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new Savings(parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Savings[] newArray(int i10) {
            return new Savings[i10];
        }
    }

    public Savings() {
        this(null, 0.0d, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Savings)) {
            return false;
        }
        Savings savings = (Savings) other;
        return Intrinsics.e(this.currencyIso, savings.currencyIso) && Double.compare(this.value, savings.value) == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.currencyIso);
        dest.writeDouble(this.value);
    }

    public Savings(String currencyIso, double d10) {
        Intrinsics.j(currencyIso, "currencyIso");
        this.currencyIso = currencyIso;
        this.value = d10;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.currencyIso.hashCode() * 31) + Double.hashCode(this.value);
    }

    public String toString() {
        return "Savings(currencyIso=" + this.currencyIso + ", value=" + this.value + ')';
    }

    public /* synthetic */ Savings(String str, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "USD" : str, (i10 & 2) != 0 ? 0.0d : d10);
    }
}
