package com.scandit.datacapture.barcode.internal.module.find.ui.wrappers;

import android.content.Context;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class i extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureView f123300a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(DataCaptureView dataCaptureView) {
        super(1);
        this.f123300a = dataCaptureView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        DataCaptureView dataCaptureView = this.f123300a;
        if (dataCaptureView.getId() == -1) {
            dataCaptureView.setId(R.id.sc_find_datacapture_view);
        }
        return dataCaptureView;
    }
}
