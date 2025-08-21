package com.bugsnag.android;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
class C0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f63878a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private boolean f63879b = false;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f63880a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6617s f63881b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q0 f63882c;

        a(String str, C6617s c6617s, Q0 q02) {
            this.f63880a = str;
            this.f63881b = c6617s;
            this.f63882c = q02;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0.this.b(this.f63880a, this.f63881b, this.f63882c);
        }
    }

    boolean a() {
        return this.f63879b;
    }

    void b(String str, C6617s c6617s, Q0 q02) {
        if (this.f63878a.getAndSet(true)) {
            return;
        }
        try {
            try {
                System.loadLibrary(str);
                this.f63879b = true;
            } catch (UnsatisfiedLinkError unused) {
                System.loadLibrary(str);
                this.f63879b = true;
            }
        } catch (UnsatisfiedLinkError e10) {
            c6617s.C(e10, q02);
        }
    }

    boolean c(String str, C6617s c6617s, Q0 q02) {
        try {
            c6617s.f64385z.d(R6.t.IO, new a(str, c6617s, q02)).get();
            return this.f63879b;
        } catch (Throwable unused) {
            return false;
        }
    }

    C0() {
    }
}
