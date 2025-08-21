package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes6.dex */
final class JC0 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f68674a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f68675b = new AudioTimestamp();

    /* renamed from: c, reason: collision with root package name */
    private long f68676c;

    /* renamed from: d, reason: collision with root package name */
    private long f68677d;

    /* renamed from: e, reason: collision with root package name */
    private long f68678e;

    /* renamed from: f, reason: collision with root package name */
    private long f68679f;

    public final long a() {
        return this.f68678e;
    }

    public final long b() {
        return this.f68675b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.f68674a.getTimestamp(this.f68675b);
        if (timestamp) {
            long j10 = this.f68675b.framePosition;
            if (this.f68677d > j10) {
                this.f68676c++;
            }
            this.f68677d = j10;
            this.f68678e = j10 + this.f68679f + (this.f68676c << 32);
        }
        return timestamp;
    }

    public JC0(AudioTrack audioTrack) {
        this.f68674a = audioTrack;
    }
}
