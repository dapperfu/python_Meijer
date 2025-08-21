package fsimpl;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: fsimpl.fx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14231fx {
    public static Bitmap a(Bitmap bitmap, boolean z10) {
        return bitmap.copy(Bitmap.Config.ARGB_8888, z10);
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == bitmap2) {
            return;
        }
        bitmap.recycle();
    }

    public static boolean a(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE;
    }

    public static Bitmap b(Bitmap bitmap) {
        return a(bitmap, false);
    }
}
