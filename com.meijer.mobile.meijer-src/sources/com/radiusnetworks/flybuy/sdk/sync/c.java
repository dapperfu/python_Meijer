package com.radiusnetworks.flybuy.sdk.sync;

import androidx.work.c;
import com.google.android.gms.common.api.a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* loaded from: classes12.dex */
public final class c extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f121029a;

    public c(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c((Continuation) obj2).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer numD;
        Object objF = IntrinsicsKt.f();
        int i10 = this.f121029a;
        if (i10 != 0) {
            if (i10 == 1) {
                ResultKt.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.b(obj);
            this.f121029a = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(this));
            FlyBuyCore.INSTANCE.getAnalytics().getAnalyticsEventOperation$core_defaultRelease().sendQueuedEvents(new b(safeContinuation));
            obj = safeContinuation.b();
            if (obj == IntrinsicsKt.f()) {
                DebugProbesKt.c(this);
            }
            if (obj == objF) {
                return objF;
            }
        }
        SdkError sdkError = (SdkError) obj;
        if (sdkError != null) {
            numD = Boxing.d(sdkError.getCode());
        } else {
            numD = null;
        }
        if (numD == null) {
            return c.a.c();
        }
        if (new IntRange(Integer.MIN_VALUE, -1).p(numD.intValue())) {
            return c.a.a();
        }
        if (new IntRange(HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR, a.e.API_PRIORITY_OTHER).p(numD.intValue())) {
            return c.a.a();
        }
        return c.a.b();
    }
}
