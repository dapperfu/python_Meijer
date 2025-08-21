package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.ar.ui.highlight.BarcodeArHighlight;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f122153a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar) {
        super(1);
        this.f122153a = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodeArHighlight barcodeArHighlight = (BarcodeArHighlight) obj;
        this.f122153a.invoke(barcodeArHighlight != null ? new BarcodeArAugmentation$Highlight(barcodeArHighlight, barcodeArHighlight.createView()) : null);
        return Unit.f143329a;
    }
}
