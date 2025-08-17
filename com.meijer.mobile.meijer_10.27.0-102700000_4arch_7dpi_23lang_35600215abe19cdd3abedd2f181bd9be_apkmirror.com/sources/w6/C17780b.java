package w6;

import w6.C17779a;
import w6.C17785g;

/* renamed from: w6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17780b {

    /* renamed from: e, reason: collision with root package name */
    private static final C17780b f165863e = new C17780b();

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2632b f165864a;

    /* renamed from: b, reason: collision with root package name */
    private int f165865b;

    /* renamed from: c, reason: collision with root package name */
    public float f165866c;

    /* renamed from: d, reason: collision with root package name */
    public String f165867d = "";

    /* renamed from: w6.b$a */
    public class a implements C17785g.b {
        @Override // w6.C17785g.b
        public final void a() {
            if (C17780b.this.f165865b == 0) {
                return;
            }
            C17780b.this.f165864a.a();
            synchronized (this) {
                C17780b.f(C17780b.this);
                C17780b.this.f165866c = 0.0f;
            }
        }

        public a() {
        }

        @Override // w6.C17785g.b
        public final void b() {
            C17780b.g(C17780b.this);
            throw null;
        }

        @Override // w6.C17785g.b
        public final void c() {
            C17780b.g(C17780b.this);
            throw null;
        }

        @Override // w6.C17785g.b
        public final void a(float f10) {
            C17780b.this.f165866c = f10;
            C17780b.this.f165864a.a(C17780b.this.f165866c);
        }

        @Override // w6.C17785g.b
        public final void a(String str) {
            C17780b.g(C17780b.this);
            throw null;
        }
    }

    /* renamed from: w6.b$b, reason: collision with other inner class name */
    public interface InterfaceC2632b {
        void a();

        void a(float f10);
    }

    static /* synthetic */ int f(C17780b c17780b) {
        c17780b.f165865b = 0;
        return 0;
    }

    public static C17780b c() {
        return f165863e;
    }

    public static void e() {
        C17785g c17785gS = C17785g.s();
        int i10 = c17785gS.f165901b;
        if (i10 == 1) {
            c17785gS.k(2);
        } else if (i10 == 3) {
            c17785gS.k(0);
        }
    }

    static /* synthetic */ C17779a.InterfaceC2631a g(C17780b c17780b) {
        c17780b.getClass();
        return null;
    }
}
