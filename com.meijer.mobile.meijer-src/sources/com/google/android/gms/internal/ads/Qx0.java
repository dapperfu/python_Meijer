package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes6.dex */
public final class Qx0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f70529a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f70530b;

    /* renamed from: c, reason: collision with root package name */
    public int f70531c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f70532d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f70533e;

    /* renamed from: f, reason: collision with root package name */
    public int f70534f;

    /* renamed from: g, reason: collision with root package name */
    public int f70535g;

    /* renamed from: h, reason: collision with root package name */
    public int f70536h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f70537i;

    /* renamed from: j, reason: collision with root package name */
    private final Ow0 f70538j;

    public final MediaCodec.CryptoInfo a() {
        return this.f70537i;
    }

    public final void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f70532d == null) {
            int[] iArr = new int[1];
            this.f70532d = iArr;
            this.f70537i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f70532d;
        iArr2[0] = iArr2[0] + i10;
    }

    public final void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f70534f = i10;
        this.f70532d = iArr;
        this.f70533e = iArr2;
        this.f70530b = bArr;
        this.f70529a = bArr2;
        this.f70531c = i11;
        this.f70535g = i12;
        this.f70536h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f70537i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (OV.f69931a >= 24) {
            Ow0 ow0 = this.f70538j;
            ow0.getClass();
            Ow0.a(ow0, i12, i13);
        }
    }

    public Qx0() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f70537i = cryptoInfo;
        this.f70538j = OV.f69931a >= 24 ? new Ow0(cryptoInfo, null) : null;
    }
}
