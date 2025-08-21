package b8;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Lb8/j;", "", "", "revision", "", "maxBeaconSizeKib", "maxEventSizeKib", "", "capture", "<init>", "(JIIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "d", "()J", "b", "I", "c", "Z", "()Z", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: b8.j, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ServerConfigurationV4 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long revision;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxBeaconSizeKib;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxEventSizeKib;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean capture;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerConfigurationV4)) {
            return false;
        }
        ServerConfigurationV4 serverConfigurationV4 = (ServerConfigurationV4) other;
        return this.revision == serverConfigurationV4.revision && this.maxBeaconSizeKib == serverConfigurationV4.maxBeaconSizeKib && this.maxEventSizeKib == serverConfigurationV4.maxEventSizeKib && this.capture == serverConfigurationV4.capture;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getCapture() {
        return this.capture;
    }

    /* renamed from: b, reason: from getter */
    public final int getMaxBeaconSizeKib() {
        return this.maxBeaconSizeKib;
    }

    /* renamed from: c, reason: from getter */
    public final int getMaxEventSizeKib() {
        return this.maxEventSizeKib;
    }

    /* renamed from: d, reason: from getter */
    public final long getRevision() {
        return this.revision;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.revision) * 31) + Integer.hashCode(this.maxBeaconSizeKib)) * 31) + Integer.hashCode(this.maxEventSizeKib)) * 31) + Boolean.hashCode(this.capture);
    }

    public String toString() {
        return "ServerConfigurationV4(revision=" + this.revision + ", maxBeaconSizeKib=" + this.maxBeaconSizeKib + ", maxEventSizeKib=" + this.maxEventSizeKib + ", capture=" + this.capture + ')';
    }

    public ServerConfigurationV4(long j10, int i10, int i11, boolean z10) {
        this.revision = j10;
        this.maxBeaconSizeKib = i10;
        this.maxEventSizeKib = i11;
        this.capture = z10;
    }
}
