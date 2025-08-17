package oh;

import com.launchdarkly.sdk.LDValue;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;

/* renamed from: oh.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16064f {

    /* renamed from: a, reason: collision with root package name */
    final boolean f153718a;

    /* renamed from: b, reason: collision with root package name */
    final LDValue f153719b;

    /* renamed from: oh.f$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final long f153720a;

        /* renamed from: b, reason: collision with root package name */
        final long f153721b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f153722c;

        a(long j10, long j11, boolean z10) {
            this.f153720a = j10;
            this.f153721b = j11;
            this.f153722c = z10;
        }
    }

    static C16064f b(long j10, C16065g c16065g, LDValue lDValue, LDValue lDValue2, LDValue lDValue3) {
        return new C16064f(true, a("diagnostic-init", j10, c16065g).d("sdk", lDValue).d("configuration", lDValue2).d("platform", lDValue3).a());
    }

    static C16064f c(long j10, C16065g c16065g, long j11, long j12, long j13, long j14, List<a> list) {
        com.launchdarkly.sdk.j jVarC = a("diagnostic", j10, c16065g).c("dataSinceDate", j11).c("droppedEvents", j12).c("deduplicatedUsers", j13).c("eventsInLastBatch", j14);
        com.launchdarkly.sdk.a aVarB = LDValue.b();
        if (list != null) {
            for (a aVar : list) {
                aVarB.a(LDValue.c().c("timestamp", aVar.f153720a).c("durationMillis", aVar.f153721b).f("failed", aVar.f153722c).a());
            }
        }
        jVarC.d("streamInits", aVarB.b());
        return new C16064f(false, jVarC.a());
    }

    private C16064f(boolean z10, LDValue lDValue) {
        this.f153718a = z10;
        this.f153719b = lDValue;
    }

    private static com.launchdarkly.sdk.j a(String str, long j10, C16065g c16065g) {
        return LDValue.c().e("kind", str).c("creationDate", j10).d(PreferencesHelper.PREF_ID, LDValue.c().e("diagnosticId", c16065g.f153723a).e("sdkKeySuffix", c16065g.f153724b).a());
    }
}
