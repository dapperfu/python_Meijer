package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    int f55543a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f55544b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f55545c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f55546d = -1;

    public int a() {
        return this.f55544b;
    }

    public int b() {
        int i10 = this.f55545c;
        int iC = c();
        if (iC == 6) {
            i10 |= 4;
        } else if (iC == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f55546d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f55545c, this.f55543a);
    }

    public int d() {
        return this.f55543a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f55544b == audioAttributesImplBase.a() && this.f55545c == audioAttributesImplBase.b() && this.f55543a == audioAttributesImplBase.d() && this.f55546d == audioAttributesImplBase.f55546d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f55544b), Integer.valueOf(this.f55545c), Integer.valueOf(this.f55543a), Integer.valueOf(this.f55546d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f55546d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f55546d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f55543a));
        sb2.append(" content=");
        sb2.append(this.f55544b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f55545c).toUpperCase());
        return sb2.toString();
    }

    AudioAttributesImplBase() {
    }
}
