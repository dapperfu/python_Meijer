package ab;

import bb.C6346c;

/* loaded from: classes4.dex */
public abstract class g extends AbstractC5678c {
    protected abstract long A();

    public abstract long z();

    public g(C6346c c6346c, bb.e eVar, String str) {
        super(c6346c, eVar, str);
    }

    private long B() {
        return Math.min((long) (z() + (A() * this.f45351h.c())), w());
    }

    @Override // ab.AbstractC5678c
    public long p() {
        long jS = s();
        if (jS == 0) {
            jS = (y() + B()) - B();
            a(jS);
        }
        return jS + B();
    }
}
