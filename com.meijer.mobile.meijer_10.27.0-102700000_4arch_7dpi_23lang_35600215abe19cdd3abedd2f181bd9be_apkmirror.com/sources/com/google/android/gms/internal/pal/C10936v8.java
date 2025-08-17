package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.pal.v8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10936v8 extends Y9 {
    @Override // com.google.android.gms.internal.pal.Y9
    public final W9 a() {
        return new C10904t8(this, C10651dc.class);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    C10936v8() {
        super(Zb.class, new C10888s8(InterfaceC10776l7.class));
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
    public final EnumC10862qd b() {
        return EnumC10862qd.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* bridge */ /* synthetic */ void e(InterfaceC10690g1 interfaceC10690g1) throws GeneralSecurityException {
        Zb zb2 = (Zb) interfaceC10690g1;
        Ye.b(zb2.t(), 0);
        Ye.a(zb2.y().f());
    }

    public static void k(boolean z10) throws GeneralSecurityException {
        if (m()) {
            Z7.n(new C10936v8(), true);
        }
    }

    static /* bridge */ /* synthetic */ V9 l(int i10, int i11) {
        C10634cc c10634ccU = C10651dc.u();
        c10634ccU.m(i10);
        return new V9((C10651dc) c10634ccU.j(), i11);
    }

    @Override // com.google.android.gms.internal.pal.Y9
    public final /* synthetic */ InterfaceC10690g1 c(AbstractC10605b0 abstractC10605b0) throws zzadi {
        return Zb.w(abstractC10605b0, C10833p0.a());
    }
}
