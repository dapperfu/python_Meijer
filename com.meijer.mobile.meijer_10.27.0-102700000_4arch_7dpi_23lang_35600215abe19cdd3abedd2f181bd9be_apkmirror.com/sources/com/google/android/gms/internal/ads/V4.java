package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes6.dex */
public final class V4 implements InterfaceC8924o4 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f70779a = new GQ();

    @Override // com.google.android.gms.internal.ads.InterfaceC8924o4
    public final void a(byte[] bArr, int i10, int i11, C8817n4 c8817n4, ME me2) {
        C7385Yx c7385YxP;
        this.f70779a.j(bArr, i11 + i10);
        this.f70779a.l(i10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            GQ gq2 = this.f70779a;
            if (gq2.r() <= 0) {
                me2.zza(new C8070g4(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            C8086gC.e(gq2.r() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            GQ gq3 = this.f70779a;
            int iW = gq3.w() - 8;
            if (gq3.w() == 1987343459) {
                GQ gq4 = this.f70779a;
                CharSequence charSequenceA = null;
                C7318Ww c7318WwB = null;
                while (iW > 0) {
                    C8086gC.e(iW >= 8, "Incomplete vtt cue box header found.");
                    int iW2 = gq4.w();
                    int iW3 = gq4.w();
                    int i12 = iW - 8;
                    int i13 = iW2 - 8;
                    String strC = OV.c(gq4.n(), gq4.t(), i13);
                    gq4.m(i13);
                    if (iW3 == 1937011815) {
                        c7318WwB = C7965f5.b(strC);
                    } else if (iW3 == 1885436268) {
                        charSequenceA = C7965f5.a(null, strC.trim(), Collections.EMPTY_LIST);
                    }
                    iW = i12 - i13;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (c7318WwB != null) {
                    c7318WwB.l(charSequenceA);
                    c7385YxP = c7318WwB.p();
                } else {
                    C7752d5 c7752d5 = new C7752d5();
                    c7752d5.f73352c = charSequenceA;
                    c7385YxP = c7752d5.a().p();
                }
                arrayList.add(c7385YxP);
            } else {
                this.f70779a.m(iW);
            }
        }
    }
}
