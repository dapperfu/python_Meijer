package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f123141a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(F f10) {
        super(0);
        this.f123141a = f10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f123141a.setVisibility(4);
        F f10 = this.f123141a;
        f10.f123155l.removeView(f10.f123159p);
        this.f123141a.f123157n.f123114a.f123116a.hideMiniPreview();
        return Unit.f142422a;
    }
}
