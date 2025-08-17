package d4;

import U3.r;
import c3.C6350a;
import d3.C13466a;
import d3.D;
import d3.InterfaceC13477l;
import d3.P;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13483a implements r {

    /* renamed from: a, reason: collision with root package name */
    private final D f127172a = new D();

    private static C6350a d(D d10, int i10) {
        CharSequence charSequenceR = null;
        C6350a.b bVarP = null;
        while (i10 > 0) {
            C13466a.b(i10 >= 8, "Incomplete vtt cue box header found.");
            int iQ = d10.q();
            int iQ2 = d10.q();
            int i11 = iQ - 8;
            String strH = P.H(d10.e(), d10.f(), i11);
            d10.X(i11);
            i10 = (i10 - 8) - i11;
            if (iQ2 == 1937011815) {
                bVarP = e.p(strH);
            } else if (iQ2 == 1885436268) {
                charSequenceR = e.r(null, strH.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceR == null) {
            charSequenceR = "";
        }
        return bVarP != null ? bVarP.o(charSequenceR).a() : e.m(charSequenceR);
    }

    @Override // U3.r
    public int c() {
        return 2;
    }

    @Override // U3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC13477l<U3.e> interfaceC13477l) {
        this.f127172a.U(bArr, i11 + i10);
        this.f127172a.W(i10);
        ArrayList arrayList = new ArrayList();
        while (this.f127172a.a() > 0) {
            C13466a.b(this.f127172a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iQ = this.f127172a.q();
            if (this.f127172a.q() == 1987343459) {
                arrayList.add(d(this.f127172a, iQ - 8));
            } else {
                this.f127172a.X(iQ - 8);
            }
        }
        interfaceC13477l.accept(new U3.e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
