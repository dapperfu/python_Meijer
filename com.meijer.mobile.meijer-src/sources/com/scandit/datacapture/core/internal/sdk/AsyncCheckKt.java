package com.scandit.datacapture.core.internal.sdk;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"await", "T", "call", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AsyncCheckKt {
    public static final <T> T await(Function1<? super Function1<? super T, Unit>, Unit> call) {
        Intrinsics.j(call, "call");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicReference atomicReference = new AtomicReference(null);
        call.invoke(new c(reentrantLock, atomicBoolean, atomicReference, conditionNewCondition));
        reentrantLock.lock();
        while (!atomicBoolean.get()) {
            try {
                conditionNewCondition.await();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        Unit unit = Unit.f143329a;
        reentrantLock.unlock();
        return (T) atomicReference.get();
    }
}
