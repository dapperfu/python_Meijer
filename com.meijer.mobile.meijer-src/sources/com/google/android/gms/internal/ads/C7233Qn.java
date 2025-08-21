package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* renamed from: com.google.android.gms.internal.ads.Qn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7233Qn implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Thread.UncaughtExceptionHandler f70483a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7267Rn f70484b;

    C7233Qn(C7267Rn c7267Rn, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f70483a = uncaughtExceptionHandler;
        this.f70484b = c7267Rn;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        try {
            try {
                this.f70484b.i(thread, th2);
            } catch (Throwable th3) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f70483a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                }
                throw th3;
            }
        } catch (Throwable unused) {
            Sc.p.d("AdMob exception reporter failed reporting the exception.");
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f70483a;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th2);
        }
    }
}
