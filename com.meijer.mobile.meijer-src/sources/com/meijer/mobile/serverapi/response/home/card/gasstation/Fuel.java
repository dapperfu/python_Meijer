package com.meijer.mobile.serverapi.response.home.card.gasstation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/serverapi/response/home/card/gasstation/Fuel;", "Landroid/os/Parcelable;", "fuelPrice", "", "fuelType", "Lcom/meijer/mobile/serverapi/response/home/card/gasstation/Fuel$FuelType;", "<init>", "(DLcom/meijer/mobile/serverapi/response/home/card/gasstation/Fuel$FuelType;)V", "getFuelPrice", "()D", "getFuelType", "()Lcom/meijer/mobile/serverapi/response/home/card/gasstation/Fuel$FuelType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "FuelType", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Fuel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Fuel> CREATOR = new Creator();

    @InterfaceC16127c("price")
    private final double fuelPrice;

    @InterfaceC16127c("type")
    private final FuelType fuelType;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Fuel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Fuel createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new Fuel(parcel.readDouble(), parcel.readInt() == 0 ? null : FuelType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Fuel[] newArray(int i10) {
            return new Fuel[i10];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/serverapi/response/home/card/gasstation/Fuel$FuelType;", "", "fuelTypeName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFuelTypeName", "()Ljava/lang/String;", "REGULAR", "MIDGRADE", "PREMIUM", "DIESEL", "E85", "E15", "KEROSENE", "RECETHANOL", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FuelType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FuelType[] $VALUES;
        private final String fuelTypeName;

        @InterfaceC16127c("Regular")
        public static final FuelType REGULAR = new FuelType("REGULAR", 0, "Regular");

        @InterfaceC16127c("Mid Grade")
        public static final FuelType MIDGRADE = new FuelType("MIDGRADE", 1, "Mid-Grade");

        @InterfaceC16127c("Premium")
        public static final FuelType PREMIUM = new FuelType("PREMIUM", 2, "Premium");

        @InterfaceC16127c("Diesel")
        public static final FuelType DIESEL = new FuelType("DIESEL", 3, "Diesel");

        @InterfaceC16127c("E85")
        public static final FuelType E85 = new FuelType("E85", 4, "E-85");

        @InterfaceC16127c("E15-Unleaded 88")
        public static final FuelType E15 = new FuelType("E15", 5, "E-15");

        @InterfaceC16127c("Kerosene")
        public static final FuelType KEROSENE = new FuelType("KEROSENE", 6, "Kerosene");

        @InterfaceC16127c("REC-Ethanol free rec fuel")
        public static final FuelType RECETHANOL = new FuelType("RECETHANOL", 7, "REC-Ethanol free rec fuel");

        private static final /* synthetic */ FuelType[] $values() {
            return new FuelType[]{REGULAR, MIDGRADE, PREMIUM, DIESEL, E85, E15, KEROSENE, RECETHANOL};
        }

        public static EnumEntries<FuelType> getEntries() {
            return $ENTRIES;
        }

        static {
            FuelType[] fuelTypeArr$values = $values();
            $VALUES = fuelTypeArr$values;
            $ENTRIES = EnumEntriesKt.a(fuelTypeArr$values);
        }

        public static FuelType valueOf(String str) {
            return (FuelType) Enum.valueOf(FuelType.class, str);
        }

        public static FuelType[] values() {
            return (FuelType[]) $VALUES.clone();
        }

        public final String getFuelTypeName() {
            return this.fuelTypeName;
        }

        private FuelType(String str, int i10, String str2) {
            this.fuelTypeName = str2;
        }
    }

    public Fuel() {
        this(0.0d, null, 3, null);
    }

    public static /* synthetic */ Fuel copy$default(Fuel fuel, double d10, FuelType fuelType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = fuel.fuelPrice;
        }
        if ((i10 & 2) != 0) {
            fuelType = fuel.fuelType;
        }
        return fuel.copy(d10, fuelType);
    }

    /* renamed from: component1, reason: from getter */
    public final double getFuelPrice() {
        return this.fuelPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final FuelType getFuelType() {
        return this.fuelType;
    }

    public final Fuel copy(double fuelPrice, FuelType fuelType) {
        return new Fuel(fuelPrice, fuelType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Fuel)) {
            return false;
        }
        Fuel fuel = (Fuel) other;
        return Double.compare(this.fuelPrice, fuel.fuelPrice) == 0 && this.fuelType == fuel.fuelType;
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.fuelPrice) * 31;
        FuelType fuelType = this.fuelType;
        return iHashCode + (fuelType == null ? 0 : fuelType.hashCode());
    }

    public String toString() {
        return "Fuel(fuelPrice=" + this.fuelPrice + ", fuelType=" + this.fuelType + ')';
    }

    public Fuel(double d10, FuelType fuelType) {
        this.fuelPrice = d10;
        this.fuelType = fuelType;
    }

    public final double getFuelPrice() {
        return this.fuelPrice;
    }

    public final FuelType getFuelType() {
        return this.fuelType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeDouble(this.fuelPrice);
        FuelType fuelType = this.fuelType;
        if (fuelType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fuelType.name());
        }
    }

    public /* synthetic */ Fuel(double d10, FuelType fuelType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? null : fuelType);
    }
}
