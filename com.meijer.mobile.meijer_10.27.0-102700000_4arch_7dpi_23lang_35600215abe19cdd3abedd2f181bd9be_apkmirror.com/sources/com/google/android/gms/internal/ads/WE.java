package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public class WE {

    /* renamed from: a, reason: collision with root package name */
    protected final Map f71039a = new HashMap();

    public final synchronized void G0(ZF zf2) {
        H0(zf2.f72122a, zf2.f72123b);
    }

    public final synchronized void H0(Object obj, Executor executor) {
        this.f71039a.put(obj, executor);
    }

    public final synchronized void I0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            G0((ZF) it.next());
        }
    }

    protected final synchronized void K0(final VE ve2) {
        for (Map.Entry entry : this.f71039a.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.UE
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ve2.zza(key);
                    } catch (Throwable th2) {
                        Lc.v.s().w(th2, "EventEmitter.notify");
                        Pc.p0.l("Event emitter exception.", th2);
                    }
                }
            });
        }
    }

    protected WE(Set set) {
        I0(set);
    }
}
