package pk;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lpk/e;", "Landroid/os/Parcelable;", "", "dayOfTheWeek", "j$/time/LocalTime", "openTime", "closeTime", "<init>", "(Ljava/lang/String;Lj$/time/LocalTime;Lj$/time/LocalTime;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lj$/time/LocalTime;", "c", "()Lj$/time/LocalTime;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pk.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class GasStationHour implements Parcelable {
    public static final Parcelable.Creator<GasStationHour> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dayOfTheWeek;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime openTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime closeTime;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.e$a */
    public static final class a implements Parcelable.Creator<GasStationHour> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GasStationHour createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new GasStationHour(parcel.readString(), (LocalTime) parcel.readSerializable(), (LocalTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GasStationHour[] newArray(int i10) {
            return new GasStationHour[i10];
        }
    }

    public GasStationHour() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GasStationHour)) {
            return false;
        }
        GasStationHour gasStationHour = (GasStationHour) other;
        return Intrinsics.e(this.dayOfTheWeek, gasStationHour.dayOfTheWeek) && Intrinsics.e(this.openTime, gasStationHour.openTime) && Intrinsics.e(this.closeTime, gasStationHour.closeTime);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.dayOfTheWeek);
        dest.writeSerializable(this.openTime);
        dest.writeSerializable(this.closeTime);
    }

    public GasStationHour(String str, LocalTime localTime, LocalTime localTime2) {
        this.dayOfTheWeek = str;
        this.openTime = localTime;
        this.closeTime = localTime2;
    }

    /* renamed from: a, reason: from getter */
    public final LocalTime getCloseTime() {
        return this.closeTime;
    }

    /* renamed from: b, reason: from getter */
    public final String getDayOfTheWeek() {
        return this.dayOfTheWeek;
    }

    /* renamed from: c, reason: from getter */
    public final LocalTime getOpenTime() {
        return this.openTime;
    }

    public int hashCode() {
        String str = this.dayOfTheWeek;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocalTime localTime = this.openTime;
        int iHashCode2 = (iHashCode + (localTime == null ? 0 : localTime.hashCode())) * 31;
        LocalTime localTime2 = this.closeTime;
        return iHashCode2 + (localTime2 != null ? localTime2.hashCode() : 0);
    }

    public String toString() {
        return "GasStationHour(dayOfTheWeek=" + this.dayOfTheWeek + ", openTime=" + this.openTime + ", closeTime=" + this.closeTime + ')';
    }

    public /* synthetic */ GasStationHour(String str, LocalTime localTime, LocalTime localTime2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : localTime, (i10 & 4) != 0 ? null : localTime2);
    }
}
