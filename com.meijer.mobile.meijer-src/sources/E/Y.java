package E;

import E.e0;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.e;
import com.fullstory.FS;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class Y implements e.a, e0.a {

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC3182w f6886b;

    /* renamed from: c, reason: collision with root package name */
    C3183x f6887c;

    /* renamed from: d, reason: collision with root package name */
    private S f6888d;

    /* renamed from: e, reason: collision with root package name */
    private final List<S> f6889e;

    /* renamed from: a, reason: collision with root package name */
    final Deque<e0> f6885a = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    boolean f6890f = false;

    class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3171k f6891a;

        a(C3171k c3171k) {
            this.f6891a = c3171k;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            Y.this.f6886b.c();
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            if (this.f6891a.b()) {
                return;
            }
            int iF = this.f6891a.a().get(0).f();
            if (th2 instanceof ImageCaptureException) {
                Y.this.f6887c.j(b.c(iF, (ImageCaptureException) th2));
            } else {
                Y.this.f6887c.j(b.c(iF, new ImageCaptureException(2, "Failed to submit capture request", th2)));
            }
            Y.this.f6886b.c();
        }
    }

    static abstract class b {
        abstract ImageCaptureException a();

        abstract int b();

        static b c(int i10, ImageCaptureException imageCaptureException) {
            return new C3167g(i10, imageCaptureException);
        }

        b() {
        }
    }

    public static /* synthetic */ void c(Y y10) {
        y10.f6888d = null;
        y10.g();
    }

    boolean f() {
        return this.f6888d != null;
    }

    public Y(InterfaceC3182w interfaceC3182w) {
        G.o.a();
        this.f6886b = interfaceC3182w;
        this.f6889e = new ArrayList();
    }

    private com.google.common.util.concurrent.q<Void> k(C3171k c3171k) {
        G.o.a();
        this.f6886b.b();
        com.google.common.util.concurrent.q<Void> qVarA = this.f6886b.a(c3171k.a());
        I.n.j(qVarA, new a(c3171k), H.a.d());
        return qVarA;
    }

    private void l(final S s10) {
        o2.i.i(!f());
        this.f6888d = s10;
        s10.o().addListener(new Runnable() { // from class: E.V
            @Override // java.lang.Runnable
            public final void run() {
                Y.c(this.f6881a);
            }
        }, H.a.a());
        this.f6889e.add(s10);
        s10.p().addListener(new Runnable() { // from class: E.W
            @Override // java.lang.Runnable
            public final void run() {
                this.f6882a.f6889e.remove(s10);
            }
        }, H.a.a());
    }

    @Override // androidx.camera.core.e.a
    public void a(androidx.camera.core.n nVar) {
        H.a.d().execute(new Runnable() { // from class: E.X
            @Override // java.lang.Runnable
            public final void run() {
                this.f6884a.g();
            }
        });
    }

    @Override // E.e0.a
    public void b(e0 e0Var) {
        G.o.a();
        C.P.a("TakePictureManager", "Add a new request for retrying.");
        this.f6885a.addFirst(e0Var);
        g();
    }

    public void e() {
        G.o.a();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        Iterator<e0> it = this.f6885a.iterator();
        while (it.hasNext()) {
            it.next().r(imageCaptureException);
        }
        this.f6885a.clear();
        Iterator it2 = new ArrayList(this.f6889e).iterator();
        while (it2.hasNext()) {
            ((S) it2.next()).l(imageCaptureException);
        }
    }

    void g() {
        G.o.a();
        FS.log_d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (f()) {
            FS.log_d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f6890f) {
            FS.log_d("TakePictureManager", "The class is paused.");
            return;
        }
        if (this.f6887c.h() == 0) {
            FS.log_d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        e0 e0VarPoll = this.f6885a.poll();
        if (e0VarPoll == null) {
            FS.log_d("TakePictureManager", "No new request.");
            return;
        }
        S s10 = new S(e0VarPoll, this);
        l(s10);
        o2.d<C3171k, O> dVarE = this.f6887c.e(e0VarPoll, s10, s10.o());
        C3171k c3171k = dVarE.f153583a;
        Objects.requireNonNull(c3171k);
        O o10 = dVarE.f153584b;
        Objects.requireNonNull(o10);
        this.f6887c.m(o10);
        s10.s(k(c3171k));
    }

    public void h() {
        G.o.a();
        this.f6890f = true;
        S s10 = this.f6888d;
        if (s10 != null) {
            s10.m();
        }
    }

    public void i() {
        G.o.a();
        this.f6890f = false;
        g();
    }

    public void j(C3183x c3183x) {
        G.o.a();
        this.f6887c = c3183x;
        c3183x.k(this);
    }
}
