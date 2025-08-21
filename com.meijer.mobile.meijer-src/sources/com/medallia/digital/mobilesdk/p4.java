package com.medallia.digital.mobilesdk;

import O4.EnumC4353a;
import O4.O;
import O4.y;
import androidx.work.b;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
class p4 {

    /* renamed from: b, reason: collision with root package name */
    protected static final String f93533b = "mediaData";

    /* renamed from: c, reason: collision with root package name */
    protected static final String f93534c = "mediaCaptureConfig";

    /* renamed from: d, reason: collision with root package name */
    protected static final String f93535d = "isPreviewsApp";

    /* renamed from: e, reason: collision with root package name */
    public static final int f93536e = 15;

    /* renamed from: f, reason: collision with root package name */
    private static final String f93537f = "MEDALLIA_NOTIFICATIONS_WORK";

    /* renamed from: g, reason: collision with root package name */
    private static final String f93538g = "MEDALLIA_NOTIFICATIONS_BACKGROUND_WORK";

    /* renamed from: h, reason: collision with root package name */
    private static p4 f93539h;

    /* renamed from: a, reason: collision with root package name */
    private O4.y f93540a;

    p4() {
    }

    protected static p4 d() {
        if (f93539h == null) {
            f93539h = new p4();
        }
        return f93539h;
    }

    void a() {
        if (this.f93540a != null) {
            O.h(i4.c().d()).b(this.f93540a.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        }
    }

    void b() {
        O.h(i4.c().d()).a(f93537f);
    }

    protected void c() {
        a4.e("executeRetryMechanism worker");
        O.h(i4.c().b()).c(new y.a(RetryMechanismWorker.class).b());
    }

    void e() {
        long minutes;
        if (this.f93540a == null) {
            try {
                minutes = t0.c().a().getSdkConfiguration().getMedalliaDigitalBrain().getAndroidBackoffDelay().longValue();
            } catch (Exception unused) {
                a4.b("using default value for repeatInterval");
                minutes = 0;
            }
            if (minutes < 15) {
                minutes = 15;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (minutes > timeUnit.toMinutes(18000000L)) {
                a4.b("repeatInterval exceeds maximum value, using MAX_BACKOFF_MILLIS");
                minutes = timeUnit.toMinutes(18000000L);
            }
            this.f93540a = new y.a(CheckBackgroundWorker.class).i(EnumC4353a.LINEAR, minutes, TimeUnit.MINUTES).a(f93538g).b();
            O.h(i4.c().d()).c(this.f93540a);
        }
    }

    void a(long j10) {
        O.h(i4.c().d()).c(new y.a(LocalNotificationWorker.class).a(f93537f).l(j10, TimeUnit.SECONDS).b());
    }

    protected void a(e5 e5Var, b5 b5Var, Boolean bool) {
        a4.e("executeSubmitMediaFeedback worker");
        b.a aVar = new b.a();
        if (e5Var != null) {
            aVar.g(f93533b, e5Var.toJsonString());
        }
        if (b5Var != null) {
            aVar.g(f93534c, b5Var.i());
        }
        aVar.e(f93535d, bool.booleanValue());
        O.h(i4.c().b()).c(new y.a(SubmitMediaFeedbackWorker.class).m(aVar.a()).b());
    }
}
