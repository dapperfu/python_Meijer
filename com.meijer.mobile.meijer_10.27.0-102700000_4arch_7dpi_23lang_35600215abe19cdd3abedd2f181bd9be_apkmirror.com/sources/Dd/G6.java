package Dd;

import com.google.android.gms.common.internal.C6535q;

/* loaded from: classes6.dex */
public final class G6 {

    /* renamed from: a, reason: collision with root package name */
    private final E6 f5223a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f5224b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f5225c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f5226d = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G6)) {
            return false;
        }
        G6 g62 = (G6) obj;
        return C6535q.a(this.f5223a, g62.f5223a) && C6535q.a(this.f5224b, g62.f5224b) && C6535q.a(null, null) && C6535q.a(null, null);
    }

    @Q0(zza = 1)
    public final E6 a() {
        return this.f5223a;
    }

    @Q0(zza = 2)
    public final Integer b() {
        return this.f5224b;
    }

    public final int hashCode() {
        return C6535q.b(this.f5223a, this.f5224b, null, null);
    }

    /* synthetic */ G6(D6 d62, F6 f62) {
        this.f5223a = d62.f5187a;
        this.f5224b = d62.f5188b;
    }
}
