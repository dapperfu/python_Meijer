package lb;

import java.util.List;

/* renamed from: lb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15392a implements Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private EnumC2285a f148780a;

    /* renamed from: b, reason: collision with root package name */
    private String f148781b;

    /* renamed from: c, reason: collision with root package name */
    private String f148782c;

    /* renamed from: d, reason: collision with root package name */
    private String f148783d;

    /* renamed from: e, reason: collision with root package name */
    private long f148784e;

    /* renamed from: f, reason: collision with root package name */
    private long f148785f;

    /* renamed from: g, reason: collision with root package name */
    private long f148786g;

    /* renamed from: h, reason: collision with root package name */
    private String f148787h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f148788i;

    /* renamed from: j, reason: collision with root package name */
    private String f148789j;

    /* renamed from: k, reason: collision with root package name */
    private List<Db.a> f148790k;

    /* renamed from: l, reason: collision with root package name */
    private String f148791l;

    /* renamed from: m, reason: collision with root package name */
    private String f148792m;

    /* renamed from: n, reason: collision with root package name */
    private String f148793n;

    /* renamed from: o, reason: collision with root package name */
    private long f148794o;

    /* renamed from: lb.a$a, reason: collision with other inner class name */
    public enum EnumC2285a implements Nb.a {
        PLACE_ENTRY,
        PLACE_EXIT,
        TIME_TRIGGERED,
        INSTANT_PUSH
    }

    public void A(String str) {
        this.f148791l = str;
    }

    public void B(EnumC2285a enumC2285a) {
        this.f148780a = enumC2285a;
    }

    public void C(String str) {
        this.f148792m = str;
    }

    public List<Db.a> a() {
        return this.f148790k;
    }

    public String b() {
        return this.f148787h;
    }

    public long c() {
        return this.f148786g;
    }

    public long d() {
        return this.f148794o;
    }

    public String e() {
        return this.f148783d;
    }

    public long f() {
        return this.f148784e;
    }

    public Long g() {
        return Long.valueOf(this.f148785f);
    }

    public String h() {
        return this.f148781b;
    }

    public String i() {
        return this.f148782c;
    }

    public String j() {
        return this.f148793n;
    }

    public String k() {
        return this.f148791l;
    }

    public EnumC2285a l() {
        return this.f148780a;
    }

    public String m() {
        return this.f148792m;
    }

    public boolean n() {
        return this.f148788i;
    }

    public void o(List<Db.a> list) {
        this.f148790k = list;
    }

    public void p(String str) {
        this.f148787h = str;
    }

    public void q(long j10) {
        this.f148786g = j10;
    }

    public void r(long j10) {
        this.f148794o = j10;
    }

    public void s(String str) {
        this.f148783d = str;
    }

    public void t(long j10) {
        this.f148784e = j10;
    }

    public void u(long j10) {
        this.f148785f = j10;
    }

    public void v(String str) {
        this.f148781b = str;
    }

    public void w(String str) {
        this.f148789j = str;
    }

    public void x(boolean z10) {
        this.f148788i = z10;
    }

    public void y(String str) {
        this.f148782c = str;
    }

    public void z(String str) {
        this.f148793n = str;
    }
}
