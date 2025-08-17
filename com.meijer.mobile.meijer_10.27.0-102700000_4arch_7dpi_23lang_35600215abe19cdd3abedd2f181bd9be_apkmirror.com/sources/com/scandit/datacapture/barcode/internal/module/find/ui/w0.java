package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewUiListener;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class w0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeFindViewUiListener f122311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f122312b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(BarcodeFindViewUiListener barcodeFindViewUiListener, Set set) {
        super(0);
        this.f122311a = barcodeFindViewUiListener;
        this.f122312b = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f122311a.onFinishButtonTapped(this.f122312b);
        return Unit.f142422a;
    }
}
