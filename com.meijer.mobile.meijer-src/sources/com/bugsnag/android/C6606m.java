package com.bugsnag.android;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0080\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0011R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/bugsnag/android/m;", "", "<init>", "()V", "LR6/r;", "observer", "", "addObserver", "(LR6/r;)V", "removeObserver", "Lkotlin/Function0;", "Lcom/bugsnag/android/e1;", "provider", "updateState$bugsnag_android_core_release", "(Lkotlin/jvm/functions/Function0;)V", "updateState", "event", "(Lcom/bugsnag/android/e1;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "observers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getObservers$bugsnag_android_core_release", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6606m {
    private final CopyOnWriteArrayList<R6.r> observers = new CopyOnWriteArrayList<>();

    public final void addObserver(R6.r observer) {
        this.observers.addIfAbsent(observer);
    }

    public final CopyOnWriteArrayList<R6.r> getObservers$bugsnag_android_core_release() {
        return this.observers;
    }

    public final void removeObserver(R6.r observer) {
        this.observers.remove(observer);
    }

    public final void updateState(e1 event) {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((R6.r) it.next()).onStateChange(event);
            }
        }
    }

    public final void updateState$bugsnag_android_core_release(Function0<? extends e1> provider) {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            e1 e1VarInvoke = provider.invoke();
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((R6.r) it.next()).onStateChange(e1VarInvoke);
            }
        }
    }
}
