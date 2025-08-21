package X7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"LX7/a;", "", "", "versionCode", "", "versionName", "<init>", "(JLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: X7.a, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class AppVersion {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long versionCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String versionName;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppVersion)) {
            return false;
        }
        AppVersion appVersion = (AppVersion) other;
        return this.versionCode == appVersion.versionCode && Intrinsics.e(this.versionName, appVersion.versionName);
    }

    /* renamed from: a, reason: from getter */
    public final long getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.versionCode) * 31;
        String str = this.versionName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AppVersion(versionCode=" + this.versionCode + ", versionName=" + this.versionName + ')';
    }

    public AppVersion(long j10, String str) {
        this.versionCode = j10;
        this.versionName = str;
    }
}
