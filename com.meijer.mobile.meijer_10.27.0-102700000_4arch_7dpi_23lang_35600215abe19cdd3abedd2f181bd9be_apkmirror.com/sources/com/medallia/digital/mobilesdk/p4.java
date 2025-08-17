package com.medallia.digital.mobilesdk;

import N4.EnumC4313a;
import N4.O;
import N4.y;
import androidx.work.b;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
class p4 {

    /* renamed from: b, reason: collision with root package name */
    protected static final String f92694b = "mediaData";

    /* renamed from: c, reason: collision with root package name */
    protected static final String f92695c = "mediaCaptureConfig";

    /* renamed from: d, reason: collision with root package name */
    protected static final String f92696d = "isPreviewsApp";

    /* renamed from: e, reason: collision with root package name */
    public static final int f92697e = 15;

    /* renamed from: f, reason: collision with root package name */
    private static final String f92698f = "MEDALLIA_NOTIFICATIONS_WORK";

    /* renamed from: g, reason: collision with root package name */
    private static final String f92699g = "MEDALLIA_NOTIFICATIONS_BACKGROUND_WORK";

    /* renamed from: h, reason: collision with root package name */
    private static p4 f92700h;

    /* renamed from: a, reason: collision with root package name */
    private N4.y f92701a;

    p4() {
    }

    protected static p4 d() {
        if (f92700h == null) {
            f92700h = new p4();
        }
        return f92700h;
    }

    void a() {
        if (this.f92701a != null) {
            O.h(i4.c().d()).b(this.f92701a.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        }
    }

    void b() {
        O.h(i4.c().d()).a(f92698f);
    }

    protected void c() {
        a4.e("executeRetryMechanism worker");
        O.h(i4.c().b()).c(new y.a(RetryMechanismWorker.class).b());
    }

    void e() {
        long minutes;
        if (this.f92701a == null) {
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
            this.f92701a = new y.a(CheckBackgroundWorker.class).i(EnumC4313a.LINEAR, minutes, TimeUnit.MINUTES).a(f92699g).b();
            O.h(i4.c().d()).c(this.f92701a);
        }
    }

    void a(long j10) {
        O.h(i4.c().d()).c(new y.a(LocalNotificationWorker.class).a(f92698f).l(j10, TimeUnit.SECONDS).b());
    }

    protected void a(e5 e5Var, b5 b5Var, Boolean bool) {
        a4.e("executeSubmitMediaFeedback worker");
        b.a aVar = new b.a();
        if (e5Var != null) {
            aVar.g(f92694b, e5Var.toJsonString());
        }
        if (b5Var != null) {
            aVar.g(f92695c, b5Var.i());
        }
        aVar.e(f92696d, bool.booleanValue());
        O.h(i4.c().b()).c(new y.a(SubmitMediaFeedbackWorker.class).m(aVar.a()).b());
    }
}
