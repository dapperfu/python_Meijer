package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Nm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7130Nm extends AbstractC15707a {
    public static final Parcelable.Creator<C7130Nm> CREATOR = new C7164Om();

    /* renamed from: a, reason: collision with root package name */
    public final int f69784a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69785b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69786c;

    public static C7130Nm B(Gc.q qVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C7130Nm)) {
            C7130Nm c7130Nm = (C7130Nm) obj;
            if (c7130Nm.f69786c == this.f69786c && c7130Nm.f69785b == this.f69785b && c7130Nm.f69784a == this.f69784a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f69784a, this.f69785b, this.f69786c});
    }

    public final String toString() {
        return this.f69784a + "." + this.f69785b + "." + this.f69786c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f69784a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.n(parcel, 2, this.f69785b);
        C15708b.n(parcel, 3, this.f69786c);
        C15708b.b(parcel, iA);
    }

    C7130Nm(int i10, int i11, int i12) {
        this.f69784a = i10;
        this.f69785b = i11;
        this.f69786c = i12;
    }
}
