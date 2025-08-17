package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.Pn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7074Pn implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f69418a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7142Rn f69419b;

    C7074Pn(C7142Rn c7142Rn, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f69418a = uncaughtExceptionHandler;
        this.f69419b = c7142Rn;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            try {
                this.f69419b.i(thread, th2);
            } catch (Throwable th3) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f69418a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                }
                throw th3;
            }
        } catch (Throwable unused) {
            Qc.p.d("AdMob exception reporter failed reporting the exception.");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f69418a;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th2);
        }
    }
}
