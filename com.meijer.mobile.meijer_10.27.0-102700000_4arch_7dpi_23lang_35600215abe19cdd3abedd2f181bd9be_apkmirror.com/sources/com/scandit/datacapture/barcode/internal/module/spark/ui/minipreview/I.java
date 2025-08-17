package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class I extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f123167a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(N n10) {
        super(1);
        this.f123167a = n10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f123167a.a(((Number) obj).intValue());
        return Unit.f142422a;
    }
}
