package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.rp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9320rp extends AbstractC15136a {
    public static final Parcelable.Creator<C9320rp> CREATOR = new C9427sp();

    /* renamed from: a, reason: collision with root package name */
    public final String f78066a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78067b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f78066a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.w(parcel, 2, this.f78067b, false);
        C15137b.b(parcel, iA);
    }

    public C9320rp(String str, String str2) {
        this.f78066a = str;
        this.f78067b = str2;
    }
}
