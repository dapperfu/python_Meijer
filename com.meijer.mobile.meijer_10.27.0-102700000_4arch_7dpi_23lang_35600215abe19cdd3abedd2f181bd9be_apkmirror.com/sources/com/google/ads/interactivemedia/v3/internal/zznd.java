package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class zznd extends AbstractC15136a {
    public static final Parcelable.Creator<zznd> CREATOR = new zzne();
    private final String zza;

    public final String zza() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.b(parcel, iA);
    }

    public zznd(String str) {
        this.zza = str;
    }
}
