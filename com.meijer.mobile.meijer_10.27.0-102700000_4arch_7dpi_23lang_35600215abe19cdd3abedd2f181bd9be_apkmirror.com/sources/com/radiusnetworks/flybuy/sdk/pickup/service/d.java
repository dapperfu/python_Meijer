package com.radiusnetworks.flybuy.sdk.pickup.service;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function2 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Continuation f120031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f120032g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t tVar, SafeContinuation safeContinuation) {
        super(2);
        this.f120031f = safeContinuation;
        this.f120032g = tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        SdkError sdkError = (SdkError) obj2;
        if (sdkError != null) {
            LogExtensionsKt.loge(this.f120032g, true, sdkError.description());
        }
        this.f120031f.resumeWith(Result.b(list));
        return Unit.f142422a;
    }
}
