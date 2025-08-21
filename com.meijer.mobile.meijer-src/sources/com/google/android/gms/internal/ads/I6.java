package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class I6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ V6 f68394a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J6 f68395b;

    I6(J6 j62, V6 v62) {
        this.f68394a = v62;
        this.f68395b = j62;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.f68395b.f68613b.put(this.f68394a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
