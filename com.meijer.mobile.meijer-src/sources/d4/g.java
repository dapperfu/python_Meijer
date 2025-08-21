package d4;

import U3.r;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import d3.D;
import d3.InterfaceC13610l;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class g implements r {

    /* renamed from: a, reason: collision with root package name */
    private final D f128023a = new D();

    /* renamed from: b, reason: collision with root package name */
    private final b f128024b = new b();

    private static int d(D d10) {
        int i10 = -1;
        int iF = 0;
        while (i10 == -1) {
            iF = d10.f();
            String strS = d10.s();
            i10 = strS == null ? 0 : "STYLE".equals(strS) ? 2 : strS.startsWith("NOTE") ? 1 : 3;
        }
        d10.W(iF);
        return i10;
    }

    @Override // U3.r
    public int c() {
        return 1;
    }

    @Override // U3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC13610l<U3.e> interfaceC13610l) {
        d dVarN;
        this.f128023a.U(bArr, i11 + i10);
        this.f128023a.W(i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.d(this.f128023a);
            while (!TextUtils.isEmpty(this.f128023a.s())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iD = d(this.f128023a);
                if (iD == 0) {
                    U3.i.c(new j(arrayList2), bVar, interfaceC13610l);
                    return;
                }
                if (iD == 1) {
                    e(this.f128023a);
                } else if (iD == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f128023a.s();
                    arrayList.addAll(this.f128024b.d(this.f128023a));
                } else if (iD == 3 && (dVarN = e.n(this.f128023a, arrayList)) != null) {
                    arrayList2.add(dVarN);
                }
            }
        } catch (ParserException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private static void e(D d10) {
        while (!TextUtils.isEmpty(d10.s())) {
        }
    }
}
