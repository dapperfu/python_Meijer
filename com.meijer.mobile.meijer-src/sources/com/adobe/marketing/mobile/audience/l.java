package com.adobe.marketing.mobile.audience;

import R5.A;
import R5.B;
import R5.C5117d;
import R5.InterfaceC5125l;
import R5.K;
import R5.o;
import R5.r;
import R5.t;
import R5.w;
import R5.x;
import com.adobe.marketing.mobile.C6574h;
import g6.C14334g;
import java.io.IOException;

/* loaded from: classes4.dex */
class l implements InterfaceC5125l {

    /* renamed from: a, reason: collision with root package name */
    private final A f63204a = K.f().h();

    /* renamed from: b, reason: collision with root package name */
    private final m f63205b;

    private void d(o oVar, C6574h c6574h, R5.m mVar) throws IOException {
        boolean z10 = false;
        if (oVar == null) {
            t.f("Audience", "AudienceHitProcessor", "AAM could not process network connection because it was null, Will retry later.", new Object[0]);
            this.f63205b.a(null, c6574h);
            mVar.a(false);
            return;
        }
        if (oVar.d() != 200) {
            if (!B.f31876a.contains(Integer.valueOf(oVar.d()))) {
                t.f("Audience", "AudienceHitProcessor", "Unrecoverable network error code (%d) while processing AAM requests, discarding hit.", Integer.valueOf(oVar.d()));
                this.f63205b.a(null, c6574h);
            }
            oVar.close();
            mVar.a(z10);
        }
        this.f63205b.a(C14334g.a(oVar.c()), c6574h);
        z10 = true;
        oVar.close();
        mVar.a(z10);
    }

    @Override // R5.InterfaceC5125l
    public void a(C5117d c5117d, final R5.m mVar) {
        if (this.f63204a == null) {
            t.f("Audience", "AudienceHitProcessor", "Unexpected null NetworkService, unable to execute the request at this time.", new Object[0]);
            mVar.a(false);
            return;
        }
        final b bVarA = b.a(c5117d);
        if (bVarA == null) {
            t.a("Audience", "AudienceHitProcessor", "Unable to deserialize DataEntity to AudienceDataEntity, discarding hit.", new Object[0]);
            mVar.a(true);
        } else {
            t.e("Audience", "AudienceHitProcessor", "Processing hit request: %s", bVarA.d());
            this.f63204a.a(new x(bVarA.d(), r.GET, null, null, bVarA.c(), bVarA.c()), new w() { // from class: com.adobe.marketing.mobile.audience.k
                @Override // R5.w
                public final void a(o oVar) throws IOException {
                    l.c(this.f63201a, bVarA, mVar, oVar);
                }
            });
        }
    }

    @Override // R5.InterfaceC5125l
    public int b(C5117d c5117d) {
        return 30;
    }

    l(m mVar) {
        this.f63205b = mVar;
    }

    public static /* synthetic */ void c(l lVar, b bVar, R5.m mVar, o oVar) throws IOException {
        lVar.getClass();
        lVar.d(oVar, bVar.b(), mVar);
    }
}
