package com.radiusnetworks.flybuy.sdk.sync;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f120079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SyncWorker f120080b;

    /* renamed from: c, reason: collision with root package name */
    public int f120081c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SyncWorker syncWorker, Continuation continuation) {
        super(continuation);
        this.f120080b = syncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f120079a = obj;
        this.f120081c |= Integer.MIN_VALUE;
        return this.f120080b.b(this);
    }
}
