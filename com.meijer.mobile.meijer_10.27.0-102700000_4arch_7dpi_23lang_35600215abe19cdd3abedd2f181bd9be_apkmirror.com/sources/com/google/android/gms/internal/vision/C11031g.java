package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.vision.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11031g extends WeakReference<Throwable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f84539a;

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C11031g.class) {
            if (this == obj) {
                return true;
            }
            C11031g c11031g = (C11031g) obj;
            if (this.f84539a == c11031g.f84539a && get() == c11031g.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f84539a;
    }

    public C11031g(Throwable th2, ReferenceQueue<Throwable> referenceQueue) {
        super(th2, referenceQueue);
        if (th2 != null) {
            this.f84539a = System.identityHashCode(th2);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }
}
