package P1;

/* loaded from: classes.dex */
public class f implements e, O1.d {

    /* renamed from: a, reason: collision with root package name */
    final O1.e f24591a;

    /* renamed from: b, reason: collision with root package name */
    private int f24592b;

    /* renamed from: c, reason: collision with root package name */
    private Q1.g f24593c;

    /* renamed from: d, reason: collision with root package name */
    private int f24594d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f24595e = -1;

    /* renamed from: f, reason: collision with root package name */
    private float f24596f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private Object f24597g;

    @Override // O1.d
    public e d() {
        return null;
    }

    public f e(float f10) {
        this.f24594d = -1;
        this.f24595e = -1;
        this.f24596f = f10;
        return this;
    }

    @Override // P1.e, O1.d
    public Q1.e a() {
        if (this.f24593c == null) {
            this.f24593c = new Q1.g();
        }
        return this.f24593c;
    }

    @Override // P1.e, O1.d
    public void apply() {
        this.f24593c.g1(this.f24592b);
        int i10 = this.f24594d;
        if (i10 != -1) {
            this.f24593c.d1(i10);
            return;
        }
        int i11 = this.f24595e;
        if (i11 != -1) {
            this.f24593c.e1(i11);
        } else {
            this.f24593c.f1(this.f24596f);
        }
    }

    @Override // O1.d
    public void b(Q1.e eVar) {
        if (eVar instanceof Q1.g) {
            this.f24593c = (Q1.g) eVar;
        } else {
            this.f24593c = null;
        }
    }

    @Override // O1.d
    public void c(Object obj) {
        this.f24597g = obj;
    }

    public void f(int i10) {
        this.f24592b = i10;
    }

    @Override // O1.d
    public Object getKey() {
        return this.f24597g;
    }

    public f(O1.e eVar) {
        this.f24591a = eVar;
    }
}
