package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Sl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7174Sl implements Sc.e {

    /* renamed from: a, reason: collision with root package name */
    private final Date f70151a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70152b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f70153c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f70154d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f70155e;

    /* renamed from: f, reason: collision with root package name */
    private final int f70156f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f70157g;

    public C7174Sl(Date date, int i10, Set set, Location location, boolean z10, int i11, boolean z11, int i12, String str) {
        this.f70151a = date;
        this.f70152b = i10;
        this.f70153c = set;
        this.f70155e = location;
        this.f70154d = z10;
        this.f70156f = i11;
        this.f70157g = z11;
    }

    @Override // Sc.e
    public final int b() {
        return this.f70156f;
    }

    @Override // Sc.e
    @Deprecated
    public final boolean c() {
        return this.f70157g;
    }

    @Override // Sc.e
    public final boolean d() {
        return this.f70154d;
    }

    @Override // Sc.e
    public final Set<String> g() {
        return this.f70153c;
    }
}
