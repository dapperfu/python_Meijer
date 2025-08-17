package F3;

import d3.C13466a;
import x3.InterfaceC18012q;
import x3.z;

/* loaded from: classes.dex */
final class d extends z {

    /* renamed from: b, reason: collision with root package name */
    private final long f10252b;

    public d(InterfaceC18012q interfaceC18012q, long j10) {
        boolean z10;
        super(interfaceC18012q);
        if (interfaceC18012q.getPosition() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        this.f10252b = j10;
    }

    @Override // x3.z, x3.InterfaceC18012q
    public long g() {
        return super.g() - this.f10252b;
    }

    @Override // x3.z, x3.InterfaceC18012q
    public long getLength() {
        return super.getLength() - this.f10252b;
    }

    @Override // x3.z, x3.InterfaceC18012q
    public long getPosition() {
        return super.getPosition() - this.f10252b;
    }
}
