package com.scandit.datacapture.barcode.internal.module.spark.ui.button;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f124062a = new i();

    public i() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(PixelExtensionsKt.pxFromDp$default(250.0f, (Context) null, 1, (Object) null));
    }
}
