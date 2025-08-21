package ph;

import com.launchdarkly.sdk.LDValue;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;

/* renamed from: ph.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C16429f {

    /* renamed from: a, reason: collision with root package name */
    final boolean f156478a;

    /* renamed from: b, reason: collision with root package name */
    final LDValue f156479b;

    /* renamed from: ph.f$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final long f156480a;

        /* renamed from: b, reason: collision with root package name */
        final long f156481b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f156482c;

        a(long j10, long j11, boolean z10) {
            this.f156480a = j10;
            this.f156481b = j11;
            this.f156482c = z10;
        }
    }

    static C16429f b(long j10, C16430g c16430g, LDValue lDValue, LDValue lDValue2, LDValue lDValue3) {
        return new C16429f(true, a("diagnostic-init", j10, c16430g).d("sdk", lDValue).d("configuration", lDValue2).d("platform", lDValue3).a());
    }

    static C16429f c(long j10, C16430g c16430g, long j11, long j12, long j13, long j14, List<a> list) {
        com.launchdarkly.sdk.j jVarC = a("diagnostic", j10, c16430g).c("dataSinceDate", j11).c("droppedEvents", j12).c("deduplicatedUsers", j13).c("eventsInLastBatch", j14);
        com.launchdarkly.sdk.a aVarB = LDValue.b();
        if (list != null) {
            for (a aVar : list) {
                aVarB.a(LDValue.c().c("timestamp", aVar.f156480a).c("durationMillis", aVar.f156481b).f("failed", aVar.f156482c).a());
            }
        }
        jVarC.d("streamInits", aVarB.b());
        return new C16429f(false, jVarC.a());
    }

    private C16429f(boolean z10, LDValue lDValue) {
        this.f156478a = z10;
        this.f156479b = lDValue;
    }

    private static com.launchdarkly.sdk.j a(String str, long j10, C16430g c16430g) {
        return LDValue.c().e("kind", str).c("creationDate", j10).d(PreferencesHelper.PREF_ID, LDValue.c().e("diagnosticId", c16430g.f156483a).e("sdkKeySuffix", c16430g.f156484b).a());
    }
}
