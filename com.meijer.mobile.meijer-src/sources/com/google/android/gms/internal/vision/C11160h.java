package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.vision.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11160h {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<C11156g, List<Throwable>> f85383a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f85384b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th2, boolean z10) {
        Reference<? extends Throwable> referencePoll = this.f85384b.poll();
        while (referencePoll != null) {
            this.f85383a.remove(referencePoll);
            referencePoll = this.f85384b.poll();
        }
        List<Throwable> list = this.f85383a.get(new C11156g(th2, null));
        if (!z10 || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f85383a.putIfAbsent(new C11156g(th2, this.f85384b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }

    C11160h() {
    }
}
