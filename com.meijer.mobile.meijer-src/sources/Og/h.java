package Og;

import java.nio.charset.StandardCharsets;

/* loaded from: classes8.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f23728a;

    /* renamed from: b, reason: collision with root package name */
    private m f23729b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.zxing.e f23730c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.zxing.e f23731d;

    /* renamed from: e, reason: collision with root package name */
    private final StringBuilder f23732e;

    /* renamed from: f, reason: collision with root package name */
    int f23733f;

    /* renamed from: g, reason: collision with root package name */
    private int f23734g;

    /* renamed from: h, reason: collision with root package name */
    private l f23735h;

    /* renamed from: i, reason: collision with root package name */
    private int f23736i;

    public void j() {
        this.f23734g = -1;
    }

    public void k() {
        this.f23735h = null;
    }

    private int h() {
        return this.f23728a.length() - this.f23736i;
    }

    public int a() {
        return this.f23732e.length();
    }

    public StringBuilder b() {
        return this.f23732e;
    }

    public char c() {
        return this.f23728a.charAt(this.f23733f);
    }

    public String d() {
        return this.f23728a;
    }

    public int e() {
        return this.f23734g;
    }

    public l g() {
        return this.f23735h;
    }

    public boolean i() {
        return this.f23733f < h();
    }

    public void l(com.google.zxing.e eVar, com.google.zxing.e eVar2) {
        this.f23730c = eVar;
        this.f23731d = eVar2;
    }

    public void m(int i10) {
        this.f23736i = i10;
    }

    public void n(m mVar) {
        this.f23729b = mVar;
    }

    public void o(int i10) {
        this.f23734g = i10;
    }

    public void q(int i10) {
        l lVar = this.f23735h;
        if (lVar == null || i10 > lVar.a()) {
            this.f23735h = l.l(i10, this.f23729b, this.f23730c, this.f23731d, true);
        }
    }

    public void r(char c10) {
        this.f23732e.append(c10);
    }

    public void s(String str) {
        this.f23732e.append(str);
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
        this.f23728a = sb2.toString();
        this.f23729b = m.FORCE_NONE;
        this.f23732e = new StringBuilder(str.length());
        this.f23734g = -1;
    }

    public int f() {
        return h() - this.f23733f;
    }

    public void p() {
        q(a());
    }
}
