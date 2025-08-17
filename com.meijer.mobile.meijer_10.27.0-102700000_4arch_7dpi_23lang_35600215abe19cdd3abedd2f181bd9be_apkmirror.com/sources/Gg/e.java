package Gg;

import java.util.List;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f11419a;

    /* renamed from: b, reason: collision with root package name */
    private int f11420b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11421c;

    /* renamed from: d, reason: collision with root package name */
    private final List<byte[]> f11422d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11423e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f11424f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f11425g;

    /* renamed from: h, reason: collision with root package name */
    private Object f11426h;

    /* renamed from: i, reason: collision with root package name */
    private final int f11427i;

    /* renamed from: j, reason: collision with root package name */
    private final int f11428j;

    /* renamed from: k, reason: collision with root package name */
    private final int f11429k;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1, 0);
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10) {
        this(bArr, str, list, str2, -1, -1, i10);
    }

    public List<byte[]> a() {
        return this.f11422d;
    }

    public String b() {
        return this.f11423e;
    }

    public Integer c() {
        return this.f11425g;
    }

    public Integer d() {
        return this.f11424f;
    }

    public int e() {
        return this.f11420b;
    }

    public Object f() {
        return this.f11426h;
    }

    public byte[] g() {
        return this.f11419a;
    }

    public int h() {
        return this.f11427i;
    }

    public int i() {
        return this.f11428j;
    }

    public int j() {
        return this.f11429k;
    }

    public String k() {
        return this.f11421c;
    }

    public boolean l() {
        return this.f11427i >= 0 && this.f11428j >= 0;
    }

    public void m(Integer num) {
        this.f11425g = num;
    }

    public void n(Integer num) {
        this.f11424f = num;
    }

    public void o(int i10) {
        this.f11420b = i10;
    }

    public void p(Object obj) {
        this.f11426h = obj;
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11, int i12) {
        this.f11419a = bArr;
        this.f11420b = bArr == null ? 0 : bArr.length * 8;
        this.f11421c = str;
        this.f11422d = list;
        this.f11423e = str2;
        this.f11427i = i11;
        this.f11428j = i10;
        this.f11429k = i12;
    }
}
