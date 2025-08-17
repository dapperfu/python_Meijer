package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9762vw extends AbstractC7183Su {
    @Override // com.google.android.gms.internal.ads.AbstractC7183Su
    public final C9328rt c(C9328rt c9328rt) throws zzcg {
        int i10 = c9328rt.f78082c;
        if (i10 != 3) {
            if (i10 == 2) {
                return C9328rt.f78079e;
            }
            if (i10 != 268435456 && i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4) {
                throw new zzcg("Unhandled input format:", c9328rt);
            }
        }
        return new C9328rt(c9328rt.f78080a, c9328rt.f78081b, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9330ru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9762vw.a(java.nio.ByteBuffer):void");
    }
}
