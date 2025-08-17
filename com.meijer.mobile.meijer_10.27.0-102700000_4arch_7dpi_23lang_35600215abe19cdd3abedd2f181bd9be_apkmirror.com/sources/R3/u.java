package R3;

import d3.C13466a;
import x3.O;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31827a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31828b;

    /* renamed from: c, reason: collision with root package name */
    public final O.a f31829c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31830d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f31831e;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            default:
                d3.r.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }

    public u(boolean z10, String str, int i10, byte[] bArr, int i11, int i12, byte[] bArr2) {
        boolean z11;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C13466a.a((bArr2 == null) ^ z11);
        this.f31827a = z10;
        this.f31828b = str;
        this.f31830d = i10;
        this.f31831e = bArr2;
        this.f31829c = new O.a(a(str), bArr, i11, i12);
    }
}
