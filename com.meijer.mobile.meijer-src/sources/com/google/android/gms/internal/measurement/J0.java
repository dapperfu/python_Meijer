package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class J0 extends AbstractC15707a {
    public static final Parcelable.Creator<J0> CREATOR = new K0();

    /* renamed from: a, reason: collision with root package name */
    public final int f82641a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82642b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f82643c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        return this.f82641a == j02.f82641a && Objects.equals(this.f82642b, j02.f82642b) && Objects.equals(this.f82643c, j02.f82643c);
    }

    public final int hashCode() {
        return this.f82641a;
    }

    public static J0 B(Activity activity) {
        return new J0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f82641a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.w(parcel, 2, this.f82642b, false);
        C15708b.u(parcel, 3, this.f82643c, i10, false);
        C15708b.b(parcel, iA);
    }

    public J0(int i10, String str, Intent intent) {
        this.f82641a = i10;
        this.f82642b = str;
        this.f82643c = intent;
    }
}
