package com.scandit.datacapture.barcode.internal.module.spark.data;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class B extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f123787b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(O o10, Function0 function0) {
        super(1);
        this.f123786a = o10;
        this.f123787b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        O.a(this.f123786a, this.f123787b);
        return Unit.f143329a;
    }
}
