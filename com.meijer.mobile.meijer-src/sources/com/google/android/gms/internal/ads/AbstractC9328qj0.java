package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.qj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC9328qj0 extends Xi0 {

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC8900mj0 f78672j;

    /* renamed from: k, reason: collision with root package name */
    private static final Vj0 f78673k = new Vj0(AbstractC9328qj0.class);

    /* renamed from: h, reason: collision with root package name */
    private volatile Set<Throwable> f78674h = null;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f78675i;

    AbstractC9328qj0(int i10) {
        this.f78675i = i10;
    }

    final void I() {
        this.f78674h = null;
    }

    abstract void J(Set set);

    static {
        Throwable th2;
        AbstractC8900mj0 c9114oj0;
        C9221pj0 c9221pj0 = null;
        try {
            c9114oj0 = new C9007nj0(AtomicReferenceFieldUpdater.newUpdater(AbstractC9328qj0.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(AbstractC9328qj0.class, "i"));
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            c9114oj0 = new C9114oj0(c9221pj0);
        }
        f78672j = c9114oj0;
        if (th2 != null) {
            f78673k.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    final int D() {
        return f78672j.a(this);
    }

    final Set F() {
        Set<Throwable> set = this.f78674h;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        J(setNewSetFromMap);
        f78672j.b(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.f78674h;
        Objects.requireNonNull(set2);
        return set2;
    }
}
