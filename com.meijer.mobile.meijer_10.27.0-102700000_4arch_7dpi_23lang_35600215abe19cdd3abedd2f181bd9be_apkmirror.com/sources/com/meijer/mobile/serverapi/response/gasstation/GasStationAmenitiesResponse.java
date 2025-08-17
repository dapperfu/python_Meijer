package com.meijer.mobile.serverapi.response.gasstation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;
import ok.GasStationAmenity;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/serverapi/response/gasstation/GasStationAmenitiesResponse;", "", "", "Lok/d;", "amenitiesList", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/meijer/mobile/serverapi/response/gasstation/GasStationAmenitiesResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAmenitiesList", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GasStationAmenitiesResponse {
    public static final int $stable = 8;

    @InterfaceC15617c("amenitiesList")
    private final List<GasStationAmenity> amenitiesList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GasStationAmenitiesResponse copy$default(GasStationAmenitiesResponse gasStationAmenitiesResponse, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = gasStationAmenitiesResponse.amenitiesList;
        }
        return gasStationAmenitiesResponse.copy(list);
    }

    public final List<GasStationAmenity> component1() {
        return this.amenitiesList;
    }

    public final GasStationAmenitiesResponse copy(List<GasStationAmenity> amenitiesList) {
        Intrinsics.j(amenitiesList, "amenitiesList");
        return new GasStationAmenitiesResponse(amenitiesList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GasStationAmenitiesResponse) && Intrinsics.e(this.amenitiesList, ((GasStationAmenitiesResponse) other).amenitiesList);
    }

    public int hashCode() {
        return this.amenitiesList.hashCode();
    }

    public String toString() {
        return "GasStationAmenitiesResponse(amenitiesList=" + this.amenitiesList + ')';
    }

    public GasStationAmenitiesResponse(List<GasStationAmenity> amenitiesList) {
        Intrinsics.j(amenitiesList, "amenitiesList");
        this.amenitiesList = amenitiesList;
    }

    public final List<GasStationAmenity> getAmenitiesList() {
        return this.amenitiesList;
    }
}
