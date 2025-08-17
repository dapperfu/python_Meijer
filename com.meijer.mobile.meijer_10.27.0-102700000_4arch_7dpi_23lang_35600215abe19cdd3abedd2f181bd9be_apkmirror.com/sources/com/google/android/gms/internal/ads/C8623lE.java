package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8623lE {

    /* renamed from: a, reason: collision with root package name */
    private boolean f75768a;

    public C8623lE(HC hc2) {
    }

    public final synchronized void a() throws InterruptedException {
        while (!this.f75768a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f75768a) {
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
        z10 = this.f75768a;
        this.f75768a = false;
        return z10;
    }

    public final synchronized boolean d() {
        return this.f75768a;
    }

    public final synchronized boolean e() {
        if (this.f75768a) {
            return false;
        }
        this.f75768a = true;
        notifyAll();
        return true;
    }
}
