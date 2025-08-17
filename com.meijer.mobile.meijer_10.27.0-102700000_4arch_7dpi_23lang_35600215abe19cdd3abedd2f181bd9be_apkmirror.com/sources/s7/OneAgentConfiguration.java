package s7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u7.EnumC17232a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u0018\u0010 R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001b\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010'¨\u0006("}, d2 = {"Ls7/a;", "", "", "version", "applicationId", "beaconUrl", "", "applicationMonitoring", "activityMonitoring", "nativeCrashReporting", "anrReporting", "", "eventThrottlingLimit", "Lu7/a;", "instrumentationFlavor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZILu7/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "c", "d", "Z", "getApplicationMonitoring", "()Z", "e", "f", "g", "I", "i", "Lu7/a;", "()Lu7/a;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: s7.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class OneAgentConfiguration {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String version;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String applicationId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String beaconUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean applicationMonitoring;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean activityMonitoring;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean nativeCrashReporting;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean anrReporting;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int eventThrottlingLimit;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC17232a instrumentationFlavor;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneAgentConfiguration)) {
            return false;
        }
        OneAgentConfiguration oneAgentConfiguration = (OneAgentConfiguration) other;
        return Intrinsics.e(this.version, oneAgentConfiguration.version) && Intrinsics.e(this.applicationId, oneAgentConfiguration.applicationId) && Intrinsics.e(this.beaconUrl, oneAgentConfiguration.beaconUrl) && this.applicationMonitoring == oneAgentConfiguration.applicationMonitoring && this.activityMonitoring == oneAgentConfiguration.activityMonitoring && this.nativeCrashReporting == oneAgentConfiguration.nativeCrashReporting && this.anrReporting == oneAgentConfiguration.anrReporting && this.eventThrottlingLimit == oneAgentConfiguration.eventThrottlingLimit && this.instrumentationFlavor == oneAgentConfiguration.instrumentationFlavor;
    }

    public OneAgentConfiguration(String version, String applicationId, String beaconUrl, boolean z10, boolean z11, boolean z12, boolean z13, int i10, EnumC17232a instrumentationFlavor) {
        Intrinsics.j(version, "version");
        Intrinsics.j(applicationId, "applicationId");
        Intrinsics.j(beaconUrl, "beaconUrl");
        Intrinsics.j(instrumentationFlavor, "instrumentationFlavor");
        this.version = version;
        this.applicationId = applicationId;
        this.beaconUrl = beaconUrl;
        this.applicationMonitoring = z10;
        this.activityMonitoring = z11;
        this.nativeCrashReporting = z12;
        this.anrReporting = z13;
        this.eventThrottlingLimit = i10;
        this.instrumentationFlavor = instrumentationFlavor;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getActivityMonitoring() {
        return this.activityMonitoring;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getAnrReporting() {
        return this.anrReporting;
    }

    /* renamed from: c, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: d, reason: from getter */
    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    /* renamed from: e, reason: from getter */
    public final int getEventThrottlingLimit() {
        return this.eventThrottlingLimit;
    }

    /* renamed from: f, reason: from getter */
    public final EnumC17232a getInstrumentationFlavor() {
        return this.instrumentationFlavor;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getNativeCrashReporting() {
        return this.nativeCrashReporting;
    }

    /* renamed from: h, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((((((((((this.version.hashCode() * 31) + this.applicationId.hashCode()) * 31) + this.beaconUrl.hashCode()) * 31) + Boolean.hashCode(this.applicationMonitoring)) * 31) + Boolean.hashCode(this.activityMonitoring)) * 31) + Boolean.hashCode(this.nativeCrashReporting)) * 31) + Boolean.hashCode(this.anrReporting)) * 31) + Integer.hashCode(this.eventThrottlingLimit)) * 31) + this.instrumentationFlavor.hashCode();
    }

    public String toString() {
        return "OneAgentConfiguration(version=" + this.version + ", applicationId=" + this.applicationId + ", beaconUrl=" + this.beaconUrl + ", applicationMonitoring=" + this.applicationMonitoring + ", activityMonitoring=" + this.activityMonitoring + ", nativeCrashReporting=" + this.nativeCrashReporting + ", anrReporting=" + this.anrReporting + ", eventThrottlingLimit=" + this.eventThrottlingLimit + ", instrumentationFlavor=" + this.instrumentationFlavor + ')';
    }
}
