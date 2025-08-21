package com.adobe.marketing.mobile.campaign;

import R5.A;
import R5.C5117d;
import R5.InterfaceC5125l;
import R5.K;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class k implements InterfaceC5125l {

    /* renamed from: a, reason: collision with root package name */
    private final String f63255a = "CampaignHitProcessor";

    class a extends HashMap<String, String> {
        a() {
            put("connection", "close");
            put("Content-Type", "application/json");
            put("Accept", "*/*");
        }
    }

    @Override // R5.InterfaceC5125l
    public void a(C5117d c5117d, final R5.m mVar) throws InterruptedException {
        if (c5117d == null || g6.i.a(c5117d.a())) {
            R5.t.e("Campaign", "CampaignHitProcessor", "processHit - Data entity contained an empty payload. Hit will not be processed.", new Object[0]);
            mVar.a(true);
            return;
        }
        final i iVarA = x.a(c5117d);
        if (iVarA == null) {
            R5.t.e("Campaign", "CampaignHitProcessor", "processHit - error occurred when creating a Campaign Hit from the given data entity", new Object[0]);
            mVar.a(true);
            return;
        }
        a aVar = new a();
        A aH = K.f().h();
        if (aH == null) {
            R5.t.f("Campaign", "CampaignHitProcessor", "processHit -The network service is unavailable, the hit will be retried later.", new Object[0]);
            mVar.a(false);
            return;
        }
        String str = iVarA.f63247a;
        R5.r rVarA = iVarA.a();
        byte[] bytes = iVarA.f63248b.getBytes(StandardCharsets.UTF_8);
        int i10 = iVarA.f63249c;
        R5.x xVar = new R5.x(str, rVarA, bytes, aVar, i10, i10);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        aH.a(xVar, new R5.w() { // from class: com.adobe.marketing.mobile.campaign.j
            @Override // R5.w
            public final void a(R5.o oVar) {
                k.c(this.f63251a, mVar, iVarA, countDownLatch, oVar);
            }
        });
        try {
            countDownLatch.await(6L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            R5.t.f("Campaign", "CampaignHitProcessor", "processHit - exception occurred while waiting for connectAsync latch: %s", e10.getMessage());
        }
    }

    @Override // R5.InterfaceC5125l
    public int b(C5117d c5117d) {
        return 30;
    }

    k() {
    }

    public static /* synthetic */ void c(k kVar, R5.m mVar, i iVar, CountDownLatch countDownLatch, R5.o oVar) {
        kVar.getClass();
        if (oVar != null && oVar.d() != -1) {
            if (oVar.d() == 200) {
                R5.t.a("Campaign", "CampaignHitProcessor", "processHit - Request was sent to (%s)", iVar.f63247a);
                kVar.d(System.currentTimeMillis());
                mVar.a(true);
                oVar.close();
            } else if (!b.f63240a.contains(Integer.valueOf(oVar.d()))) {
                R5.t.a("Campaign", "CampaignHitProcessor", "processHit - Unrecoverable network error while processing requests. Discarding request.", new Object[0]);
                mVar.a(true);
                oVar.close();
            } else {
                R5.t.a("Campaign", "CampaignHitProcessor", "processHit - Recoverable network error while processing requests, will retry.", new Object[0]);
                mVar.a(false);
            }
        } else {
            R5.t.a("Campaign", "CampaignHitProcessor", "processHit - Could not process a Campaign network request because the connection was null or response code was invalid. Retrying the request.", new Object[0]);
            mVar.a(false);
        }
        countDownLatch.countDown();
    }

    protected void d(long j10) {
        R5.v vVarA = K.f().d().a("CampaignCollection");
        if (vVarA == null) {
            R5.t.a("Campaign", "CampaignHitProcessor", "updateTimestampInNamedCollection -  Campaign Data store is not available to update.", new Object[0]);
        } else {
            R5.t.e("Campaign", "CampaignHitProcessor", "updateTimestampInNamedCollection -  Persisting timestamp (%d) in Campaign Data Store.", Long.valueOf(j10));
            vVarA.b("CampaignRegistrationTimestamp", j10);
        }
    }
}
