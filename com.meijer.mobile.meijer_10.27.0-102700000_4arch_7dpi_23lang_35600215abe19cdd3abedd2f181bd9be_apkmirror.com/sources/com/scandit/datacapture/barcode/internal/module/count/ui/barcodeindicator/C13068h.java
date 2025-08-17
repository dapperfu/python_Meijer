package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13068h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13079t f121442a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13068h(C13079t c13079t) {
        super(0);
        this.f121442a = c13079t;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a aVar = new com.scandit.datacapture.barcode.internal.module.count.ui.barcodeoverlay.a(this.f121442a.f121457a.e());
        C13079t c13079t = this.f121442a;
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c13079t.f121457a.a().addView(aVar, 0);
        return aVar;
    }
}
