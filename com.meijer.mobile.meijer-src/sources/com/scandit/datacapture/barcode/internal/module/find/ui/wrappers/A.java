package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class A extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final A f123265a = new A();

    public A() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(PixelExtensionsKt.pxFromDp$default(4, (Context) null, 1, (Object) null));
    }
}
