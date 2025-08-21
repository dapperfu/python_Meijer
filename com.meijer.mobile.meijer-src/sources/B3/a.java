package B3;

import java.io.IOException;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.L;
import x3.r;

/* loaded from: classes.dex */
public final class a implements InterfaceC18077p {

    /* renamed from: a, reason: collision with root package name */
    private final L f2515a = new L(16973, 2, "image/bmp");

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f2515a.a(j10, j11);
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        return this.f2515a.b(interfaceC18078q, i10);
    }

    @Override // x3.InterfaceC18077p
    public void c(r rVar) {
        this.f2515a.c(rVar);
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        return this.f2515a.j(interfaceC18078q);
    }
}
