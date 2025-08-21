package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.b0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13288b0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeFindViewPresenter f123137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13288b0(BarcodeFindViewPresenter barcodeFindViewPresenter) {
        super(1);
        this.f123137a = barcodeFindViewPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f123137a.a(((Number) obj).floatValue());
        return Unit.f143329a;
    }
}
