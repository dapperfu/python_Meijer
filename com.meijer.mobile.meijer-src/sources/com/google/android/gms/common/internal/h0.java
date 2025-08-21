package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import id.C14720c;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class h0 extends AbstractC15707a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    Bundle f65721a;

    /* renamed from: b, reason: collision with root package name */
    C14720c[] f65722b;

    /* renamed from: c, reason: collision with root package name */
    int f65723c;

    /* renamed from: d, reason: collision with root package name */
    C6649f f65724d;

    public h0() {
    }

    h0(Bundle bundle, C14720c[] c14720cArr, int i10, C6649f c6649f) {
        this.f65721a = bundle;
        this.f65722b = c14720cArr;
        this.f65723c = i10;
        this.f65724d = c6649f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.e(parcel, 1, this.f65721a, false);
        C15708b.z(parcel, 2, this.f65722b, i10, false);
        C15708b.n(parcel, 3, this.f65723c);
        C15708b.u(parcel, 4, this.f65724d, i10, false);
        C15708b.b(parcel, iA);
    }
}
