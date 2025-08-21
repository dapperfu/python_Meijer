package com.bugsnag.android;

import android.os.StrictMode;
import com.fullstory.FS;
import java.lang.Thread;

/* renamed from: com.bugsnag.android.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6605l0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: c, reason: collision with root package name */
    private final C6617s f64300c;

    /* renamed from: d, reason: collision with root package name */
    private final D0 f64301d;

    /* renamed from: b, reason: collision with root package name */
    private final g1 f64299b = new g1();

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f64298a = FS.getDefaultUncaughtExceptionHandler();

    private void a(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f64298a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            System.err.printf("Exception in thread \"%s\" ", thread.getName());
            this.f64301d.b("Exception", th2);
        }
    }

    void c() {
        FS.setDefaultUncaughtExceptionHandler(this.f64298a);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        String str;
        try {
            if (this.f64300c.h().M(th2)) {
                a(thread, th2);
                return;
            }
            boolean zC = this.f64299b.c(th2);
            Metadata metadata = new Metadata();
            if (zC) {
                String strB = this.f64299b.b(th2.getMessage());
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
                this.f64300c.E(th2, metadata, str2, str);
                StrictMode.setThreadPolicy(threadPolicy);
            } else {
                this.f64300c.E(th2, metadata, str2, null);
            }
            a(thread, th2);
        } catch (Throwable unused) {
            a(thread, th2);
        }
    }

    C6605l0(C6617s c6617s, D0 d02) {
        this.f64300c = c6617s;
        this.f64301d = d02;
    }

    void b() {
        FS.setDefaultUncaughtExceptionHandler(this);
    }
}
