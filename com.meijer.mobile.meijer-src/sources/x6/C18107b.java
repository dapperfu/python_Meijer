package x6;

import x6.C18106a;
import x6.C18112g;

/* renamed from: x6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18107b {

    /* renamed from: e, reason: collision with root package name */
    private static final C18107b f170508e = new C18107b();

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2738b f170509a;

    /* renamed from: b, reason: collision with root package name */
    private int f170510b;

    /* renamed from: c, reason: collision with root package name */
    public float f170511c;

    /* renamed from: d, reason: collision with root package name */
    public String f170512d = "";

    /* renamed from: x6.b$a */
    public class a implements C18112g.b {
        @Override // x6.C18112g.b
        public final void a() {
            if (C18107b.this.f170510b == 0) {
                return;
            }
            C18107b.this.f170509a.a();
            synchronized (this) {
                C18107b.f(C18107b.this);
                C18107b.this.f170511c = 0.0f;
            }
        }

        public a() {
        }

        @Override // x6.C18112g.b
        public final void b() {
            C18107b.g(C18107b.this);
            throw null;
        }

        @Override // x6.C18112g.b
        public final void c() {
            C18107b.g(C18107b.this);
            throw null;
        }

        @Override // x6.C18112g.b
        public final void a(float f10) {
            C18107b.this.f170511c = f10;
            C18107b.this.f170509a.a(C18107b.this.f170511c);
        }

        @Override // x6.C18112g.b
        public final void a(String str) {
            C18107b.g(C18107b.this);
            throw null;
        }
    }

    /* renamed from: x6.b$b, reason: collision with other inner class name */
    public interface InterfaceC2738b {
        void a();

        void a(float f10);
    }

    static /* synthetic */ int f(C18107b c18107b) {
        c18107b.f170510b = 0;
        return 0;
    }

    public static C18107b c() {
        return f170508e;
    }

    public static void e() {
        C18112g c18112gS = C18112g.s();
        int i10 = c18112gS.f170546b;
        if (i10 == 1) {
            c18112gS.k(2);
        } else if (i10 == 3) {
            c18112gS.k(0);
        }
    }

    static /* synthetic */ C18106a.InterfaceC2737a g(C18107b c18107b) {
        c18107b.getClass();
        return null;
    }
}
