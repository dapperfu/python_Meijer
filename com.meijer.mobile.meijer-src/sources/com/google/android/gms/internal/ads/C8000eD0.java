package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.eD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8000eD0 implements LC0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8533jD0 f74633a;

    /* synthetic */ C8000eD0(C8533jD0 c8533jD0, C8428iD0 c8428iD0) {
        this.f74633a = c8533jD0;
    }

    @Override // com.google.android.gms.internal.ads.LC0
    public final void a(long j10) {
        C8533jD0 c8533jD0 = this.f74633a;
        if (c8533jD0.f76250m != null) {
            ((C8961nD0) c8533jD0.f76250m).f77855a.f78369A0.v(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.LC0
    public final void n(int i10, long j10) {
        C8533jD0 c8533jD0 = this.f74633a;
        if (c8533jD0.f76250m != null) {
            ((C8961nD0) this.f74633a.f76250m).f77855a.f78369A0.x(i10, j10, SystemClock.elapsedRealtime() - c8533jD0.f76229S);
        }
    }

    @Override // com.google.android.gms.internal.ads.LC0
    public final void o(long j10, long j11, long j12, long j13) {
        C8533jD0 c8533jD0 = this.f74633a;
        C10042xL.f("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + c8533jD0.z() + ", " + c8533jD0.A());
    }

    @Override // com.google.android.gms.internal.ads.LC0
    public final void p(long j10, long j11, long j12, long j13) {
        C8533jD0 c8533jD0 = this.f74633a;
        C10042xL.f("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + c8533jD0.z() + ", " + c8533jD0.A());
    }

    @Override // com.google.android.gms.internal.ads.LC0
    public final void zza(long j10) {
        C10042xL.f("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
    }
}
