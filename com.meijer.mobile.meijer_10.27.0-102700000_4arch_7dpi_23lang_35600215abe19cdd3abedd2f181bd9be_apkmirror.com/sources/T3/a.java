package T3;

import java.io.IOException;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.L;
import x3.r;

/* loaded from: classes4.dex */
public final class a implements InterfaceC18011p {

    /* renamed from: a, reason: collision with root package name */
    private final L f34793a = new L(35152, 2, "image/png");

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f34793a.a(j10, j11);
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        return this.f34793a.b(interfaceC18012q, i10);
    }

    @Override // x3.InterfaceC18011p
    public void c(r rVar) {
        this.f34793a.c(rVar);
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        return this.f34793a.j(interfaceC18012q);
    }
}
