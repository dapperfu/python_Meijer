package k2;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import k2.f;
import k2.g;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C15079a {

    /* renamed from: a, reason: collision with root package name */
    private final g.c f141349a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f141350b;

    /* renamed from: k2.a$a, reason: collision with other inner class name */
    class RunnableC2239a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f141351a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f141352b;

        RunnableC2239a(g.c cVar, Typeface typeface) {
            this.f141351a = cVar;
            this.f141352b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f141351a.b(this.f141352b);
        }
    }

    /* renamed from: k2.a$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f141354a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f141355b;

        b(g.c cVar, int i10) {
            this.f141354a = cVar;
            this.f141355b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f141354a.a(this.f141355b);
        }
    }

    private void a(int i10) {
        this.f141350b.execute(new b(this.f141349a, i10));
    }

    private void c(Typeface typeface) {
        this.f141350b.execute(new RunnableC2239a(this.f141349a, typeface));
    }

    C15079a(g.c cVar, Executor executor) {
        this.f141349a = cVar;
        this.f141350b = executor;
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f141383a);
        } else {
            a(eVar.f141384b);
        }
    }
}
