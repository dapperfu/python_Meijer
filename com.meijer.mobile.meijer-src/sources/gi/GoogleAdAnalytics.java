package gi;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lgi/a;", "", "", "adType", "pageType", "adDisplaySize", "adUnitId", "mPerksShopperId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "d", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class GoogleAdAnalytics {

    /* renamed from: f, reason: collision with root package name */
    public static final int f134240f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String adType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String pageType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String adDisplaySize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String adUnitId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mPerksShopperId;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleAdAnalytics)) {
            return false;
        }
        GoogleAdAnalytics googleAdAnalytics = (GoogleAdAnalytics) other;
        return Intrinsics.e(this.adType, googleAdAnalytics.adType) && Intrinsics.e(this.pageType, googleAdAnalytics.pageType) && Intrinsics.e(this.adDisplaySize, googleAdAnalytics.adDisplaySize) && Intrinsics.e(this.adUnitId, googleAdAnalytics.adUnitId) && Intrinsics.e(this.mPerksShopperId, googleAdAnalytics.mPerksShopperId);
    }

    public GoogleAdAnalytics(String adType, String pageType, String adDisplaySize, String adUnitId, String str) {
        Intrinsics.j(adType, "adType");
        Intrinsics.j(pageType, "pageType");
        Intrinsics.j(adDisplaySize, "adDisplaySize");
        Intrinsics.j(adUnitId, "adUnitId");
        this.adType = adType;
        this.pageType = pageType;
        this.adDisplaySize = adDisplaySize;
        this.adUnitId = adUnitId;
        this.mPerksShopperId = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getAdDisplaySize() {
        return this.adDisplaySize;
    }

    /* renamed from: b, reason: from getter */
    public final String getAdType() {
        return this.adType;
    }

    /* renamed from: c, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    /* renamed from: d, reason: from getter */
    public final String getMPerksShopperId() {
        return this.mPerksShopperId;
    }

    /* renamed from: e, reason: from getter */
    public final String getPageType() {
        return this.pageType;
    }

    public int hashCode() {
        int iHashCode = ((((((this.adType.hashCode() * 31) + this.pageType.hashCode()) * 31) + this.adDisplaySize.hashCode()) * 31) + this.adUnitId.hashCode()) * 31;
        String str = this.mPerksShopperId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GoogleAdAnalytics(adType=" + this.adType + ", pageType=" + this.pageType + ", adDisplaySize=" + this.adDisplaySize + ", adUnitId=" + this.adUnitId + ", mPerksShopperId=" + this.mPerksShopperId + ')';
    }
}
