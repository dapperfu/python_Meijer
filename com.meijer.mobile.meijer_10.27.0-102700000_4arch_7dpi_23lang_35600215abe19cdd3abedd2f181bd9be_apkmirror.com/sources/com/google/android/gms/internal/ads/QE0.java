package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class QE0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f69546a = new AtomicLong();

    public QE0(long j10, C8030fk0 c8030fk0, Uri uri, Map map, long j11, long j12, long j13) {
    }

    public QE0(long j10, C8030fk0 c8030fk0, long j11) {
        Uri uri = c8030fk0.f74151a;
    }

    public static long a() {
        return f69546a.getAndIncrement();
    }
}
