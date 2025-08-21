package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class C8 implements InterfaceC10901l7 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f83348c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final C11082wd f83349a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10901l7 f83350b;

    public C8(C11082wd c11082wd, InterfaceC10901l7 interfaceC10901l7) {
        this.f83349a = c11082wd;
        this.f83350b = interfaceC10901l7;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10901l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrI = Z7.d(this.f83349a).i();
        byte[] bArrZza = this.f83350b.zza(bArrI, f83348c);
        byte[] bArrZza2 = ((InterfaceC10901l7) Z7.i(this.f83349a.y(), bArrI, InterfaceC10901l7.class)).zza(bArr, bArr2);
        int length = bArrZza.length;
        return ByteBuffer.allocate(length + 4 + bArrZza2.length).putInt(length).put(bArrZza).put(bArrZza2).array();
    }
}
