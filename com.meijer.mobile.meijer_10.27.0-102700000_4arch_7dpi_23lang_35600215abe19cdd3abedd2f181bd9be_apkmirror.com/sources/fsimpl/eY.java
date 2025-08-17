package fsimpl;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.fullstory.jni.FSNative;
import com.fullstory.jni.FSNativeHooks;
import com.fullstory.util.Log;
import java.io.InputStream;

/* loaded from: classes14.dex */
public class eY implements FSNativeHooks {

    /* renamed from: a, reason: collision with root package name */
    private static final eZ f132117a = new eZ();

    private static void a(long j10) {
        Log.d("Closed " + j10);
        f132117a.b(j10);
    }

    private static void a(long j10, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        eZ eZVar = f132117a;
        String strA = eZVar.a(j10);
        Log.i("Read " + bitmap + " from " + strA);
        eZVar.a(bitmap, strA);
    }

    private static void a(long j10, String str, int i10) {
        Log.d("Opened " + j10 + " with filename " + str + "@" + i10);
        f132117a.a(j10, str);
    }

    public static boolean hook() {
        int iA = FSNative.a(new eY());
        boolean z10 = iA == 0;
        if (!z10) {
            Log.e("Unable to initialize FS native hooks: " + iA);
        }
        return z10;
    }

    public static String identify(Bitmap bitmap) {
        return f132117a.a(bitmap);
    }

    public static boolean unhook() {
        int iA = FSNative.a(null);
        boolean z10 = iA == -1;
        if (!z10) {
            Log.e("Unable to un-initialize FS native hooks: " + iA);
        }
        return z10;
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void destroyAsset(AssetManager assetManager, int i10) {
        a(i10);
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void destroyAsset(AssetManager assetManager, long j10) {
        a(j10);
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nCreate(Class cls, Object obj, long j10, Object obj2) {
        f132117a.putImageDecoder(obj, Long.valueOf(j10));
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nCreate(Class cls, Object obj, InputStream inputStream, byte[] bArr, Object obj2) {
        f132117a.putImageDecoder(obj, eX.a(inputStream));
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nDecodeBitmap(Class cls, Bitmap bitmap, long j10, Object obj, boolean z10, int i10, int i11, Rect rect, boolean z11, int i12, boolean z12, boolean z13, boolean z14, long j11, boolean z15) {
        Long lRemoveImageDecoder = f132117a.removeImageDecoder(obj);
        if (lRemoveImageDecoder != null) {
            a(lRemoveImageDecoder.longValue(), bitmap);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nDecodeBitmap(Class cls, Bitmap bitmap, long j10, Object obj, boolean z10, int i10, int i11, Rect rect, boolean z11, int i12, boolean z12, boolean z13, boolean z14, Object obj2) {
        Long lRemoveImageDecoder = f132117a.removeImageDecoder(obj);
        if (lRemoveImageDecoder != null) {
            a(lRemoveImageDecoder.longValue(), bitmap);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeAssetDestroy(Class cls, long j10) {
        a(j10);
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeDecodeAsset(Class cls, Bitmap bitmap, int i10, Rect rect, BitmapFactory.Options options) {
        a(i10, bitmap);
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeDecodeAsset(Class cls, Bitmap bitmap, int i10, Rect rect, BitmapFactory.Options options, boolean z10, float f10) {
        a(i10, bitmap);
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeDecodeAsset(Class cls, Bitmap bitmap, long j10, Rect rect, BitmapFactory.Options options) {
        a(j10, bitmap);
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeDecodeAsset(Class cls, Bitmap bitmap, long j10, Rect rect, BitmapFactory.Options options, long j11, long j12) {
        a(j10, bitmap);
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeDecodeAsset(Class cls, Bitmap bitmap, long j10, Rect rect, BitmapFactory.Options options, boolean z10, float f10) {
        a(j10, bitmap);
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeOpenNonAsset(Class cls, long j10, long j11, int i10, String str, int i11) {
        a(j10, str, i10);
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void openNonAssetNative(AssetManager assetManager, int i10, int i11, String str, int i12) {
        a(i10, str, i11);
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void openNonAssetNative(AssetManager assetManager, long j10, int i10, String str, int i11) {
        a(j10, str, i10);
    }
}
