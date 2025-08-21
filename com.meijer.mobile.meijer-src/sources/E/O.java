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
    private final int f6847a;

    /* renamed from: b, reason: collision with root package name */
    private final H.g f6848b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f6849c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6850d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6851e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f6852f;

    /* renamed from: g, reason: collision with root package name */
    private final U f6853g;

    /* renamed from: h, reason: collision with root package name */
    private final String f6854h;

    /* renamed from: j, reason: collision with root package name */
    final com.google.common.util.concurrent.q<Void> f6856j;

    /* renamed from: k, reason: collision with root package name */
    private int f6857k = -1;

    /* renamed from: i, reason: collision with root package name */
    private final List<Integer> f6855i = new ArrayList();

    com.google.common.util.concurrent.q<Void> a() {
        return this.f6856j;
    }

    Rect b() {
        return this.f6849c;
    }

    int c() {
        return this.f6851e;
    }

    H.g d() {
        return this.f6848b;
    }

    public int e() {
        return this.f6847a;
    }

    int f() {
        return this.f6850d;
    }

    Matrix g() {
        return this.f6852f;
    }

    List<Integer> h() {
        return this.f6855i;
    }

    String i() {
        return this.f6854h;
    }

    boolean j() {
        return this.f6853g.isAborted();
    }

    void l(ImageCaptureException imageCaptureException) {
        this.f6853g.f(imageCaptureException);
    }

    void m(int i10) {
        if (this.f6857k != i10) {
            this.f6857k = i10;
            this.f6853g.a(i10);
        }
    }

    void n() {
        this.f6853g.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(H.h hVar) {
        this.f6853g.h(hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(androidx.camera.core.n nVar) {
        this.f6853g.e(nVar);
    }

    void q() {
        if (this.f6857k != -1) {
            m(100);
        }
        this.f6853g.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Bitmap bitmap) {
        this.f6853g.b(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(ImageCaptureException imageCaptureException) {
        this.f6853g.d(imageCaptureException);
    }

    O(F.G g10, H.g gVar, Rect rect, int i10, int i11, Matrix matrix, U u10, com.google.common.util.concurrent.q<Void> qVar, int i12) {
        this.f6847a = i12;
        this.f6848b = gVar;
        this.f6851e = i11;
        this.f6850d = i10;
        this.f6849c = rect;
        this.f6852f = matrix;
        this.f6853g = u10;
        this.f6854h = String.valueOf(g10.hashCode());
        List<androidx.camera.core.impl.j> listA = g10.a();
        Objects.requireNonNull(listA);
        Iterator<androidx.camera.core.impl.j> it = listA.iterator();
        while (it.hasNext()) {
            this.f6855i.add(Integer.valueOf(it.next().getId()));
        }
        this.f6856j = qVar;
    }

    boolean k() {
        d();
        return true;
    }
}
