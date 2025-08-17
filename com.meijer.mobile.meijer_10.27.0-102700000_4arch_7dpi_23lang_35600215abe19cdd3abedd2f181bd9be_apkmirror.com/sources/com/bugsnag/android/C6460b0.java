package com.bugsnag.android;

import android.os.StrictMode;
import com.fullstory.FS;
import java.lang.Thread;

/* renamed from: com.bugsnag.android.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6460b0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: c, reason: collision with root package name */
    private final C6487p f63392c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6495t0 f63393d;

    /* renamed from: b, reason: collision with root package name */
    private final V0 f63391b = new V0();

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f63390a = FS.getDefaultUncaughtExceptionHandler();

    private void a(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f63390a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            System.err.printf("Exception in thread \"%s\" ", thread.getName());
            this.f63393d.b("Exception", th2);
        }
    }

    void c() {
        FS.setDefaultUncaughtExceptionHandler(this.f63390a);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        String str;
        try {
            if (this.f63392c.i().J(th2)) {
                a(thread, th2);
                return;
            }
            boolean zC = this.f63391b.c(th2);
            Metadata metadata = new Metadata();
            if (zC) {
                String strB = this.f63391b.b(th2.getMessage());
                Metadata metadata2 = new Metadata();
                metadata2.a("StrictMode", "Violation", strB);
                str = strB;
                metadata = metadata2;
            } else {
                str = null;
            }
            String str2 = zC ? "strictMode" : "unhandledException";
            if (zC) {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                this.f63392c.E(th2, metadata, str2, str);
                StrictMode.setThreadPolicy(threadPolicy);
            } else {
                this.f63392c.E(th2, metadata, str2, null);
            }
            a(thread, th2);
        } catch (Throwable unused) {
            a(thread, th2);
        }
    }

    C6460b0(C6487p c6487p, InterfaceC6495t0 interfaceC6495t0) {
        this.f63392c = c6487p;
        this.f63393d = interfaceC6495t0;
    }

    void b() {
        FS.setDefaultUncaughtExceptionHandler(this);
    }
}
