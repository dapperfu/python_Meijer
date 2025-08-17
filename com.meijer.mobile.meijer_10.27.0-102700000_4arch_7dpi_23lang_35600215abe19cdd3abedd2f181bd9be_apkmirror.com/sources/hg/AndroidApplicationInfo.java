package hg;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006!"}, d2 = {"Lhg/a;", "", "", "packageName", "versionName", "appBuildVersion", "deviceManufacturer", "Lhg/C;", "currentProcessDetails", "", "appProcessDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhg/C;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "f", "c", "d", "Lhg/C;", "()Lhg/C;", "Ljava/util/List;", "()Ljava/util/List;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: hg.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class AndroidApplicationInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String packageName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String versionName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appBuildVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceManufacturer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProcessDetails currentProcessDetails;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ProcessDetails> appProcessDetails;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) other;
        return Intrinsics.e(this.packageName, androidApplicationInfo.packageName) && Intrinsics.e(this.versionName, androidApplicationInfo.versionName) && Intrinsics.e(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && Intrinsics.e(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer) && Intrinsics.e(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails) && Intrinsics.e(this.appProcessDetails, androidApplicationInfo.appProcessDetails);
    }

    public AndroidApplicationInfo(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, ProcessDetails currentProcessDetails, List<ProcessDetails> appProcessDetails) {
        Intrinsics.j(packageName, "packageName");
        Intrinsics.j(versionName, "versionName");
        Intrinsics.j(appBuildVersion, "appBuildVersion");
        Intrinsics.j(deviceManufacturer, "deviceManufacturer");
        Intrinsics.j(currentProcessDetails, "currentProcessDetails");
        Intrinsics.j(appProcessDetails, "appProcessDetails");
        this.packageName = packageName;
        this.versionName = versionName;
        this.appBuildVersion = appBuildVersion;
        this.deviceManufacturer = deviceManufacturer;
        this.currentProcessDetails = currentProcessDetails;
        this.appProcessDetails = appProcessDetails;
    }

    /* renamed from: a, reason: from getter */
    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    public final List<ProcessDetails> b() {
        return this.appProcessDetails;
    }

    /* renamed from: c, reason: from getter */
    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    /* renamed from: d, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    /* renamed from: e, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: f, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((this.packageName.hashCode() * 31) + this.versionName.hashCode()) * 31) + this.appBuildVersion.hashCode()) * 31) + this.deviceManufacturer.hashCode()) * 31) + this.currentProcessDetails.hashCode()) * 31) + this.appProcessDetails.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.packageName + ", versionName=" + this.versionName + ", appBuildVersion=" + this.appBuildVersion + ", deviceManufacturer=" + this.deviceManufacturer + ", currentProcessDetails=" + this.currentProcessDetails + ", appProcessDetails=" + this.appProcessDetails + ')';
    }
}
