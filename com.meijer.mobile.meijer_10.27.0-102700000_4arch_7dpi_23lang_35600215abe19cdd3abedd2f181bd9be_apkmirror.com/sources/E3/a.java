package E3;

import d3.D;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.L;
import x3.r;

/* loaded from: classes.dex */
public final class a implements InterfaceC18011p {

    /* renamed from: a, reason: collision with root package name */
    private final D f7608a = new D(4);

    /* renamed from: b, reason: collision with root package name */
    private final L f7609b = new L(-1, -1, "image/heif");

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        interfaceC18012q.i(4);
        return d(interfaceC18012q, 1718909296) && d(interfaceC18012q, 1751476579);
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    private boolean d(InterfaceC18012q interfaceC18012q, int i10) throws IOException {
        this.f7608a.S(4);
        interfaceC18012q.m(this.f7608a.e(), 0, 4);
        return this.f7608a.J() == ((long) i10);
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f7609b.a(j10, j11);
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        return this.f7609b.b(interfaceC18012q, i10);
    }

    @Override // x3.InterfaceC18011p
    public void c(r rVar) {
        this.f7609b.c(rVar);
    }
}
