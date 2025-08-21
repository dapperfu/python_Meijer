package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8748lE {

    /* renamed from: a, reason: collision with root package name */
    private boolean f76608a;

    public C8748lE(HC hc2) {
    }

    public final synchronized void a() throws InterruptedException {
        while (!this.f76608a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f76608a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        boolean z10;
        z10 = this.f76608a;
        this.f76608a = false;
        return z10;
    }

    public final synchronized boolean d() {
        return this.f76608a;
    }

    public final synchronized boolean e() {
        if (this.f76608a) {
            return false;
        }
        this.f76608a = true;
        notifyAll();
        return true;
    }
}
