package N1;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    String f20532a;

    /* renamed from: b, reason: collision with root package name */
    private int f20533b;

    /* renamed from: c, reason: collision with root package name */
    private int f20534c;

    /* renamed from: d, reason: collision with root package name */
    private float f20535d;

    /* renamed from: e, reason: collision with root package name */
    private String f20536e;

    /* renamed from: f, reason: collision with root package name */
    boolean f20537f;

    public a(a aVar) {
        this.f20534c = Integer.MIN_VALUE;
        this.f20535d = Float.NaN;
        this.f20536e = null;
        this.f20532a = aVar.f20532a;
        this.f20533b = aVar.f20533b;
        this.f20534c = aVar.f20534c;
        this.f20535d = aVar.f20535d;
        this.f20536e = aVar.f20536e;
        this.f20537f = aVar.f20537f;
    }

    public static String a(int i10) {
        return "#" + ("00000000" + Integer.toHexString(i10)).substring(r2.length() - 8);
    }

    public a b() {
        return new a(this);
    }

    public boolean c() {
        return this.f20537f;
    }

    public float d() {
        return this.f20535d;
    }

    public int e() {
        return this.f20534c;
    }

    public String f() {
        return this.f20532a;
    }

    public String g() {
        return this.f20536e;
    }

    public int h() {
        return this.f20533b;
    }

    public void i(float f10) {
        this.f20535d = f10;
    }

    public void j(int i10) {
        this.f20534c = i10;
    }

    public String toString() {
        String str = this.f20532a + ':';
        switch (this.f20533b) {
            case 900:
                return str + this.f20534c;
            case 901:
                return str + this.f20535d;
            case 902:
                return str + a(this.f20534c);
            case 903:
                return str + this.f20536e;
            case 904:
                return str + Boolean.valueOf(this.f20537f);
            case 905:
                return str + this.f20535d;
            default:
                return str + "????";
        }
    }

    public a(String str, int i10, int i11) {
        this.f20534c = Integer.MIN_VALUE;
        this.f20535d = Float.NaN;
        this.f20536e = null;
        this.f20532a = str;
        this.f20533b = i10;
        if (i10 == 901) {
            this.f20535d = i11;
        } else {
            this.f20534c = i11;
        }
    }

    public a(String str, int i10, float f10) {
        this.f20534c = Integer.MIN_VALUE;
        this.f20536e = null;
        this.f20532a = str;
        this.f20533b = i10;
        this.f20535d = f10;
    }
}
