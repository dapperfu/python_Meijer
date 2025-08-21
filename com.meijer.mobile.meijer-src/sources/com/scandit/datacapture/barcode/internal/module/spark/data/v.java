package com.scandit.datacapture.barcode.internal.module.spark.data;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class v extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f123871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Function1 function1, Object obj) {
        super(0);
        this.f123871a = function1;
        this.f123872b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f123871a.invoke(this.f123872b);
        return Unit.f143329a;
    }
}
