package Cb;

import Bb.p;
import java.io.IOException;
import vb.C17538d;

/* loaded from: classes4.dex */
public final class b extends Ya.b {

    /* renamed from: n, reason: collision with root package name */
    private final d f3755n;

    public b(Za.c cVar, Za.e eVar, d dVar) {
        super(cVar, eVar, "delayedPlaceEventCleanupJob");
        this.f3755n = dVar;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        d dVar = this.f3755n;
        try {
            p<String, a>.b bVarE = dVar.e();
            try {
                for (String str : dVar.s()) {
                    a aVarH = dVar.h(str);
                    if (d.x(aVarH)) {
                        dVar.i(bVarE, str);
                        if (d.f3759i.b()) {
                            C17538d.e(aVarH, 0);
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
