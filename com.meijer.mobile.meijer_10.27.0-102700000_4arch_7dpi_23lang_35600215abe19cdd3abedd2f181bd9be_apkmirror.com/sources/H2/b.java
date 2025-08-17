package H2;

import H2.a;
import H2.b;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: m, reason: collision with root package name */
    public static final s f12035m = new g("translationX");

    /* renamed from: n, reason: collision with root package name */
    public static final s f12036n = new h("translationY");

    /* renamed from: o, reason: collision with root package name */
    public static final s f12037o = new i("translationZ");

    /* renamed from: p, reason: collision with root package name */
    public static final s f12038p = new j("scaleX");

    /* renamed from: q, reason: collision with root package name */
    public static final s f12039q = new k("scaleY");

    /* renamed from: r, reason: collision with root package name */
    public static final s f12040r = new l("rotation");

    /* renamed from: s, reason: collision with root package name */
    public static final s f12041s = new m("rotationX");

    /* renamed from: t, reason: collision with root package name */
    public static final s f12042t = new n("rotationY");

    /* renamed from: u, reason: collision with root package name */
    public static final s f12043u = new o("x");

    /* renamed from: v, reason: collision with root package name */
    public static final s f12044v = new a("y");

    /* renamed from: w, reason: collision with root package name */
    public static final s f12045w = new C0183b("z");

    /* renamed from: x, reason: collision with root package name */
    public static final s f12046x = new c("alpha");

    /* renamed from: y, reason: collision with root package name */
    public static final s f12047y = new d("scrollX");

    /* renamed from: z, reason: collision with root package name */
    public static final s f12048z = new e("scrollY");

    /* renamed from: e, reason: collision with root package name */
    final H2.c f12053e;

    /* renamed from: a, reason: collision with root package name */
    float f12049a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    float f12050b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    boolean f12051c = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f12054f = false;

    /* renamed from: g, reason: collision with root package name */
    float f12055g = Float.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    float f12056h = -Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    private long f12057i = 0;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList<q> f12059k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<r> f12060l = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    final Object f12052d = null;

    /* renamed from: j, reason: collision with root package name */
    private float f12058j = 1.0f;

    class f extends H2.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H2.d f12061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, H2.d dVar) {
            super(str);
            this.f12061b = dVar;
        }

        @Override // H2.c
        public float a(Object obj) {
            return this.f12061b.a();
        }

        @Override // H2.c
        public void b(Object obj, float f10) {
            this.f12061b.b(f10);
        }
    }

    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void e(b bVar, float f10, float f11);
    }

    public static abstract class s extends H2.c<View> {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    private void c(boolean z10) {
        this.f12054f = false;
        H2.a.d().g(this);
        this.f12057i = 0L;
        this.f12051c = false;
        for (int i10 = 0; i10 < this.f12059k.size(); i10++) {
            if (this.f12059k.get(i10) != null) {
                this.f12059k.get(i10).a(this, z10, this.f12050b, this.f12049a);
            }
        }
        g(this.f12059k);
    }

    public T j(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f12058j = f10;
        n(f10 * 0.75f);
        return this;
    }

    abstract void n(float f10);

    abstract boolean q(long j10);

    static class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    /* renamed from: H2.b$b, reason: collision with other inner class name */
    static class C0183b extends s {
        C0183b(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return ViewCompat.M(view);
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            ViewCompat.J0(view, f10);
        }
    }

    static class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    static class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }
    }

    static class e extends s {
        e(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }
    }

    static class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    static class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    static class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return ViewCompat.J(view);
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            ViewCompat.H0(view, f10);
        }
    }

    static class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    static class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    static class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    static class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    static class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    static class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // H2.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // H2.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    static class p {

        /* renamed from: a, reason: collision with root package name */
        float f12063a;

        /* renamed from: b, reason: collision with root package name */
        float f12064b;

        p() {
        }
    }

    private float d() {
        return this.f12053e.a(this.f12052d);
    }

    private void p() {
        if (this.f12054f) {
            return;
        }
        this.f12054f = true;
        if (!this.f12051c) {
            this.f12050b = d();
        }
        float f10 = this.f12050b;
        if (f10 > this.f12055g || f10 < this.f12056h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        H2.a.d().a(this, 0L);
    }

    public T a(q qVar) {
        if (!this.f12059k.contains(qVar)) {
            this.f12059k.add(qVar);
        }
        return this;
    }

    @Override // H2.a.b
    public boolean doAnimationFrame(long j10) {
        long j11 = this.f12057i;
        if (j11 == 0) {
            this.f12057i = j10;
            k(this.f12050b);
            return false;
        }
        this.f12057i = j10;
        boolean zQ = q(j10 - j11);
        float fMin = Math.min(this.f12050b, this.f12055g);
        this.f12050b = fMin;
        float fMax = Math.max(fMin, this.f12056h);
        this.f12050b = fMax;
        k(fMax);
        if (zQ) {
            c(false);
        }
        return zQ;
    }

    float e() {
        return this.f12058j * 0.75f;
    }

    public boolean f() {
        return this.f12054f;
    }

    public T h(float f10) {
        this.f12055g = f10;
        return this;
    }

    public T i(float f10) {
        this.f12056h = f10;
        return this;
    }

    void k(float f10) {
        this.f12053e.b(this.f12052d, f10);
        for (int i10 = 0; i10 < this.f12060l.size(); i10++) {
            if (this.f12060l.get(i10) != null) {
                this.f12060l.get(i10).e(this, this.f12050b, this.f12049a);
            }
        }
        g(this.f12060l);
    }

    public T l(float f10) {
        this.f12050b = f10;
        this.f12051c = true;
        return this;
    }

    public T m(float f10) {
        this.f12049a = f10;
        return this;
    }

    b(H2.d dVar) {
        this.f12053e = new f("FloatValueHolder", dVar);
    }

    private static <T> void g(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public T b(r rVar) {
        if (!f()) {
            if (!this.f12060l.contains(rVar)) {
                this.f12060l.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public void o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f12054f) {
                p();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }
}
