package com.scandit.datacapture.core.internal.sdk.data;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a implements Subscription {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f125450a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DisposableResource f125451b;

    public a(DisposableResource disposableResource) {
        this.f125451b = disposableResource;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.Subscription
    public final void dispose() {
        if (this.f125450a.compareAndSet(false, true)) {
            Object obj = this.f125451b.f125443e;
            DisposableResource disposableResource = this.f125451b;
            synchronized (obj) {
                try {
                    disposableResource.counter = disposableResource.getCounter() - 1;
                    if (disposableResource.getCounter() == 0) {
                        Object obj2 = disposableResource.f125442d;
                        if (obj2 != null) {
                            disposableResource.f125440b.invoke(obj2);
                        }
                        disposableResource.f125442d = null;
                    }
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.Subscription
    public final void use(Function1 action) {
        Object obj;
        Intrinsics.j(action, "action");
        if (this.f125450a.get()) {
            return;
        }
        Object obj2 = this.f125451b.f125443e;
        DisposableResource disposableResource = this.f125451b;
        synchronized (obj2) {
            try {
                if (!this.f125450a.get() && (obj = disposableResource.f125442d) != null) {
                    action.invoke(obj);
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
