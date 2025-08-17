package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final a f55915a;

    /* renamed from: b, reason: collision with root package name */
    private int f55916b;

    /* renamed from: c, reason: collision with root package name */
    private long f55917c;

    /* renamed from: d, reason: collision with root package name */
    private long f55918d;

    /* renamed from: e, reason: collision with root package name */
    private long f55919e;

    /* renamed from: f, reason: collision with root package name */
    private long f55920f;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f55921a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f55922b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f55923c;

        /* renamed from: d, reason: collision with root package name */
        private long f55924d;

        /* renamed from: e, reason: collision with root package name */
        private long f55925e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f55926f;

        /* renamed from: g, reason: collision with root package name */
        private long f55927g;

        public void a() {
            this.f55926f = true;
        }

        public long b() {
            return this.f55925e;
        }

        public long c() {
            return this.f55922b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f55921a.getTimestamp(this.f55922b);
            if (timestamp) {
                long j10 = this.f55922b.framePosition;
                long j11 = this.f55924d;
                if (j11 > j10) {
                    if (this.f55926f) {
                        this.f55927g += j11;
                        this.f55926f = false;
                    } else {
                        this.f55923c++;
                    }
                }
                this.f55924d = j10;
                this.f55925e = j10 + this.f55927g + (this.f55923c << 32);
            }
            return timestamp;
        }

        public a(AudioTrack audioTrack) {
            this.f55921a = audioTrack;
        }
    }

    public void g() {
        i(4);
    }

    private void i(int i10) {
        this.f55916b = i10;
        if (i10 == 0) {
            this.f55919e = 0L;
            this.f55920f = -1L;
            this.f55917c = System.nanoTime() / 1000;
            this.f55918d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f55918d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f55918d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f55918d = 500000L;
        }
    }

    public void a() {
        if (this.f55916b == 4) {
            h();
        }
    }

    public void b() {
        a aVar = this.f55915a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.f55915a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1L;
    }

    public long d() {
        a aVar = this.f55915a;
        if (aVar != null) {
            return aVar.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f55916b == 2;
    }

    public boolean f(long j10) {
        a aVar = this.f55915a;
        if (aVar == null || j10 - this.f55919e < this.f55918d) {
            return false;
        }
        this.f55919e = j10;
        boolean zD = aVar.d();
        int i10 = this.f55916b;
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
                if (this.f55915a.b() > this.f55920f) {
                    i(2);
                    return zD;
                }
            }
        } else {
            if (zD) {
                if (this.f55915a.c() < this.f55917c) {
                    return false;
                }
                this.f55920f = this.f55915a.b();
                i(1);
                return zD;
            }
            if (j10 - this.f55917c > 500000) {
                i(3);
            }
        }
        return zD;
    }

    public void h() {
        if (this.f55915a != null) {
            i(0);
        }
    }

    public f(AudioTrack audioTrack) {
        this.f55915a = new a(audioTrack);
        h();
    }
}
