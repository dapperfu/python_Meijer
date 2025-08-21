package cr;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.DayOfWeek;
import j$.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Lcr/h;", "Landroid/os/Parcelable;", "j$/time/DayOfWeek", "dayOfWeek", "j$/time/LocalTime", "endTime", "startTime", "<init>", "(Lj$/time/DayOfWeek;Lj$/time/LocalTime;Lj$/time/LocalTime;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj$/time/DayOfWeek;", "getDayOfWeek", "()Lj$/time/DayOfWeek;", "b", "Lj$/time/LocalTime;", "getEndTime", "()Lj$/time/LocalTime;", "c", "getStartTime", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cr.h, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class PreferredTimeslot implements Parcelable {
    public static final Parcelable.Creator<PreferredTimeslot> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DayOfWeek dayOfWeek;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime endTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalTime startTime;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cr.h$a */
    public static final class a implements Parcelable.Creator<PreferredTimeslot> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PreferredTimeslot createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new PreferredTimeslot(DayOfWeek.valueOf(parcel.readString()), (LocalTime) parcel.readSerializable(), (LocalTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PreferredTimeslot[] newArray(int i10) {
            return new PreferredTimeslot[i10];
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
        if (!(other instanceof PreferredTimeslot)) {
            return false;
        }
        PreferredTimeslot preferredTimeslot = (PreferredTimeslot) other;
        return this.dayOfWeek == preferredTimeslot.dayOfWeek && Intrinsics.e(this.endTime, preferredTimeslot.endTime) && Intrinsics.e(this.startTime, preferredTimeslot.startTime);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.dayOfWeek.name());
        dest.writeSerializable(this.endTime);
        dest.writeSerializable(this.startTime);
    }

    public PreferredTimeslot(DayOfWeek dayOfWeek, LocalTime endTime, LocalTime startTime) {
        Intrinsics.j(dayOfWeek, "dayOfWeek");
        Intrinsics.j(endTime, "endTime");
        Intrinsics.j(startTime, "startTime");
        this.dayOfWeek = dayOfWeek;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    public int hashCode() {
        return (((this.dayOfWeek.hashCode() * 31) + this.endTime.hashCode()) * 31) + this.startTime.hashCode();
    }

    public String toString() {
        return "PreferredTimeslot(dayOfWeek=" + this.dayOfWeek + ", endTime=" + this.endTime + ", startTime=" + this.startTime + ')';
    }
}
