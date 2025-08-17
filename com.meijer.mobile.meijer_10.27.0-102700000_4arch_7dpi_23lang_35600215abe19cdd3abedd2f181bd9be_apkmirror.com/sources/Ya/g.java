package Ya;

/* loaded from: classes4.dex */
public abstract class g extends c {
    protected abstract long A();

    public abstract long z();

    public g(Za.c cVar, Za.e eVar, String str) {
        super(cVar, eVar, str);
    }

    private long B() {
        return Math.min((long) (z() + (A() * this.f40219h.c())), w());
    }

    @Override // Ya.c
    public long p() {
        long jS = s();
        if (jS == 0) {
            jS = (y() + B()) - B();
            a(jS);
        }
        return jS + B();
    }
}
