package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7940dj0 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f74303a;

    /* renamed from: b, reason: collision with root package name */
    private Map f74304b;

    /* renamed from: c, reason: collision with root package name */
    private long f74305c;

    /* renamed from: d, reason: collision with root package name */
    private final long f74306d;

    /* renamed from: e, reason: collision with root package name */
    private int f74307e;

    /* synthetic */ C7940dj0(C8155fk0 c8155fk0, Ej0 ej0) {
        this.f74303a = c8155fk0.f74991a;
        this.f74304b = c8155fk0.f74994d;
        this.f74305c = c8155fk0.f74995e;
        this.f74306d = c8155fk0.f74996f;
        this.f74307e = c8155fk0.f74997g;
    }

    public final C7940dj0 a(int i10) {
        this.f74307e = 6;
        return this;
    }

    public final C7940dj0 b(Map map) {
        this.f74304b = map;
        return this;
    }

    public final C7940dj0 c(long j10) {
        this.f74305c = j10;
        return this;
    }

    public final C7940dj0 d(Uri uri) {
        this.f74303a = uri;
        return this;
    }

    public C7940dj0() {
        this.f74304b = Collections.EMPTY_MAP;
        this.f74306d = -1L;
    }

    public final C8155fk0 e() {
        if (this.f74303a == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new C8155fk0(this.f74303a, this.f74304b, this.f74305c, this.f74306d, this.f74307e);
    }
}
