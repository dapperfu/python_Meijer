package q6;

import android.graphics.PointF;
import h6.C14478i;
import j6.InterfaceC14951c;
import p6.C16407b;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class k implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f157974a;

    /* renamed from: b, reason: collision with root package name */
    private final a f157975b;

    /* renamed from: c, reason: collision with root package name */
    private final C16407b f157976c;

    /* renamed from: d, reason: collision with root package name */
    private final p6.o<PointF, PointF> f157977d;

    /* renamed from: e, reason: collision with root package name */
    private final C16407b f157978e;

    /* renamed from: f, reason: collision with root package name */
    private final C16407b f157979f;

    /* renamed from: g, reason: collision with root package name */
    private final C16407b f157980g;

    /* renamed from: h, reason: collision with root package name */
    private final C16407b f157981h;

    /* renamed from: i, reason: collision with root package name */
    private final C16407b f157982i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f157983j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f157984k;

    public enum a {
        STAR(1),
        POLYGON(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f157988a;

        a(int i10) {
            this.f157988a = i10;
        }

        public static a b(int i10) {
            for (a aVar : values()) {
                if (aVar.f157988a == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return new j6.n(oVar, abstractC16860b, this);
    }

    public C16407b b() {
        return this.f157979f;
    }

    public C16407b c() {
        return this.f157981h;
    }

    public String d() {
        return this.f157974a;
    }

    public C16407b e() {
        return this.f157980g;
    }

    public C16407b f() {
        return this.f157982i;
    }

    public C16407b g() {
        return this.f157976c;
    }

    public p6.o<PointF, PointF> h() {
        return this.f157977d;
    }

    public C16407b i() {
        return this.f157978e;
    }

    public a j() {
        return this.f157975b;
    }

    public boolean k() {
        return this.f157983j;
    }

    public boolean l() {
        return this.f157984k;
    }

    public k(String str, a aVar, C16407b c16407b, p6.o<PointF, PointF> oVar, C16407b c16407b2, C16407b c16407b3, C16407b c16407b4, C16407b c16407b5, C16407b c16407b6, boolean z10, boolean z11) {
        this.f157974a = str;
        this.f157975b = aVar;
        this.f157976c = c16407b;
        this.f157977d = oVar;
        this.f157978e = c16407b2;
        this.f157979f = c16407b3;
        this.f157980g = c16407b4;
        this.f157981h = c16407b5;
        this.f157982i = c16407b6;
        this.f157983j = z10;
        this.f157984k = z11;
    }
}
