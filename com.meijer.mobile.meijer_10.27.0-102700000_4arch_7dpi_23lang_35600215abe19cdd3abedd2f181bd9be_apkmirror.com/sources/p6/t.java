package p6;

import g6.C14209i;
import i6.InterfaceC14692c;
import o6.C15998b;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class t implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f155631a;

    /* renamed from: b, reason: collision with root package name */
    private final a f155632b;

    /* renamed from: c, reason: collision with root package name */
    private final C15998b f155633c;

    /* renamed from: d, reason: collision with root package name */
    private final C15998b f155634d;

    /* renamed from: e, reason: collision with root package name */
    private final C15998b f155635e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f155636f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a b(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    @Override // p6.c
    public InterfaceC14692c a(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b) {
        return new i6.u(abstractC16472b, this);
    }

    public C15998b b() {
        return this.f155634d;
    }

    public String c() {
        return this.f155631a;
    }

    public C15998b d() {
        return this.f155635e;
    }

    public C15998b e() {
        return this.f155633c;
    }

    public a f() {
        return this.f155632b;
    }

    public boolean g() {
        return this.f155636f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f155633c + ", end: " + this.f155634d + ", offset: " + this.f155635e + "}";
    }

    public t(String str, a aVar, C15998b c15998b, C15998b c15998b2, C15998b c15998b3, boolean z10) {
        this.f155631a = str;
        this.f155632b = aVar;
        this.f155633c = c15998b;
        this.f155634d = c15998b2;
        this.f155635e = c15998b3;
        this.f155636f = z10;
    }
}
