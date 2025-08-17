package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7815dj0 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f73463a;

    /* renamed from: b, reason: collision with root package name */
    private Map f73464b;

    /* renamed from: c, reason: collision with root package name */
    private long f73465c;

    /* renamed from: d, reason: collision with root package name */
    private final long f73466d;

    /* renamed from: e, reason: collision with root package name */
    private int f73467e;

    /* synthetic */ C7815dj0(C8030fk0 c8030fk0, Ej0 ej0) {
        this.f73463a = c8030fk0.f74151a;
        this.f73464b = c8030fk0.f74154d;
        this.f73465c = c8030fk0.f74155e;
        this.f73466d = c8030fk0.f74156f;
        this.f73467e = c8030fk0.f74157g;
    }

    public final C7815dj0 a(int i10) {
        this.f73467e = 6;
        return this;
    }

    public final C7815dj0 b(Map map) {
        this.f73464b = map;
        return this;
    }

    public final C7815dj0 c(long j10) {
        this.f73465c = j10;
        return this;
    }

    public final C7815dj0 d(Uri uri) {
        this.f73463a = uri;
        return this;
    }

    public C7815dj0() {
        this.f73464b = Collections.EMPTY_MAP;
        this.f73466d = -1L;
    }

    public final C8030fk0 e() {
        if (this.f73463a == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new C8030fk0(this.f73463a, this.f73464b, this.f73465c, this.f73466d, this.f73467e);
    }
}
