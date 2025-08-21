package Eb;

import Db.p;
import ab.AbstractC5677b;
import bb.C6346c;
import java.io.IOException;
import xb.C18150d;

/* loaded from: classes4.dex */
public final class b extends AbstractC5677b {

    /* renamed from: n, reason: collision with root package name */
    private final d f7067n;

    public b(C6346c c6346c, bb.e eVar, d dVar) {
        super(c6346c, eVar, "delayedPlaceEventCleanupJob");
        this.f7067n = dVar;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        d dVar = this.f7067n;
        try {
            p<String, a>.b bVarE = dVar.e();
            try {
                for (String str : dVar.s()) {
                    a aVarH = dVar.h(str);
                    if (d.x(aVarH)) {
                        dVar.i(bVarE, str);
                        if (d.f7071i.b()) {
                            C18150d.e(aVarH, 0);
                        }
                    }
                }
            } finally {
                bVarE.a();
            }
        } catch (IOException e10) {
            e10.getMessage();
        }
    }
}
