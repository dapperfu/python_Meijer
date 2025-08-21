package hb;

import Db.p;
import ab.AbstractC5677b;
import bb.C6346c;
import java.io.IOException;
import nb.C15926a;
import nb.C15927b;
import xb.C18150d;

/* renamed from: hb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14496c extends AbstractC5677b {

    /* renamed from: n, reason: collision with root package name */
    private final C15927b f135245n;

    public C14496c(C6346c c6346c, bb.e eVar, C15927b c15927b) {
        super(c6346c, eVar, "CommunicationCleanupJob");
        this.f135245n = c15927b;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        C15927b c15927b = this.f135245n;
        try {
            p<String, C15926a>.b bVarE = c15927b.e();
            try {
                for (String str : c15927b.s()) {
                    C15926a c15926aH = c15927b.h(str);
                    if (c15926aH.d() == 0 || C15927b.x(c15926aH)) {
                        c15927b.i(bVarE, str);
                        if (C15927b.f152197i.b()) {
                            C18150d.e(c15926aH, 0);
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
