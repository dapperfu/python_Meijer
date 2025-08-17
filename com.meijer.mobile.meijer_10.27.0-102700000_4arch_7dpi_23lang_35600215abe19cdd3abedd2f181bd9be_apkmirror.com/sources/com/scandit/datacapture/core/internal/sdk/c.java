package com.scandit.datacapture.core.internal.sdk;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f125381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f125382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f125383c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Condition f125384d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, AtomicReference atomicReference, Condition condition) {
        super(1);
        this.f125381a = reentrantLock;
        this.f125382b = atomicBoolean;
        this.f125383c = atomicReference;
        this.f125384d = condition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ReentrantLock reentrantLock = this.f125381a;
        AtomicBoolean atomicBoolean = this.f125382b;
        AtomicReference atomicReference = this.f125383c;
        Condition condition = this.f125384d;
        reentrantLock.lock();
        try {
            atomicBoolean.set(true);
            atomicReference.set(obj);
            condition.signalAll();
            return Unit.f142422a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
