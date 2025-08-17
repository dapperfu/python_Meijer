package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public interface ImageOutput {

    /* renamed from: a, reason: collision with root package name */
    public static final ImageOutput f56197a = new a();

    void a();

    void onImageAvailable(long j10, Bitmap bitmap);

    class a implements ImageOutput {
        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void a() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j10, Bitmap bitmap) {
        }

        a() {
        }
    }
}
