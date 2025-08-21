package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class zznd extends AbstractC15707a {
    public static final Parcelable.Creator<zznd> CREATOR = new zzne();
    private final String zza;

    public final String zza() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.b(parcel, iA);
    }

    public zznd(String str) {
        this.zza = str;
    }
}
