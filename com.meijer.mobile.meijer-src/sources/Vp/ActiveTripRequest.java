package Vp;

import Xp.ShopAndScanStore;
import com.google.android.libraries.places.api.model.PlaceTypes;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"LVp/a;", "", "", "Lcom/meijer/mobile/shopandscan/domain/model/MPerksBarcode;", "mPerksBarcode", "LXp/e;", PlaceTypes.STORE, "j$/time/LocalDateTime", "currentTime", "<init>", "(Ljava/lang/String;LXp/e;Lj$/time/LocalDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LXp/e;", "c", "()LXp/e;", "Lj$/time/LocalDateTime;", "()Lj$/time/LocalDateTime;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vp.a, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ActiveTripRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mPerksBarcode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopAndScanStore store;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime currentTime;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveTripRequest)) {
            return false;
        }
        ActiveTripRequest activeTripRequest = (ActiveTripRequest) other;
        return Intrinsics.e(this.mPerksBarcode, activeTripRequest.mPerksBarcode) && Intrinsics.e(this.store, activeTripRequest.store) && Intrinsics.e(this.currentTime, activeTripRequest.currentTime);
    }

    public ActiveTripRequest(String mPerksBarcode, ShopAndScanStore store, LocalDateTime currentTime) {
        Intrinsics.j(mPerksBarcode, "mPerksBarcode");
        Intrinsics.j(store, "store");
        Intrinsics.j(currentTime, "currentTime");
        this.mPerksBarcode = mPerksBarcode;
        this.store = store;
        this.currentTime = currentTime;
    }

    /* renamed from: a, reason: from getter */
    public final LocalDateTime getCurrentTime() {
        return this.currentTime;
    }

    /* renamed from: b, reason: from getter */
    public final String getMPerksBarcode() {
        return this.mPerksBarcode;
    }

    /* renamed from: c, reason: from getter */
    public final ShopAndScanStore getStore() {
        return this.store;
    }

    public int hashCode() {
        return (((this.mPerksBarcode.hashCode() * 31) + this.store.hashCode()) * 31) + this.currentTime.hashCode();
    }

    public String toString() {
        return "ActiveTripRequest(mPerksBarcode=" + this.mPerksBarcode + ", store=" + this.store + ", currentTime=" + this.currentTime + ')';
    }
}
