package q6;

import h6.C14478i;
import j6.InterfaceC14951c;
import p6.C16407b;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class t implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f158035a;

    /* renamed from: b, reason: collision with root package name */
    private final a f158036b;

    /* renamed from: c, reason: collision with root package name */
    private final C16407b f158037c;

    /* renamed from: d, reason: collision with root package name */
    private final C16407b f158038d;

    /* renamed from: e, reason: collision with root package name */
    private final C16407b f158039e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f158040f;

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

    @Override // q6.c
    public InterfaceC14951c a(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b) {
        return new j6.u(abstractC16860b, this);
    }

    public C16407b b() {
        return this.f158038d;
    }

    public String c() {
        return this.f158035a;
    }

    public C16407b d() {
        return this.f158039e;
    }

    public C16407b e() {
        return this.f158037c;
    }

    public a f() {
        return this.f158036b;
    }

    public boolean g() {
        return this.f158040f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f158037c + ", end: " + this.f158038d + ", offset: " + this.f158039e + "}";
    }

    public t(String str, a aVar, C16407b c16407b, C16407b c16407b2, C16407b c16407b3, boolean z10) {
        this.f158035a = str;
        this.f158036b = aVar;
        this.f158037c = c16407b;
        this.f158038d = c16407b2;
        this.f158039e = c16407b3;
        this.f158040f = z10;
    }
}
