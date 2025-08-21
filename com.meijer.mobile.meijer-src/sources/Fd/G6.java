package Fd;

import com.google.android.gms.common.internal.C6660q;

/* loaded from: classes6.dex */
public final class G6 {

    /* renamed from: a, reason: collision with root package name */
    private final E6 f9256a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f9257b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f9258c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f9259d = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G6)) {
            return false;
        }
        G6 g62 = (G6) obj;
        return C6660q.a(this.f9256a, g62.f9256a) && C6660q.a(this.f9257b, g62.f9257b) && C6660q.a(null, null) && C6660q.a(null, null);
    }

    @Q0(zza = 1)
    public final E6 a() {
        return this.f9256a;
    }

    @Q0(zza = 2)
    public final Integer b() {
        return this.f9257b;
    }

    public final int hashCode() {
        return C6660q.b(this.f9256a, this.f9257b, null, null);
    }

    /* synthetic */ G6(D6 d62, F6 f62) {
        this.f9256a = d62.f9220a;
        this.f9257b = d62.f9221b;
    }
}
