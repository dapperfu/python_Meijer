package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class I extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f124119a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(N n10) {
        super(1);
        this.f124119a = n10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f124119a.a(((Number) obj).intValue());
        return Unit.f143329a;
    }
}
