package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class zzpl extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f81557a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81558b;

    /* renamed from: c, reason: collision with root package name */
    public final C f81559c;

    public zzpl(int i10, C c10, boolean z10) {
        super("AudioTrack write failed: " + i10);
        this.f81558b = z10;
        this.f81557a = i10;
        this.f81559c = c10;
    }
}
