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
    private final Image f47469a;

    /* renamed from: b, reason: collision with root package name */
    private final C0979a[] f47470b;

    /* renamed from: c, reason: collision with root package name */
    private final I f47471c;

    /* renamed from: androidx.camera.core.a$a, reason: collision with other inner class name */
    private static final class C0979a implements n.a {

        /* renamed from: a, reason: collision with root package name */
        private final Image.Plane f47472a;

        @Override // androidx.camera.core.n.a
        public ByteBuffer e() {
            return this.f47472a.getBuffer();
        }

        @Override // androidx.camera.core.n.a
        public int f() {
            return this.f47472a.getRowStride();
        }

        @Override // androidx.camera.core.n.a
        public int g() {
            return this.f47472a.getPixelStride();
        }

        C0979a(Image.Plane plane) {
            this.f47472a = plane;
        }
    }

    @Override // androidx.camera.core.n
    public void R0(Rect rect) {
        this.f47469a.setCropRect(rect);
    }

    @Override // androidx.camera.core.n
    public I S2() {
        return this.f47471c;
    }

    @Override // androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        this.f47469a.close();
    }

    @Override // androidx.camera.core.n
    public int getFormat() {
        return this.f47469a.getFormat();
    }

    @Override // androidx.camera.core.n
    public int getHeight() {
        return this.f47469a.getHeight();
    }

    @Override // androidx.camera.core.n
    public n.a[] getPlanes() {
        return this.f47470b;
    }

    @Override // androidx.camera.core.n
    public int getWidth() {
        return this.f47469a.getWidth();
    }

    @Override // androidx.camera.core.n
    public Image m3() {
        return this.f47469a;
    }

    a(Image image) {
        this.f47469a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f47470b = new C0979a[planes.length];
            for (int i10 = 0; i10 < planes.length; i10++) {
                this.f47470b[i10] = new C0979a(planes[i10]);
            }
        } else {
            this.f47470b = new C0979a[0];
        }
        this.f47471c = N.d(x0.b(), image.getTimestamp(), 0, new Matrix());
    }
}
