package com.radiusnetworks.flybuy.sdk.pickup.service;

import android.os.Build;
import com.radiusnetworks.flybuy.sdk.util.ContextExtensionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes12.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationService f121023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(LocationService locationService, Continuation continuation) {
        super(2, continuation);
        this.f121023a = locationService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f121023a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.f121023a, (Continuation) obj2).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.f();
        ResultKt.b(obj);
        if (Build.VERSION.SDK_INT >= 29 && ContextExtensionsKt.targetSdkVersion(this.f121023a) >= 29) {
            LocationService locationService = this.f121023a;
            locationService.startForeground(2147482310, locationService.a(), 8);
        } else {
            LocationService locationService2 = this.f121023a;
            locationService2.startForeground(2147482310, locationService2.a());
        }
        return Unit.f143329a;
    }
}
