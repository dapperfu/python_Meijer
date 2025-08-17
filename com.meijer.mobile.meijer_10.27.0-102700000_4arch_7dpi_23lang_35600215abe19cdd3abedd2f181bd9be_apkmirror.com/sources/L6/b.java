package L6;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.util.Base64;
import com.bazaarvoice.bvandroidsdk.BazaarRuntimeException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b {
    private static int a(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 <= i11 && i13 <= i10) {
            return 1;
        }
        int i15 = i12 / 2;
        int i16 = i13 / 2;
        while (i15 / i14 >= i11 && i16 / i14 >= i10) {
            i14 *= 2;
        }
        return i14;
    }

    public static Bitmap d(byte[] bArr, int i10, int i11) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        options.inSampleSize = a(options, i10, i11);
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    public static Float e(Float f10) {
        return f10 == null ? Float.valueOf(0.0f) : f10;
    }

    public static Integer f(Integer num) {
        if (num == null) {
            return 0;
        }
        return num;
    }

    public static <Key, Value> void h(Map<Key, Value> map, Key key, Value value) {
        if (map == null || key == null || value == null) {
            return;
        }
        map.put(key, value);
    }

    public static String i(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static URL j(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static void b() {
        if (g()) {
        } else {
            throw new BazaarRuntimeException("Method call should happen from the main thread.");
        }
    }

    public static void c() {
        if (!g()) {
        } else {
            throw new BazaarRuntimeException("Method call should not happen from the main thread.");
        }
    }

    public static boolean g() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
