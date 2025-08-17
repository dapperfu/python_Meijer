package com.scandit.datacapture.core.internal.module;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageConverterInstance;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b extends NativeImageConverterInstance {
    @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageConverterInstance
    public final byte[] convertToJpeg(NativeImageBuffer imageBuffer) {
        Intrinsics.j(imageBuffer, "imageBuffer");
        Bitmap bitmap = new ImageBuffer(imageBuffer).toBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.i(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
