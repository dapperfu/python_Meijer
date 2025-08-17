package fb;

import Bb.p;
import java.io.IOException;
import lb.C15392a;
import lb.C15393b;
import vb.C17538d;

/* renamed from: fb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13866c extends Ya.b {

    /* renamed from: n, reason: collision with root package name */
    private final C15393b f130899n;

    public C13866c(Za.c cVar, Za.e eVar, C15393b c15393b) {
        super(cVar, eVar, "CommunicationCleanupJob");
        this.f130899n = c15393b;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        C15393b c15393b = this.f130899n;
        try {
            p<String, C15392a>.b bVarE = c15393b.e();
            try {
                for (String str : c15393b.s()) {
                    C15392a c15392aH = c15393b.h(str);
                    if (c15392aH.d() == 0 || C15393b.x(c15392aH)) {
                        c15393b.i(bVarE, str);
                        if (C15393b.f148800i.b()) {
                            C17538d.e(c15392aH, 0);
                        }
                    }
                }
                bVarE.a();
            } catch (Throwable th2) {
                bVarE.a();
                throw th2;
            }
        } catch (IOException e10) {
            e10.getMessage();
        }
    }
}
