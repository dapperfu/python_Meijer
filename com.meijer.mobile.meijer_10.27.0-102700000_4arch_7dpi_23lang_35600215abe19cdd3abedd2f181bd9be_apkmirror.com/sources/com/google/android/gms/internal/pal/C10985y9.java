package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.y9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10985y9 implements InterfaceC10856q7 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f84235e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final C10798md f84236a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC11001z9 f84237b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10921u9 f84238c;

    /* renamed from: d, reason: collision with root package name */
    private final C10905t9 f84239d;

    private C10985y9(C10798md c10798md, InterfaceC11001z9 interfaceC11001z9, C10905t9 c10905t9, InterfaceC10921u9 interfaceC10921u9, byte[] bArr) {
        this.f84236a = c10798md;
        this.f84237b = interfaceC11001z9;
        this.f84239d = c10905t9;
        this.f84238c = interfaceC10921u9;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10856q7
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        C10798md c10798md = this.f84236a;
        InterfaceC11001z9 interfaceC11001z9 = this.f84237b;
        C10905t9 c10905t9 = this.f84239d;
        InterfaceC10921u9 interfaceC10921u9 = this.f84238c;
        A9 a9A = interfaceC11001z9.a(c10798md.A().z());
        C10937v9 c10937v9C = C10937v9.c(a9A.a(), a9A.b(), interfaceC11001z9, c10905t9, interfaceC10921u9, bArr3);
        return C10910te.c(c10937v9C.a(), c10937v9C.b(bArr, f84235e));
    }

    static C10985y9 a(C10798md c10798md) throws GeneralSecurityException {
        if (!c10798md.A().y()) {
            C10702gd c10702gdU = c10798md.u();
            return new C10985y9(c10798md, C9.b(c10702gdU), C9.c(c10702gdU), C9.a(c10702gdU), null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
