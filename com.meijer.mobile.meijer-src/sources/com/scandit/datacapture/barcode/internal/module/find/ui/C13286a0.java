package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.a0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13286a0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeFindViewPresenter f123133a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13286a0(BarcodeFindViewPresenter barcodeFindViewPresenter) {
        super(1);
        this.f123133a = barcodeFindViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f123133a.a((BarcodeFindItem) obj);
        return Unit.f143329a;
    }
}
