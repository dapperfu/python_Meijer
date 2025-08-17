package g4;

import d3.D;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.L;
import x3.r;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14197a implements InterfaceC18011p {

    /* renamed from: a, reason: collision with root package name */
    private final D f132740a = new D(4);

    /* renamed from: b, reason: collision with root package name */
    private final L f132741b = new L(-1, -1, "image/webp");

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f132741b.a(j10, j11);
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        return this.f132741b.b(interfaceC18012q, i10);
    }

    @Override // x3.InterfaceC18011p
    public void c(r rVar) {
        this.f132741b.c(rVar);
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        this.f132740a.S(4);
        interfaceC18012q.m(this.f132740a.e(), 0, 4);
        if (this.f132740a.J() != 1380533830) {
            return false;
        }
        interfaceC18012q.i(4);
        this.f132740a.S(4);
        interfaceC18012q.m(this.f132740a.e(), 0, 4);
        return this.f132740a.J() == 1464156752;
    }
}
