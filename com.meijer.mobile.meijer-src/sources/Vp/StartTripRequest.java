package Vp;

import Xp.ShopAndScanStore;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b!\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b#\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010'¨\u0006("}, d2 = {"LVp/f;", "", "", "digitalId", "", "mPerksBarcode", "LXp/e;", PlaceTypes.STORE, "mmaAppVersion", "osVersion", "phoneModel", "deviceId", "", "isGreenville", "<init>", "(JLjava/lang/String;LXp/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "Ljava/lang/String;", "c", "LXp/e;", "f", "()LXp/e;", "d", "e", "getPhoneModel", "g", "h", "Z", "()Z", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vp.f, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class StartTripRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long digitalId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mPerksBarcode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopAndScanStore store;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mmaAppVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String osVersion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneModel;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGreenville;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartTripRequest)) {
            return false;
        }
        StartTripRequest startTripRequest = (StartTripRequest) other;
        return this.digitalId == startTripRequest.digitalId && Intrinsics.e(this.mPerksBarcode, startTripRequest.mPerksBarcode) && Intrinsics.e(this.store, startTripRequest.store) && Intrinsics.e(this.mmaAppVersion, startTripRequest.mmaAppVersion) && Intrinsics.e(this.osVersion, startTripRequest.osVersion) && Intrinsics.e(this.phoneModel, startTripRequest.phoneModel) && Intrinsics.e(this.deviceId, startTripRequest.deviceId) && this.isGreenville == startTripRequest.isGreenville;
    }

    public StartTripRequest(long j10, String mPerksBarcode, ShopAndScanStore store, String mmaAppVersion, String osVersion, String phoneModel, String deviceId, boolean z10) {
        Intrinsics.j(mPerksBarcode, "mPerksBarcode");
        Intrinsics.j(store, "store");
        Intrinsics.j(mmaAppVersion, "mmaAppVersion");
        Intrinsics.j(osVersion, "osVersion");
        Intrinsics.j(phoneModel, "phoneModel");
        Intrinsics.j(deviceId, "deviceId");
        this.digitalId = j10;
        this.mPerksBarcode = mPerksBarcode;
        this.store = store;
        this.mmaAppVersion = mmaAppVersion;
        this.osVersion = osVersion;
        this.phoneModel = phoneModel;
        this.deviceId = deviceId;
        this.isGreenville = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: b, reason: from getter */
    public final long getDigitalId() {
        return this.digitalId;
    }

    /* renamed from: c, reason: from getter */
    public final String getMPerksBarcode() {
        return this.mPerksBarcode;
    }

    /* renamed from: d, reason: from getter */
    public final String getMmaAppVersion() {
        return this.mmaAppVersion;
    }

    /* renamed from: e, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: f, reason: from getter */
    public final ShopAndScanStore getStore() {
        return this.store;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsGreenville() {
        return this.isGreenville;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.digitalId) * 31) + this.mPerksBarcode.hashCode()) * 31) + this.store.hashCode()) * 31) + this.mmaAppVersion.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.phoneModel.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + Boolean.hashCode(this.isGreenville);
    }

    public String toString() {
        return "StartTripRequest(digitalId=" + this.digitalId + ", mPerksBarcode=" + this.mPerksBarcode + ", store=" + this.store + ", mmaAppVersion=" + this.mmaAppVersion + ", osVersion=" + this.osVersion + ", phoneModel=" + this.phoneModel + ", deviceId=" + this.deviceId + ", isGreenville=" + this.isGreenville + ')';
    }
}
