package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Sj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7297Sj extends AbstractC15707a {
    public static final Parcelable.Creator<C7297Sj> CREATOR = new C7331Tj();

    /* renamed from: a, reason: collision with root package name */
    public final String f70989a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f70990b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f70989a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.e(parcel, 2, this.f70990b, false);
        C15708b.b(parcel, iA);
    }

    public C7297Sj(String str, Bundle bundle) {
        this.f70989a = str;
        this.f70990b = bundle;
    }
}
