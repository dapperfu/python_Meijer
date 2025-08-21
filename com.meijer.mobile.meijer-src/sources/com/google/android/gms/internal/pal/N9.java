package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class N9 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10901l7 f83637a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10949o7 f83638b;

    public N9(InterfaceC10901l7 interfaceC10901l7) {
        this.f83637a = interfaceC10901l7;
        this.f83638b = null;
    }

    public N9(InterfaceC10949o7 interfaceC10949o7) {
        this.f83637a = null;
        this.f83638b = interfaceC10949o7;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        InterfaceC10901l7 interfaceC10901l7 = this.f83637a;
        return interfaceC10901l7 != null ? interfaceC10901l7.zza(bArr, bArr2) : this.f83638b.zza(bArr, bArr2);
    }
}
