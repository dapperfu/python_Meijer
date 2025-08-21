package g3;

import android.media.MediaCodec;
import d3.C13599a;
import d3.P;

/* renamed from: g3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14325c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f133994a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f133995b;

    /* renamed from: c, reason: collision with root package name */
    public int f133996c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f133997d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f133998e;

    /* renamed from: f, reason: collision with root package name */
    public int f133999f;

    /* renamed from: g, reason: collision with root package name */
    public int f134000g;

    /* renamed from: h, reason: collision with root package name */
    public int f134001h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f134002i;

    /* renamed from: j, reason: collision with root package name */
    private final b f134003j;

    /* renamed from: g3.c$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f134004a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f134005b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f134004a = cryptoInfo;
            this.f134005b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f134005b.set(i10, i11);
            this.f134004a.setPattern(this.f134005b);
        }
    }

    public MediaCodec.CryptoInfo a() {
        return this.f134002i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f133997d == null) {
            int[] iArr = new int[1];
            this.f133997d = iArr;
            this.f134002i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f133997d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f133999f = i10;
        this.f133997d = iArr;
        this.f133998e = iArr2;
        this.f133995b = bArr;
        this.f133994a = bArr2;
        this.f133996c = i11;
        this.f134000g = i12;
        this.f134001h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f134002i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (P.f127888a >= 24) {
            ((b) C13599a.e(this.f134003j)).b(i12, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14325c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f134002i = cryptoInfo;
        this.f134003j = P.f127888a >= 24 ? new b(cryptoInfo) : null;
    }
}
