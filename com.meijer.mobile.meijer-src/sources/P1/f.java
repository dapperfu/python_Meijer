package P1;

/* loaded from: classes.dex */
public class f implements e, O1.d {

    /* renamed from: a, reason: collision with root package name */
    final O1.e f25289a;

    /* renamed from: b, reason: collision with root package name */
    private int f25290b;

    /* renamed from: c, reason: collision with root package name */
    private Q1.g f25291c;

    /* renamed from: d, reason: collision with root package name */
    private int f25292d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f25293e = -1;

    /* renamed from: f, reason: collision with root package name */
    private float f25294f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private Object f25295g;

    @Override // O1.d
    public e d() {
        return null;
    }

    public f e(float f10) {
        this.f25292d = -1;
        this.f25293e = -1;
        this.f25294f = f10;
        return this;
    }

    @Override // P1.e, O1.d
    public Q1.e a() {
        if (this.f25291c == null) {
            this.f25291c = new Q1.g();
        }
        return this.f25291c;
    }

    @Override // P1.e, O1.d
    public void apply() {
        this.f25291c.g1(this.f25290b);
        int i10 = this.f25292d;
        if (i10 != -1) {
            this.f25291c.d1(i10);
            return;
        }
        int i11 = this.f25293e;
        if (i11 != -1) {
            this.f25291c.e1(i11);
        } else {
            this.f25291c.f1(this.f25294f);
        }
    }

    @Override // O1.d
    public void b(Q1.e eVar) {
        if (eVar instanceof Q1.g) {
            this.f25291c = (Q1.g) eVar;
        } else {
            this.f25291c = null;
        }
    }

    @Override // O1.d
    public void c(Object obj) {
        this.f25295g = obj;
    }

    public void f(int i10) {
        this.f25290b = i10;
    }

    @Override // O1.d
    public Object getKey() {
        return this.f25295g;
    }

    public f(O1.e eVar) {
        this.f25289a = eVar;
    }
}
