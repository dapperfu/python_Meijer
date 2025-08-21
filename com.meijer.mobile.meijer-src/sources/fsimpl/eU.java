package fsimpl;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import com.fullstory.jni.FSNativeHooks;
import java.io.InputStream;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class eU extends eT {
    public eU() {
        int i10;
        Method methodA;
        super(15);
        int i11 = Build.VERSION.SDK_INT;
        Method methodA2 = eW.a(AssetManager.class, "destroyAsset", null, Integer.TYPE);
        a(0, methodA2, methodA2 == null ? null : eW.a(FSNativeHooks.class, "destroyAsset", AssetManager.class, Integer.TYPE), AssetManager.class);
        Method methodA3 = eW.a(AssetManager.class, "destroyAsset", null, Long.TYPE);
        a(1, methodA3, methodA3 == null ? null : eW.a(FSNativeHooks.class, "destroyAsset", AssetManager.class, Long.TYPE), AssetManager.class);
        if (i11 >= 28) {
            Class clsA = fT.a("android.graphics.ImageDecoder");
            Method methodA4 = eW.a(clsA, "nCreate", fT.a("android.graphics.ImageDecoder"), InputStream.class, byte[].class, fT.a("android.graphics.ImageDecoder$Source"));
            a(2, methodA4, methodA4 == null ? null : eW.a(FSNativeHooks.class, "nCreate", Class.class, Object.class, InputStream.class, byte[].class, Object.class), clsA);
        }
        if (i11 >= 28) {
            Class clsA2 = fT.a("android.graphics.ImageDecoder");
            Method methodA5 = eW.a(clsA2, "nCreate", fT.a("android.graphics.ImageDecoder"), Long.TYPE, fT.a("android.graphics.ImageDecoder$Source"));
            a(3, methodA5, methodA5 == null ? null : eW.a(FSNativeHooks.class, "nCreate", Class.class, Object.class, Long.TYPE, Object.class), clsA2);
        }
        if (i11 < 28 || i11 > 28) {
            i10 = 13;
        } else {
            Class clsA3 = fT.a("android.graphics.ImageDecoder");
            Method methodA6 = eW.a(clsA3, "nDecodeBitmap", Bitmap.class, Long.TYPE, fT.a("android.graphics.ImageDecoder"), Boolean.TYPE, Integer.TYPE, Integer.TYPE, Rect.class, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, fT.a("android.graphics.ColorSpace"));
            if (methodA6 == null) {
                methodA = null;
                i10 = 13;
            } else {
                i10 = 13;
                methodA = eW.a(FSNativeHooks.class, "nDecodeBitmap", Class.class, Bitmap.class, Long.TYPE, Object.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Rect.class, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Object.class);
            }
            a(4, methodA6, methodA, clsA3);
        }
        if (i11 >= 29) {
            Class clsA4 = fT.a("android.graphics.ImageDecoder");
            Class[] clsArr = new Class[i10];
            clsArr[0] = Long.TYPE;
            clsArr[1] = fT.a("android.graphics.ImageDecoder");
            clsArr[2] = Boolean.TYPE;
            clsArr[3] = Integer.TYPE;
            clsArr[4] = Integer.TYPE;
            clsArr[5] = Rect.class;
            clsArr[6] = Boolean.TYPE;
            clsArr[7] = Integer.TYPE;
            clsArr[8] = Boolean.TYPE;
            clsArr[9] = Boolean.TYPE;
            clsArr[10] = Boolean.TYPE;
            clsArr[11] = Long.TYPE;
            clsArr[12] = Boolean.TYPE;
            Method methodA7 = eW.a(clsA4, "nDecodeBitmap", Bitmap.class, clsArr);
            a(5, methodA7, methodA7 == null ? null : eW.a(FSNativeHooks.class, "nDecodeBitmap", Class.class, Bitmap.class, Long.TYPE, Object.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Rect.class, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Long.TYPE, Boolean.TYPE), clsA4);
        }
        Method methodA8 = eW.a(AssetManager.class, "nativeAssetDestroy", null, Long.TYPE);
        a(6, methodA8, methodA8 == null ? null : eW.a(FSNativeHooks.class, "nativeAssetDestroy", Class.class, Long.TYPE), AssetManager.class);
        Method methodA9 = eW.a(BitmapFactory.class, "nativeDecodeAsset", Bitmap.class, Integer.TYPE, Rect.class, BitmapFactory.Options.class);
        a(7, methodA9, methodA9 == null ? null : eW.a(FSNativeHooks.class, "nativeDecodeAsset", Class.class, Bitmap.class, Integer.TYPE, Rect.class, BitmapFactory.Options.class), BitmapFactory.class);
        Method methodA10 = eW.a(BitmapFactory.class, "nativeDecodeAsset", Bitmap.class, Integer.TYPE, Rect.class, BitmapFactory.Options.class, Boolean.TYPE, Float.TYPE);
        a(8, methodA10, methodA10 == null ? null : eW.a(FSNativeHooks.class, "nativeDecodeAsset", Class.class, Bitmap.class, Integer.TYPE, Rect.class, BitmapFactory.Options.class, Boolean.TYPE, Float.TYPE), BitmapFactory.class);
        Method methodA11 = eW.a(BitmapFactory.class, "nativeDecodeAsset", Bitmap.class, Long.TYPE, Rect.class, BitmapFactory.Options.class);
        a(9, methodA11, methodA11 == null ? null : eW.a(FSNativeHooks.class, "nativeDecodeAsset", Class.class, Bitmap.class, Long.TYPE, Rect.class, BitmapFactory.Options.class), BitmapFactory.class);
        Method methodA12 = eW.a(BitmapFactory.class, "nativeDecodeAsset", Bitmap.class, Long.TYPE, Rect.class, BitmapFactory.Options.class, Boolean.TYPE, Float.TYPE);
        a(10, methodA12, methodA12 == null ? null : eW.a(FSNativeHooks.class, "nativeDecodeAsset", Class.class, Bitmap.class, Long.TYPE, Rect.class, BitmapFactory.Options.class, Boolean.TYPE, Float.TYPE), BitmapFactory.class);
        if (i11 >= 29) {
            Method methodA13 = eW.a(BitmapFactory.class, "nativeDecodeAsset", Bitmap.class, Long.TYPE, Rect.class, BitmapFactory.Options.class, Long.TYPE, Long.TYPE);
            a(11, methodA13, methodA13 == null ? null : eW.a(FSNativeHooks.class, "nativeDecodeAsset", Class.class, Bitmap.class, Long.TYPE, Rect.class, BitmapFactory.Options.class, Long.TYPE, Long.TYPE), BitmapFactory.class);
        }
        Method methodA14 = eW.a(AssetManager.class, "nativeOpenNonAsset", Long.TYPE, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE);
        a(12, methodA14, methodA14 == null ? null : eW.a(FSNativeHooks.class, "nativeOpenNonAsset", Class.class, Long.TYPE, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE), AssetManager.class);
        Method methodA15 = eW.a(AssetManager.class, "openNonAssetNative", Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE);
        a(13, methodA15, methodA15 == null ? null : eW.a(FSNativeHooks.class, "openNonAssetNative", AssetManager.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE), AssetManager.class);
        Method methodA16 = eW.a(AssetManager.class, "openNonAssetNative", Long.TYPE, Integer.TYPE, String.class, Integer.TYPE);
        a(14, methodA16, methodA16 != null ? eW.a(FSNativeHooks.class, "openNonAssetNative", AssetManager.class, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE) : null, AssetManager.class);
    }
}
