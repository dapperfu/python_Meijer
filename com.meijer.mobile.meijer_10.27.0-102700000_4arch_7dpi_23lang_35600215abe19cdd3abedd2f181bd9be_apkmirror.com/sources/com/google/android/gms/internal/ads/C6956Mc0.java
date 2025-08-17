package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Mc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6956Mc0 extends AbstractC15136a {
    public static final Parcelable.Creator<C6956Mc0> CREATOR = new C6990Nc0();

    /* renamed from: a, reason: collision with root package name */
    public final int f68674a;

    /* renamed from: b, reason: collision with root package name */
    private H8 f68675b = null;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f68676c;

    private final void zzb() {
        H8 h82 = this.f68675b;
        if (h82 != null || this.f68676c == null) {
            if (h82 == null || this.f68676c != null) {
                if (h82 != null && this.f68676c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (h82 != null || this.f68676c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final H8 B() {
        if (this.f68675b == null) {
            try {
                this.f68675b = H8.X0(this.f68676c, C9225qu0.a());
                this.f68676c = null;
            } catch (zzgyg | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.f68675b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f68674a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        byte[] bArrJ = this.f68676c;
        if (bArrJ == null) {
            bArrJ = this.f68675b.j();
        }
        C15137b.g(parcel, 2, bArrJ, false);
        C15137b.b(parcel, iA);
    }

    C6956Mc0(int i10, byte[] bArr) {
        this.f68674a = i10;
        this.f68676c = bArr;
        zzb();
    }
}
