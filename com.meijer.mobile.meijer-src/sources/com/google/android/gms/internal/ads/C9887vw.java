package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9887vw extends AbstractC7308Su {
    @Override // com.google.android.gms.internal.ads.AbstractC7308Su
    public final C9453rt c(C9453rt c9453rt) throws zzcg {
        int i10 = c9453rt.f78922c;
        if (i10 != 3) {
            if (i10 == 2) {
                return C9453rt.f78919e;
            }
            if (i10 != 268435456 && i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4) {
                throw new zzcg("Unhandled input format:", c9453rt);
            }
        }
        return new C9453rt(c9453rt.f78920a, c9453rt.f78921b, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9455ru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9887vw.a(java.nio.ByteBuffer):void");
    }
}
