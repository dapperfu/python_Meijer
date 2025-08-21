package pk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Lpk/d;", "Landroid/os/Parcelable;", "", "amenityType", "amenityGroupType", "", "auxiliaryUnitId", "unitId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getAmenityGroupType", "c", "Ljava/lang/Integer;", "getAuxiliaryUnitId", "()Ljava/lang/Integer;", "d", "getUnitId", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pk.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class GasStationAmenity implements Parcelable {
    public static final Parcelable.Creator<GasStationAmenity> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String amenityType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String amenityGroupType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer auxiliaryUnitId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer unitId;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.d$a */
    public static final class a implements Parcelable.Creator<GasStationAmenity> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GasStationAmenity createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new GasStationAmenity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GasStationAmenity[] newArray(int i10) {
            return new GasStationAmenity[i10];
        }
    }

    public GasStationAmenity(String str, String str2, Integer num, Integer num2) {
        this.amenityType = str;
        this.amenityGroupType = str2;
        this.auxiliaryUnitId = num;
        this.unitId = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GasStationAmenity)) {
            return false;
        }
        GasStationAmenity gasStationAmenity = (GasStationAmenity) other;
        return Intrinsics.e(this.amenityType, gasStationAmenity.amenityType) && Intrinsics.e(this.amenityGroupType, gasStationAmenity.amenityGroupType) && Intrinsics.e(this.auxiliaryUnitId, gasStationAmenity.auxiliaryUnitId) && Intrinsics.e(this.unitId, gasStationAmenity.unitId);
    }

    /* renamed from: a, reason: from getter */
    public final String getAmenityType() {
        return this.amenityType;
    }

    public int hashCode() {
        String str = this.amenityType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amenityGroupType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.auxiliaryUnitId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unitId;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "GasStationAmenity(amenityType=" + this.amenityType + ", amenityGroupType=" + this.amenityGroupType + ", auxiliaryUnitId=" + this.auxiliaryUnitId + ", unitId=" + this.unitId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.amenityType);
        dest.writeString(this.amenityGroupType);
        Integer num = this.auxiliaryUnitId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.unitId;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GasStationAmenity(String amenityType) {
        this(amenityType, "", 0, 0);
        Intrinsics.j(amenityType, "amenityType");
    }
}
