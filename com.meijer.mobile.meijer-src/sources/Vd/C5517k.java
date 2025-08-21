package Vd;

/* renamed from: Vd.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C5517k<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final N f39865a = new N();

    public C5517k() {
    }

    public C5517k(AbstractC5507a abstractC5507a) {
        abstractC5507a.b(new K(this));
    }

    public AbstractC5516j<TResult> a() {
        return this.f39865a;
    }

    public void b(Exception exc) {
        this.f39865a.u(exc);
    }

    public void c(TResult tresult) {
        this.f39865a.v(tresult);
    }

    public boolean d(Exception exc) {
        return this.f39865a.x(exc);
    }

    public boolean e(TResult tresult) {
        return this.f39865a.y(tresult);
    }
}
