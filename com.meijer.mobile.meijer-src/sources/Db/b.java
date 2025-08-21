package Db;

import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f6063c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final Long f6064d = 10000L;

    /* renamed from: a, reason: collision with root package name */
    public l f6065a;

    /* renamed from: b, reason: collision with root package name */
    private Qb.b f6066b;

    public static double a(Float f10, Float f11) {
        return f10 == null ? f11.floatValue() : f10.floatValue();
    }

    public static int b(Integer num, int i10) {
        return num == null ? i10 : num.intValue();
    }

    public static long c(Long l10, long j10) {
        return l10 == null ? j10 : l10.longValue();
    }

    private static Gb.f d(String str) {
        return str.compareTo("on") == 0 ? Gb.f.ON : str.compareTo("off") == 0 ? Gb.f.OFF : Gb.f.NOT_SET;
    }

    public static String f(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static boolean i(Boolean bool, boolean z10) {
        return bool == null ? z10 : bool.booleanValue();
    }

    public final void B() {
        this.f6065a.c("lastConfigChangeTime", Long.valueOf(System.currentTimeMillis()));
    }

    public final Qb.b e() {
        if (this.f6066b == null) {
            Qb.b bVar = new Qb.b();
            this.f6066b = bVar;
            bVar.r0(this.f6065a.a("arrivalRSSI"));
            this.f6066b.C0(this.f6065a.a("departureRSSI"));
            this.f6066b.B0(this.f6065a.b("departureIntervalInForegroundInMillis"));
            this.f6066b.A0(this.f6065a.b("departureIntervalInBackgroundInMillis"));
            this.f6066b.b0(this.f6065a.g("allowKitKat", null));
            this.f6066b.Q0(this.f6065a.a("smoothingWindow"));
            this.f6066b.z0(this.f6065a.b("configFetchIntervalInMillis"));
            this.f6066b.P0(this.f6065a.b("sightingsUploadIntervalInMillis"));
            this.f6066b.w0(this.f6065a.b("clientStateUploadIntervalInMillis"));
            this.f6066b.G0(this.f6065a.b("establishedLocationUploadIntervalInMillis"));
            this.f6066b.F0(this.f6065a.a("establishedLocationMinDurationInMillis"));
            this.f6066b.E0(this.f6065a.a("establishedLocationMaxCountToSend"));
            this.f6066b.a0(this.f6065a.g("allowGeofence", null));
            this.f6066b.Z(this.f6065a.g("allowEstablishedLocations", null));
            this.f6066b.c0(this.f6065a.g("allowProximity", null));
            this.f6066b.Y(this.f6065a.g("allowCommunicate", null));
            this.f6066b.y0(this.f6065a.g("storeSightingLocation", null));
            this.f6066b.O0(this.f6065a.g("sendPlaceStateToServer", null));
            this.f6066b.X(this.f6065a.g("allowCollectIDFA", null));
            this.f6066b.x0(this.f6065a.g("collectBreadcrumb", null));
            this.f6066b.u0(this.f6065a.b("breadcrumbsMinFixInterval"));
            this.f6066b.t0(this.f6065a.c("breadcrumbsBigDelta"));
            this.f6066b.v0(this.f6065a.b("breadcrumbsUploadIntervalInMillis"));
            this.f6066b.T0((List) this.f6065a.b("ibeaconToResolve", List.class));
            this.f6066b.H0(this.f6065a.a("foregroundScanMode"));
            this.f6066b.s0(this.f6065a.a("backgroundScanMode"));
            this.f6066b.N0((Xb.c[]) this.f6065a.b("scanParametersConfiguration", Xb.c[].class));
            this.f6066b.R0(this.f6065a.h("thirdPartyBeaconScanSchedule", null));
            this.f6066b.M0(this.f6065a.g("reportThirdPartySightingOnResolveWhenScheduleIsoff", null));
            this.f6066b.S0(this.f6065a.b("thirdPartySightingIntervalInMillis"));
            this.f6066b.K0(this.f6065a.h("overrideGeofence", null));
            this.f6066b.L0(this.f6065a.h("overrideProximity", null));
            this.f6066b.J0(this.f6065a.h("overrideEstablishedLocations", null));
            this.f6066b.I0(this.f6065a.h("overrideCollectIDFA", null));
            this.f6066b.D0(this.f6065a.h("diagnosticsKey", null));
            this.f6066b.q0(this.f6065a.a("android_place_small_size"));
            this.f6066b.p0(this.f6065a.c("android_place_small_multiplier"));
            this.f6066b.o0(this.f6065a.a("android_place_medium_size"));
            this.f6066b.n0(this.f6065a.c("android_place_medium_multiplier"));
            this.f6066b.m0(this.f6065a.a("android_place_large_size"));
            this.f6066b.l0(this.f6065a.c("android_place_large_multiplier"));
            this.f6066b.j0(this.f6065a.a("android_min_accuracy"));
            this.f6066b.i0(this.f6065a.a("android_max_entry_accuracy"));
            this.f6066b.f0(this.f6065a.a("android_exit_hysteresis"));
            this.f6066b.e0(this.f6065a.a("android_entry_buffer"));
            this.f6066b.d0(this.f6065a.a("android_assumed_min_speed"));
            this.f6066b.k0(this.f6065a.a("android_place_default_exit_delay"));
            this.f6066b.g0(this.f6065a.a("android_location_default_cycle_interval"));
            this.f6066b.h0(this.f6065a.a("android_location_not_traveling_interval"));
        }
        return this.f6066b;
    }

    public final void g(k kVar, String... strArr) {
        this.f6065a.j(kVar, strArr);
    }

    public final void h(Qb.b bVar) {
        if (bVar != null) {
            this.f6066b = bVar;
            this.f6065a.i("arrivalRSSI", bVar.o());
            this.f6065a.i("departureRSSI", bVar.x());
            this.f6065a.c("departureIntervalInForegroundInMillis", bVar.w());
            this.f6065a.c("departureIntervalInBackgroundInMillis", bVar.v());
            this.f6065a.e("allowKitKat", bVar.S());
            this.f6065a.i("smoothingWindow", bVar.K());
            this.f6065a.c("configFetchIntervalInMillis", bVar.u());
            this.f6065a.c("sightingsUploadIntervalInMillis", bVar.J());
            this.f6065a.c("clientStateUploadIntervalInMillis", bVar.t());
            this.f6065a.c("establishedLocationUploadIntervalInMillis", bVar.B());
            this.f6065a.i("establishedLocationMinDurationInMillis", bVar.A());
            this.f6065a.i("establishedLocationMaxCountToSend", bVar.z());
            this.f6065a.e("allowGeofence", bVar.R());
            this.f6065a.e("allowEstablishedLocations", bVar.Q());
            this.f6065a.e("allowProximity", bVar.T());
            this.f6065a.e("allowCommunicate", bVar.P());
            this.f6065a.e("storeSightingLocation", bVar.V());
            this.f6065a.e("sendPlaceStateToServer", bVar.W());
            this.f6065a.e("allowCollectIDFA", bVar.O());
            this.f6065a.e("collectBreadcrumb", bVar.U());
            this.f6065a.c("breadcrumbsMinFixInterval", bVar.r());
            this.f6065a.d("breadcrumbsBigDelta", bVar.q());
            this.f6065a.c("breadcrumbsUploadIntervalInMillis", bVar.s());
            this.f6065a.a("ibeaconToResolve", bVar.N());
            this.f6065a.i("foregroundScanMode", bVar.C());
            this.f6065a.i("backgroundScanMode", bVar.p());
            this.f6065a.a("scanParametersConfiguration", bVar.I());
            this.f6065a.f("thirdPartyBeaconScanSchedule", bVar.L());
            this.f6065a.e("reportThirdPartySightingOnResolveWhenScheduleIsoff", bVar.H());
            this.f6065a.c("thirdPartySightingIntervalInMillis", bVar.M());
            this.f6065a.f("overrideGeofence", bVar.F());
            this.f6065a.f("overrideProximity", bVar.G());
            this.f6065a.f("overrideEstablishedLocations", bVar.E());
            this.f6065a.f("overrideCollectIDFA", bVar.D());
            this.f6065a.f("diagnosticsKey", bVar.y());
            this.f6065a.i("android_place_small_size", bVar.n());
            this.f6065a.d("android_place_small_multiplier", bVar.m());
            this.f6065a.i("android_place_medium_size", bVar.l());
            this.f6065a.d("android_place_medium_multiplier", bVar.k());
            this.f6065a.i("android_place_large_size", bVar.j());
            this.f6065a.d("android_place_large_multiplier", bVar.i());
            this.f6065a.i("android_min_accuracy", bVar.g());
            this.f6065a.i("android_max_entry_accuracy", bVar.f());
            this.f6065a.i("android_exit_hysteresis", bVar.c());
            this.f6065a.i("android_entry_buffer", bVar.b());
            this.f6065a.i("android_assumed_min_speed", bVar.a());
            this.f6065a.i("android_place_default_exit_delay", bVar.h());
            this.f6065a.i("android_location_default_cycle_interval", bVar.d());
            this.f6065a.i("android_location_not_traveling_interval", bVar.e());
        }
    }

    public b(l lVar) {
        this.f6065a = lVar;
        h(e());
    }

    public final Gb.f A() {
        String strD = e().D();
        if (strD == null) {
            strD = "default";
        }
        return d(strD);
    }

    public final int C() {
        return b(e().b(), 0);
    }

    public final long j() {
        return c(e().w(), 30000L);
    }

    public final long k() {
        return c(e().v(), 30000L);
    }

    public final boolean l() {
        return i(e().S(), false);
    }

    public final int m() {
        return b(e().K(), 3);
    }

    public final long n() {
        return c(e().u(), 28800000L);
    }

    public final long o() {
        return c(e().J(), 300000L);
    }

    public final boolean p() {
        return i(e().R(), true);
    }

    public final boolean q() {
        return i(e().Q(), true);
    }

    public final boolean r() {
        return i(e().T(), true);
    }

    public final boolean s() {
        return i(e().P(), true);
    }

    public final boolean t() {
        return i(e().V(), true);
    }

    public final boolean u() {
        return i(e().W(), true);
    }

    public final boolean v() {
        return i(e().O(), false);
    }

    public final boolean w() {
        return i(e().U(), false);
    }

    public final Gb.f x() {
        String strF = e().F();
        if (strF == null) {
            strF = "default";
        }
        return d(strF);
    }

    public final Gb.f y() {
        String strG = e().G();
        if (strG == null) {
            strG = "default";
        }
        return d(strG);
    }

    public final Gb.f z() {
        String strE = e().E();
        if (strE == null) {
            strE = "default";
        }
        return d(strE);
    }
}
