package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.eD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7875eD0 implements LC0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8408jD0 f73793a;

    /* synthetic */ C7875eD0(C8408jD0 c8408jD0, C8303iD0 c8303iD0) {
        this.f73793a = c8408jD0;
    }

    @Override // com.google.android.gms.internal.ads.LC0
    public final void a(long j10) {
        C8408jD0 c8408jD0 = this.f73793a;
        if (c8408jD0.f75410m != null) {
            ((C8836nD0) c8408jD0.f75410m).f77015a.f77529A0.v(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.LC0
    public final void n(int i10, long j10) {
        C8408jD0 c8408jD0 = this.f73793a;
        if (c8408jD0.f75410m != null) {
            ((C8836nD0) this.f73793a.f75410m).f77015a.f77529A0.x(i10, j10, SystemClock.elapsedRealtime() - c8408jD0.f75389S);
        }
    }

    @Override // com.google.android.gms.internal.ads.LC0
    public final void o(long j10, long j11, long j12, long j13) {
        C8408jD0 c8408jD0 = this.f73793a;
        C9917xL.f("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + c8408jD0.z() + ", " + c8408jD0.A());
    }

    @Override // com.google.android.gms.internal.ads.LC0
    public final void p(long j10, long j11, long j12, long j13) {
        C8408jD0 c8408jD0 = this.f73793a;
        C9917xL.f("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + c8408jD0.z() + ", " + c8408jD0.A());
    }

    @Override // com.google.android.gms.internal.ads.LC0
    public final void zza(long j10) {
        C9917xL.f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
    }
}
