package com.adobe.marketing.mobile.campaign;

import com.adobe.marketing.mobile.D;
import com.adobe.marketing.mobile.H;
import f6.C13845a;
import java.util.Map;

/* loaded from: classes4.dex */
final class r {

    /* renamed from: b, reason: collision with root package name */
    private String f62438b;

    /* renamed from: c, reason: collision with root package name */
    private String f62439c;

    /* renamed from: d, reason: collision with root package name */
    private String f62440d;

    /* renamed from: e, reason: collision with root package name */
    private D f62441e;

    /* renamed from: f, reason: collision with root package name */
    private String f62442f;

    /* renamed from: g, reason: collision with root package name */
    private int f62443g;

    /* renamed from: h, reason: collision with root package name */
    private int f62444h;

    /* renamed from: j, reason: collision with root package name */
    private String f62446j;

    /* renamed from: a, reason: collision with root package name */
    private final String f62437a = "CampaignState";

    /* renamed from: i, reason: collision with root package name */
    private boolean f62445i = false;

    private void m(Map<String, Object> map) {
        this.f62438b = C13845a.o(map, "campaign.server", "");
        this.f62439c = C13845a.o(map, "campaign.pkey", "");
        this.f62440d = C13845a.o(map, "campaign.mcias", "");
        this.f62442f = C13845a.o(map, "property.id", "");
        this.f62441e = D.b(C13845a.o(map, "global.privacy", ""));
        this.f62443g = C13845a.m(map, "campaign.timeout", 5);
        this.f62444h = C13845a.m(map, "campaign.registrationDelay", 7);
        this.f62445i = C13845a.l(map, "campaign.registrationPaused", false);
    }

    private void n(Map<String, Object> map) {
        this.f62446j = C13845a.o(map, "mid", "");
    }

    boolean a() {
        if (this.f62441e == D.OPT_IN) {
            return (f6.i.a(this.f62446j) || f6.i.a(this.f62438b) || f6.i.a(this.f62440d) || f6.i.a(this.f62442f)) ? false : true;
        }
        Q5.t.e("Campaign", "CampaignState", "canDownloadRulesWithCurrentState -  Cannot download rules, since privacy status is not opted in.", new Object[0]);
        return false;
    }

    boolean b() {
        if (this.f62441e == D.OPT_IN) {
            return (f6.i.a(this.f62446j) || f6.i.a(this.f62438b) || f6.i.a(this.f62439c)) ? false : true;
        }
        Q5.t.e("Campaign", "CampaignState", "canRegisterWithCurrentState -  Cannot register with Campaign, since privacy status is not opted in.", new Object[0]);
        return false;
    }

    boolean c() {
        if (this.f62441e == D.OPT_IN) {
            return (f6.i.a(this.f62446j) || f6.i.a(this.f62438b)) ? false : true;
        }
        Q5.t.e("Campaign", "CampaignState", "canSendTrackInfoWithCurrentState -  Cannot send message track request to Campaign, since privacy status is not opted in.", new Object[0]);
        return false;
    }

    String d() {
        return this.f62440d;
    }

    String e() {
        return this.f62439c;
    }

    int f() {
        return this.f62444h;
    }

    boolean g() {
        return this.f62445i;
    }

    String h() {
        return this.f62438b;
    }

    int i() {
        return this.f62443g;
    }

    String j() {
        return this.f62446j;
    }

    D k() {
        return this.f62441e;
    }

    String l() {
        return this.f62442f;
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
