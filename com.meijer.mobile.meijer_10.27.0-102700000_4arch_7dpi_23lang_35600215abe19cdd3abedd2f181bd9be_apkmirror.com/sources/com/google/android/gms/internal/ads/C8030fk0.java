package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8030fk0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f74150h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f74151a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74152b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f74153c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f74154d;

    /* renamed from: e, reason: collision with root package name */
    public final long f74155e;

    /* renamed from: f, reason: collision with root package name */
    public final long f74156f;

    /* renamed from: g, reason: collision with root package name */
    public final int f74157g;

    public final C7815dj0 a() {
        return new C7815dj0(this, null);
    }

    public final boolean b(int i10) {
        return (this.f74157g & i10) == i10;
    }

    static {
        C8292i8.b("media3.datasource");
    }

    private C8030fk0(Uri uri, long j10, int i10, byte[] bArr, Map map, long j11, long j12, String str, int i11, Object obj) {
        boolean z10 = false;
        boolean z11 = j11 >= 0;
        C8086gC.d(z11);
        C8086gC.d(z11);
        if (j12 > 0) {
            z10 = true;
        } else if (j12 == -1) {
            j12 = -1;
            z10 = true;
        }
        C8086gC.d(z10);
        uri.getClass();
        this.f74151a = uri;
        this.f74152b = 1;
        this.f74153c = null;
        this.f74154d = Collections.unmodifiableMap(new HashMap(map));
        this.f74155e = j11;
        this.f74156f = j12;
        this.f74157g = i11;
    }

    public final String toString() {
        return "DataSpec[GET " + this.f74151a.toString() + ", " + this.f74155e + ", " + this.f74156f + ", null, " + this.f74157g + "]";
    }

    @Deprecated
    public C8030fk0(Uri uri, long j10, long j11, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j10, j11, null, 0, null);
    }
}
