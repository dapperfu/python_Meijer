package com.scandit.datacapture.core.internal.sdk;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReentrantLock f126333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f126334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f126335c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Condition f126336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, AtomicReference atomicReference, Condition condition) {
        super(1);
        this.f126333a = reentrantLock;
        this.f126334b = atomicBoolean;
        this.f126335c = atomicReference;
        this.f126336d = condition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ReentrantLock reentrantLock = this.f126333a;
        AtomicBoolean atomicBoolean = this.f126334b;
        AtomicReference atomicReference = this.f126335c;
        Condition condition = this.f126336d;
        reentrantLock.lock();
        try {
            atomicBoolean.set(true);
            atomicReference.set(obj);
            condition.signalAll();
            return Unit.f143329a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
