package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final a f56139a;

    /* renamed from: b, reason: collision with root package name */
    private int f56140b;

    /* renamed from: c, reason: collision with root package name */
    private long f56141c;

    /* renamed from: d, reason: collision with root package name */
    private long f56142d;

    /* renamed from: e, reason: collision with root package name */
    private long f56143e;

    /* renamed from: f, reason: collision with root package name */
    private long f56144f;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f56145a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f56146b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f56147c;

        /* renamed from: d, reason: collision with root package name */
        private long f56148d;

        /* renamed from: e, reason: collision with root package name */
        private long f56149e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f56150f;

        /* renamed from: g, reason: collision with root package name */
        private long f56151g;

        public void a() {
            this.f56150f = true;
        }

        public long b() {
            return this.f56149e;
        }

        public long c() {
            return this.f56146b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f56145a.getTimestamp(this.f56146b);
            if (timestamp) {
                long j10 = this.f56146b.framePosition;
                long j11 = this.f56148d;
                if (j11 > j10) {
                    if (this.f56150f) {
                        this.f56151g += j11;
                        this.f56150f = false;
                    } else {
                        this.f56147c++;
                    }
                }
                this.f56148d = j10;
                this.f56149e = j10 + this.f56151g + (this.f56147c << 32);
            }
            return timestamp;
        }

        public a(AudioTrack audioTrack) {
            this.f56145a = audioTrack;
        }
    }

    public void g() {
        i(4);
    }

    private void i(int i10) {
        this.f56140b = i10;
        if (i10 == 0) {
            this.f56143e = 0L;
            this.f56144f = -1L;
            this.f56141c = System.nanoTime() / 1000;
            this.f56142d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f56142d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f56142d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f56142d = 500000L;
        }
    }

    public void a() {
        if (this.f56140b == 4) {
            h();
        }
    }

    public void b() {
        a aVar = this.f56139a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.f56139a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1L;
    }

    public long d() {
        a aVar = this.f56139a;
        if (aVar != null) {
            return aVar.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f56140b == 2;
    }

    public boolean f(long j10) {
        a aVar = this.f56139a;
        if (aVar == null || j10 - this.f56143e < this.f56142d) {
            return false;
        }
        this.f56143e = j10;
        boolean zD = aVar.d();
        int i10 = this.f56140b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zD) {
                        h();
                        return zD;
                    }
                } else if (!zD) {
                    h();
                    return zD;
                }
            } else {
                if (!zD) {
                    h();
                    return zD;
                }
                if (this.f56139a.b() > this.f56144f) {
                    i(2);
                    return zD;
                }
            }
        } else {
            if (zD) {
                if (this.f56139a.c() < this.f56141c) {
                    return false;
                }
                this.f56144f = this.f56139a.b();
                i(1);
                return zD;
            }
            if (j10 - this.f56141c > 500000) {
                i(3);
            }
        }
        return zD;
    }

    public void h() {
        if (this.f56139a != null) {
            i(0);
        }
    }

    public f(AudioTrack audioTrack) {
        this.f56139a = new a(audioTrack);
        h();
    }
}
