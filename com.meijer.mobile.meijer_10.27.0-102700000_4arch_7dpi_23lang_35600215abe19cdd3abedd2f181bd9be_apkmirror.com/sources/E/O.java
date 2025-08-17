package E;

import C.H;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class O {

    /* renamed from: a, reason: collision with root package name */
    private final int f7440a;

    /* renamed from: b, reason: collision with root package name */
    private final H.g f7441b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f7442c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7443d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7444e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f7445f;

    /* renamed from: g, reason: collision with root package name */
    private final U f7446g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7447h;

    /* renamed from: j, reason: collision with root package name */
    final com.google.common.util.concurrent.q<Void> f7449j;

    /* renamed from: k, reason: collision with root package name */
    private int f7450k = -1;

    /* renamed from: i, reason: collision with root package name */
    private final List<Integer> f7448i = new ArrayList();

    com.google.common.util.concurrent.q<Void> a() {
        return this.f7449j;
    }

    Rect b() {
        return this.f7442c;
    }

    int c() {
        return this.f7444e;
    }

    H.g d() {
        return this.f7441b;
    }

    public int e() {
        return this.f7440a;
    }

    int f() {
        return this.f7443d;
    }

    Matrix g() {
        return this.f7445f;
    }

    List<Integer> h() {
        return this.f7448i;
    }

    String i() {
        return this.f7447h;
    }

    boolean j() {
        return this.f7446g.isAborted();
    }

    void l(ImageCaptureException imageCaptureException) {
        this.f7446g.f(imageCaptureException);
    }

    void m(int i10) {
        if (this.f7450k != i10) {
            this.f7450k = i10;
            this.f7446g.a(i10);
        }
    }

    void n() {
        this.f7446g.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(H.h hVar) {
        this.f7446g.h(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(androidx.camera.core.n nVar) {
        this.f7446g.e(nVar);
    }

    void q() {
        if (this.f7450k != -1) {
            m(100);
        }
        this.f7446g.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Bitmap bitmap) {
        this.f7446g.b(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(ImageCaptureException imageCaptureException) {
        this.f7446g.d(imageCaptureException);
    }

    O(F.G g10, H.g gVar, Rect rect, int i10, int i11, Matrix matrix, U u10, com.google.common.util.concurrent.q<Void> qVar, int i12) {
        this.f7440a = i12;
        this.f7441b = gVar;
        this.f7444e = i11;
        this.f7443d = i10;
        this.f7442c = rect;
        this.f7445f = matrix;
        this.f7446g = u10;
        this.f7447h = String.valueOf(g10.hashCode());
        List<androidx.camera.core.impl.j> listA = g10.a();
        Objects.requireNonNull(listA);
        Iterator<androidx.camera.core.impl.j> it = listA.iterator();
        while (it.hasNext()) {
            this.f7448i.add(Integer.valueOf(it.next().getId()));
        }
        this.f7449j = qVar;
    }

    boolean k() {
        d();
        return true;
    }
}
