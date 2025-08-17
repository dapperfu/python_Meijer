package com.adobe.marketing.mobile.audience;

import Q5.A;
import Q5.B;
import Q5.C5072d;
import Q5.InterfaceC5080l;
import Q5.K;
import Q5.o;
import Q5.r;
import Q5.t;
import Q5.w;
import Q5.x;
import com.adobe.marketing.mobile.C6449h;
import f6.C13851g;
import java.io.IOException;

/* loaded from: classes4.dex */
class l implements InterfaceC5080l {

    /* renamed from: a, reason: collision with root package name */
    private final A f62365a = K.f().h();

    /* renamed from: b, reason: collision with root package name */
    private final m f62366b;

    private void d(o oVar, C6449h c6449h, Q5.m mVar) throws IOException {
        boolean z10 = false;
        if (oVar == null) {
            t.f("Audience", "AudienceHitProcessor", "AAM could not process network connection because it was null, Will retry later.", new Object[0]);
            this.f62366b.a(null, c6449h);
            mVar.a(false);
            return;
        }
        if (oVar.d() != 200) {
            if (!B.f29765a.contains(Integer.valueOf(oVar.d()))) {
                t.f("Audience", "AudienceHitProcessor", "Unrecoverable network error code (%d) while processing AAM requests, discarding hit.", Integer.valueOf(oVar.d()));
                this.f62366b.a(null, c6449h);
            }
            oVar.close();
            mVar.a(z10);
        }
        this.f62366b.a(C13851g.a(oVar.c()), c6449h);
        z10 = true;
        oVar.close();
        mVar.a(z10);
    }

    @Override // Q5.InterfaceC5080l
    public int a(C5072d c5072d) {
        return 30;
    }

    @Override // Q5.InterfaceC5080l
    public void b(C5072d c5072d, final Q5.m mVar) {
        if (this.f62365a == null) {
            t.f("Audience", "AudienceHitProcessor", "Unexpected null NetworkService, unable to execute the request at this time.", new Object[0]);
            mVar.a(false);
            return;
        }
        final b bVarA = b.a(c5072d);
        if (bVarA == null) {
            t.a("Audience", "AudienceHitProcessor", "Unable to deserialize DataEntity to AudienceDataEntity, discarding hit.", new Object[0]);
            mVar.a(true);
        } else {
            t.e("Audience", "AudienceHitProcessor", "Processing hit request: %s", bVarA.d());
            this.f62365a.a(new x(bVarA.d(), r.GET, null, null, bVarA.c(), bVarA.c()), new w() { // from class: com.adobe.marketing.mobile.audience.k
                @Override // Q5.w
                public final void a(o oVar) throws IOException {
                    l.c(this.f62362a, bVarA, mVar, oVar);
                }
            });
        }
    }

    l(m mVar) {
        this.f62366b = mVar;
    }

    public static /* synthetic */ void c(l lVar, b bVar, Q5.m mVar, o oVar) throws IOException {
        lVar.getClass();
        lVar.d(oVar, bVar.b(), mVar);
    }
}
