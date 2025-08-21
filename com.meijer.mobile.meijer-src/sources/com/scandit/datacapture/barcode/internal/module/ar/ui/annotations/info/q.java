package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class q extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q f122059a = new q();

    public q() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf((((Number) z.f122067q.getValue()).intValue() - PixelExtensionsKt.pxFromDp$default(4, (Context) null, 1, (Object) null)) + 2);
    }
}
