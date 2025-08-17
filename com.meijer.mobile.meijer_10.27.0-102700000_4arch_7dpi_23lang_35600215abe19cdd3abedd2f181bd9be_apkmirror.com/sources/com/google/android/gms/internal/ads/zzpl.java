package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class zzpl extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f80717a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f80718b;

    /* renamed from: c, reason: collision with root package name */
    public final C f80719c;

    public zzpl(int i10, C c10, boolean z10) {
        super("AudioTrack write failed: " + i10);
        this.f80718b = z10;
        this.f80717a = i10;
        this.f80719c = c10;
    }
}
