package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class I6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ V6 f67554a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ J6 f67555b;

    I6(J6 j62, V6 v62) {
        this.f67554a = v62;
        this.f67555b = j62;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.f67555b.f67773b.put(this.f67554a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
