package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f122297a = Color.parseColor("#80000000");

    public static final void a(TextView textView) {
        Intrinsics.j(textView, "<this>");
        textView.setTextSize(2, 16.0f);
        textView.setTextColor(-1);
        textView.setBackgroundColor(0);
        textView.setShadowLayer(PixelExtensionsKt.pxFromDp$default(4, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(0, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(2, (Context) null, 1, (Object) null), f122297a);
    }
}
