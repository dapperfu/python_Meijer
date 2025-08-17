package Td;

/* renamed from: Td.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C5233k<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final N f34932a = new N();

    public C5233k() {
    }

    public C5233k(AbstractC5223a abstractC5223a) {
        abstractC5223a.b(new K(this));
    }

    public AbstractC5232j<TResult> a() {
        return this.f34932a;
    }

    public void b(Exception exc) {
        this.f34932a.u(exc);
    }

    public void c(TResult tresult) {
        this.f34932a.v(tresult);
    }

    public boolean d(Exception exc) {
        return this.f34932a.x(exc);
    }

    public boolean e(TResult tresult) {
        return this.f34932a.y(tresult);
    }
}
