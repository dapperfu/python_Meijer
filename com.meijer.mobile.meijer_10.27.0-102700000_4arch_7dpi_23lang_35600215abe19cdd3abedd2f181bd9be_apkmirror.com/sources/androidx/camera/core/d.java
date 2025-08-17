package androidx.camera.core;

import F.S;
import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class d implements S {

    /* renamed from: a, reason: collision with root package name */
    private final ImageReader f47254a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f47255b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private boolean f47256c = true;

    public static /* synthetic */ void a(final d dVar, Executor executor, final S.a aVar, ImageReader imageReader) {
        synchronized (dVar.f47255b) {
            try {
                if (!dVar.f47256c) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            d.h(this.f47252a, aVar);
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
        synchronized (this.f47255b) {
            try {
                imageAcquireLatestImage = this.f47254a.acquireLatestImage();
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
        synchronized (this.f47255b) {
            imageFormat = this.f47254a.getImageFormat();
        }
        return imageFormat;
    }

    @Override // F.S
    public void close() {
        synchronized (this.f47255b) {
            this.f47254a.close();
        }
    }

    @Override // F.S
    public void d() {
        synchronized (this.f47255b) {
            this.f47256c = true;
            this.f47254a.setOnImageAvailableListener(null, null);
        }
    }

    @Override // F.S
    public int e() {
        int maxImages;
        synchronized (this.f47255b) {
            maxImages = this.f47254a.getMaxImages();
        }
        return maxImages;
    }

    @Override // F.S
    public void f(final S.a aVar, final Executor executor) {
        synchronized (this.f47255b) {
            this.f47256c = false;
            this.f47254a.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    d.a(this.f47249a, executor, aVar, imageReader);
                }
            }, G.l.a());
        }
    }

    @Override // F.S
    public n g() {
        Image imageAcquireNextImage;
        synchronized (this.f47255b) {
            try {
                imageAcquireNextImage = this.f47254a.acquireNextImage();
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
        synchronized (this.f47255b) {
            height = this.f47254a.getHeight();
        }
        return height;
    }

    @Override // F.S
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f47255b) {
            surface = this.f47254a.getSurface();
        }
        return surface;
    }

    @Override // F.S
    public int getWidth() {
        int width;
        synchronized (this.f47255b) {
            width = this.f47254a.getWidth();
        }
        return width;
    }

    d(ImageReader imageReader) {
        this.f47254a = imageReader;
    }

    public static /* synthetic */ void h(d dVar, S.a aVar) {
        dVar.getClass();
        aVar.a(dVar);
    }
}
