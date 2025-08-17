package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import gd.C14244c;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class h0 extends AbstractC15136a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    Bundle f64881a;

    /* renamed from: b, reason: collision with root package name */
    C14244c[] f64882b;

    /* renamed from: c, reason: collision with root package name */
    int f64883c;

    /* renamed from: d, reason: collision with root package name */
    C6524f f64884d;

    public h0() {
    }

    h0(Bundle bundle, C14244c[] c14244cArr, int i10, C6524f c6524f) {
        this.f64881a = bundle;
        this.f64882b = c14244cArr;
        this.f64883c = i10;
        this.f64884d = c6524f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.e(parcel, 1, this.f64881a, false);
        C15137b.z(parcel, 2, this.f64882b, i10, false);
        C15137b.n(parcel, 3, this.f64883c);
        C15137b.u(parcel, 4, this.f64884d, i10, false);
        C15137b.b(parcel, iA);
    }
}
