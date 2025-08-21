package com.radiusnetworks.flybuy.sdk.sync;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f121031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SyncWorker f121032b;

    /* renamed from: c, reason: collision with root package name */
    public int f121033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SyncWorker syncWorker, Continuation continuation) {
        super(continuation);
        this.f121032b = syncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f121031a = obj;
        this.f121033c |= Integer.MIN_VALUE;
        return this.f121032b.b(this);
    }
}
