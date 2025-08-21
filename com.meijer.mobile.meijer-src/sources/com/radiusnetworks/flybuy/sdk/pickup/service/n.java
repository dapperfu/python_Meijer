package com.radiusnetworks.flybuy.sdk.pickup.service;

import android.location.Location;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.pickup.helper.LocationEventGenerator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;
import mv.InterfaceC15783O;

/* loaded from: classes12.dex */
public final class n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f120997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f120998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Location f120999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, Location location, Continuation continuation) {
        super(2, continuation);
        this.f120998b = tVar;
        this.f120999c = location;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n nVar = new n(this.f120998b, this.f120999c, continuation);
        nVar.f120997a = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC15783O) obj, (Continuation) obj2)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        IntrinsicsKt.f();
        ResultKt.b(obj);
        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f120997a;
        t tVar = this.f120998b;
        Location location = this.f120999c;
        try {
            LocationEventGenerator locationEventGenerator = tVar.f121005a;
            if (locationEventGenerator == null) {
                Intrinsics.x("locationEventGenerator");
                locationEventGenerator = null;
            }
            C15809k.d(C15784P.a(C15800f0.b()), null, null, new l(locationEventGenerator.updateLocation(location), null), 3, null);
            tVar.f();
            return Unit.f143329a;
        } catch (Exception e10) {
            LogExtensionsKt.logd(interfaceC15783O, true, e10, "catchAndThrow caught exception", new Object[0]);
            FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
            flyBuyCore.getCrashManager().log("catchAndThrow caught exception");
            flyBuyCore.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }
}
