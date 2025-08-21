package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class Scope extends AbstractC15707a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    final int f65572a;

    /* renamed from: b, reason: collision with root package name */
    private final String f65573b;

    Scope(int i10, String str) {
        r.g(str, "scopeUri must not be null or empty");
        this.f65572a = i10;
        this.f65573b = str;
    }

    public String B() {
        return this.f65573b;
    }

    public String toString() {
        return this.f65573b;
    }

    public Scope(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f65573b.equals(((Scope) obj).f65573b);
        }
        return false;
    }

    public int hashCode() {
        return this.f65573b.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f65572a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.w(parcel, 2, B(), false);
        C15708b.b(parcel, iA);
    }
}
