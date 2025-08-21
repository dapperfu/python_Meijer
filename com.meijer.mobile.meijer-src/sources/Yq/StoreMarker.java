package Yq;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.MarkerState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pk.StoreDetails;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0005\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b \u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b\u001d\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0019\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b#\u0010,¨\u0006-"}, d2 = {"LYq/e;", "", "Lpk/h;", "storeDetails", "", "isPreferredStore", "", "title", "snippet", "markerId", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "drawable", "Lcom/google/maps/android/compose/MarkerState;", "markerState", "<init>", "(Lpk/h;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;ILcom/google/maps/android/compose/MarkerState;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lpk/h;", "getStoreDetails", "()Lpk/h;", "b", "Z", "()Z", "c", "Ljava/lang/String;", "f", "d", "e", "Lcom/google/android/gms/maps/model/LatLng;", "()Lcom/google/android/gms/maps/model/LatLng;", "g", "I", "()Ljava/lang/Integer;", "h", "Lcom/google/maps/android/compose/MarkerState;", "()Lcom/google/maps/android/compose/MarkerState;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Yq.e, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class StoreMarker {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final StoreDetails storeDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPreferredStore;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String snippet;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String markerId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LatLng latLng;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int drawable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final MarkerState markerState;

    public StoreMarker(StoreDetails storeDetails, boolean z10, String str, String str2, String str3, LatLng latLng, int i10, MarkerState markerState) {
        Intrinsics.j(storeDetails, "storeDetails");
        this.storeDetails = storeDetails;
        this.isPreferredStore = z10;
        this.title = str;
        this.snippet = str2;
        this.markerId = str3;
        this.latLng = latLng;
        this.drawable = i10;
        this.markerState = markerState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreMarker)) {
            return false;
        }
        StoreMarker storeMarker = (StoreMarker) other;
        return Intrinsics.e(this.storeDetails, storeMarker.storeDetails) && this.isPreferredStore == storeMarker.isPreferredStore && Intrinsics.e(this.title, storeMarker.title) && Intrinsics.e(this.snippet, storeMarker.snippet) && Intrinsics.e(this.markerId, storeMarker.markerId) && Intrinsics.e(this.latLng, storeMarker.latLng) && this.drawable == storeMarker.drawable && Intrinsics.e(this.markerState, storeMarker.markerState);
    }

    public Integer a() {
        return Integer.valueOf(this.drawable);
    }

    /* renamed from: b, reason: from getter */
    public LatLng getLatLng() {
        return this.latLng;
    }

    /* renamed from: c, reason: from getter */
    public String getMarkerId() {
        return this.markerId;
    }

    /* renamed from: d, reason: from getter */
    public MarkerState getMarkerState() {
        return this.markerState;
    }

    /* renamed from: e, reason: from getter */
    public String getSnippet() {
        return this.snippet;
    }

    /* renamed from: f, reason: from getter */
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((this.storeDetails.hashCode() * 31) + Boolean.hashCode(this.isPreferredStore)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.snippet;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.markerId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LatLng latLng = this.latLng;
        int iHashCode5 = (((iHashCode4 + (latLng == null ? 0 : latLng.hashCode())) * 31) + Integer.hashCode(this.drawable)) * 31;
        MarkerState markerState = this.markerState;
        return iHashCode5 + (markerState != null ? markerState.hashCode() : 0);
    }

    public String toString() {
        return "StoreMarker(storeDetails=" + this.storeDetails + ", isPreferredStore=" + this.isPreferredStore + ", title=" + this.title + ", snippet=" + this.snippet + ", markerId=" + this.markerId + ", latLng=" + this.latLng + ", drawable=" + this.drawable + ", markerState=" + this.markerState + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StoreMarker(StoreDetails storeDetails, boolean z10, String str, String str2, String str3, LatLng latLng, int i10, MarkerState markerState, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        int i12;
        MarkerState markerStateInvoke;
        boolean z11 = (i11 & 2) != 0 ? false : z10;
        String name = (i11 & 4) != 0 ? storeDetails.getName() : str;
        String streetAddress = (i11 & 8) != 0 ? storeDetails.getStreetAddress() : str2;
        String str4 = (i11 & 16) != 0 ? null : str3;
        LatLng latLngA = (i11 & 32) != 0 ? f.a(storeDetails) : latLng;
        if ((i11 & 64) == 0) {
            i12 = i10;
        } else if (z11) {
            i12 = Vq.b.f40129d;
        } else {
            i12 = Vq.b.f40130e;
        }
        if ((i11 & 128) != 0) {
            markerStateInvoke = latLngA != null ? MarkerState.INSTANCE.invoke(latLngA) : null;
        } else {
            markerStateInvoke = markerState;
        }
        this(storeDetails, z11, name, streetAddress, str4, latLngA, i12, markerStateInvoke);
    }
}
