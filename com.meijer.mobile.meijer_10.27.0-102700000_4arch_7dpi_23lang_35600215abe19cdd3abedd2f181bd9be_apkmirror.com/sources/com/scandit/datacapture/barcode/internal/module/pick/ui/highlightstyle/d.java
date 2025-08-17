package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodePickHighlightStyleIconsHolder f122740a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BarcodePickHighlightStyleIconsHolder barcodePickHighlightStyleIconsHolder) {
        super(1);
        this.f122740a = barcodePickHighlightStyleIconsHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BarcodePickState it = (BarcodePickState) obj;
        Intrinsics.j(it, "it");
        return this.f122740a.b(it);
    }
}
