package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13201h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13212t f122394a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13201h(C13212t c13212t) {
        super(0);
        this.f122394a = c13212t;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a aVar = new com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a(this.f122394a.f122409a.e());
        C13212t c13212t = this.f122394a;
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c13212t.f122409a.a().addView(aVar, 0);
        return aVar;
    }
}
