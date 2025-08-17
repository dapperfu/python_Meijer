package androidx.camera.core;

import C.I;
import C.N;
import F.x0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.n;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Image f47245a;

    /* renamed from: b, reason: collision with root package name */
    private final C0966a[] f47246b;

    /* renamed from: c, reason: collision with root package name */
    private final I f47247c;

    /* renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    private static final class C0966a implements n.a {

        /* renamed from: a, reason: collision with root package name */
        private final Image.Plane f47248a;

        @Override // androidx.camera.core.n.a
        public ByteBuffer e() {
            return this.f47248a.getBuffer();
        }

        @Override // androidx.camera.core.n.a
        public int f() {
            return this.f47248a.getRowStride();
        }

        @Override // androidx.camera.core.n.a
        public int g() {
            return this.f47248a.getPixelStride();
        }

        C0966a(Image.Plane plane) {
            this.f47248a = plane;
        }
    }

    @Override // androidx.camera.core.n
    public I S2() {
        return this.f47247c;
    }

    @Override // androidx.camera.core.n
    public void T0(Rect rect) {
        this.f47245a.setCropRect(rect);
    }

    @Override // androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        this.f47245a.close();
    }

    @Override // androidx.camera.core.n
    public int getFormat() {
        return this.f47245a.getFormat();
    }

    @Override // androidx.camera.core.n
    public int getHeight() {
        return this.f47245a.getHeight();
    }

    @Override // androidx.camera.core.n
    public n.a[] getPlanes() {
        return this.f47246b;
    }

    @Override // androidx.camera.core.n
    public int getWidth() {
        return this.f47245a.getWidth();
    }

    @Override // androidx.camera.core.n
    public Image m3() {
        return this.f47245a;
    }

    a(Image image) {
        this.f47245a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f47246b = new C0966a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f47246b[i10] = new C0966a(planes[i10]);
            }
        } else {
            this.f47246b = new C0966a[0];
        }
        this.f47247c = N.d(x0.b(), image.getTimestamp(), 0, new Matrix());
    }
}
