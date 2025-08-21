package a3;

import a3.x;
import d3.P;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final a[] f45074a;

    /* renamed from: b, reason: collision with root package name */
    public final long f45075b;

    public interface a {
        default t a() {
            return null;
        }

        default void b(x.b bVar) {
        }

        default byte[] c() {
            return null;
        }
    }

    public y(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public y a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new y(this.f45075b, (a[]) P.Q0(this.f45074a, aVarArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (Arrays.equals(this.f45074a, yVar.f45074a) && this.f45075b == yVar.f45075b) {
                return true;
            }
        }
        return false;
    }

    public y(long j10, a... aVarArr) {
        this.f45075b = j10;
        this.f45074a = aVarArr;
    }

    public y b(y yVar) {
        return yVar == null ? this : a(yVar.f45074a);
    }

    public y c(long j10) {
        return this.f45075b == j10 ? this : new y(j10, this.f45074a);
    }

    public a d(int i10) {
        return this.f45074a[i10];
    }

    public int e() {
        return this.f45074a.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f45074a) * 31) + Je.h.a(this.f45075b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f45074a));
        if (this.f45075b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f45075b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public y(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }

    public y(long j10, List<? extends a> list) {
        this(j10, (a[]) list.toArray(new a[0]));
    }
}
