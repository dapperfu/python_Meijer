package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ck0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7710ck0 extends Xi0 implements Runnable {

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f73234h;

    @Override // com.google.android.gms.internal.ads.AbstractC7495aj0
    protected final String e() {
        return "task=[" + this.f73234h.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f73234h.run();
        } catch (Throwable th2) {
            h(th2);
            throw th2;
        }
    }

    public RunnableC7710ck0(Runnable runnable) {
        runnable.getClass();
        this.f73234h = runnable;
    }
}
