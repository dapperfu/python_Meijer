package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BinsView f124479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinsView.TouchedElement.ToteHandle f124480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f124481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BinsView binsView, BinsView.TouchedElement.ToteHandle toteHandle, int i10) {
        super(0);
        this.f124479a = binsView;
        this.f124480b = toteHandle;
        this.f124481c = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BinsView.access$swapToteIndex(this.f124479a, this.f124480b.getIndex(), this.f124481c);
        this.f124479a.f124423q = BinsView.TouchedElement.Nothing.INSTANCE;
        this.f124479a.f124424r = null;
        return Unit.f143329a;
    }
}
