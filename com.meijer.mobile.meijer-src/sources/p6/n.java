package p6;

import android.graphics.PointF;
import h6.C14478i;
import j6.InterfaceC14951c;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class n implements q6.c {

    /* renamed from: a, reason: collision with root package name */
    private final e f156176a;

    /* renamed from: b, reason: collision with root package name */
    private final o<PointF, PointF> f156177b;

    /* renamed from: c, reason: collision with root package name */
    private final g f156178c;

    /* renamed from: d, reason: collision with root package name */
    private final C16407b f156179d;

    /* renamed from: e, reason: collision with root package name */
    private final C16409d f156180e;

    /* renamed from: f, reason: collision with root package name */
    private final C16407b f156181f;

    /* renamed from: g, reason: collision with root package name */
    private final C16407b f156182g;

    /* renamed from: h, reason: collision with root package name */
    private final C16407b f156183h;

    /* renamed from: i, reason: collision with root package name */
    private final C16407b f156184i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f156185j;

    public n() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return null;
    }

    public n(e eVar, o<PointF, PointF> oVar, g gVar, C16407b c16407b, C16409d c16409d, C16407b c16407b2, C16407b c16407b3, C16407b c16407b4, C16407b c16407b5) {
        this.f156185j = false;
        this.f156176a = eVar;
        this.f156177b = oVar;
        this.f156178c = gVar;
        this.f156179d = c16407b;
        this.f156180e = c16409d;
        this.f156183h = c16407b2;
        this.f156184i = c16407b3;
        this.f156181f = c16407b4;
        this.f156182g = c16407b5;
    }

    public k6.p b() {
        return new k6.p(this);
    }

    public e c() {
        return this.f156176a;
    }

    public C16407b d() {
        return this.f156184i;
    }

    public C16409d e() {
        return this.f156180e;
    }

    public o<PointF, PointF> f() {
        return this.f156177b;
    }

    public C16407b g() {
        return this.f156179d;
    }

    public g h() {
        return this.f156178c;
    }

    public C16407b i() {
        return this.f156181f;
    }

    public C16407b j() {
        return this.f156182g;
    }

    public C16407b k() {
        return this.f156183h;
    }

    public boolean l() {
        return this.f156185j;
    }

    public void m(boolean z10) {
        this.f156185j = z10;
    }
}
