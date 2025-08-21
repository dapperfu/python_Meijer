package p3;

import a3.F;
import a3.v;

/* loaded from: classes.dex */
public final class u extends androidx.media3.exoplayer.source.m {

    /* renamed from: f, reason: collision with root package name */
    private final a3.v f156146f;

    public u(F f10, a3.v vVar) {
        super(f10);
        this.f156146f = vVar;
    }

    @Override // androidx.media3.exoplayer.source.m, a3.F
    public F.c o(int i10, F.c cVar, long j10) {
        Object obj;
        super.o(i10, cVar, j10);
        a3.v vVar = this.f156146f;
        cVar.f44435c = vVar;
        v.h hVar = vVar.f44830b;
        if (hVar != null) {
            obj = hVar.f44936i;
        } else {
            obj = null;
        }
        cVar.f44434b = obj;
        return cVar;
    }
}
