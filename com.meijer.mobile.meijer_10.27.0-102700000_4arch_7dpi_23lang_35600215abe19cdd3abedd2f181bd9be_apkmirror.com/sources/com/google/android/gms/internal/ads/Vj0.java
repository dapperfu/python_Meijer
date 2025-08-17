package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class Vj0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7596bg0 f70909a = new C7596bg0();

    /* renamed from: b, reason: collision with root package name */
    private final String f70910b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Logger f70911c;

    final Logger a() {
        Logger logger = this.f70911c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f70909a) {
            try {
                Logger logger2 = this.f70911c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f70910b);
                this.f70911c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    Vj0(Class cls) {
        this.f70910b = cls.getName();
    }
}
