package Ig;

import java.util.List;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f14518a;

    /* renamed from: b, reason: collision with root package name */
    private int f14519b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14520c;

    /* renamed from: d, reason: collision with root package name */
    private final List<byte[]> f14521d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14522e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f14523f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f14524g;

    /* renamed from: h, reason: collision with root package name */
    private Object f14525h;

    /* renamed from: i, reason: collision with root package name */
    private final int f14526i;

    /* renamed from: j, reason: collision with root package name */
    private final int f14527j;

    /* renamed from: k, reason: collision with root package name */
    private final int f14528k;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1, 0);
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10) {
        this(bArr, str, list, str2, -1, -1, i10);
    }

    public List<byte[]> a() {
        return this.f14521d;
    }

    public String b() {
        return this.f14522e;
    }

    public Integer c() {
        return this.f14524g;
    }

    public Integer d() {
        return this.f14523f;
    }

    public int e() {
        return this.f14519b;
    }

    public Object f() {
        return this.f14525h;
    }

    public byte[] g() {
        return this.f14518a;
    }

    public int h() {
        return this.f14526i;
    }

    public int i() {
        return this.f14527j;
    }

    public int j() {
        return this.f14528k;
    }

    public String k() {
        return this.f14520c;
    }

    public boolean l() {
        return this.f14526i >= 0 && this.f14527j >= 0;
    }

    public void m(Integer num) {
        this.f14524g = num;
    }

    public void n(Integer num) {
        this.f14523f = num;
    }

    public void o(int i10) {
        this.f14519b = i10;
    }

    public void p(Object obj) {
        this.f14525h = obj;
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11, int i12) {
        this.f14518a = bArr;
        this.f14519b = bArr == null ? 0 : bArr.length * 8;
        this.f14520c = str;
        this.f14521d = list;
        this.f14522e = str2;
        this.f14526i = i11;
        this.f14527j = i10;
        this.f14528k = i12;
    }
}
