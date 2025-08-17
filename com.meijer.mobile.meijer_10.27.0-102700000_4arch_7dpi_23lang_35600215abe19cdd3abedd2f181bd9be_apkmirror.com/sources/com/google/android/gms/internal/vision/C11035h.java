package com.google.android.gms.internal.vision;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.vision.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11035h {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<C11031g, List<Throwable>> f84543a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b, reason: collision with root package name */
    private final ReferenceQueue<Throwable> f84544b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th2, boolean z10) {
        Reference<? extends Throwable> referencePoll = this.f84544b.poll();
        while (referencePoll != null) {
            this.f84543a.remove(referencePoll);
            referencePoll = this.f84544b.poll();
        }
        List<Throwable> list = this.f84543a.get(new C11031g(th2, null));
        if (!z10 || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> listPutIfAbsent = this.f84543a.putIfAbsent(new C11031g(th2, this.f84544b), vector);
        return listPutIfAbsent == null ? vector : listPutIfAbsent;
    }

    C11035h() {
    }
}
