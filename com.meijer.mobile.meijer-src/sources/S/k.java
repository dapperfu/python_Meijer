package S;

import F.EnumC3276k;
import F.EnumC3277l;
import F.EnumC3278m;
import F.EnumC3279n;
import F.EnumC3280o;
import F.EnumC3281p;
import F.EnumC3282q;
import F.r;
import F.x0;

/* loaded from: classes.dex */
public class k implements r {

    /* renamed from: a, reason: collision with root package name */
    private final r f34279a;

    /* renamed from: b, reason: collision with root package name */
    private final x0 f34280b;

    /* renamed from: c, reason: collision with root package name */
    private final long f34281c;

    public k(x0 x0Var, r rVar) {
        this(rVar, x0Var, -1L);
    }

    public k(x0 x0Var, long j10) {
        this(null, x0Var, j10);
    }

    @Override // F.r
    public x0 a() {
        return this.f34280b;
    }

    @Override // F.r
    public EnumC3282q c() {
        r rVar = this.f34279a;
        return rVar != null ? rVar.c() : EnumC3282q.UNKNOWN;
    }

    @Override // F.r
    public EnumC3280o d() {
        r rVar = this.f34279a;
        return rVar != null ? rVar.d() : EnumC3280o.UNKNOWN;
    }

    @Override // F.r
    public EnumC3276k f() {
        r rVar = this.f34279a;
        return rVar != null ? rVar.f() : EnumC3276k.UNKNOWN;
    }

    @Override // F.r
    public EnumC3279n g() {
        r rVar = this.f34279a;
        return rVar != null ? rVar.g() : EnumC3279n.UNKNOWN;
    }

    @Override // F.r
    public long getTimestamp() {
        r rVar = this.f34279a;
        if (rVar != null) {
            return rVar.getTimestamp();
        }
        long j10 = this.f34281c;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // F.r
    public EnumC3281p h() {
        r rVar = this.f34279a;
        return rVar != null ? rVar.h() : EnumC3281p.UNKNOWN;
    }

    @Override // F.r
    public EnumC3278m i() {
        r rVar = this.f34279a;
        return rVar != null ? rVar.i() : EnumC3278m.UNKNOWN;
    }

    @Override // F.r
    public EnumC3277l j() {
        r rVar = this.f34279a;
        return rVar != null ? rVar.j() : EnumC3277l.UNKNOWN;
    }

    private k(r rVar, x0 x0Var, long j10) {
        this.f34279a = rVar;
        this.f34280b = x0Var;
        this.f34281c = j10;
    }
}
