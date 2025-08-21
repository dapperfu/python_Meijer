package U3;

import Ee.L;
import c3.C6476a;
import java.util.List;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final L<C6476a> f37037a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37038b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37039c;

    /* renamed from: d, reason: collision with root package name */
    public final long f37040d;

    public e(List<C6476a> list, long j10, long j11) {
        this.f37037a = L.s(list);
        this.f37038b = j10;
        this.f37039c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f37040d = j12;
    }
}
