package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class C8 implements InterfaceC10776l7 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f82508c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final C10957wd f82509a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10776l7 f82510b;

    public C8(C10957wd c10957wd, InterfaceC10776l7 interfaceC10776l7) {
        this.f82509a = c10957wd;
        this.f82510b = interfaceC10776l7;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10776l7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrI = Z7.d(this.f82509a).i();
        byte[] bArrZza = this.f82510b.zza(bArrI, f82508c);
        byte[] bArrZza2 = ((InterfaceC10776l7) Z7.i(this.f82509a.y(), bArrI, InterfaceC10776l7.class)).zza(bArr, bArr2);
        int length = bArrZza.length;
        return ByteBuffer.allocate(length + 4 + bArrZza2.length).putInt(length).put(bArrZza).put(bArrZza2).array();
    }
}
