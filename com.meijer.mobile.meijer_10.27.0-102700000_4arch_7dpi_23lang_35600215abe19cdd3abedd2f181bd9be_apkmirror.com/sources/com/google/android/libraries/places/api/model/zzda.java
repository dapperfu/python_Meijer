package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.OpeningHours;
import j$.time.Instant;
import java.util.List;

/* loaded from: classes6.dex */
final class zzda extends zzah {
    public static final Parcelable.Creator<zzda> CREATOR = new zzcz();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    zzda(OpeningHours.HoursType hoursType, List list, List list2, List list3, Boolean bool, Instant instant, Instant instant2) {
        super(hoursType, list, list2, list3, bool, instant, instant2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(getHoursType(), i10);
        parcel.writeList(getPeriods());
        parcel.writeList(getSpecialDays());
        parcel.writeList(getWeekdayText());
        if (zza() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(zza().booleanValue() ? 1 : 0);
        }
        if (zzb() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(zzb());
        }
        if (zzc() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(zzc());
        }
    }
}
