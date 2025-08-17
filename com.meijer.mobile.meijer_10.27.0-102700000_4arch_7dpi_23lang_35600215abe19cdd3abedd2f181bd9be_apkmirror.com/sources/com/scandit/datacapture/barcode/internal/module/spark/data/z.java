package com.scandit.datacapture.barcode.internal.module.spark.data;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f122926b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(O o10, Function0 function0) {
        super(0);
        this.f122925a = o10;
        this.f122926b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        O.a(this.f122925a, this.f122926b);
        return Unit.f142422a;
    }
}
