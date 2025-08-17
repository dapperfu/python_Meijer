package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Sj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7172Sj extends AbstractC15136a {
    public static final Parcelable.Creator<C7172Sj> CREATOR = new C7206Tj();

    /* renamed from: a, reason: collision with root package name */
    public final String f70149a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f70150b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f70149a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.e(parcel, 2, this.f70150b, false);
        C15137b.b(parcel, iA);
    }

    public C7172Sj(String str, Bundle bundle) {
        this.f70149a = str;
        this.f70150b = bundle;
    }
}
