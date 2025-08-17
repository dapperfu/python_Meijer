package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class N9 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10776l7 f82797a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10824o7 f82798b;

    public N9(InterfaceC10776l7 interfaceC10776l7) {
        this.f82797a = interfaceC10776l7;
        this.f82798b = null;
    }

    public N9(InterfaceC10824o7 interfaceC10824o7) {
        this.f82797a = null;
        this.f82798b = interfaceC10824o7;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        InterfaceC10776l7 interfaceC10776l7 = this.f82797a;
        return interfaceC10776l7 != null ? interfaceC10776l7.zza(bArr, bArr2) : this.f82798b.zza(bArr, bArr2);
    }
}
