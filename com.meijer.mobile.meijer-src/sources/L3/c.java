package L3;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class c extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17978b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17979c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17980d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17981e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17982f;

    /* renamed from: g, reason: collision with root package name */
    private final i[] f17983g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f17979c == cVar.f17979c && this.f17980d == cVar.f17980d && this.f17981e == cVar.f17981e && this.f17982f == cVar.f17982f && Objects.equals(this.f17978b, cVar.f17978b) && Arrays.equals(this.f17983g, cVar.f17983g)) {
                return true;
            }
        }
        return false;
    }

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f17978b = str;
        this.f17979c = i10;
        this.f17980d = i11;
        this.f17981e = j10;
        this.f17982f = j11;
        this.f17983g = iVarArr;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f17979c) * 31) + this.f17980d) * 31) + ((int) this.f17981e)) * 31) + ((int) this.f17982f)) * 31;
        String str = this.f17978b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
