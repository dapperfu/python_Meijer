package S;

import F.EnumC3614k;
import F.EnumC3615l;
import F.EnumC3616m;
import F.EnumC3617n;
import F.EnumC3618o;
import F.EnumC3619p;
import F.EnumC3620q;
import F.r;
import F.x0;

/* loaded from: classes.dex */
public class k implements r {

    /* renamed from: a, reason: collision with root package name */
    private final r f33100a;

    /* renamed from: b, reason: collision with root package name */
    private final x0 f33101b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33102c;

    public k(x0 x0Var, r rVar) {
        this(rVar, x0Var, -1L);
    }

    public k(x0 x0Var, long j10) {
        this(null, x0Var, j10);
    }

    @Override // F.r
    public x0 a() {
        return this.f33101b;
    }

    @Override // F.r
    public EnumC3620q c() {
        r rVar = this.f33100a;
        return rVar != null ? rVar.c() : EnumC3620q.UNKNOWN;
    }

    @Override // F.r
    public EnumC3618o d() {
        r rVar = this.f33100a;
        return rVar != null ? rVar.d() : EnumC3618o.UNKNOWN;
    }

    @Override // F.r
    public EnumC3614k f() {
        r rVar = this.f33100a;
        return rVar != null ? rVar.f() : EnumC3614k.UNKNOWN;
    }

    @Override // F.r
    public EnumC3617n g() {
        r rVar = this.f33100a;
        return rVar != null ? rVar.g() : EnumC3617n.UNKNOWN;
    }

    @Override // F.r
    public long getTimestamp() {
        r rVar = this.f33100a;
        if (rVar != null) {
            return rVar.getTimestamp();
        }
        long j10 = this.f33102c;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // F.r
    public EnumC3619p h() {
        r rVar = this.f33100a;
        return rVar != null ? rVar.h() : EnumC3619p.UNKNOWN;
    }

    @Override // F.r
    public EnumC3616m i() {
        r rVar = this.f33100a;
        return rVar != null ? rVar.i() : EnumC3616m.UNKNOWN;
    }

    @Override // F.r
    public EnumC3615l j() {
        r rVar = this.f33100a;
        return rVar != null ? rVar.j() : EnumC3615l.UNKNOWN;
    }

    private k(r rVar, x0 x0Var, long j10) {
        this.f33100a = rVar;
        this.f33101b = x0Var;
        this.f33102c = j10;
    }
}
