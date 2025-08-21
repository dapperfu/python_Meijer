package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.C11209x;

/* loaded from: classes6.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f86924a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C11209x f86925b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ DynamiteClearcutLogger f86926c;

    a(DynamiteClearcutLogger dynamiteClearcutLogger, int i10, C11209x c11209x) {
        this.f86926c = dynamiteClearcutLogger;
        this.f86924a = i10;
        this.f86925b = c11209x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f86926c.zzc.zza(this.f86924a, this.f86925b);
    }
}
