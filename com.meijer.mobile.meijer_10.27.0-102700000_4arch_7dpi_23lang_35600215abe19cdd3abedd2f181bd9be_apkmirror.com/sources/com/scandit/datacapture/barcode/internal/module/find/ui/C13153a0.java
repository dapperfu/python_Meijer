package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.a0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13153a0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeFindViewPresenter f122181a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13153a0(BarcodeFindViewPresenter barcodeFindViewPresenter) {
        super(1);
        this.f122181a = barcodeFindViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f122181a.a((BarcodeFindItem) obj);
        return Unit.f142422a;
    }
}
