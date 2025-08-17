package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes6.dex */
public final class Qx0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f69689a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f69690b;

    /* renamed from: c, reason: collision with root package name */
    public int f69691c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f69692d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f69693e;

    /* renamed from: f, reason: collision with root package name */
    public int f69694f;

    /* renamed from: g, reason: collision with root package name */
    public int f69695g;

    /* renamed from: h, reason: collision with root package name */
    public int f69696h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f69697i;

    /* renamed from: j, reason: collision with root package name */
    private final Ow0 f69698j;

    public final MediaCodec.CryptoInfo a() {
        return this.f69697i;
    }

    public final void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f69692d == null) {
            int[] iArr = new int[1];
            this.f69692d = iArr;
            this.f69697i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f69692d;
        iArr2[0] = iArr2[0] + i10;
    }

    public final void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f69694f = i10;
        this.f69692d = iArr;
        this.f69693e = iArr2;
        this.f69690b = bArr;
        this.f69689a = bArr2;
        this.f69691c = i11;
        this.f69695g = i12;
        this.f69696h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f69697i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (OV.f69091a >= 24) {
            Ow0 ow0 = this.f69698j;
            ow0.getClass();
            Ow0.a(ow0, i12, i13);
        }
    }

    public Qx0() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f69697i = cryptoInfo;
        this.f69698j = OV.f69091a >= 24 ? new Ow0(cryptoInfo, null) : null;
    }
}
