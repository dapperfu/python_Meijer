package com.scandit.datacapture.core.internal.module.ui.control;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f126127a = new a();

    public a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(PixelExtensionsKt.pxFromDp$default(32, (Context) null, 1, (Object) null) + ((int) (((Number) ToggleImageButton.f126123e.getValue()).floatValue() * 2)));
    }
}
