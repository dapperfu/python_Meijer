package com.scandit.datacapture.core.internal.sdk.extensions;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0004\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0001¨\u0006\t"}, d2 = {"bitmapFromBase64", "Landroid/graphics/Bitmap;", "", "bitmapFromResource", "", "bitmapFromResourceName", "toBase64", "toJpeg", "", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BitmapExtensionsKt {
    public static final Bitmap bitmapFromBase64(String str) {
        Object objB;
        Bitmap bitmapDecodeByteArray;
        Intrinsics.j(str, "<this>");
        if (StringsKt.s0(str)) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            int iQ0 = StringsKt.q0(str, ",", 0, false, 6, null);
            byte[] bArrDecode = Base64.decode(iQ0 < 0 ? str : StringsKt.L0(str, 0, iQ0).toString(), 2);
            if (bArrDecode != null) {
                Intrinsics.g(bArrDecode);
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            } else {
                bitmapDecodeByteArray = null;
            }
            objB = Result.b(bitmapDecodeByteArray);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        return (Bitmap) (Result.g(objB) ? null : objB);
    }

    public static final Bitmap bitmapFromResource(int i10) {
        return ContextExtensionsKt.getBitmap(AppAndroidEnvironment.INSTANCE.getApplicationContext(), i10);
    }

    @SuppressLint({"DiscouragedApi"})
    public static final Bitmap bitmapFromResourceName(String str) {
        Intrinsics.j(str, "<this>");
        AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
        Context applicationContext = appAndroidEnvironment.getApplicationContext();
        return ContextExtensionsKt.getBitmap(appAndroidEnvironment.getApplicationContext(), applicationContext.getResources().getIdentifier(str, "drawable", applicationContext.getPackageName()));
    }

    public static final String toBase64(Bitmap bitmap) {
        Intrinsics.j(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            CloseableKt.a(byteArrayOutputStream, null);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.i(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        } finally {
        }
    }

    public static final byte[] toJpeg(Bitmap bitmap) {
        Intrinsics.j(bitmap, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            CloseableKt.a(byteArrayOutputStream, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.i(byteArray, "toByteArray(...)");
            return byteArray;
        } finally {
        }
    }
}
