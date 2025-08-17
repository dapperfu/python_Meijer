package com.scandit.datacapture.barcode.internal.module.spark.ui;

import android.content.Context;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13219l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C13219l f123138a = new C13219l();

    public C13219l() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(PixelExtensionsKt.pxFromDp$default(HttpResponseStatus.SUCCESS_OK, (Context) null, 1, (Object) null));
    }
}
