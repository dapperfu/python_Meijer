package com.google.android.gms.internal.pal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class P5 extends AbstractC15707a {
    public static final Parcelable.Creator<P5> CREATOR = new Q5();

    /* renamed from: a, reason: collision with root package name */
    public final int f83670a;

    /* renamed from: b, reason: collision with root package name */
    private B1 f83671b = null;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f83672c;

    private final void zzb() {
        B1 b12 = this.f83671b;
        if (b12 != null || this.f83672c == null) {
            if (b12 == null || this.f83672c != null) {
                if (b12 != null && this.f83672c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (b12 != null || this.f83672c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final B1 B() {
        if (this.f83671b == null) {
            try {
                this.f83671b = B1.p0(this.f83672c, C10958p0.a());
                this.f83672c = null;
            } catch (zzadi | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.f83671b;
    }

    P5(int i10, byte[] bArr) {
        this.f83670a = i10;
        this.f83672c = bArr;
        zzb();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f83670a);
        byte[] bArrI = this.f83672c;
        if (bArrI == null) {
            bArrI = this.f83671b.i();
        }
        C15708b.g(parcel, 2, bArrI, false);
        C15708b.b(parcel, iA);
    }
}
