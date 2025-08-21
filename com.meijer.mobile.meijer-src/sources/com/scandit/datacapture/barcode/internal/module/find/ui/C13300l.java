package com.scandit.datacapture.barcode.internal.module.find.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.find.ui.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13300l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13301m f123180a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13300l(C13301m c13301m) {
        super(1);
        this.f123180a = c13301m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C13301m it = (C13301m) obj;
        Intrinsics.j(it, "it");
        this.f123180a.invalidate();
        return Unit.f143329a;
    }
}
