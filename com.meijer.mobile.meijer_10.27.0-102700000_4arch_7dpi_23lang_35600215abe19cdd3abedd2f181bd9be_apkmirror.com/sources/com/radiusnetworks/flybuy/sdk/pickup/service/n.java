package com.radiusnetworks.flybuy.sdk.pickup.service;

import android.location.Location;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;

/* loaded from: classes11.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f120051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Location f120052b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, Location location, Continuation continuation) {
        super(2, continuation);
        this.f120051a = tVar;
        this.f120052b = location;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f120051a, this.f120052b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        IntrinsicsKt.f();
        ResultKt.b(obj);
        t tVar = this.f120051a;
        Location location = this.f120052b;
        try {
            com.radiusnetworks.flybuy.sdk.pickup.helper.c cVar = tVar.f120058a;
            if (cVar == null) {
                Intrinsics.y("locationEventGenerator");
                cVar = null;
            }
            C16648k.d(C16623P.a(C16639f0.b()), null, null, new l(cVar.b(location), null), 3, null);
            tVar.e();
            return Unit.f142422a;
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }
}
