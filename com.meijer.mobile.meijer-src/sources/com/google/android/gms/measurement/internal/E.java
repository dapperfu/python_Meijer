package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class E extends AbstractC15707a implements Iterable<String> {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f85808a;

    final /* synthetic */ Bundle d1() {
        return this.f85808a;
    }

    final Object B(String str) {
        return this.f85808a.get(str);
    }

    public final int I0() {
        return this.f85808a.size();
    }

    final Long T(String str) {
        return Long.valueOf(this.f85808a.getLong(str));
    }

    public final Bundle U0() {
        return new Bundle(this.f85808a);
    }

    final Double b0(String str) {
        return Double.valueOf(this.f85808a.getDouble("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new D(this);
    }

    final String r0(String str) {
        return this.f85808a.getString(str);
    }

    public final String toString() {
        return this.f85808a.toString();
    }

    E(Bundle bundle) {
        this.f85808a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.e(parcel, 2, U0(), false);
        C15708b.b(parcel, iA);
    }
}
