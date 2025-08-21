package x3;

import L3.h;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    private final d3.D f170147a = new d3.D(10);

    public a3.y a(InterfaceC18078q interfaceC18078q, h.a aVar) throws Throwable {
        a3.y yVarE = null;
        int i10 = 0;
        while (true) {
            try {
                interfaceC18078q.m(this.f170147a.e(), 0, 10);
                this.f170147a.W(0);
                if (this.f170147a.K() != 4801587) {
                    break;
                }
                this.f170147a.X(3);
                int iG = this.f170147a.G();
                int i11 = iG + 10;
                if (yVarE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f170147a.e(), 0, bArr, 0, 10);
                    interfaceC18078q.m(bArr, 10, iG);
                    yVarE = new L3.h(aVar).e(bArr, i11);
                } else {
                    interfaceC18078q.i(iG);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC18078q.d();
        interfaceC18078q.i(i10);
        return yVarE;
    }
}
