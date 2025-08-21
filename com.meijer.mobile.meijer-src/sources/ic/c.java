package ic;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private String f137493a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f137494b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f137495c;

    /* renamed from: d, reason: collision with root package name */
    private String f137496d;

    public String a() {
        if (this.f137496d == null) {
            this.f137496d = this.f137493a + "-" + this.f137495c + "-" + this.f137494b;
        }
        return this.f137496d;
    }

    public Integer b() {
        return this.f137495c;
    }

    public Integer c() {
        return this.f137494b;
    }

    public String d() {
        return this.f137493a;
    }

    public void e(Integer num) {
        this.f137495c = num;
    }

    public void f(Integer num) {
        this.f137494b = num;
    }

    public void g(String str) {
        this.f137493a = str;
    }

    public String toString() {
        return "ResolveIBeaconRequest [uuid=" + this.f137493a + ", minor=" + this.f137494b + ", major=" + this.f137495c + "]";
    }
}
