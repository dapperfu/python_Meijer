package com.radiusnetworks.flybuy.sdk.pickup.service;

import android.app.NotificationManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f121000a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, Continuation continuation) {
        super(2, continuation);
        this.f121000a = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new o(this.f121000a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o(this.f121000a, (Continuation) obj2).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.f();
        ResultKt.b(obj);
        Object systemService = this.f121000a.getSystemService("notification");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(2147482310, this.f121000a.a());
        return Unit.f143329a;
    }
}
