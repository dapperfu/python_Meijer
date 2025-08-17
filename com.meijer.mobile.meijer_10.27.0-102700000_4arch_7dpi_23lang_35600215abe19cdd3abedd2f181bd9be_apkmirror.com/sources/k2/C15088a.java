package k2;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import k2.f;
import k2.g;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C15088a {

    /* renamed from: a, reason: collision with root package name */
    private final g.c f141156a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f141157b;

    /* renamed from: k2.a$a, reason: collision with other inner class name */
    class RunnableC2235a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f141158a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f141159b;

        RunnableC2235a(g.c cVar, Typeface typeface) {
            this.f141158a = cVar;
            this.f141159b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f141158a.b(this.f141159b);
        }
    }

    /* renamed from: k2.a$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f141161a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f141162b;

        b(g.c cVar, int i10) {
            this.f141161a = cVar;
            this.f141162b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f141161a.a(this.f141162b);
        }
    }

    private void a(int i10) {
        this.f141157b.execute(new b(this.f141156a, i10));
    }

    private void c(Typeface typeface) {
        this.f141157b.execute(new RunnableC2235a(this.f141156a, typeface));
    }

    C15088a(g.c cVar, Executor executor) {
        this.f141156a = cVar;
        this.f141157b = executor;
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f141190a);
        } else {
            a(eVar.f141191b);
        }
    }
}
