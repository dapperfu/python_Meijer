package p6;

import android.graphics.PointF;
import g6.C14209i;
import i6.InterfaceC14692c;
import o6.C15998b;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class k implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155570a;

    /* renamed from: b, reason: collision with root package name */
    private final a f155571b;

    /* renamed from: c, reason: collision with root package name */
    private final C15998b f155572c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.o<PointF, PointF> f155573d;

    /* renamed from: e, reason: collision with root package name */
    private final C15998b f155574e;

    /* renamed from: f, reason: collision with root package name */
    private final C15998b f155575f;

    /* renamed from: g, reason: collision with root package name */
    private final C15998b f155576g;

    /* renamed from: h, reason: collision with root package name */
    private final C15998b f155577h;

    /* renamed from: i, reason: collision with root package name */
    private final C15998b f155578i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f155579j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f155580k;

    public enum a {
        STAR(1),
        POLYGON(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f155584a;

        a(int i10) {
            this.f155584a = i10;
        }

        public static a b(int i10) {
            for (a aVar : values()) {
                if (aVar.f155584a == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return new i6.n(oVar, abstractC16472b, this);
    }

    public C15998b b() {
        return this.f155575f;
    }

    public C15998b c() {
        return this.f155577h;
    }

    public String d() {
        return this.f155570a;
    }

    public C15998b e() {
        return this.f155576g;
    }

    public C15998b f() {
        return this.f155578i;
    }

    public C15998b g() {
        return this.f155572c;
    }

    public o6.o<PointF, PointF> h() {
        return this.f155573d;
    }

    public C15998b i() {
        return this.f155574e;
    }

    public a j() {
        return this.f155571b;
    }

    public boolean k() {
        return this.f155579j;
    }

    public boolean l() {
        return this.f155580k;
    }

    public k(String str, a aVar, C15998b c15998b, o6.o<PointF, PointF> oVar, C15998b c15998b2, C15998b c15998b3, C15998b c15998b4, C15998b c15998b5, C15998b c15998b6, boolean z10, boolean z11) {
        this.f155570a = str;
        this.f155571b = aVar;
        this.f155572c = c15998b;
        this.f155573d = oVar;
        this.f155574e = c15998b2;
        this.f155575f = c15998b3;
        this.f155576g = c15998b4;
        this.f155577h = c15998b5;
        this.f155578i = c15998b6;
        this.f155579j = z10;
        this.f155580k = z11;
    }
}
