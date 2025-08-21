package com.google.android.gms.internal.ads;

import android.location.Location;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Sl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7299Sl implements Uc.e {

    /* renamed from: a, reason: collision with root package name */
    private final Date f70991a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70992b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f70993c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f70994d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f70995e;

    /* renamed from: f, reason: collision with root package name */
    private final int f70996f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f70997g;

    public C7299Sl(Date date, int i10, Set set, Location location, boolean z10, int i11, boolean z11, int i12, String str) {
        this.f70991a = date;
        this.f70992b = i10;
        this.f70993c = set;
        this.f70995e = location;
        this.f70994d = z10;
        this.f70996f = i11;
        this.f70997g = z11;
    }

    @Override // Uc.e
    public final int b() {
        return this.f70996f;
    }

    @Override // Uc.e
    @Deprecated
    public final boolean c() {
        return this.f70997g;
    }

    @Override // Uc.e
    public final boolean d() {
        return this.f70994d;
    }

    @Override // Uc.e
    public final Set<String> g() {
        return this.f70993c;
    }
}
