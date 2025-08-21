package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.tA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9596tA0 implements InterfaceC8634kA0 {

    /* renamed from: a, reason: collision with root package name */
    public final VE0 f79338a;

    /* renamed from: d, reason: collision with root package name */
    public int f79341d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f79342e;

    /* renamed from: c, reason: collision with root package name */
    public final List f79340c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f79339b = new Object();

    @Override // com.google.android.gms.internal.ads.InterfaceC8634kA0
    public final AbstractC7432Wl zza() {
        return this.f79338a.I();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8634kA0
    public final Object zzb() {
        return this.f79339b;
    }

    public final void a(int i10) {
        this.f79341d = i10;
        this.f79342e = false;
        this.f79340c.clear();
    }

    public C9596tA0(InterfaceC7791cF0 interfaceC7791cF0, boolean z10) {
        this.f79338a = new VE0(interfaceC7791cF0, z10);
    }
}
