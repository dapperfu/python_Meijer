package com.radiusnetworks.flybuy.sdk.sync;

import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.manager.ConfigManager;
import j$.time.Clock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import qv.InterfaceC16622O;

/* loaded from: classes11.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f120085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SyncWorker f120086b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Clock f120087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Ref.BooleanRef booleanRef, SyncWorker syncWorker, Clock clock, Continuation continuation) {
        super(2, continuation);
        this.f120085a = booleanRef;
        this.f120086b = syncWorker;
        this.f120087c = clock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f120085a, this.f120086b, this.f120087c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        IntrinsicsKt.f();
        ResultKt.b(obj);
        ConfigManager.fetch$default(FlyBuyCore.INSTANCE.getConfig(), null, new c(this.f120085a, this.f120086b, this.f120087c), 1, null);
        return Unit.f142422a;
    }
}
