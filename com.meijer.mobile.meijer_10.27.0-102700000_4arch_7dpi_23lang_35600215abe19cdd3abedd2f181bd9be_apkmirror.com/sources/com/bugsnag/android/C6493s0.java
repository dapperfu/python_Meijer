package com.bugsnag.android;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bugsnag.android.s0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6493s0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f63571a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private boolean f63572b = false;

    /* renamed from: com.bugsnag.android.s0$a */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63573a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6487p f63574b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ F0 f63575c;

        a(String str, C6487p c6487p, F0 f02) {
            this.f63573a = str;
            this.f63574b = c6487p;
            this.f63575c = f02;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6493s0.this.b(this.f63573a, this.f63574b, this.f63575c);
        }
    }

    boolean a() {
        return this.f63572b;
    }

    void b(String str, C6487p c6487p, F0 f02) {
        if (this.f63571a.getAndSet(true)) {
            return;
        }
        try {
            System.loadLibrary(str);
            this.f63572b = true;
        } catch (UnsatisfiedLinkError e10) {
            c6487p.C(e10, f02);
        }
    }

    boolean c(String str, C6487p c6487p, F0 f02) {
        try {
            c6487p.f63549z.c(Q6.n.IO, new a(str, c6487p, f02)).get();
            return this.f63572b;
        } catch (Throwable unused) {
            return false;
        }
    }

    C6493s0() {
    }
}
