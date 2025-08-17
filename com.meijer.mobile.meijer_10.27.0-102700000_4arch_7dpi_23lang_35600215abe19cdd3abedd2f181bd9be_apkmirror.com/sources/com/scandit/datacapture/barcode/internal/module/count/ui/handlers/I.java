package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class I extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f121609a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j10) {
        super(0);
        this.f121609a = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f121609a.f121630p.shutterButtonPressed();
        this.f121609a.f121610A = false;
        return Unit.f142422a;
    }
}
