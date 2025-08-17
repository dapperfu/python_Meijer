package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.C11084x;

/* loaded from: classes6.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f86084a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C11084x f86085b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ DynamiteClearcutLogger f86086c;

    a(DynamiteClearcutLogger dynamiteClearcutLogger, int i10, C11084x c11084x) {
        this.f86086c = dynamiteClearcutLogger;
        this.f86084a = i10;
        this.f86085b = c11084x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f86086c.zzc.zza(this.f86084a, this.f86085b);
    }
}
