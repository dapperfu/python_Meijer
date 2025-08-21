package com.radiusnetworks.flybuy.sdk.sync;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f121025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsSyncWorker f121026b;

    /* renamed from: c, reason: collision with root package name */
    public int f121027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AnalyticsSyncWorker analyticsSyncWorker, Continuation continuation) {
        super(continuation);
        this.f121026b = analyticsSyncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f121025a = obj;
        this.f121027c |= Integer.MIN_VALUE;
        return this.f121026b.b(this);
    }
}
