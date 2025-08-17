package p3;

import a3.F;
import a3.v;

/* loaded from: classes.dex */
public final class u extends androidx.media3.exoplayer.source.m {

    /* renamed from: f, reason: collision with root package name */
    private final a3.v f155472f;

    public u(F f10, a3.v vVar) {
        super(f10);
        this.f155472f = vVar;
    }

    @Override // androidx.media3.exoplayer.source.m, a3.F
    public F.c o(int i10, F.c cVar, long j10) {
        Object obj;
        super.o(i10, cVar, j10);
        a3.v vVar = this.f155472f;
        cVar.f43617c = vVar;
        v.h hVar = vVar.f44012b;
        if (hVar != null) {
            obj = hVar.f44118i;
        } else {
            obj = null;
        }
        cVar.f43616b = obj;
        return cVar;
    }
}
