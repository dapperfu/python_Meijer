package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes6.dex */
final class JC0 {

    /* renamed from: a, reason: collision with root package name */
    private final AudioTrack f67834a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioTimestamp f67835b = new AudioTimestamp();

    /* renamed from: c, reason: collision with root package name */
    private long f67836c;

    /* renamed from: d, reason: collision with root package name */
    private long f67837d;

    /* renamed from: e, reason: collision with root package name */
    private long f67838e;

    /* renamed from: f, reason: collision with root package name */
    private long f67839f;

    public final long a() {
        return this.f67838e;
    }

    public final long b() {
        return this.f67835b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.f67834a.getTimestamp(this.f67835b);
        if (timestamp) {
            long j10 = this.f67835b.framePosition;
            if (this.f67837d > j10) {
                this.f67836c++;
            }
            this.f67837d = j10;
            this.f67838e = j10 + this.f67839f + (this.f67836c << 32);
        }
        return timestamp;
    }

    public JC0(AudioTrack audioTrack) {
        this.f67834a = audioTrack;
    }
}
