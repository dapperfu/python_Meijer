package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Nm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7005Nm extends AbstractC15136a {
    public static final Parcelable.Creator<C7005Nm> CREATOR = new C7039Om();

    /* renamed from: a, reason: collision with root package name */
    public final int f68944a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68945b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68946c;

    public static C7005Nm B(Ec.q qVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C7005Nm)) {
            C7005Nm c7005Nm = (C7005Nm) obj;
            if (c7005Nm.f68946c == this.f68946c && c7005Nm.f68945b == this.f68945b && c7005Nm.f68944a == this.f68944a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f68944a, this.f68945b, this.f68946c});
    }

    public final String toString() {
        return this.f68944a + "." + this.f68945b + "." + this.f68946c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f68944a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, this.f68945b);
        C15137b.n(parcel, 3, this.f68946c);
        C15137b.b(parcel, iA);
    }

    C7005Nm(int i10, int i11, int i12) {
        this.f68944a = i10;
        this.f68945b = i11;
        this.f68946c = i12;
    }
}
