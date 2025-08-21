package androidx.camera.core;

import F.S;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class d implements S {

    /* renamed from: a, reason: collision with root package name */
    private final ImageReader f47478a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f47479b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private boolean f47480c = true;

    public static /* synthetic */ void a(final d dVar, Executor executor, final S.a aVar, ImageReader imageReader) {
        synchronized (dVar.f47479b) {
            try {
                if (!dVar.f47480c) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.h(this.f47476a, aVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean i(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    @Override // F.S
    public n b() {
        Image imageAcquireLatestImage;
        synchronized (this.f47479b) {
            try {
                imageAcquireLatestImage = this.f47478a.acquireLatestImage();
            } catch (RuntimeException e10) {
                if (!i(e10)) {
                    throw e10;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new a(imageAcquireLatestImage);
        }
    }

    @Override // F.S
    public int c() {
        int imageFormat;
        synchronized (this.f47479b) {
            imageFormat = this.f47478a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // F.S
    public void close() {
        synchronized (this.f47479b) {
            this.f47478a.close();
        }
    }

    @Override // F.S
    public void d() {
        synchronized (this.f47479b) {
            this.f47480c = true;
            this.f47478a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // F.S
    public int e() {
        int maxImages;
        synchronized (this.f47479b) {
            maxImages = this.f47478a.getMaxImages();
        }
        return maxImages;
    }

    @Override // F.S
    public void f(final S.a aVar, final Executor executor) {
        synchronized (this.f47479b) {
            this.f47480c = false;
            this.f47478a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    d.a(this.f47473a, executor, aVar, imageReader);
                }
            }, G.l.a());
        }
    }

    @Override // F.S
    public n g() {
        Image imageAcquireNextImage;
        synchronized (this.f47479b) {
            try {
                imageAcquireNextImage = this.f47478a.acquireNextImage();
            } catch (RuntimeException e10) {
                if (!i(e10)) {
                    throw e10;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new a(imageAcquireNextImage);
        }
    }

    @Override // F.S
    public int getHeight() {
        int height;
        synchronized (this.f47479b) {
            height = this.f47478a.getHeight();
        }
        return height;
    }

    @Override // F.S
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f47479b) {
            surface = this.f47478a.getSurface();
        }
        return surface;
    }

    @Override // F.S
    public int getWidth() {
        int width;
        synchronized (this.f47479b) {
            width = this.f47478a.getWidth();
        }
        return width;
    }

    d(ImageReader imageReader) {
        this.f47478a = imageReader;
    }

    public static /* synthetic */ void h(d dVar, S.a aVar) {
        dVar.getClass();
        aVar.a(dVar);
    }
}
