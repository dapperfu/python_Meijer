package com.adobe.marketing.mobile.campaign;

import com.adobe.marketing.mobile.D;
import com.adobe.marketing.mobile.H;
import g6.C14328a;
import java.util.Map;

/* loaded from: classes4.dex */
final class r {

    /* renamed from: b, reason: collision with root package name */
    private String f63277b;

    /* renamed from: c, reason: collision with root package name */
    private String f63278c;

    /* renamed from: d, reason: collision with root package name */
    private String f63279d;

    /* renamed from: e, reason: collision with root package name */
    private D f63280e;

    /* renamed from: f, reason: collision with root package name */
    private String f63281f;

    /* renamed from: g, reason: collision with root package name */
    private int f63282g;

    /* renamed from: h, reason: collision with root package name */
    private int f63283h;

    /* renamed from: j, reason: collision with root package name */
    private String f63285j;

    /* renamed from: a, reason: collision with root package name */
    private final String f63276a = "CampaignState";

    /* renamed from: i, reason: collision with root package name */
    private boolean f63284i = false;

    private void m(Map<String, Object> map) {
        this.f63277b = C14328a.o(map, "campaign.server", "");
        this.f63278c = C14328a.o(map, "campaign.pkey", "");
        this.f63279d = C14328a.o(map, "campaign.mcias", "");
        this.f63281f = C14328a.o(map, "property.id", "");
        this.f63280e = D.b(C14328a.o(map, "global.privacy", ""));
        this.f63282g = C14328a.m(map, "campaign.timeout", 5);
        this.f63283h = C14328a.m(map, "campaign.registrationDelay", 7);
        this.f63284i = C14328a.l(map, "campaign.registrationPaused", false);
    }

    private void n(Map<String, Object> map) {
        this.f63285j = C14328a.o(map, "mid", "");
    }

    boolean a() {
        if (this.f63280e == D.OPT_IN) {
            return (g6.i.a(this.f63285j) || g6.i.a(this.f63277b) || g6.i.a(this.f63279d) || g6.i.a(this.f63281f)) ? false : true;
        }
        R5.t.e("Campaign", "CampaignState", "canDownloadRulesWithCurrentState -  Cannot download rules, since privacy status is not opted in.", new Object[0]);
        return false;
    }

    boolean b() {
        if (this.f63280e == D.OPT_IN) {
            return (g6.i.a(this.f63285j) || g6.i.a(this.f63277b) || g6.i.a(this.f63278c)) ? false : true;
        }
        R5.t.e("Campaign", "CampaignState", "canRegisterWithCurrentState -  Cannot register with Campaign, since privacy status is not opted in.", new Object[0]);
        return false;
    }

    boolean c() {
        if (this.f63280e == D.OPT_IN) {
            return (g6.i.a(this.f63285j) || g6.i.a(this.f63277b)) ? false : true;
        }
        R5.t.e("Campaign", "CampaignState", "canSendTrackInfoWithCurrentState -  Cannot send message track request to Campaign, since privacy status is not opted in.", new Object[0]);
        return false;
    }

    String d() {
        return this.f63279d;
    }

    String e() {
        return this.f63278c;
    }

    int f() {
        return this.f63283h;
    }

    boolean g() {
        return this.f63284i;
    }

    String h() {
        return this.f63277b;
    }

    int i() {
        return this.f63282g;
    }

    String j() {
        return this.f63285j;
    }

    D k() {
        return this.f63280e;
    }

    String l() {
        return this.f63281f;
    }

    void o(H h10, H h11) {
        if (h10 != null && h10.b() != null) {
            m(h10.b());
        }
        if (h11 == null || h11.b() == null) {
            return;
        }
        n(h11.b());
    }

    r() {
    }
}
