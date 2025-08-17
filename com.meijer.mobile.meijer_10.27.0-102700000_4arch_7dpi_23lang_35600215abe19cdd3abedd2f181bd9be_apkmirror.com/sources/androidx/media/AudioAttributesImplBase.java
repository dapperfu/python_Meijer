package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    int f55319a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f55320b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f55321c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f55322d = -1;

    public int a() {
        return this.f55320b;
    }

    public int b() {
        int i10 = this.f55321c;
        int iC = c();
        if (iC == 6) {
            i10 |= 4;
        } else if (iC == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f55322d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f55321c, this.f55319a);
    }

    public int d() {
        return this.f55319a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f55320b == audioAttributesImplBase.a() && this.f55321c == audioAttributesImplBase.b() && this.f55319a == audioAttributesImplBase.d() && this.f55322d == audioAttributesImplBase.f55322d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f55320b), Integer.valueOf(this.f55321c), Integer.valueOf(this.f55319a), Integer.valueOf(this.f55322d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f55322d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f55322d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f55319a));
        sb2.append(" content=");
        sb2.append(this.f55320b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f55321c).toUpperCase());
        return sb2.toString();
    }

    AudioAttributesImplBase() {
    }
}
