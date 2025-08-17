package Mg;

import java.nio.charset.StandardCharsets;

/* loaded from: classes7.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f19541a;

    /* renamed from: b, reason: collision with root package name */
    private m f19542b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.zxing.e f19543c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.zxing.e f19544d;

    /* renamed from: e, reason: collision with root package name */
    private final StringBuilder f19545e;

    /* renamed from: f, reason: collision with root package name */
    int f19546f;

    /* renamed from: g, reason: collision with root package name */
    private int f19547g;

    /* renamed from: h, reason: collision with root package name */
    private l f19548h;

    /* renamed from: i, reason: collision with root package name */
    private int f19549i;

    public void j() {
        this.f19547g = -1;
    }

    public void k() {
        this.f19548h = null;
    }

    private int h() {
        return this.f19541a.length() - this.f19549i;
    }

    public int a() {
        return this.f19545e.length();
    }

    public StringBuilder b() {
        return this.f19545e;
    }

    public char c() {
        return this.f19541a.charAt(this.f19546f);
    }

    public String d() {
        return this.f19541a;
    }

    public int e() {
        return this.f19547g;
    }

    public l g() {
        return this.f19548h;
    }

    public boolean i() {
        return this.f19546f < h();
    }

    public void l(com.google.zxing.e eVar, com.google.zxing.e eVar2) {
        this.f19543c = eVar;
        this.f19544d = eVar2;
    }

    public void m(int i10) {
        this.f19549i = i10;
    }

    public void n(m mVar) {
        this.f19542b = mVar;
    }

    public void o(int i10) {
        this.f19547g = i10;
    }

    public void q(int i10) {
        l lVar = this.f19548h;
        if (lVar == null || i10 > lVar.a()) {
            this.f19548h = l.l(i10, this.f19542b, this.f19543c, this.f19544d, true);
        }
    }

    public void r(char c10) {
        this.f19545e.append(c10);
    }

    public void s(String str) {
        this.f19545e.append(str);
    }

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f19541a = sb2.toString();
        this.f19542b = m.FORCE_NONE;
        this.f19545e = new StringBuilder(str.length());
        this.f19547g = -1;
    }

    public int f() {
        return h() - this.f19546f;
    }

    public void p() {
        q(a());
    }
}
