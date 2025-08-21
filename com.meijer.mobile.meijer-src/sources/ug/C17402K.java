package ug;

import java.io.Closeable;

/* renamed from: ug.K, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17402K implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C17417o f163934a;

    /* synthetic */ C17402K(C17417o c17417o, C17401J c17401j) {
        this.f163934a = c17417o;
        com.google.android.gms.common.internal.r.p(((Thread) c17417o.f163995d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f163934a.f163995d.set(null);
        this.f163934a.d();
    }
}
