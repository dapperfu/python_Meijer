package fsimpl;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.fullstory.jni.FSNativeHooks;
import java.io.InputStream;

/* loaded from: classes15.dex */
public class eV implements FSNativeHooks {

    /* renamed from: a, reason: collision with root package name */
    public int f133363a = -1;

    /* renamed from: b, reason: collision with root package name */
    private FSNativeHooks f133364b = null;

    public void a(FSNativeHooks fSNativeHooks) {
        this.f133364b = fSNativeHooks;
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void destroyAsset(AssetManager assetManager, int i10) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.destroyAsset(assetManager, i10);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void destroyAsset(AssetManager assetManager, long j10) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.destroyAsset(assetManager, j10);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nCreate(Class cls, Object obj, long j10, Object obj2) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.nCreate(cls, obj, j10, obj2);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nCreate(Class cls, Object obj, InputStream inputStream, byte[] bArr, Object obj2) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.nCreate(cls, obj, inputStream, bArr, obj2);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nDecodeBitmap(Class cls, Bitmap bitmap, long j10, Object obj, boolean z10, int i10, int i11, Rect rect, boolean z11, int i12, boolean z12, boolean z13, boolean z14, long j11, boolean z15) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.nDecodeBitmap(cls, bitmap, j10, obj, z10, i10, i11, rect, z11, i12, z12, z13, z14, j11, z15);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nDecodeBitmap(Class cls, Bitmap bitmap, long j10, Object obj, boolean z10, int i10, int i11, Rect rect, boolean z11, int i12, boolean z12, boolean z13, boolean z14, Object obj2) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.nDecodeBitmap(cls, bitmap, j10, obj, z10, i10, i11, rect, z11, i12, z12, z13, z14, obj2);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeAssetDestroy(Class cls, long j10) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.nativeAssetDestroy(cls, j10);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeDecodeAsset(Class cls, Bitmap bitmap, int i10, Rect rect, BitmapFactory.Options options) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.nativeDecodeAsset(cls, bitmap, i10, rect, options);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeDecodeAsset(Class cls, Bitmap bitmap, int i10, Rect rect, BitmapFactory.Options options, boolean z10, float f10) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.nativeDecodeAsset(cls, bitmap, i10, rect, options, z10, f10);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeDecodeAsset(Class cls, Bitmap bitmap, long j10, Rect rect, BitmapFactory.Options options) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.nativeDecodeAsset(cls, bitmap, j10, rect, options);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeDecodeAsset(Class cls, Bitmap bitmap, long j10, Rect rect, BitmapFactory.Options options, long j11, long j12) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.nativeDecodeAsset(cls, bitmap, j10, rect, options, j11, j12);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeDecodeAsset(Class cls, Bitmap bitmap, long j10, Rect rect, BitmapFactory.Options options, boolean z10, float f10) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.nativeDecodeAsset(cls, bitmap, j10, rect, options, z10, f10);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void nativeOpenNonAsset(Class cls, long j10, long j11, int i10, String str, int i11) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.nativeOpenNonAsset(cls, j10, j11, i10, str, i11);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void openNonAssetNative(AssetManager assetManager, int i10, int i11, String str, int i12) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.openNonAssetNative(assetManager, i10, i11, str, i12);
        }
    }

    @Override // com.fullstory.jni.FSNativeHooks
    public void openNonAssetNative(AssetManager assetManager, long j10, int i10, String str, int i11) {
        FSNativeHooks fSNativeHooks = this.f133364b;
        if (fSNativeHooks != null) {
            fSNativeHooks.openNonAssetNative(assetManager, j10, i10, str, i11);
        }
    }
}
