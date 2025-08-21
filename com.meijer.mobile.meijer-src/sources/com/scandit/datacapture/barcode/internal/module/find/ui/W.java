package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class W extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f123122a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(boolean z10) {
        super(1);
        this.f123122a = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.f it = (com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.f) obj;
        Intrinsics.j(it, "it");
        if (this.f123122a) {
            it.f124367a.start();
        } else {
            it.f124367a.stop();
        }
        return Unit.f143329a;
    }
}
