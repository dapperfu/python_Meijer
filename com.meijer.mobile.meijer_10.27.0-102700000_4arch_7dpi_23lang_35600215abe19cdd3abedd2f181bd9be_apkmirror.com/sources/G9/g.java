package G9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.webkit.URLUtil;
import h9.DeviceInfo;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LG9/g;", "", "<init>", "()V", "", "imageUrl", "", "c", "(Ljava/lang/String;)Z", "LG9/f;", "fileDownloader", "b", "(LG9/f;Ljava/lang/String;)Ljava/lang/String;", "d", "imageFileUrl", "", "width", "Landroid/graphics/Bitmap;", "e", "(Ljava/lang/String;I)Landroid/graphics/Bitmap;", "Lh9/c;", "deviceInfo", "f", "(LG9/f;Ljava/lang/String;Lh9/c;)Landroid/graphics/Bitmap;", "Landroid/graphics/BitmapFactory$Options;", "options", "reqWidth", "a", "(Landroid/graphics/BitmapFactory$Options;I)I", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f11291a = new g();

    private final boolean c(String imageUrl) {
        if (imageUrl == null) {
            return false;
        }
        if (URLUtil.isHttpsUrl(imageUrl)) {
            return true;
        }
        return new File(imageUrl).exists();
    }

    private final Bitmap e(String imageFileUrl, int width) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(imageFileUrl, options);
            options.inSampleSize = a(options, width);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(imageFileUrl, options);
        } catch (Exception e10) {
            I9.e.INSTANCE.c(new J9.b(e10, null, 2, null));
            return null;
        }
    }

    public final int a(BitmapFactory.Options options, int reqWidth) {
        Intrinsics.j(options, "options");
        int i10 = 1;
        while (reqWidth <= options.outWidth / i10) {
            i10 *= 2;
        }
        return i10;
    }

    public final Bitmap f(f fileDownloader, String imageUrl, DeviceInfo deviceInfo) {
        String strB;
        Intrinsics.j(fileDownloader, "fileDownloader");
        Intrinsics.j(deviceInfo, "deviceInfo");
        if (!c(imageUrl) || (strB = b(fileDownloader, imageUrl)) == null) {
            return null;
        }
        Bitmap bitmapE = e(strB, deviceInfo.getDisplayMetrics().widthPixels);
        if (d(imageUrl)) {
            fileDownloader.c(strB);
        }
        return bitmapE;
    }

    private g() {
    }

    private final String b(f fileDownloader, String imageUrl) {
        if (d(imageUrl) && imageUrl != null) {
            return fileDownloader.e(imageUrl, 3);
        }
        return imageUrl;
    }

    private final boolean d(String imageUrl) {
        return URLUtil.isHttpsUrl(imageUrl);
    }
}
