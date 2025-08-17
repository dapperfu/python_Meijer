package p2;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class W {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f155349a = new float[20];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f155350b = new long[20];

    /* renamed from: c, reason: collision with root package name */
    private float f155351c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f155352d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f155353e = 0;

    private void b() {
        this.f155352d = 0;
        this.f155351c = 0.0f;
    }

    private static float f(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    private float e() {
        long[] jArr;
        long j10;
        int i10 = this.f155352d;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f155353e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f155350b[i11];
        while (true) {
            jArr = this.f155350b;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f155352d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f155352d;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            if (j10 == jArr[i14]) {
                return 0.0f;
            }
            return this.f155349a[i14] / (r2 - j10);
        }
        float fAbs = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f155352d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f155350b;
            long j12 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j12) {
                i15++;
                float f10 = f(fAbs);
                float f11 = this.f155349a[i18] / (this.f155350b[i18] - j12);
                fAbs += (f11 - f10) * Math.abs(f11);
                if (i15 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    float d(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f155351c;
    }

    W() {
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f155352d != 0 && eventTime - this.f155350b[this.f155353e] > 40) {
            b();
        }
        int i10 = (this.f155353e + 1) % 20;
        this.f155353e = i10;
        int i11 = this.f155352d;
        if (i11 != 20) {
            this.f155352d = i11 + 1;
        }
        this.f155349a[i10] = motionEvent.getAxisValue(26);
        this.f155350b[this.f155353e] = eventTime;
    }

    void c(int i10, float f10) {
        float fE = e() * i10;
        this.f155351c = fE;
        if (fE < (-Math.abs(f10))) {
            this.f155351c = -Math.abs(f10);
        } else if (this.f155351c > Math.abs(f10)) {
            this.f155351c = Math.abs(f10);
        }
    }
}
