package h3;

import d3.P;

/* renamed from: h3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14446b {

    /* renamed from: a, reason: collision with root package name */
    public int f134685a;

    /* renamed from: b, reason: collision with root package name */
    public int f134686b;

    /* renamed from: c, reason: collision with root package name */
    public int f134687c;

    /* renamed from: d, reason: collision with root package name */
    public int f134688d;

    /* renamed from: e, reason: collision with root package name */
    public int f134689e;

    /* renamed from: f, reason: collision with root package name */
    public int f134690f;

    /* renamed from: g, reason: collision with root package name */
    public int f134691g;

    /* renamed from: h, reason: collision with root package name */
    public int f134692h;

    /* renamed from: i, reason: collision with root package name */
    public int f134693i;

    /* renamed from: j, reason: collision with root package name */
    public int f134694j;

    /* renamed from: k, reason: collision with root package name */
    public long f134695k;

    /* renamed from: l, reason: collision with root package name */
    public int f134696l;

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    private void b(long j10, int i10) {
        this.f134695k += j10;
        this.f134696l += i10;
    }

    public String toString() {
        return P.F("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f134685a), Integer.valueOf(this.f134686b), Integer.valueOf(this.f134687c), Integer.valueOf(this.f134688d), Integer.valueOf(this.f134689e), Integer.valueOf(this.f134690f), Integer.valueOf(this.f134691g), Integer.valueOf(this.f134692h), Integer.valueOf(this.f134693i), Integer.valueOf(this.f134694j), Long.valueOf(this.f134695k), Integer.valueOf(this.f134696l));
    }
}
