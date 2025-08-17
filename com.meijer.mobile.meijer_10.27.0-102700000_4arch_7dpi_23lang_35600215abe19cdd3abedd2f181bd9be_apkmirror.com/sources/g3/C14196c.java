package g3;

import android.media.MediaCodec;
import d3.C13466a;
import d3.P;

/* renamed from: g3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14196c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f132704a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f132705b;

    /* renamed from: c, reason: collision with root package name */
    public int f132706c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f132707d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f132708e;

    /* renamed from: f, reason: collision with root package name */
    public int f132709f;

    /* renamed from: g, reason: collision with root package name */
    public int f132710g;

    /* renamed from: h, reason: collision with root package name */
    public int f132711h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f132712i;

    /* renamed from: j, reason: collision with root package name */
    private final b f132713j;

    /* renamed from: g3.c$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f132714a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f132715b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f132714a = cryptoInfo;
            this.f132715b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f132715b.set(i10, i11);
            this.f132714a.setPattern(this.f132715b);
        }
    }

    public MediaCodec.CryptoInfo a() {
        return this.f132712i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f132707d == null) {
            int[] iArr = new int[1];
            this.f132707d = iArr;
            this.f132712i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f132707d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f132709f = i10;
        this.f132707d = iArr;
        this.f132708e = iArr2;
        this.f132705b = bArr;
        this.f132704a = bArr2;
        this.f132706c = i11;
        this.f132710g = i12;
        this.f132711h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f132712i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (P.f127086a >= 24) {
            ((b) C13466a.e(this.f132713j)).b(i12, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14196c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f132712i = cryptoInfo;
        this.f132713j = P.f127086a >= 24 ? new b(cryptoInfo) : null;
    }
}
