package h3;

import d3.P;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14333b {

    /* renamed from: a, reason: collision with root package name */
    public int f134214a;

    /* renamed from: b, reason: collision with root package name */
    public int f134215b;

    /* renamed from: c, reason: collision with root package name */
    public int f134216c;

    /* renamed from: d, reason: collision with root package name */
    public int f134217d;

    /* renamed from: e, reason: collision with root package name */
    public int f134218e;

    /* renamed from: f, reason: collision with root package name */
    public int f134219f;

    /* renamed from: g, reason: collision with root package name */
    public int f134220g;

    /* renamed from: h, reason: collision with root package name */
    public int f134221h;

    /* renamed from: i, reason: collision with root package name */
    public int f134222i;

    /* renamed from: j, reason: collision with root package name */
    public int f134223j;

    /* renamed from: k, reason: collision with root package name */
    public long f134224k;

    /* renamed from: l, reason: collision with root package name */
    public int f134225l;

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    private void b(long j10, int i10) {
        this.f134224k += j10;
        this.f134225l += i10;
    }

    public String toString() {
        return P.F("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f134214a), Integer.valueOf(this.f134215b), Integer.valueOf(this.f134216c), Integer.valueOf(this.f134217d), Integer.valueOf(this.f134218e), Integer.valueOf(this.f134219f), Integer.valueOf(this.f134220g), Integer.valueOf(this.f134221h), Integer.valueOf(this.f134222i), Integer.valueOf(this.f134223j), Long.valueOf(this.f134224k), Integer.valueOf(this.f134225l));
    }
}
