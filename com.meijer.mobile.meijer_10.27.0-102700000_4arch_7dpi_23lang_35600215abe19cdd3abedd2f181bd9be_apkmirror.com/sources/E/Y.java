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
    final InterfaceC3420w f7479b;

    /* renamed from: c, reason: collision with root package name */
    C3421x f7480c;

    /* renamed from: d, reason: collision with root package name */
    private S f7481d;

    /* renamed from: e, reason: collision with root package name */
    private final List<S> f7482e;

    /* renamed from: a, reason: collision with root package name */
    final Deque<e0> f7478a = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    boolean f7483f = false;

    class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3409k f7484a;

        a(C3409k c3409k) {
            this.f7484a = c3409k;
        }

        @Override // I.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            Y.this.f7479b.c();
        }

        @Override // I.c
        public void onFailure(Throwable th2) {
            if (this.f7484a.b()) {
                return;
            }
            int iF = this.f7484a.a().get(0).f();
            if (th2 instanceof ImageCaptureException) {
                Y.this.f7480c.j(b.c(iF, (ImageCaptureException) th2));
            } else {
                Y.this.f7480c.j(b.c(iF, new ImageCaptureException(2, "Failed to submit capture request", th2)));
            }
            Y.this.f7479b.c();
        }
    }

    static abstract class b {
        abstract ImageCaptureException a();

        abstract int b();

        static b c(int i10, ImageCaptureException imageCaptureException) {
            return new C3405g(i10, imageCaptureException);
        }

        b() {
        }
    }

    public static /* synthetic */ void c(Y y10) {
        y10.f7481d = null;
        y10.g();
    }

    boolean f() {
        return this.f7481d != null;
    }

    public Y(InterfaceC3420w interfaceC3420w) {
        G.o.a();
        this.f7479b = interfaceC3420w;
        this.f7482e = new ArrayList();
    }

    private com.google.common.util.concurrent.q<Void> k(C3409k c3409k) {
        G.o.a();
        this.f7479b.b();
        com.google.common.util.concurrent.q<Void> qVarA = this.f7479b.a(c3409k.a());
        I.n.j(qVarA, new a(c3409k), H.a.d());
        return qVarA;
    }

    private void l(final S s10) {
        o2.i.i(!f());
        this.f7481d = s10;
        s10.o().addListener(new Runnable() { // from class: E.V
            @Override // java.lang.Runnable
            public final void run() {
                Y.c(this.f7474a);
            }
        }, H.a.a());
        this.f7482e.add(s10);
        s10.p().addListener(new Runnable() { // from class: E.W
            @Override // java.lang.Runnable
            public final void run() {
                this.f7475a.f7482e.remove(s10);
            }
        }, H.a.a());
    }

    @Override // androidx.camera.core.e.a
    public void a(androidx.camera.core.n nVar) {
        H.a.d().execute(new Runnable() { // from class: E.X
            @Override // java.lang.Runnable
            public final void run() {
                this.f7477a.g();
            }
        });
    }

    @Override // E.e0.a
    public void b(e0 e0Var) {
        G.o.a();
        C.P.a("TakePictureManager", "Add a new request for retrying.");
        this.f7478a.addFirst(e0Var);
        g();
    }

    public void e() {
        G.o.a();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        Iterator<e0> it = this.f7478a.iterator();
        while (it.hasNext()) {
            it.next().r(imageCaptureException);
        }
        this.f7478a.clear();
        Iterator it2 = new ArrayList(this.f7482e).iterator();
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
        if (this.f7483f) {
            FS.log_d("TakePictureManager", "The class is paused.");
            return;
        }
        if (this.f7480c.h() == 0) {
            FS.log_d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        e0 e0VarPoll = this.f7478a.poll();
        if (e0VarPoll == null) {
            FS.log_d("TakePictureManager", "No new request.");
            return;
        }
        S s10 = new S(e0VarPoll, this);
        l(s10);
        o2.d<C3409k, O> dVarE = this.f7480c.e(e0VarPoll, s10, s10.o());
        C3409k c3409k = dVarE.f153138a;
        Objects.requireNonNull(c3409k);
        O o10 = dVarE.f153139b;
        Objects.requireNonNull(o10);
        this.f7480c.m(o10);
        s10.s(k(c3409k));
    }

    public void h() {
        G.o.a();
        this.f7483f = true;
        S s10 = this.f7481d;
        if (s10 != null) {
            s10.m();
        }
    }

    public void i() {
        G.o.a();
        this.f7483f = false;
        g();
    }

    public void j(C3421x c3421x) {
        G.o.a();
        this.f7480c = c3421x;
        c3421x.k(this);
    }
}
