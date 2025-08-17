package bv;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes9.dex */
public final class h extends AtomicLong implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final String f60819a;

    /* renamed from: b, reason: collision with root package name */
    final int f60820b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f60821c;

    public h(String str) {
        this(str, 5, false);
    }

    static final class a extends Thread implements g {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public h(String str, int i10) {
        this(str, i10, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f60819a + '-' + incrementAndGet();
        Thread aVar = this.f60821c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f60820b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f60819a + "]";
    }

    public h(String str, int i10, boolean z10) {
        this.f60819a = str;
        this.f60820b = i10;
        this.f60821c = z10;
    }
}
