package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class E extends AbstractC15136a implements Iterable<String> {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f84968a;

    final /* synthetic */ Bundle d1() {
        return this.f84968a;
    }

    final Object B(String str) {
        return this.f84968a.get(str);
    }

    public final int K0() {
        return this.f84968a.size();
    }

    final Long T(String str) {
        return Long.valueOf(this.f84968a.getLong(str));
    }

    public final Bundle W0() {
        return new Bundle(this.f84968a);
    }

    final Double c0(String str) {
        return Double.valueOf(this.f84968a.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new D(this);
    }

    final String q0(String str) {
        return this.f84968a.getString(str);
    }

    public final String toString() {
        return this.f84968a.toString();
    }

    E(Bundle bundle) {
        this.f84968a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.e(parcel, 2, W0(), false);
        C15137b.b(parcel, iA);
    }
}
