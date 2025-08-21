package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class I extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f122561a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j10) {
        super(0);
        this.f122561a = j10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f122561a.f122582p.shutterButtonPressed();
        this.f122561a.f122562A = false;
        return Unit.f143329a;
    }
}
