package Xu;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class h extends AtomicLong implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final String f42717a;

    /* renamed from: b, reason: collision with root package name */
    final int f42718b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f42719c;

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
        String str = this.f42717a + '-' + incrementAndGet();
        Thread aVar = this.f42719c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f42718b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f42717a + "]";
    }

    public h(String str, int i10, boolean z10) {
        this.f42717a = str;
        this.f42718b = i10;
        this.f42719c = z10;
    }
}
