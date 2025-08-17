package g3;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14194a {

    /* renamed from: a, reason: collision with root package name */
    private int f132703a;

    public void o() {
        this.f132703a = 0;
    }

    public final boolean u() {
        return p(4);
    }

    public final boolean z() {
        return p(1);
    }

    public final boolean B() {
        return p(536870912);
    }

    public final boolean C() {
        return p(67108864);
    }

    public final void D(int i10) {
        this.f132703a = i10;
    }

    public final void m(int i10) {
        this.f132703a = i10 | this.f132703a;
    }

    protected final boolean p(int i10) {
        return (this.f132703a & i10) == i10;
    }

    public final boolean t() {
        return p(268435456);
    }

    public final boolean w() {
        return p(134217728);
    }
}
