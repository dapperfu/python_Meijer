package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.pal.ye, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10990ye implements InterfaceC10856q7 {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f84240f = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final Be f84241a;

    /* renamed from: b, reason: collision with root package name */
    private final String f84242b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f84243c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10958we f84244d;

    /* renamed from: e, reason: collision with root package name */
    private final int f84245e;

    @Override // com.google.android.gms.internal.pal.InterfaceC10856q7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws IllegalStateException, GeneralSecurityException {
        Ae aeA = this.f84241a.a(this.f84242b, this.f84243c, bArr2, this.f84244d.zza(), this.f84245e);
        byte[] bArrA = this.f84244d.zzb(aeA.b()).a(bArr, f84240f);
        byte[] bArrA2 = aeA.a();
        return ByteBuffer.allocate(bArrA2.length + bArrA.length).put(bArrA2).put(bArrA).array();
    }

    public C10990ye(ECPublicKey eCPublicKey, byte[] bArr, String str, int i10, InterfaceC10958we interfaceC10958we) throws GeneralSecurityException {
        Ce.d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f84241a = new Be(eCPublicKey);
        this.f84243c = bArr;
        this.f84242b = str;
        this.f84245e = i10;
        this.f84244d = interfaceC10958we;
    }
}
