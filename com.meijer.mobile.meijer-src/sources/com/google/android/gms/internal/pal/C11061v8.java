package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.pal.v8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11061v8 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C11029t8(this, C10776dc.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    C11061v8() {
        super(Zb.class, new C11013s8(InterfaceC10901l7.class));
    }

    private static boolean m() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final EnumC10987qd b() {
        return EnumC10987qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Zb zb2 = (Zb) interfaceC10815g1;
        Ye.b(zb2.t(), 0);
        Ye.a(zb2.y().f());
    }

    public static void k(boolean z10) throws GeneralSecurityException {
        if (m()) {
            Z7.n(new C11061v8(), true);
        }
    }

    static /* bridge */ /* synthetic */ V9 l(int i10, int i11) {
        C10759cc c10759ccU = C10776dc.u();
        c10759ccU.m(i10);
        return new V9((C10776dc) c10759ccU.j(), i11);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10815g1 c(AbstractC10730b0 abstractC10730b0) throws zzadi {
        return Zb.w(abstractC10730b0, C10958p0.a());
    }
}
