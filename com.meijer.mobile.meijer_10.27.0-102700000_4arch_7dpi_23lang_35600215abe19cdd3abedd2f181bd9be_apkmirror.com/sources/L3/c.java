package L3;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class c extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17831b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17832c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17833d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17834e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17835f;

    /* renamed from: g, reason: collision with root package name */
    private final i[] f17836g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f17832c == cVar.f17832c && this.f17833d == cVar.f17833d && this.f17834e == cVar.f17834e && this.f17835f == cVar.f17835f && Objects.equals(this.f17831b, cVar.f17831b) && Arrays.equals(this.f17836g, cVar.f17836g)) {
                return true;
            }
        }
        return false;
    }

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f17831b = str;
        this.f17832c = i10;
        this.f17833d = i11;
        this.f17834e = j10;
        this.f17835f = j11;
        this.f17836g = iVarArr;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f17832c) * 31) + this.f17833d) * 31) + ((int) this.f17834e)) * 31) + ((int) this.f17835f)) * 31;
        String str = this.f17831b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
