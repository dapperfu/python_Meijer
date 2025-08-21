package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class V4 implements InterfaceC9049o4 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f71619a = new GQ();

    @Override // com.google.android.gms.internal.ads.InterfaceC9049o4
    public final void a(byte[] bArr, int i10, int i11, C8942n4 c8942n4, ME me2) {
        C7510Yx c7510YxP;
        this.f71619a.j(bArr, i11 + i10);
        this.f71619a.l(i10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            GQ gq2 = this.f71619a;
            if (gq2.r() <= 0) {
                me2.zza(new C8195g4(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            C8211gC.e(gq2.r() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            GQ gq3 = this.f71619a;
            int iW = gq3.w() - 8;
            if (gq3.w() == 1987343459) {
                GQ gq4 = this.f71619a;
                CharSequence charSequenceA = null;
                C7443Ww c7443WwB = null;
                while (iW > 0) {
                    C8211gC.e(iW >= 8, "Incomplete vtt cue box header found.");
                    int iW2 = gq4.w();
                    int iW3 = gq4.w();
                    int i12 = iW - 8;
                    int i13 = iW2 - 8;
                    String strC = OV.c(gq4.n(), gq4.t(), i13);
                    gq4.m(i13);
                    if (iW3 == 1937011815) {
                        c7443WwB = C8090f5.b(strC);
                    } else if (iW3 == 1885436268) {
                        charSequenceA = C8090f5.a(null, strC.trim(), Collections.EMPTY_LIST);
                    }
                    iW = i12 - i13;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (c7443WwB != null) {
                    c7443WwB.l(charSequenceA);
                    c7510YxP = c7443WwB.p();
                } else {
                    C7877d5 c7877d5 = new C7877d5();
                    c7877d5.f74192c = charSequenceA;
                    c7510YxP = c7877d5.a().p();
                }
                arrayList.add(c7510YxP);
            } else {
                this.f71619a.m(iW);
            }
        }
    }
}
