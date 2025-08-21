package com.radiusnetworks.flybuy.sdk.pickup.service;

import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.order.OrderEventInfo;
import com.radiusnetworks.flybuy.sdk.manager.OrdersManager;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes12.dex */
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f120995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, Continuation continuation) {
        super(2, continuation);
        this.f120995a = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f120995a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new l(this.f120995a, (Continuation) obj2).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        IntrinsicsKt.f();
        ResultKt.b(obj);
        List list = this.f120995a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OrdersManager.event$default(FlyBuyCore.getOrders(), (OrderEventInfo) it.next(), null, 2, null);
            }
        }
        return Unit.f143329a;
    }
}
