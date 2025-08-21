package K;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

/* loaded from: classes.dex */
final class b {
    static void a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    static Image b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    static ImageWriter c(Surface surface, int i10) {
        return ImageWriter.newInstance(surface, i10);
    }

    static void d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
