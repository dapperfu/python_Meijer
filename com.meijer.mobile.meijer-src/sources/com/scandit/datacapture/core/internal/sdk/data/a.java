package com.scandit.datacapture.core.internal.sdk.data;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements Subscription {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f126402a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DisposableResource f126403b;

    public a(DisposableResource disposableResource) {
        this.f126403b = disposableResource;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.Subscription
    public final void dispose() {
        if (this.f126402a.compareAndSet(false, true)) {
            Object obj = this.f126403b.f126395e;
            DisposableResource disposableResource = this.f126403b;
            synchronized (obj) {
                try {
                    disposableResource.counter = disposableResource.getCounter() - 1;
                    if (disposableResource.getCounter() == 0) {
                        Object obj2 = disposableResource.f126394d;
                        if (obj2 != null) {
                            disposableResource.f126392b.invoke(obj2);
                        }
                        disposableResource.f126394d = null;
                    }
                    Unit unit = Unit.f143329a;
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
        if (this.f126402a.get()) {
            return;
        }
        Object obj2 = this.f126403b.f126395e;
        DisposableResource disposableResource = this.f126403b;
        synchronized (obj2) {
            try {
                if (!this.f126402a.get() && (obj = disposableResource.f126394d) != null) {
                    action.invoke(obj);
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
