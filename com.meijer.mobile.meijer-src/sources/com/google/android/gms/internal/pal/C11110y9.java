package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.y9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11110y9 implements InterfaceC10981q7 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f85075e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final C10923md f85076a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC11126z9 f85077b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC11046u9 f85078c;

    /* renamed from: d, reason: collision with root package name */
    private final C11030t9 f85079d;

    private C11110y9(C10923md c10923md, InterfaceC11126z9 interfaceC11126z9, C11030t9 c11030t9, InterfaceC11046u9 interfaceC11046u9, byte[] bArr) {
        this.f85076a = c10923md;
        this.f85077b = interfaceC11126z9;
        this.f85079d = c11030t9;
        this.f85078c = interfaceC11046u9;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10981q7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        C10923md c10923md = this.f85076a;
        InterfaceC11126z9 interfaceC11126z9 = this.f85077b;
        C11030t9 c11030t9 = this.f85079d;
        InterfaceC11046u9 interfaceC11046u9 = this.f85078c;
        A9 a9A = interfaceC11126z9.a(c10923md.A().z());
        C11062v9 c11062v9C = C11062v9.c(a9A.a(), a9A.b(), interfaceC11126z9, c11030t9, interfaceC11046u9, bArr3);
        return C11035te.c(c11062v9C.a(), c11062v9C.b(bArr, f85075e));
    }

    static C11110y9 a(C10923md c10923md) throws GeneralSecurityException {
        if (!c10923md.A().y()) {
            C10827gd c10827gdU = c10923md.u();
            return new C11110y9(c10923md, C9.b(c10827gdU), C9.c(c10827gdU), C9.a(c10827gdU), null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
