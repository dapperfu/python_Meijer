package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class X extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final X f123123a = new X();

    public X() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.f it = (com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.f) obj;
        Intrinsics.j(it, "it");
        it.getForeground().setLevel(0);
        return Unit.f143329a;
    }
}
