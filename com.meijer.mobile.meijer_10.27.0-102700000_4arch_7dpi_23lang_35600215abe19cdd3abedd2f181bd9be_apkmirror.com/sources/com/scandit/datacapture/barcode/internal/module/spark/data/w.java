package com.scandit.datacapture.barcode.internal.module.spark.data;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class w extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f122922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(O o10, Function1 function1) {
        super(1);
        this.f122921a = o10;
        this.f122922b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        O.a(this.f122921a, new v(this.f122922b, obj));
        return Unit.f142422a;
    }
}
