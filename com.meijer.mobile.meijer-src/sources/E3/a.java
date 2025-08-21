package E3;

import d3.D;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.L;
import x3.r;

/* loaded from: classes.dex */
public final class a implements InterfaceC18077p {

    /* renamed from: a, reason: collision with root package name */
    private final D f7015a = new D(4);

    /* renamed from: b, reason: collision with root package name */
    private final L f7016b = new L(-1, -1, "image/heif");

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        interfaceC18078q.i(4);
        return d(interfaceC18078q, 1718909296) && d(interfaceC18078q, 1751476579);
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    private boolean d(InterfaceC18078q interfaceC18078q, int i10) throws IOException {
        this.f7015a.S(4);
        interfaceC18078q.m(this.f7015a.e(), 0, 4);
        return this.f7015a.J() == ((long) i10);
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f7016b.a(j10, j11);
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        return this.f7016b.b(interfaceC18078q, i10);
    }

    @Override // x3.InterfaceC18077p
    public void c(r rVar) {
        this.f7016b.c(rVar);
    }
}
