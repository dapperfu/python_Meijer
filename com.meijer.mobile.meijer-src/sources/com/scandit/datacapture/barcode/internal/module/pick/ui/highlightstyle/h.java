package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class h {
    public static final Bitmap a(BarcodePickIcon barcodePickIcon, Context context) {
        Intrinsics.j(barcodePickIcon, "<this>");
        Intrinsics.j(context, "context");
        Drawable drawableA = barcodePickIcon.a(context);
        if (drawableA == null) {
            return null;
        }
        if (drawableA instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawableA).getBitmap();
        }
        drawableA.setBounds(0, 0, drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.i(bitmapCreateBitmap, "createBitmap(...)");
        drawableA.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
