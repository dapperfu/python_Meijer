package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f124093a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(F f10) {
        super(0);
        this.f124093a = f10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f124093a.setVisibility(4);
        F f10 = this.f124093a;
        f10.f124107l.removeView(f10.f124111p);
        this.f124093a.f124109n.f124066a.f124068a.hideMiniPreview();
        return Unit.f143329a;
    }
}
