package F3;

import d3.C13599a;
import x3.InterfaceC18078q;
import x3.z;

/* loaded from: classes.dex */
final class d extends z {

    /* renamed from: b, reason: collision with root package name */
    private final long f9019b;

    public d(InterfaceC18078q interfaceC18078q, long j10) {
        boolean z10;
        super(interfaceC18078q);
        if (interfaceC18078q.getPosition() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.a(z10);
        this.f9019b = j10;
    }

    @Override // x3.z, x3.InterfaceC18078q
    public long g() {
        return super.g() - this.f9019b;
    }

    @Override // x3.z, x3.InterfaceC18078q
    public long getLength() {
        return super.getLength() - this.f9019b;
    }

    @Override // x3.z, x3.InterfaceC18078q
    public long getPosition() {
        return super.getPosition() - this.f9019b;
    }
}
