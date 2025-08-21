package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ck0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7835ck0 extends Xi0 implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f74074h;

    @Override // com.google.android.gms.internal.ads.AbstractC7620aj0
    protected final String e() {
        return "task=[" + this.f74074h.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f74074h.run();
        } catch (Throwable th2) {
            h(th2);
            throw th2;
        }
    }

    public RunnableC7835ck0(Runnable runnable) {
        runnable.getClass();
        this.f74074h = runnable;
    }
}
