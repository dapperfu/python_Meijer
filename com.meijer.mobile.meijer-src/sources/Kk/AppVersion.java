package Kk;

import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001\u0016B;\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010!\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010$\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010%\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010&\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010'\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b'\u0010\u001e¨\u0006)"}, d2 = {"LKk/a;", "", "", "environment", "", "versionCode", "versionName", "", "isDevMode", "isDebug", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZZ)V", "Lokhttp3/Headers;", "j", "()Lokhttp3/Headers;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "d", "Z", "f", "()Z", "e", "h", "isPlayStore", "g", "i", "isProdBuild", "isInternalProdBuild", "isCertBuild", "isIntBuild", "k", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kk.a, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class AppVersion {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String environment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int versionCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String versionName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDevMode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDebug;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isPlayStore;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isProdBuild;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean isInternalProdBuild;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean isCertBuild;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isIntBuild;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppVersion)) {
            return false;
        }
        AppVersion appVersion = (AppVersion) other;
        return Intrinsics.e(this.environment, appVersion.environment) && this.versionCode == appVersion.versionCode && Intrinsics.e(this.versionName, appVersion.versionName) && this.isDevMode == appVersion.isDevMode && this.isDebug == appVersion.isDebug;
    }

    public AppVersion(String environment, int i10, String versionName, boolean z10, boolean z11) {
        Intrinsics.j(environment, "environment");
        Intrinsics.j(versionName, "versionName");
        this.environment = environment;
        this.versionCode = i10;
        this.versionName = versionName;
        this.isDevMode = z10;
        this.isDebug = z11;
        this.isPlayStore = StringsKt.H("playstore", environment, true);
        this.isProdBuild = StringsKt.H(environment, "prod", true);
        this.isInternalProdBuild = StringsKt.H(environment, "internalProd", true);
        this.isCertBuild = StringsKt.H(environment, "stg", true);
        this.isIntBuild = StringsKt.H(environment, "dev2", true);
    }

    /* renamed from: a, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    /* renamed from: b, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    /* renamed from: c, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsCertBuild() {
        return this.isCertBuild;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsDevMode() {
        return this.isDevMode;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsInternalProdBuild() {
        return this.isInternalProdBuild;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsPlayStore() {
        return this.isPlayStore;
    }

    public int hashCode() {
        return (((((((this.environment.hashCode() * 31) + Integer.hashCode(this.versionCode)) * 31) + this.versionName.hashCode()) * 31) + Boolean.hashCode(this.isDevMode)) * 31) + Boolean.hashCode(this.isDebug);
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsProdBuild() {
        return this.isProdBuild;
    }

    public final Headers j() {
        return Headers.INSTANCE.a(MapsKt.o(TuplesKt.a("Platform", "Android"), TuplesKt.a("Version", this.versionName), TuplesKt.a("Build", String.valueOf(this.versionCode))));
    }

    public String toString() {
        return "AppVersion(environment=" + this.environment + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ", isDevMode=" + this.isDevMode + ", isDebug=" + this.isDebug + ')';
    }
}
