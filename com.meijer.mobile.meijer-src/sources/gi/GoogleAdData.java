package gi;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lgi/d;", "", "LHc/a;", "adRequest", "LGc/e;", "adSize", "", "adSizes", "", "adUnitId", "Lgi/a;", "analytics", "<init>", "(LHc/a;LGc/e;[LGc/e;Ljava/lang/String;Lgi/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHc/a;", "()LHc/a;", "setAdRequest", "(LHc/a;)V", "b", "LGc/e;", "()LGc/e;", "c", "[LGc/e;", "()[LGc/e;", "d", "Ljava/lang/String;", "e", "Lgi/a;", "()Lgi/a;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class GoogleAdData {

    /* renamed from: f, reason: collision with root package name */
    public static final int f134248f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private Hc.a adRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Gc.e adSize;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Gc.e[] adSizes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String adUnitId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final GoogleAdAnalytics analytics;

    public GoogleAdData(Hc.a adRequest, Gc.e eVar, Gc.e[] eVarArr, String adUnitId, GoogleAdAnalytics analytics) {
        Intrinsics.j(adRequest, "adRequest");
        Intrinsics.j(adUnitId, "adUnitId");
        Intrinsics.j(analytics, "analytics");
        this.adRequest = adRequest;
        this.adSize = eVar;
        this.adSizes = eVarArr;
        this.adUnitId = adUnitId;
        this.analytics = analytics;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleAdData)) {
            return false;
        }
        GoogleAdData googleAdData = (GoogleAdData) other;
        return Intrinsics.e(this.adRequest, googleAdData.adRequest) && Intrinsics.e(this.adSize, googleAdData.adSize) && Intrinsics.e(this.adSizes, googleAdData.adSizes) && Intrinsics.e(this.adUnitId, googleAdData.adUnitId) && Intrinsics.e(this.analytics, googleAdData.analytics);
    }

    /* renamed from: a, reason: from getter */
    public final Hc.a getAdRequest() {
        return this.adRequest;
    }

    /* renamed from: b, reason: from getter */
    public final Gc.e getAdSize() {
        return this.adSize;
    }

    /* renamed from: c, reason: from getter */
    public final Gc.e[] getAdSizes() {
        return this.adSizes;
    }

    /* renamed from: d, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    /* renamed from: e, reason: from getter */
    public final GoogleAdAnalytics getAnalytics() {
        return this.analytics;
    }

    public int hashCode() {
        int iHashCode = this.adRequest.hashCode() * 31;
        Gc.e eVar = this.adSize;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Gc.e[] eVarArr = this.adSizes;
        return ((((iHashCode2 + (eVarArr != null ? Arrays.hashCode(eVarArr) : 0)) * 31) + this.adUnitId.hashCode()) * 31) + this.analytics.hashCode();
    }

    public String toString() {
        return "GoogleAdData(adRequest=" + this.adRequest + ", adSize=" + this.adSize + ", adSizes=" + Arrays.toString(this.adSizes) + ", adUnitId=" + this.adUnitId + ", analytics=" + this.analytics + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GoogleAdData(Hc.a aVar, Gc.e eVar, Gc.e[] eVarArr, String str, GoogleAdAnalytics googleAdAnalytics, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        GoogleAdAnalytics googleAdAnalytics2;
        String str2;
        Gc.e[] eVarArr2;
        eVar = (i10 & 2) != 0 ? null : eVar;
        if ((i10 & 4) != 0) {
            googleAdAnalytics2 = googleAdAnalytics;
            str2 = str;
            eVarArr2 = null;
        } else {
            googleAdAnalytics2 = googleAdAnalytics;
            str2 = str;
            eVarArr2 = eVarArr;
        }
        this(aVar, eVar, eVarArr2, str2, googleAdAnalytics2);
    }
}
