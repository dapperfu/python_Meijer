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
    public static final s f13367m = new g("translationX");

    /* renamed from: n, reason: collision with root package name */
    public static final s f13368n = new h("translationY");

    /* renamed from: o, reason: collision with root package name */
    public static final s f13369o = new i("translationZ");

    /* renamed from: p, reason: collision with root package name */
    public static final s f13370p = new j("scaleX");

    /* renamed from: q, reason: collision with root package name */
    public static final s f13371q = new k("scaleY");

    /* renamed from: r, reason: collision with root package name */
    public static final s f13372r = new l("rotation");

    /* renamed from: s, reason: collision with root package name */
    public static final s f13373s = new m("rotationX");

    /* renamed from: t, reason: collision with root package name */
    public static final s f13374t = new n("rotationY");

    /* renamed from: u, reason: collision with root package name */
    public static final s f13375u = new o("x");

    /* renamed from: v, reason: collision with root package name */
    public static final s f13376v = new a("y");

    /* renamed from: w, reason: collision with root package name */
    public static final s f13377w = new C0198b("z");

    /* renamed from: x, reason: collision with root package name */
    public static final s f13378x = new c("alpha");

    /* renamed from: y, reason: collision with root package name */
    public static final s f13379y = new d("scrollX");

    /* renamed from: z, reason: collision with root package name */
    public static final s f13380z = new e("scrollY");

    /* renamed from: e, reason: collision with root package name */
    final H2.c f13385e;

    /* renamed from: a, reason: collision with root package name */
    float f13381a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    float f13382b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    boolean f13383c = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f13386f = false;

    /* renamed from: g, reason: collision with root package name */
    float f13387g = Float.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    float f13388h = -Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    private long f13389i = 0;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList<q> f13391k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    private final ArrayList<r> f13392l = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    final Object f13384d = null;

    /* renamed from: j, reason: collision with root package name */
    private float f13390j = 1.0f;

    class f extends H2.c {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H2.d f13393b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, H2.d dVar) {
            super(str);
            this.f13393b = dVar;
        }

        @Override // H2.c
        public float a(Object obj) {
            return this.f13393b.a();
        }

        @Override // H2.c
        public void b(Object obj, float f10) {
            this.f13393b.b(f10);
        }
    }

    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void a(b bVar, float f10, float f11);
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
        this.f13386f = false;
        H2.a.d().g(this);
        this.f13389i = 0L;
        this.f13383c = false;
        for (int i10 = 0; i10 < this.f13391k.size(); i10++) {
            if (this.f13391k.get(i10) != null) {
                this.f13391k.get(i10).a(this, z10, this.f13382b, this.f13381a);
            }
        }
        g(this.f13391k);
    }

    public T j(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f13390j = f10;
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
    static class C0198b extends s {
        C0198b(String str) {
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
        float f13395a;

        /* renamed from: b, reason: collision with root package name */
        float f13396b;

        p() {
        }
    }

    private float d() {
        return this.f13385e.a(this.f13384d);
    }

    private void p() {
        if (this.f13386f) {
            return;
        }
        this.f13386f = true;
        if (!this.f13383c) {
            this.f13382b = d();
        }
        float f10 = this.f13382b;
        if (f10 > this.f13387g || f10 < this.f13388h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        H2.a.d().a(this, 0L);
    }

    public T a(q qVar) {
        if (!this.f13391k.contains(qVar)) {
            this.f13391k.add(qVar);
        }
        return this;
    }

    @Override // H2.a.b
    public boolean doAnimationFrame(long j10) {
        long j11 = this.f13389i;
        if (j11 == 0) {
            this.f13389i = j10;
            k(this.f13382b);
            return false;
        }
        this.f13389i = j10;
        boolean zQ = q(j10 - j11);
        float fMin = Math.min(this.f13382b, this.f13387g);
        this.f13382b = fMin;
        float fMax = Math.max(fMin, this.f13388h);
        this.f13382b = fMax;
        k(fMax);
        if (zQ) {
            c(false);
        }
        return zQ;
    }

    float e() {
        return this.f13390j * 0.75f;
    }

    public boolean f() {
        return this.f13386f;
    }

    public T h(float f10) {
        this.f13387g = f10;
        return this;
    }

    public T i(float f10) {
        this.f13388h = f10;
        return this;
    }

    void k(float f10) {
        this.f13385e.b(this.f13384d, f10);
        for (int i10 = 0; i10 < this.f13392l.size(); i10++) {
            if (this.f13392l.get(i10) != null) {
                this.f13392l.get(i10).a(this, this.f13382b, this.f13381a);
            }
        }
        g(this.f13392l);
    }

    public T l(float f10) {
        this.f13382b = f10;
        this.f13383c = true;
        return this;
    }

    public T m(float f10) {
        this.f13381a = f10;
        return this;
    }

    b(H2.d dVar) {
        this.f13385e = new f("FloatValueHolder", dVar);
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
            if (!this.f13392l.contains(rVar)) {
                this.f13392l.add(rVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public void o() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f13386f) {
                p();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }
}
