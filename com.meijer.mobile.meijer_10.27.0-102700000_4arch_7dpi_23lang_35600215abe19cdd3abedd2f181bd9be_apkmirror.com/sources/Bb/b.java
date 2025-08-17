package Bb;

import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final String f2118c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final Long f2119d = 10000L;

    /* renamed from: a, reason: collision with root package name */
    public l f2120a;

    /* renamed from: b, reason: collision with root package name */
    private Ob.b f2121b;

    public static double a(Float f10, Float f11) {
        return f10 == null ? f11.floatValue() : f10.floatValue();
    }

    public static int b(Integer num, int i10) {
        return num == null ? i10 : num.intValue();
    }

    public static long c(Long l10, long j10) {
        return l10 == null ? j10 : l10.longValue();
    }

    private static Eb.f d(String str) {
        return str.compareTo("on") == 0 ? Eb.f.ON : str.compareTo("off") == 0 ? Eb.f.OFF : Eb.f.NOT_SET;
    }

    public static String f(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static boolean i(Boolean bool, boolean z10) {
        return bool == null ? z10 : bool.booleanValue();
    }

    public final void B() {
        this.f2120a.c("lastConfigChangeTime", Long.valueOf(System.currentTimeMillis()));
    }

    public final Ob.b e() {
        if (this.f2121b == null) {
            Ob.b bVar = new Ob.b();
            this.f2121b = bVar;
            bVar.r0(this.f2120a.a("arrivalRSSI"));
            this.f2121b.C0(this.f2120a.a("departureRSSI"));
            this.f2121b.B0(this.f2120a.b("departureIntervalInForegroundInMillis"));
            this.f2121b.A0(this.f2120a.b("departureIntervalInBackgroundInMillis"));
            this.f2121b.b0(this.f2120a.h("allowKitKat", null));
            this.f2121b.Q0(this.f2120a.a("smoothingWindow"));
            this.f2121b.z0(this.f2120a.b("configFetchIntervalInMillis"));
            this.f2121b.P0(this.f2120a.b("sightingsUploadIntervalInMillis"));
            this.f2121b.w0(this.f2120a.b("clientStateUploadIntervalInMillis"));
            this.f2121b.G0(this.f2120a.b("establishedLocationUploadIntervalInMillis"));
            this.f2121b.F0(this.f2120a.a("establishedLocationMinDurationInMillis"));
            this.f2121b.E0(this.f2120a.a("establishedLocationMaxCountToSend"));
            this.f2121b.a0(this.f2120a.h("allowGeofence", null));
            this.f2121b.Z(this.f2120a.h("allowEstablishedLocations", null));
            this.f2121b.c0(this.f2120a.h("allowProximity", null));
            this.f2121b.Y(this.f2120a.h("allowCommunicate", null));
            this.f2121b.y0(this.f2120a.h("storeSightingLocation", null));
            this.f2121b.O0(this.f2120a.h("sendPlaceStateToServer", null));
            this.f2121b.X(this.f2120a.h("allowCollectIDFA", null));
            this.f2121b.x0(this.f2120a.h("collectBreadcrumb", null));
            this.f2121b.u0(this.f2120a.b("breadcrumbsMinFixInterval"));
            this.f2121b.t0(this.f2120a.c("breadcrumbsBigDelta"));
            this.f2121b.v0(this.f2120a.b("breadcrumbsUploadIntervalInMillis"));
            this.f2121b.T0((List) this.f2120a.b("ibeaconToResolve", List.class));
            this.f2121b.H0(this.f2120a.a("foregroundScanMode"));
            this.f2121b.s0(this.f2120a.a("backgroundScanMode"));
            this.f2121b.N0((Vb.c[]) this.f2120a.b("scanParametersConfiguration", Vb.c[].class));
            this.f2121b.R0(this.f2120a.i("thirdPartyBeaconScanSchedule", null));
            this.f2121b.M0(this.f2120a.h("reportThirdPartySightingOnResolveWhenScheduleIsoff", null));
            this.f2121b.S0(this.f2120a.b("thirdPartySightingIntervalInMillis"));
            this.f2121b.K0(this.f2120a.i("overrideGeofence", null));
            this.f2121b.L0(this.f2120a.i("overrideProximity", null));
            this.f2121b.J0(this.f2120a.i("overrideEstablishedLocations", null));
            this.f2121b.I0(this.f2120a.i("overrideCollectIDFA", null));
            this.f2121b.D0(this.f2120a.i("diagnosticsKey", null));
            this.f2121b.q0(this.f2120a.a("android_place_small_size"));
            this.f2121b.p0(this.f2120a.c("android_place_small_multiplier"));
            this.f2121b.o0(this.f2120a.a("android_place_medium_size"));
            this.f2121b.n0(this.f2120a.c("android_place_medium_multiplier"));
            this.f2121b.m0(this.f2120a.a("android_place_large_size"));
            this.f2121b.l0(this.f2120a.c("android_place_large_multiplier"));
            this.f2121b.j0(this.f2120a.a("android_min_accuracy"));
            this.f2121b.i0(this.f2120a.a("android_max_entry_accuracy"));
            this.f2121b.f0(this.f2120a.a("android_exit_hysteresis"));
            this.f2121b.e0(this.f2120a.a("android_entry_buffer"));
            this.f2121b.d0(this.f2120a.a("android_assumed_min_speed"));
            this.f2121b.k0(this.f2120a.a("android_place_default_exit_delay"));
            this.f2121b.g0(this.f2120a.a("android_location_default_cycle_interval"));
            this.f2121b.h0(this.f2120a.a("android_location_not_traveling_interval"));
        }
        return this.f2121b;
    }

    public final void g(k kVar, String... strArr) {
        this.f2120a.e(kVar, strArr);
    }

    public final void h(Ob.b bVar) {
        if (bVar != null) {
            this.f2121b = bVar;
            this.f2120a.j("arrivalRSSI", bVar.o());
            this.f2120a.j("departureRSSI", bVar.x());
            this.f2120a.c("departureIntervalInForegroundInMillis", bVar.w());
            this.f2120a.c("departureIntervalInBackgroundInMillis", bVar.v());
            this.f2120a.f("allowKitKat", bVar.S());
            this.f2120a.j("smoothingWindow", bVar.K());
            this.f2120a.c("configFetchIntervalInMillis", bVar.u());
            this.f2120a.c("sightingsUploadIntervalInMillis", bVar.J());
            this.f2120a.c("clientStateUploadIntervalInMillis", bVar.t());
            this.f2120a.c("establishedLocationUploadIntervalInMillis", bVar.B());
            this.f2120a.j("establishedLocationMinDurationInMillis", bVar.A());
            this.f2120a.j("establishedLocationMaxCountToSend", bVar.z());
            this.f2120a.f("allowGeofence", bVar.R());
            this.f2120a.f("allowEstablishedLocations", bVar.Q());
            this.f2120a.f("allowProximity", bVar.T());
            this.f2120a.f("allowCommunicate", bVar.P());
            this.f2120a.f("storeSightingLocation", bVar.V());
            this.f2120a.f("sendPlaceStateToServer", bVar.W());
            this.f2120a.f("allowCollectIDFA", bVar.O());
            this.f2120a.f("collectBreadcrumb", bVar.U());
            this.f2120a.c("breadcrumbsMinFixInterval", bVar.r());
            this.f2120a.d("breadcrumbsBigDelta", bVar.q());
            this.f2120a.c("breadcrumbsUploadIntervalInMillis", bVar.s());
            this.f2120a.a("ibeaconToResolve", bVar.N());
            this.f2120a.j("foregroundScanMode", bVar.C());
            this.f2120a.j("backgroundScanMode", bVar.p());
            this.f2120a.a("scanParametersConfiguration", bVar.I());
            this.f2120a.g("thirdPartyBeaconScanSchedule", bVar.L());
            this.f2120a.f("reportThirdPartySightingOnResolveWhenScheduleIsoff", bVar.H());
            this.f2120a.c("thirdPartySightingIntervalInMillis", bVar.M());
            this.f2120a.g("overrideGeofence", bVar.F());
            this.f2120a.g("overrideProximity", bVar.G());
            this.f2120a.g("overrideEstablishedLocations", bVar.E());
            this.f2120a.g("overrideCollectIDFA", bVar.D());
            this.f2120a.g("diagnosticsKey", bVar.y());
            this.f2120a.j("android_place_small_size", bVar.n());
            this.f2120a.d("android_place_small_multiplier", bVar.m());
            this.f2120a.j("android_place_medium_size", bVar.l());
            this.f2120a.d("android_place_medium_multiplier", bVar.k());
            this.f2120a.j("android_place_large_size", bVar.j());
            this.f2120a.d("android_place_large_multiplier", bVar.i());
            this.f2120a.j("android_min_accuracy", bVar.g());
            this.f2120a.j("android_max_entry_accuracy", bVar.f());
            this.f2120a.j("android_exit_hysteresis", bVar.c());
            this.f2120a.j("android_entry_buffer", bVar.b());
            this.f2120a.j("android_assumed_min_speed", bVar.a());
            this.f2120a.j("android_place_default_exit_delay", bVar.h());
            this.f2120a.j("android_location_default_cycle_interval", bVar.d());
            this.f2120a.j("android_location_not_traveling_interval", bVar.e());
        }
    }

    public b(l lVar) {
        this.f2120a = lVar;
        h(e());
    }

    public final Eb.f A() {
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

    public final Eb.f x() {
        String strF = e().F();
        if (strF == null) {
            strF = "default";
        }
        return d(strF);
    }

    public final Eb.f y() {
        String strG = e().G();
        if (strG == null) {
            strG = "default";
        }
        return d(strG);
    }

    public final Eb.f z() {
        String strE = e().E();
        if (strE == null) {
            strE = "default";
        }
        return d(strE);
    }
}
