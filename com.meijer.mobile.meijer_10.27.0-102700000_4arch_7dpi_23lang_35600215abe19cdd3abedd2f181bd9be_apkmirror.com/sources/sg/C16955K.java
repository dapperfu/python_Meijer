package sg;

import java.io.Closeable;

/* renamed from: sg.K, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16955K implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C16970o f160448a;

    /* synthetic */ C16955K(C16970o c16970o, C16954J c16954j) {
        this.f160448a = c16970o;
        com.google.android.gms.common.internal.r.p(((Thread) c16970o.f160509d.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f160448a.f160509d.set(null);
        this.f160448a.d();
    }
}
