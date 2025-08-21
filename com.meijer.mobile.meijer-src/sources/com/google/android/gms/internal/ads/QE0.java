package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class QE0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f70386a = new AtomicLong();

    public QE0(long j10, C8155fk0 c8155fk0, Uri uri, Map map, long j11, long j12, long j13) {
    }

    public QE0(long j10, C8155fk0 c8155fk0, long j11) {
        Uri uri = c8155fk0.f74991a;
    }

    public static long a() {
        return f70386a.getAndIncrement();
    }
}
