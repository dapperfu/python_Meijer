package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes6.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    private final long f85878a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.measurement.Y2 f85879b;

    /* renamed from: c, reason: collision with root package name */
    private final String f85880c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f85881d;

    /* renamed from: e, reason: collision with root package name */
    private final Od.G f85882e;

    /* renamed from: f, reason: collision with root package name */
    private final long f85883f;

    /* renamed from: g, reason: collision with root package name */
    private final long f85884g;

    /* renamed from: h, reason: collision with root package name */
    private final long f85885h;

    /* renamed from: i, reason: collision with root package name */
    private final int f85886i;

    public final C11116c6 a() {
        return new C11116c6(this.f85880c, this.f85881d, this.f85882e, null);
    }

    public final long c() {
        return this.f85878a;
    }

    public final com.google.android.gms.internal.measurement.Y2 d() {
        return this.f85879b;
    }

    public final String e() {
        return this.f85880c;
    }

    public final long g() {
        return this.f85883f;
    }

    public final long h() {
        return this.f85885h;
    }

    public final int i() {
        return this.f85886i;
    }

    public final X5 b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f85881d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f85878a;
        com.google.android.gms.internal.measurement.Y2 y22 = this.f85879b;
        String str = this.f85880c;
        Od.G g10 = this.f85882e;
        return new X5(j10, y22.g(), str, bundle, g10.zza(), this.f85884g, "");
    }

    public final Od.G f() {
        return this.f85882e;
    }

    /* synthetic */ t6(long j10, com.google.android.gms.internal.measurement.Y2 y22, String str, Map map, Od.G g10, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f85878a = j10;
        this.f85879b = y22;
        this.f85880c = str;
        this.f85881d = map;
        this.f85882e = g10;
        this.f85883f = j11;
        this.f85884g = j12;
        this.f85885h = j13;
        this.f85886i = i10;
    }
}
