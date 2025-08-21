package T3;

import java.io.IOException;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.L;
import x3.r;

/* loaded from: classes4.dex */
public final class a implements InterfaceC18077p {

    /* renamed from: a, reason: collision with root package name */
    private final L f35888a = new L(35152, 2, "image/png");

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f35888a.a(j10, j11);
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        return this.f35888a.b(interfaceC18078q, i10);
    }

    @Override // x3.InterfaceC18077p
    public void c(r rVar) {
        this.f35888a.c(rVar);
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        return this.f35888a.j(interfaceC18078q);
    }
}
