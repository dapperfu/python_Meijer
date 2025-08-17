package N1;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    String f21268a;

    /* renamed from: b, reason: collision with root package name */
    private int f21269b;

    /* renamed from: c, reason: collision with root package name */
    private int f21270c;

    /* renamed from: d, reason: collision with root package name */
    private float f21271d;

    /* renamed from: e, reason: collision with root package name */
    private String f21272e;

    /* renamed from: f, reason: collision with root package name */
    boolean f21273f;

    public a(a aVar) {
        this.f21270c = Integer.MIN_VALUE;
        this.f21271d = Float.NaN;
        this.f21272e = null;
        this.f21268a = aVar.f21268a;
        this.f21269b = aVar.f21269b;
        this.f21270c = aVar.f21270c;
        this.f21271d = aVar.f21271d;
        this.f21272e = aVar.f21272e;
        this.f21273f = aVar.f21273f;
    }

    public static String a(int i10) {
        return "#" + ("00000000" + Integer.toHexString(i10)).substring(r2.length() - 8);
    }

    public a b() {
        return new a(this);
    }

    public boolean c() {
        return this.f21273f;
    }

    public float d() {
        return this.f21271d;
    }

    public int e() {
        return this.f21270c;
    }

    public String f() {
        return this.f21268a;
    }

    public String g() {
        return this.f21272e;
    }

    public int h() {
        return this.f21269b;
    }

    public void i(float f10) {
        this.f21271d = f10;
    }

    public void j(int i10) {
        this.f21270c = i10;
    }

    public String toString() {
        String str = this.f21268a + ':';
        switch (this.f21269b) {
            case 900:
                return str + this.f21270c;
            case 901:
                return str + this.f21271d;
            case 902:
                return str + a(this.f21270c);
            case 903:
                return str + this.f21272e;
            case 904:
                return str + Boolean.valueOf(this.f21273f);
            case 905:
                return str + this.f21271d;
            default:
                return str + "????";
        }
    }

    public a(String str, int i10, int i11) {
        this.f21270c = Integer.MIN_VALUE;
        this.f21271d = Float.NaN;
        this.f21272e = null;
        this.f21268a = str;
        this.f21269b = i10;
        if (i10 == 901) {
            this.f21271d = i11;
        } else {
            this.f21270c = i11;
        }
    }

    public a(String str, int i10, float f10) {
        this.f21270c = Integer.MIN_VALUE;
        this.f21272e = null;
        this.f21268a = str;
        this.f21269b = i10;
        this.f21271d = f10;
    }
}
