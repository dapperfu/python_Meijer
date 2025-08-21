package com.google.android.gms.internal.pal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.pal.ye, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11115ye implements InterfaceC10981q7 {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f85080f = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final Be f85081a;

    /* renamed from: b, reason: collision with root package name */
    private final String f85082b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f85083c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC11083we f85084d;

    /* renamed from: e, reason: collision with root package name */
    private final int f85085e;

    @Override // com.google.android.gms.internal.pal.InterfaceC10981q7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws IllegalStateException, GeneralSecurityException {
        Ae aeA = this.f85081a.a(this.f85082b, this.f85083c, bArr2, this.f85084d.zza(), this.f85085e);
        byte[] bArrA = this.f85084d.zzb(aeA.b()).a(bArr, f85080f);
        byte[] bArrA2 = aeA.a();
        return ByteBuffer.allocate(bArrA2.length + bArrA.length).put(bArrA2).put(bArrA).array();
    }

    public C11115ye(ECPublicKey eCPublicKey, byte[] bArr, String str, int i10, InterfaceC11083we interfaceC11083we) throws GeneralSecurityException {
        Ce.d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f85081a = new Be(eCPublicKey);
        this.f85083c = bArr;
        this.f85082b = str;
        this.f85085e = i10;
        this.f85084d = interfaceC11083we;
    }
}
