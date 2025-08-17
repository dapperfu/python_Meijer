package F3;

import java.io.IOException;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.L;
import x3.r;

/* loaded from: classes.dex */
public final class a implements InterfaceC18011p {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC18011p f10235a;

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f10235a.a(j10, j11);
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        return this.f10235a.b(interfaceC18012q, i10);
    }

    @Override // x3.InterfaceC18011p
    public void c(r rVar) {
        this.f10235a.c(rVar);
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        return this.f10235a.j(interfaceC18012q);
    }

    @Override // x3.InterfaceC18011p
    public void release() {
        this.f10235a.release();
    }

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f10235a = new L(65496, 2, "image/jpeg");
        } else {
            this.f10235a = new b();
        }
    }
}
