package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class J0 extends AbstractC15136a {
    public static final Parcelable.Creator<J0> CREATOR = new K0();

    /* renamed from: a, reason: collision with root package name */
    public final int f81801a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81802b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f81803c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        return this.f81801a == j02.f81801a && Objects.equals(this.f81802b, j02.f81802b) && Objects.equals(this.f81803c, j02.f81803c);
    }

    public final int hashCode() {
        return this.f81801a;
    }

    public static J0 B(Activity activity) {
        return new J0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f81801a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.w(parcel, 2, this.f81802b, false);
        C15137b.u(parcel, 3, this.f81803c, i10, false);
        C15137b.b(parcel, iA);
    }

    public J0(int i10, String str, Intent intent) {
        this.f81801a = i10;
        this.f81802b = str;
        this.f81803c = intent;
    }
}
