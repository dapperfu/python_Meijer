package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.l8;
import java.util.UUID;

/* loaded from: classes8.dex */
class y6 {

    /* renamed from: a, reason: collision with root package name */
    private long f94470a = -1;

    y6() {
    }

    protected long a() {
        return this.f94470a;
    }

    protected void b() {
        d7 d7VarB = d7.b();
        d7.a aVar = d7.a.PREVIOUS_SESSION_ID;
        d7 d7VarB2 = d7.b();
        d7.a aVar2 = d7.a.SESSION_ID;
        d7VarB.b(aVar, d7VarB2.a(aVar2, (String) null));
        d7.b().b(aVar2, UUID.randomUUID().toString());
        d7 d7VarB3 = d7.b();
        d7.a aVar3 = d7.a.SESSION_COUNTER;
        d7.b().b(aVar3, d7VarB3.a(aVar3, 0) + 1);
    }

    void c() {
        CollectorsInfrastructure.getInstance().setSessionNumber(Integer.valueOf(d7.b().a(d7.a.SESSION_COUNTER, 0)));
        CollectorsInfrastructure.getInstance().setSessionId(d7.b().a(d7.a.SESSION_ID, (String) null));
    }

    protected void a(ConfigurationContract configurationContract) {
        this.f94470a = (configurationContract == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime().longValue() <= 0) ? l8.b.f93364b : configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime().longValue();
    }

    protected boolean a(long j10) {
        return j10 > this.f94470a;
    }
}
