package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Mc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7081Mc0 extends AbstractC15707a {
    public static final Parcelable.Creator<C7081Mc0> CREATOR = new C7115Nc0();

    /* renamed from: a, reason: collision with root package name */
    public final int f69514a;

    /* renamed from: b, reason: collision with root package name */
    private H8 f69515b = null;

    /* renamed from: c, reason: collision with root package name */
    private byte[] f69516c;

    private final void zzb() {
        H8 h82 = this.f69515b;
        if (h82 != null || this.f69516c == null) {
            if (h82 == null || this.f69516c != null) {
                if (h82 != null && this.f69516c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (h82 != null || this.f69516c != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final H8 B() {
        if (this.f69515b == null) {
            try {
                this.f69515b = H8.X0(this.f69516c, C9350qu0.a());
                this.f69516c = null;
            } catch (zzgyg | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.f69515b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f69514a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        byte[] bArrJ = this.f69516c;
        if (bArrJ == null) {
            bArrJ = this.f69515b.j();
        }
        C15708b.g(parcel, 2, bArrJ, false);
        C15708b.b(parcel, iA);
    }

    C7081Mc0(int i10, byte[] bArr) {
        this.f69514a = i10;
        this.f69516c = bArr;
        zzb();
    }
}
