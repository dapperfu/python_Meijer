package com.scandit.datacapture.barcode.internal.module.spark.ui;

import android.content.Context;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13220m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C13220m f123139a = new C13220m();

    public C13220m() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(PixelExtensionsKt.pxFromDp$default(HttpResponseStatus.SUCCESS_OK, (Context) null, 1, (Object) null));
    }
}
