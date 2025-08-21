package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.p0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13265p0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f123007a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13265p0(boolean z10) {
        super(1);
        this.f123007a = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c it = (com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c) obj;
        Intrinsics.j(it, "it");
        it.setEnabled(this.f123007a);
        return Unit.f143329a;
    }
}
