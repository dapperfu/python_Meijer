package U3;

import Ce.L;
import c3.C6350a;
import java.util.List;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final L<C6350a> f35701a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35702b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35703c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35704d;

    public e(List<C6350a> list, long j10, long j11) {
        this.f35701a = L.s(list);
        this.f35702b = j10;
        this.f35703c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f35704d = j12;
    }
}
