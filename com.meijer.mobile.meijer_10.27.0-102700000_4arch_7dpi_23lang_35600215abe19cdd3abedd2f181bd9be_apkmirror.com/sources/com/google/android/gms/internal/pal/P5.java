package com.google.android.gms.internal.pal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class P5 extends AbstractC15136a {
    public static final Parcelable.Creator<P5> CREATOR = new Q5();

    /* renamed from: a, reason: collision with root package name */
    public final int f82830a;

    /* renamed from: b, reason: collision with root package name */
    private B1 f82831b = null;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f82832c;

    private final void zzb() {
        B1 b12 = this.f82831b;
        if (b12 != null || this.f82832c == null) {
            if (b12 == null || this.f82832c != null) {
                if (b12 != null && this.f82832c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (b12 != null || this.f82832c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final B1 B() {
        if (this.f82831b == null) {
            try {
                this.f82831b = B1.p0(this.f82832c, C10833p0.a());
                this.f82832c = null;
            } catch (zzadi | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.f82831b;
    }

    P5(int i10, byte[] bArr) {
        this.f82830a = i10;
        this.f82832c = bArr;
        zzb();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f82830a);
        byte[] bArrI = this.f82832c;
        if (bArrI == null) {
            bArrI = this.f82831b.i();
        }
        C15137b.g(parcel, 2, bArrI, false);
        C15137b.b(parcel, iA);
    }
}
