package com.google.android.gms.internal.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.vision.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11156g extends WeakReference<Throwable> {

    /* renamed from: a, reason: collision with root package name */
    private final int f85379a;

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C11156g.class) {
            if (this == obj) {
                return true;
            }
            C11156g c11156g = (C11156g) obj;
            if (this.f85379a == c11156g.f85379a && get() == c11156g.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f85379a;
    }

    public C11156g(Throwable th2, ReferenceQueue<Throwable> referenceQueue) {
        super(th2, referenceQueue);
        if (th2 != null) {
            this.f85379a = System.identityHashCode(th2);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }
}
