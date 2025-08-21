package androidx.camera.core;

import C.I;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.internal.utils.ImageUtil;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface n extends AutoCloseable {

    public interface a {
        ByteBuffer e();

        int f();

        int g();
    }

    void R0(Rect rect);

    I S2();

    @Override // java.lang.AutoCloseable
    void close();

    int getFormat();

    int getHeight();

    @SuppressLint({"ArrayReturn"})
    a[] getPlanes();

    int getWidth();

    Image m3();

    default Bitmap a3() {
        return ImageUtil.a(this);
    }
}
