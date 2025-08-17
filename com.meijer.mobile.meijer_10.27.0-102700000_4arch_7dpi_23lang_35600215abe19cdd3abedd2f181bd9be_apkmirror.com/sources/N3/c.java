package N3;

import a3.y;
import d3.C;
import d3.D;
import d3.J;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class c extends G3.c {

    /* renamed from: a, reason: collision with root package name */
    private final D f21277a = new D();

    /* renamed from: b, reason: collision with root package name */
    private final C f21278b = new C();

    /* renamed from: c, reason: collision with root package name */
    private J f21279c;

    @Override // G3.c
    protected y b(G3.b bVar, ByteBuffer byteBuffer) {
        J j10 = this.f21279c;
        if (j10 == null || bVar.f11255j != j10.f()) {
            J j11 = new J(bVar.f55467f);
            this.f21279c = j11;
            j11.a(bVar.f55467f - bVar.f11255j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f21277a.U(bArrArray, iLimit);
        this.f21278b.o(bArrArray, iLimit);
        this.f21278b.r(39);
        long jH = (this.f21278b.h(1) << 32) | this.f21278b.h(32);
        this.f21278b.r(20);
        int iH = this.f21278b.h(12);
        int iH2 = this.f21278b.h(8);
        this.f21277a.X(14);
        y.a aVarD = iH2 != 0 ? iH2 != 255 ? iH2 != 4 ? iH2 != 5 ? iH2 != 6 ? null : g.d(this.f21277a, jH, this.f21279c) : d.d(this.f21277a, jH, this.f21279c) : f.d(this.f21277a) : a.d(this.f21277a, iH, jH) : new e();
        return aVarD == null ? new y(new y.a[0]) : new y(aVarD);
    }
}
