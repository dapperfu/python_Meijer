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
import mv.InterfaceC15783O;

/* loaded from: classes12.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f121037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SyncWorker f121038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Clock f121039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Ref.BooleanRef booleanRef, SyncWorker syncWorker, Clock clock, Continuation continuation) {
        super(2, continuation);
        this.f121037a = booleanRef;
        this.f121038b = syncWorker;
        this.f121039c = clock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f121037a, this.f121038b, this.f121039c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC15783O) obj, (Continuation) obj2)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        IntrinsicsKt.f();
        ResultKt.b(obj);
        ConfigManager.fetch$default(FlyBuyCore.INSTANCE.getConfig(), null, new f(this.f121037a, this.f121038b, this.f121039c), 1, null);
        return Unit.f143329a;
    }
}
