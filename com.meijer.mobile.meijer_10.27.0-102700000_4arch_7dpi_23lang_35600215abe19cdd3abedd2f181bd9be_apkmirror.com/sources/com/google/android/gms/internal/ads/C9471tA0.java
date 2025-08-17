package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.tA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9471tA0 implements InterfaceC8509kA0 {

    /* renamed from: a, reason: collision with root package name */
    public final VE0 f78498a;

    /* renamed from: d, reason: collision with root package name */
    public int f78501d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f78502e;

    /* renamed from: c, reason: collision with root package name */
    public final List f78500c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f78499b = new Object();

    @Override // com.google.android.gms.internal.ads.InterfaceC8509kA0
    public final AbstractC7307Wl zza() {
        return this.f78498a.I();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8509kA0
    public final Object zzb() {
        return this.f78499b;
    }

    public final void a(int i10) {
        this.f78501d = i10;
        this.f78502e = false;
        this.f78500c.clear();
    }

    public C9471tA0(InterfaceC7666cF0 interfaceC7666cF0, boolean z10) {
        this.f78498a = new VE0(interfaceC7666cF0, z10);
    }
}
