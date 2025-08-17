package gc;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f133277a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f133278b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f133279c;

    /* renamed from: d, reason: collision with root package name */
    private String f133280d;

    public String a() {
        if (this.f133280d == null) {
            this.f133280d = this.f133277a + "-" + this.f133279c + "-" + this.f133278b;
        }
        return this.f133280d;
    }

    public Integer b() {
        return this.f133279c;
    }

    public Integer c() {
        return this.f133278b;
    }

    public String d() {
        return this.f133277a;
    }

    public void e(Integer num) {
        this.f133279c = num;
    }

    public void f(Integer num) {
        this.f133278b = num;
    }

    public void g(String str) {
        this.f133277a = str;
    }

    public String toString() {
        return "ResolveIBeaconRequest [uuid=" + this.f133277a + ", minor=" + this.f133278b + ", major=" + this.f133279c + "]";
    }
}
