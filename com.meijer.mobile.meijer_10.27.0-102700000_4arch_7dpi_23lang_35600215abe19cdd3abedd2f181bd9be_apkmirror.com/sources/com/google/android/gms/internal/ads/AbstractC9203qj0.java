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
abstract class AbstractC9203qj0 extends Xi0 {

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC8775mj0 f77832j;

    /* renamed from: k, reason: collision with root package name */
    private static final Vj0 f77833k = new Vj0(AbstractC9203qj0.class);

    /* renamed from: h, reason: collision with root package name */
    private volatile Set<Throwable> f77834h = null;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f77835i;

    AbstractC9203qj0(int i10) {
        this.f77835i = i10;
    }

    final void I() {
        this.f77834h = null;
    }

    abstract void J(Set set);

    static {
        Throwable th2;
        AbstractC8775mj0 c8989oj0;
        C9096pj0 c9096pj0 = null;
        try {
            c8989oj0 = new C8882nj0(AtomicReferenceFieldUpdater.newUpdater(AbstractC9203qj0.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(AbstractC9203qj0.class, "i"));
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            c8989oj0 = new C8989oj0(c9096pj0);
        }
        f77832j = c8989oj0;
        if (th2 != null) {
            f77833k.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    final int D() {
        return f77832j.a(this);
    }

    final Set F() {
        Set<Throwable> set = this.f77834h;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        J(setNewSetFromMap);
        f77832j.b(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.f77834h;
        Objects.requireNonNull(set2);
        return set2;
    }
}
