package o6;

import android.graphics.PointF;
import g6.C14209i;
import i6.InterfaceC14692c;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class n implements p6.c {

    /* renamed from: a, reason: collision with root package name */
    private final e f153184a;

    /* renamed from: b, reason: collision with root package name */
    private final o<PointF, PointF> f153185b;

    /* renamed from: c, reason: collision with root package name */
    private final g f153186c;

    /* renamed from: d, reason: collision with root package name */
    private final C15998b f153187d;

    /* renamed from: e, reason: collision with root package name */
    private final C16000d f153188e;

    /* renamed from: f, reason: collision with root package name */
    private final C15998b f153189f;

    /* renamed from: g, reason: collision with root package name */
    private final C15998b f153190g;

    /* renamed from: h, reason: collision with root package name */
    private final C15998b f153191h;

    /* renamed from: i, reason: collision with root package name */
    private final C15998b f153192i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f153193j;

    public n() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return null;
    }

    public n(e eVar, o<PointF, PointF> oVar, g gVar, C15998b c15998b, C16000d c16000d, C15998b c15998b2, C15998b c15998b3, C15998b c15998b4, C15998b c15998b5) {
        this.f153193j = false;
        this.f153184a = eVar;
        this.f153185b = oVar;
        this.f153186c = gVar;
        this.f153187d = c15998b;
        this.f153188e = c16000d;
        this.f153191h = c15998b2;
        this.f153192i = c15998b3;
        this.f153189f = c15998b4;
        this.f153190g = c15998b5;
    }

    public j6.p b() {
        return new j6.p(this);
    }

    public e c() {
        return this.f153184a;
    }

    public C15998b d() {
        return this.f153192i;
    }

    public C16000d e() {
        return this.f153188e;
    }

    public o<PointF, PointF> f() {
        return this.f153185b;
    }

    public C15998b g() {
        return this.f153187d;
    }

    public g h() {
        return this.f153186c;
    }

    public C15998b i() {
        return this.f153189f;
    }

    public C15998b j() {
        return this.f153190g;
    }

    public C15998b k() {
        return this.f153191h;
    }

    public boolean l() {
        return this.f153193j;
    }

    public void m(boolean z10) {
        this.f153193j = z10;
    }
}
