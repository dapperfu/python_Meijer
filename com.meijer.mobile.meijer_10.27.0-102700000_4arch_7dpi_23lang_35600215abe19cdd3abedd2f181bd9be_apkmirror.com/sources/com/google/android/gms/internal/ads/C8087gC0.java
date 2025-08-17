package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.gC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8087gC0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C8087gC0 f74279d;

    /* renamed from: a, reason: collision with root package name */
    public final int f74280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74281b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC8450jh0 f74282c;

    public C8087gC0(int i10, int i11) {
        this.f74280a = i10;
        this.f74281b = i11;
        this.f74282c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8087gC0)) {
            return false;
        }
        C8087gC0 c8087gC0 = (C8087gC0) obj;
        return this.f74280a == c8087gC0.f74280a && this.f74281b == c8087gC0.f74281b && Objects.equals(this.f74282c, c8087gC0.f74282c);
    }

    static {
        C8087gC0 c8087gC0;
        if (OV.f69091a >= 33) {
            C8344ih0 c8344ih0 = new C8344ih0();
            for (int i10 = 1; i10 <= 10; i10++) {
                c8344ih0.g(Integer.valueOf(OV.A(i10)));
            }
            c8087gC0 = new C8087gC0(2, c8344ih0.j());
        } else {
            c8087gC0 = new C8087gC0(2, 10);
        }
        f74279d = c8087gC0;
    }

    public C8087gC0(int i10, Set set) {
        this.f74280a = i10;
        AbstractC8450jh0 abstractC8450jh0R = AbstractC8450jh0.r(set);
        this.f74282c = abstractC8450jh0R;
        AbstractC8559ki0 it = abstractC8450jh0R.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f74281b = iMax;
    }

    public final int a(int i10, HR hr2) {
        if (this.f74282c != null) {
            return this.f74281b;
        }
        if (OV.f69091a < 29) {
            Integer num = (Integer) C8194hC0.f74635e.getOrDefault(Integer.valueOf(this.f74280a), 0);
            num.getClass();
            return num.intValue();
        }
        int i11 = this.f74280a;
        for (int i12 = 10; i12 > 0; i12--) {
            int iA = OV.A(i12);
            if (iA != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i10).setChannelMask(iA).build(), hr2.a().f69186a)) {
                return i12;
            }
        }
        return 0;
    }

    public final boolean b(int i10) {
        if (this.f74282c == null) {
            return i10 <= this.f74281b;
        }
        int iA = OV.A(i10);
        if (iA == 0) {
            return false;
        }
        return this.f74282c.contains(Integer.valueOf(iA));
    }

    public final int hashCode() {
        AbstractC8450jh0 abstractC8450jh0 = this.f74282c;
        return (((this.f74280a * 31) + this.f74281b) * 31) + (abstractC8450jh0 == null ? 0 : abstractC8450jh0.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f74280a + ", maxChannelCount=" + this.f74281b + ", channelMasks=" + String.valueOf(this.f74282c) + "]";
    }
}
