package I3;

import a3.t;
import a3.y;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class a implements y.a {

    /* renamed from: g, reason: collision with root package name */
    private static final t f13463g = new t.b().u0("application/id3").N();

    /* renamed from: h, reason: collision with root package name */
    private static final t f13464h = new t.b().u0("application/x-scte35").N();

    /* renamed from: a, reason: collision with root package name */
    public final String f13465a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13466b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13467c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13468d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f13469e;

    /* renamed from: f, reason: collision with root package name */
    private int f13470f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13467c == aVar.f13467c && this.f13468d == aVar.f13468d && Objects.equals(this.f13465a, aVar.f13465a) && Objects.equals(this.f13466b, aVar.f13466b) && Arrays.equals(this.f13469e, aVar.f13469e)) {
                return true;
            }
        }
        return false;
    }

    @Override // a3.y.a
    public t a() {
        String str = this.f13465a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f13464h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f13463g;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f13470f == 0) {
            String str = this.f13465a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f13466b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f13467c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f13468d;
            this.f13470f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f13469e);
        }
        return this.f13470f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f13465a + ", id=" + this.f13468d + ", durationMs=" + this.f13467c + ", value=" + this.f13466b;
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f13465a = str;
        this.f13466b = str2;
        this.f13467c = j10;
        this.f13468d = j11;
        this.f13469e = bArr;
    }

    @Override // a3.y.a
    public byte[] c() {
        if (a() != null) {
            return this.f13469e;
        }
        return null;
    }
}
