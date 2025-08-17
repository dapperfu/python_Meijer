package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class GA {

    /* renamed from: a, reason: collision with root package name */
    private final Object f67121a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f67122b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap f67123c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f67124d = new ConcurrentHashMap();

    public final int a(String str) {
        Integer num = (Integer) this.f67122b.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long b(String str) {
        Long l10 = (Long) this.f67124d.get(str);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    public final void c(String str) {
        synchronized (this.f67121a) {
            try {
                Integer num = (Integer) this.f67122b.get(str);
                this.f67122b.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(String str, String str2, long j10) {
        Long l10 = (Long) this.f67123c.get(str2);
        if (l10 == null) {
            return;
        }
        this.f67123c.remove(str2);
        this.f67124d.put(str, Long.valueOf(j10 - l10.longValue()));
    }

    public final void e(String str, long j10) {
        this.f67123c.put(str, Long.valueOf(j10));
    }
}
