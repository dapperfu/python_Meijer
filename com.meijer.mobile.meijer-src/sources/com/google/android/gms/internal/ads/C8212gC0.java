package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.gC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8212gC0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C8212gC0 f75119d;

    /* renamed from: a, reason: collision with root package name */
    public final int f75120a;

    /* renamed from: b, reason: collision with root package name */
    public final int f75121b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC8575jh0 f75122c;

    public C8212gC0(int i10, int i11) {
        this.f75120a = i10;
        this.f75121b = i11;
        this.f75122c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8212gC0)) {
            return false;
        }
        C8212gC0 c8212gC0 = (C8212gC0) obj;
        return this.f75120a == c8212gC0.f75120a && this.f75121b == c8212gC0.f75121b && Objects.equals(this.f75122c, c8212gC0.f75122c);
    }

    static {
        C8212gC0 c8212gC0;
        if (OV.f69931a >= 33) {
            C8469ih0 c8469ih0 = new C8469ih0();
            for (int i10 = 1; i10 <= 10; i10++) {
                c8469ih0.g(Integer.valueOf(OV.A(i10)));
            }
            c8212gC0 = new C8212gC0(2, c8469ih0.j());
        } else {
            c8212gC0 = new C8212gC0(2, 10);
        }
        f75119d = c8212gC0;
    }

    public C8212gC0(int i10, Set set) {
        this.f75120a = i10;
        AbstractC8575jh0 abstractC8575jh0R = AbstractC8575jh0.r(set);
        this.f75122c = abstractC8575jh0R;
        AbstractC8684ki0 it = abstractC8575jh0R.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f75121b = iMax;
    }

    public final int a(int i10, HR hr2) {
        if (this.f75122c != null) {
            return this.f75121b;
        }
        if (OV.f69931a < 29) {
            Integer num = (Integer) C8319hC0.f75475e.getOrDefault(Integer.valueOf(this.f75120a), 0);
            num.getClass();
            return num.intValue();
        }
        int i11 = this.f75120a;
        for (int i12 = 10; i12 > 0; i12--) {
            int iA = OV.A(i12);
            if (iA != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i11).setSampleRate(i10).setChannelMask(iA).build(), hr2.a().f70026a)) {
                return i12;
            }
        }
        return 0;
    }

    public final boolean b(int i10) {
        if (this.f75122c == null) {
            return i10 <= this.f75121b;
        }
        int iA = OV.A(i10);
        if (iA == 0) {
            return false;
        }
        return this.f75122c.contains(Integer.valueOf(iA));
    }

    public final int hashCode() {
        AbstractC8575jh0 abstractC8575jh0 = this.f75122c;
        return (((this.f75120a * 31) + this.f75121b) * 31) + (abstractC8575jh0 == null ? 0 : abstractC8575jh0.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f75120a + ", maxChannelCount=" + this.f75121b + ", channelMasks=" + String.valueOf(this.f75122c) + "]";
    }
}
