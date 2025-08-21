package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewUiListener;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class w0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeFindViewUiListener f123263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f123264b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(BarcodeFindViewUiListener barcodeFindViewUiListener, Set set) {
        super(0);
        this.f123263a = barcodeFindViewUiListener;
        this.f123264b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f123263a.onFinishButtonTapped(this.f123264b);
        return Unit.f143329a;
    }
}
