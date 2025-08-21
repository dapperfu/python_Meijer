package g4;

import d3.D;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.L;
import x3.r;

/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14326a implements InterfaceC18077p {

    /* renamed from: a, reason: collision with root package name */
    private final D f134030a = new D(4);

    /* renamed from: b, reason: collision with root package name */
    private final L f134031b = new L(-1, -1, "image/webp");

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f134031b.a(j10, j11);
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        return this.f134031b.b(interfaceC18078q, i10);
    }

    @Override // x3.InterfaceC18077p
    public void c(r rVar) {
        this.f134031b.c(rVar);
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        this.f134030a.S(4);
        interfaceC18078q.m(this.f134030a.e(), 0, 4);
        if (this.f134030a.J() != 1380533830) {
            return false;
        }
        interfaceC18078q.i(4);
        this.f134030a.S(4);
        interfaceC18078q.m(this.f134030a.e(), 0, 4);
        return this.f134030a.J() == 1464156752;
    }
}
