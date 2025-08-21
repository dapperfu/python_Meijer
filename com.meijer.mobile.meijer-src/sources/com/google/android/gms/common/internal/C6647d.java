package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.common.internal.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6647d extends AbstractC15707a {
    public static final Parcelable.Creator<C6647d> CREATOR = new C6668z();

    /* renamed from: a, reason: collision with root package name */
    public final int f65675a;

    /* renamed from: b, reason: collision with root package name */
    public final String f65676b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6647d)) {
            return false;
        }
        C6647d c6647d = (C6647d) obj;
        return c6647d.f65675a == this.f65675a && C6660q.a(c6647d.f65676b, this.f65676b);
    }

    public final int hashCode() {
        return this.f65675a;
    }

    public final String toString() {
        return this.f65675a + ":" + this.f65676b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f65675a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.w(parcel, 2, this.f65676b, false);
        C15708b.b(parcel, iA);
    }

    public C6647d(int i10, String str) {
        this.f65675a = i10;
        this.f65676b = str;
    }
}
