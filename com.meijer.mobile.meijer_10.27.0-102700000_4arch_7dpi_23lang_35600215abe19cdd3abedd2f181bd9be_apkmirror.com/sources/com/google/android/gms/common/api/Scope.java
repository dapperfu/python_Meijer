package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class Scope extends AbstractC15136a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    final int f64732a;

    /* renamed from: b, reason: collision with root package name */
    private final String f64733b;

    Scope(int i10, String str) {
        r.g(str, "scopeUri must not be null or empty");
        this.f64732a = i10;
        this.f64733b = str;
    }

    public String B() {
        return this.f64733b;
    }

    public String toString() {
        return this.f64733b;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f64733b.equals(((Scope) obj).f64733b);
        }
        return false;
    }

    public int hashCode() {
        return this.f64733b.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f64732a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.w(parcel, 2, B(), false);
        C15137b.b(parcel, iA);
    }
}
