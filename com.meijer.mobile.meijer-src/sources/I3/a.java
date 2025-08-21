package I3;

import a3.t;
import a3.y;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class a implements y.a {

    /* renamed from: g, reason: collision with root package name */
    private static final t f14136g = new t.b().u0("application/id3").N();

    /* renamed from: h, reason: collision with root package name */
    private static final t f14137h = new t.b().u0("application/x-scte35").N();

    /* renamed from: a, reason: collision with root package name */
    public final String f14138a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14139b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14140c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14141d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14142e;

    /* renamed from: f, reason: collision with root package name */
    private int f14143f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f14140c == aVar.f14140c && this.f14141d == aVar.f14141d && Objects.equals(this.f14138a, aVar.f14138a) && Objects.equals(this.f14139b, aVar.f14139b) && Arrays.equals(this.f14142e, aVar.f14142e)) {
                return true;
            }
        }
        return false;
    }

    @Override // a3.y.a
    public t a() {
        String str = this.f14138a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f14137h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f14136g;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f14143f == 0) {
            String str = this.f14138a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f14139b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f14140c;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f14141d;
            this.f14143f = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f14142e);
        }
        return this.f14143f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f14138a + ", id=" + this.f14141d + ", durationMs=" + this.f14140c + ", value=" + this.f14139b;
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f14138a = str;
        this.f14139b = str2;
        this.f14140c = j10;
        this.f14141d = j11;
        this.f14142e = bArr;
    }

    @Override // a3.y.a
    public byte[] c() {
        if (a() != null) {
            return this.f14142e;
        }
        return null;
    }
}
