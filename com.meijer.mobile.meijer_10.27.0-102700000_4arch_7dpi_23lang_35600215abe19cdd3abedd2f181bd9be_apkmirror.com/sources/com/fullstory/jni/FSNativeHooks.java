package com.fullstory.jni;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;

/* loaded from: classes14.dex */
public interface FSNativeHooks {
    void destroyAsset(AssetManager assetManager, int i10);

    void destroyAsset(AssetManager assetManager, long j10);

    void nCreate(Class cls, Object obj, long j10, Object obj2);

    void nCreate(Class cls, Object obj, InputStream inputStream, byte[] bArr, Object obj2);

    void nDecodeBitmap(Class cls, Bitmap bitmap, long j10, Object obj, boolean z10, int i10, int i11, Rect rect, boolean z11, int i12, boolean z12, boolean z13, boolean z14, long j11, boolean z15);

    void nDecodeBitmap(Class cls, Bitmap bitmap, long j10, Object obj, boolean z10, int i10, int i11, Rect rect, boolean z11, int i12, boolean z12, boolean z13, boolean z14, Object obj2);

    void nativeAssetDestroy(Class cls, long j10);

    void nativeDecodeAsset(Class cls, Bitmap bitmap, int i10, Rect rect, BitmapFactory.Options options);

    void nativeDecodeAsset(Class cls, Bitmap bitmap, int i10, Rect rect, BitmapFactory.Options options, boolean z10, float f10);

    void nativeDecodeAsset(Class cls, Bitmap bitmap, long j10, Rect rect, BitmapFactory.Options options);

    void nativeDecodeAsset(Class cls, Bitmap bitmap, long j10, Rect rect, BitmapFactory.Options options, long j11, long j12);

    void nativeDecodeAsset(Class cls, Bitmap bitmap, long j10, Rect rect, BitmapFactory.Options options, boolean z10, float f10);

    void nativeOpenNonAsset(Class cls, long j10, long j11, int i10, String str, int i11);

    void openNonAssetNative(AssetManager assetManager, int i10, int i11, String str, int i12);

    void openNonAssetNative(AssetManager assetManager, long j10, int i10, String str, int i11);
}
