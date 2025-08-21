package com.scandit.datacapture.barcode.internal.module.spark.data;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class w extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f123874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(O o10, Function1 function1) {
        super(1);
        this.f123873a = o10;
        this.f123874b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        O.a(this.f123873a, new v(this.f123874b, obj));
        return Unit.f143329a;
    }
}
