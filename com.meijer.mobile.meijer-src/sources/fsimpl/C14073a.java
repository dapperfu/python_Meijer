package fsimpl;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* renamed from: fsimpl.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14073a {

    /* renamed from: a, reason: collision with root package name */
    static final Field f132704a = fT.a(30, 30, BitmapShader.class, "mBitmap");

    public static Bitmap a(BitmapShader bitmapShader) {
        if (!a()) {
            return null;
        }
        try {
            return (Bitmap) f132704a.get(bitmapShader);
        } catch (IllegalAccessException e10) {
            Log.e("Failed to retrieve mBitmap field value", e10);
            return null;
        }
    }

    public static boolean a() {
        return f132704a != null;
    }
}
