package ok;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lok/a;", "Landroid/os/Parcelable;", "", "fuelPrice", "Lok/b;", "fuelType", "j$/time/LocalDateTime", "priceEffectiveDate", "<init>", "(DLok/b;Lj$/time/LocalDateTime;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "setFuelPrice", "(D)V", "b", "Lok/b;", "()Lok/b;", "setFuelType", "(Lok/b;)V", "c", "Lj$/time/LocalDateTime;", "getPriceEffectiveDate", "()Lj$/time/LocalDateTime;", "setPriceEffectiveDate", "(Lj$/time/LocalDateTime;)V", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ok.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class FuelPrice implements Parcelable {
    public static final Parcelable.Creator<FuelPrice> CREATOR = new C2392a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private double fuelPrice;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private EnumC16091b fuelType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private LocalDateTime priceEffectiveDate;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ok.a$a, reason: collision with other inner class name */
    public static final class C2392a implements Parcelable.Creator<FuelPrice> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FuelPrice createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new FuelPrice(parcel.readDouble(), parcel.readInt() == 0 ? null : EnumC16091b.CREATOR.createFromParcel(parcel), (LocalDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FuelPrice[] newArray(int i10) {
            return new FuelPrice[i10];
        }
    }

    public FuelPrice() {
        this(0.0d, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuelPrice)) {
            return false;
        }
        FuelPrice fuelPrice = (FuelPrice) other;
        return Double.compare(this.fuelPrice, fuelPrice.fuelPrice) == 0 && this.fuelType == fuelPrice.fuelType && Intrinsics.e(this.priceEffectiveDate, fuelPrice.priceEffectiveDate);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeDouble(this.fuelPrice);
        EnumC16091b enumC16091b = this.fuelType;
        if (enumC16091b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            enumC16091b.writeToParcel(dest, flags);
        }
        dest.writeSerializable(this.priceEffectiveDate);
    }

    public FuelPrice(double d10, EnumC16091b enumC16091b, LocalDateTime localDateTime) {
        this.fuelPrice = d10;
        this.fuelType = enumC16091b;
        this.priceEffectiveDate = localDateTime;
    }

    /* renamed from: a, reason: from getter */
    public final double getFuelPrice() {
        return this.fuelPrice;
    }

    /* renamed from: b, reason: from getter */
    public final EnumC16091b getFuelType() {
        return this.fuelType;
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.fuelPrice) * 31;
        EnumC16091b enumC16091b = this.fuelType;
        int iHashCode2 = (iHashCode + (enumC16091b == null ? 0 : enumC16091b.hashCode())) * 31;
        LocalDateTime localDateTime = this.priceEffectiveDate;
        return iHashCode2 + (localDateTime != null ? localDateTime.hashCode() : 0);
    }

    public String toString() {
        return "FuelPrice(fuelPrice=" + this.fuelPrice + ", fuelType=" + this.fuelType + ", priceEffectiveDate=" + this.priceEffectiveDate + ')';
    }

    public /* synthetic */ FuelPrice(double d10, EnumC16091b enumC16091b, LocalDateTime localDateTime, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? null : enumC16091b, (i10 & 4) != 0 ? null : localDateTime);
    }
}
