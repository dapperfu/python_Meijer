package Fo;

import android.os.Parcel;
import android.os.Parcelable;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 12\u00020\u00012\u00020\u0002:\u0001\u001fBW\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b\u001f\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\u0018¨\u00062"}, d2 = {"LFo/b;", "Lnk/b;", "Landroid/os/Parcelable;", "", "currencyIso", "formattedValue", "priceType", "unit", "", "value", "averagePoundEach", "priceText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Double;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "K3", "b", "O3", "c", "d", "p", "e", "D", "getValue", "()D", "f", "Ljava/lang/Double;", "Z2", "()Ljava/lang/Double;", "g", "D3", "h", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Fo.b, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class Price implements nk.b, Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currencyIso;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formattedValue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double value;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double averagePoundEach;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceText;
    public static final Parcelable.Creator<Price> CREATOR = new C0176b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fo.b$b, reason: collision with other inner class name */
    public static final class C0176b implements Parcelable.Creator<Price> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Price createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new Price(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Price[] newArray(int i10) {
            return new Price[i10];
        }
    }

    public Price() {
        this(null, null, null, null, 0.0d, null, null, l3.f93324d, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Price)) {
            return false;
        }
        Price price = (Price) other;
        return Intrinsics.e(this.currencyIso, price.currencyIso) && Intrinsics.e(this.formattedValue, price.formattedValue) && Intrinsics.e(this.priceType, price.priceType) && Intrinsics.e(this.unit, price.unit) && Double.compare(this.value, price.value) == 0 && Intrinsics.e(this.averagePoundEach, price.averagePoundEach) && Intrinsics.e(this.priceText, price.priceText);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.currencyIso);
        dest.writeString(this.formattedValue);
        dest.writeString(this.priceType);
        dest.writeString(this.unit);
        dest.writeDouble(this.value);
        Double d10 = this.averagePoundEach;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        dest.writeString(this.priceText);
    }

    public Price(String str, String formattedValue, String str2, String str3, double d10, Double d11, String str4) {
        Intrinsics.j(formattedValue, "formattedValue");
        this.currencyIso = str;
        this.formattedValue = formattedValue;
        this.priceType = str2;
        this.unit = str3;
        this.value = d10;
        this.averagePoundEach = d11;
        this.priceText = str4;
    }

    @Override // nk.b
    /* renamed from: D3, reason: from getter */
    public String getPriceText() {
        return this.priceText;
    }

    @Override // nk.b
    /* renamed from: K3, reason: from getter */
    public String getCurrencyIso() {
        return this.currencyIso;
    }

    @Override // nk.b
    /* renamed from: O3, reason: from getter */
    public String getFormattedValue() {
        return this.formattedValue;
    }

    @Override // nk.b
    /* renamed from: Z2, reason: from getter */
    public Double getAveragePoundEach() {
        return this.averagePoundEach;
    }

    /* renamed from: a, reason: from getter */
    public final String getPriceType() {
        return this.priceType;
    }

    @Override // nk.b
    public double getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.currencyIso;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.formattedValue.hashCode()) * 31;
        String str2 = this.priceType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.unit;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Double.hashCode(this.value)) * 31;
        Double d10 = this.averagePoundEach;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str4 = this.priceText;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // nk.b
    /* renamed from: p, reason: from getter */
    public String getUnit() {
        return this.unit;
    }

    public String toString() {
        return "Price(currencyIso=" + this.currencyIso + ", formattedValue=" + this.formattedValue + ", priceType=" + this.priceType + ", unit=" + this.unit + ", value=" + this.value + ", averagePoundEach=" + this.averagePoundEach + ", priceText=" + this.priceText + ')';
    }

    public /* synthetic */ Price(String str, String str2, String str3, String str4, double d10, Double d11, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "BUY" : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? 0.0d : d10, (i10 & 32) != 0 ? Double.valueOf(0.0d) : d11, (i10 & 64) != 0 ? null : str5);
    }
}
