package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes6.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    private final long f86718a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.Y2 f86719b;

    /* renamed from: c, reason: collision with root package name */
    private final String f86720c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f86721d;

    /* renamed from: e, reason: collision with root package name */
    private final Qd.G f86722e;

    /* renamed from: f, reason: collision with root package name */
    private final long f86723f;

    /* renamed from: g, reason: collision with root package name */
    private final long f86724g;

    /* renamed from: h, reason: collision with root package name */
    private final long f86725h;

    /* renamed from: i, reason: collision with root package name */
    private final int f86726i;

    public final C11241c6 a() {
        return new C11241c6(this.f86720c, this.f86721d, this.f86722e, null);
    }

    public final long c() {
        return this.f86718a;
    }

    public final com.google.android.gms.internal.measurement.Y2 d() {
        return this.f86719b;
    }

    public final String e() {
        return this.f86720c;
    }

    public final long g() {
        return this.f86723f;
    }

    public final long h() {
        return this.f86725h;
    }

    public final int i() {
        return this.f86726i;
    }

    public final X5 b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f86721d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f86718a;
        com.google.android.gms.internal.measurement.Y2 y22 = this.f86719b;
        String str = this.f86720c;
        Qd.G g10 = this.f86722e;
        return new X5(j10, y22.g(), str, bundle, g10.zza(), this.f86724g, "");
    }

    public final Qd.G f() {
        return this.f86722e;
    }

    /* synthetic */ t6(long j10, com.google.android.gms.internal.measurement.Y2 y22, String str, Map map, Qd.G g10, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f86718a = j10;
        this.f86719b = y22;
        this.f86720c = str;
        this.f86721d = map;
        this.f86722e = g10;
        this.f86723f = j11;
        this.f86724g = j12;
        this.f86725h = j13;
        this.f86726i = i10;
    }
}
