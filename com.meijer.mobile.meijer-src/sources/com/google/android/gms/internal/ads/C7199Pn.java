package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.Pn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7199Pn implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f70258a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7267Rn f70259b;

    C7199Pn(C7267Rn c7267Rn, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f70258a = uncaughtExceptionHandler;
        this.f70259b = c7267Rn;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            try {
                this.f70259b.i(thread, th2);
            } catch (Throwable th3) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f70258a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                }
                throw th3;
            }
        } catch (Throwable unused) {
            Sc.p.d("AdMob exception reporter failed reporting the exception.");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f70258a;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th2);
        }
    }
}
