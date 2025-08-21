package N3;

import a3.y;
import d3.C;
import d3.D;
import d3.J;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class c extends G3.c {

    /* renamed from: a, reason: collision with root package name */
    private final D f20541a = new D();

    /* renamed from: b, reason: collision with root package name */
    private final C f20542b = new C();

    /* renamed from: c, reason: collision with root package name */
    private J f20543c;

    @Override // G3.c
    protected y b(G3.b bVar, ByteBuffer byteBuffer) {
        J j10 = this.f20543c;
        if (j10 == null || bVar.f11180j != j10.f()) {
            J j11 = new J(bVar.f55691f);
            this.f20543c = j11;
            j11.a(bVar.f55691f - bVar.f11180j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f20541a.U(bArrArray, iLimit);
        this.f20542b.o(bArrArray, iLimit);
        this.f20542b.r(39);
        long jH = (this.f20542b.h(1) << 32) | this.f20542b.h(32);
        this.f20542b.r(20);
        int iH = this.f20542b.h(12);
        int iH2 = this.f20542b.h(8);
        this.f20541a.X(14);
        y.a aVarD = iH2 != 0 ? iH2 != 255 ? iH2 != 4 ? iH2 != 5 ? iH2 != 6 ? null : g.d(this.f20541a, jH, this.f20543c) : d.d(this.f20541a, jH, this.f20543c) : f.d(this.f20541a) : a.d(this.f20541a, iH, jH) : new e();
        return aVarD == null ? new y(new y.a[0]) : new y(aVarD);
    }
}
