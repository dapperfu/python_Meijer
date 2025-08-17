package com.adobe.marketing.mobile.campaign;

import Q5.A;
import Q5.C5072d;
import Q5.InterfaceC5080l;
import Q5.K;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class k implements InterfaceC5080l {

    /* renamed from: a, reason: collision with root package name */
    private final String f62416a = "CampaignHitProcessor";

    class a extends HashMap<String, String> {
        a() {
            put("connection", "close");
            put("Content-Type", "application/json");
            put("Accept", "*/*");
        }
    }

    @Override // Q5.InterfaceC5080l
    public void b(C5072d c5072d, final Q5.m mVar) throws InterruptedException {
        if (c5072d == null || f6.i.a(c5072d.a())) {
            Q5.t.e("Campaign", "CampaignHitProcessor", "processHit - Data entity contained an empty payload. Hit will not be processed.", new Object[0]);
            mVar.a(true);
            return;
        }
        final i iVarA = x.a(c5072d);
        if (iVarA == null) {
            Q5.t.e("Campaign", "CampaignHitProcessor", "processHit - error occurred when creating a Campaign Hit from the given data entity", new Object[0]);
            mVar.a(true);
            return;
        }
        a aVar = new a();
        A aH = K.f().h();
        if (aH == null) {
            Q5.t.f("Campaign", "CampaignHitProcessor", "processHit -The network service is unavailable, the hit will be retried later.", new Object[0]);
            mVar.a(false);
            return;
        }
        String str = iVarA.f62408a;
        Q5.r rVarA = iVarA.a();
        byte[] bytes = iVarA.f62409b.getBytes(StandardCharsets.UTF_8);
        int i10 = iVarA.f62410c;
        Q5.x xVar = new Q5.x(str, rVarA, bytes, aVar, i10, i10);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        aH.a(xVar, new Q5.w() { // from class: com.adobe.marketing.mobile.campaign.j
            @Override // Q5.w
            public final void a(Q5.o oVar) {
                k.c(this.f62412a, mVar, iVarA, countDownLatch, oVar);
            }
        });
        try {
            countDownLatch.await(6L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Q5.t.f("Campaign", "CampaignHitProcessor", "processHit - exception occurred while waiting for connectAsync latch: %s", e10.getMessage());
        }
    }

    @Override // Q5.InterfaceC5080l
    public int a(C5072d c5072d) {
        return 30;
    }

    k() {
    }

    public static /* synthetic */ void c(k kVar, Q5.m mVar, i iVar, CountDownLatch countDownLatch, Q5.o oVar) {
        kVar.getClass();
        if (oVar != null && oVar.d() != -1) {
            if (oVar.d() == 200) {
                Q5.t.a("Campaign", "CampaignHitProcessor", "processHit - Request was sent to (%s)", iVar.f62408a);
                kVar.d(System.currentTimeMillis());
                mVar.a(true);
                oVar.close();
            } else if (!b.f62401a.contains(Integer.valueOf(oVar.d()))) {
                Q5.t.a("Campaign", "CampaignHitProcessor", "processHit - Unrecoverable network error while processing requests. Discarding request.", new Object[0]);
                mVar.a(true);
                oVar.close();
            } else {
                Q5.t.a("Campaign", "CampaignHitProcessor", "processHit - Recoverable network error while processing requests, will retry.", new Object[0]);
                mVar.a(false);
            }
        } else {
            Q5.t.a("Campaign", "CampaignHitProcessor", "processHit - Could not process a Campaign network request because the connection was null or response code was invalid. Retrying the request.", new Object[0]);
            mVar.a(false);
        }
        countDownLatch.countDown();
    }

    protected void d(long j10) {
        Q5.v vVarA = K.f().d().a("CampaignCollection");
        if (vVarA == null) {
            Q5.t.a("Campaign", "CampaignHitProcessor", "updateTimestampInNamedCollection -  Campaign Data store is not available to update.", new Object[0]);
        } else {
            Q5.t.e("Campaign", "CampaignHitProcessor", "updateTimestampInNamedCollection -  Persisting timestamp (%d) in Campaign Data Store.", Long.valueOf(j10));
            vVarA.b("CampaignRegistrationTimestamp", j10);
        }
    }
}
