package r5;

import android.graphics.Bitmap;
import android.os.Build;
import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u0015\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\" \u0010\b\u001a\u00020\u0003*\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\f\u001a\u00020\u0003*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\u0010\u001a\u00020\r*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0015\u001a\u00020\u0000*\u00020\t8@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroid/graphics/Bitmap$Config;", "e", "(Landroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap$Config;", "", "b", "(Landroid/graphics/Bitmap$Config;)I", "getBytesPerPixel$annotations", "(Landroid/graphics/Bitmap$Config;)V", "bytesPerPixel", "Landroid/graphics/Bitmap;", "a", "(Landroid/graphics/Bitmap;)I", "allocationByteCountCompat", "", "d", "(Landroid/graphics/Bitmap$Config;)Z", "isHardware", "c", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap$Config;", "getSafeConfig$annotations", "(Landroid/graphics/Bitmap;)V", "safeConfig", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: r5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16837a {
    public static final int b(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
    }

    public static final boolean d(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static final Bitmap.Config e(Bitmap.Config config) {
        return (config == null || d(config)) ? Bitmap.Config.ARGB_8888 : config;
    }

    public static final int a(Bitmap bitmap) {
        if (!FS.bitmap_isRecycled(bitmap)) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                return bitmap.getWidth() * bitmap.getHeight() * b(bitmap.getConfig());
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final Bitmap.Config c(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            return Bitmap.Config.ARGB_8888;
        }
        return config;
    }
}
