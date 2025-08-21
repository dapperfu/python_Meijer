package nb;

import java.util.List;

/* renamed from: nb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15926a implements Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private EnumC2352a f152177a;

    /* renamed from: b, reason: collision with root package name */
    private String f152178b;

    /* renamed from: c, reason: collision with root package name */
    private String f152179c;

    /* renamed from: d, reason: collision with root package name */
    private String f152180d;

    /* renamed from: e, reason: collision with root package name */
    private long f152181e;

    /* renamed from: f, reason: collision with root package name */
    private long f152182f;

    /* renamed from: g, reason: collision with root package name */
    private long f152183g;

    /* renamed from: h, reason: collision with root package name */
    private String f152184h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f152185i;

    /* renamed from: j, reason: collision with root package name */
    private String f152186j;

    /* renamed from: k, reason: collision with root package name */
    private List<Fb.a> f152187k;

    /* renamed from: l, reason: collision with root package name */
    private String f152188l;

    /* renamed from: m, reason: collision with root package name */
    private String f152189m;

    /* renamed from: n, reason: collision with root package name */
    private String f152190n;

    /* renamed from: o, reason: collision with root package name */
    private long f152191o;

    /* renamed from: nb.a$a, reason: collision with other inner class name */
    public enum EnumC2352a implements Pb.a {
        PLACE_ENTRY,
        PLACE_EXIT,
        TIME_TRIGGERED,
        INSTANT_PUSH
    }

    public void A(String str) {
        this.f152188l = str;
    }

    public void B(EnumC2352a enumC2352a) {
        this.f152177a = enumC2352a;
    }

    public void C(String str) {
        this.f152189m = str;
    }

    public List<Fb.a> a() {
        return this.f152187k;
    }

    public String b() {
        return this.f152184h;
    }

    public long c() {
        return this.f152183g;
    }

    public long d() {
        return this.f152191o;
    }

    public String e() {
        return this.f152180d;
    }

    public long f() {
        return this.f152181e;
    }

    public Long g() {
        return Long.valueOf(this.f152182f);
    }

    public String h() {
        return this.f152178b;
    }

    public String i() {
        return this.f152179c;
    }

    public String j() {
        return this.f152190n;
    }

    public String k() {
        return this.f152188l;
    }

    public EnumC2352a l() {
        return this.f152177a;
    }

    public String m() {
        return this.f152189m;
    }

    public boolean n() {
        return this.f152185i;
    }

    public void o(List<Fb.a> list) {
        this.f152187k = list;
    }

    public void p(String str) {
        this.f152184h = str;
    }

    public void q(long j10) {
        this.f152183g = j10;
    }

    public void r(long j10) {
        this.f152191o = j10;
    }

    public void s(String str) {
        this.f152180d = str;
    }

    public void t(long j10) {
        this.f152181e = j10;
    }

    public void u(long j10) {
        this.f152182f = j10;
    }

    public void v(String str) {
        this.f152178b = str;
    }

    public void w(String str) {
        this.f152186j = str;
    }

    public void x(boolean z10) {
        this.f152185i = z10;
    }

    public void y(String str) {
        this.f152179c = str;
    }

    public void z(String str) {
        this.f152190n = str;
    }
}
