package com.meijer.mobile.storeinfo.api.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ok.GasStationAmenity;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0014B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ@\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/GasStationAmenities;", "", "", "unitId", "auxiliaryUnitId", "", "amenityType", "amenityGroupType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/storeinfo/api/model/GasStationAmenities;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "c", "Ljava/lang/String;", "e", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GasStationAmenities {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer unitId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer auxiliaryUnitId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String amenityType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String amenityGroupType;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/GasStationAmenities$a;", "", "<init>", "()V", "Lcom/meijer/mobile/storeinfo/api/model/GasStationAmenities;", "Lok/d;", "a", "(Lcom/meijer/mobile/storeinfo/api/model/GasStationAmenities;)Lok/d;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.storeinfo.api.model.GasStationAmenities$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GasStationAmenity a(GasStationAmenities gasStationAmenities) {
            Intrinsics.j(gasStationAmenities, "<this>");
            return new GasStationAmenity(gasStationAmenities.getAmenityType(), gasStationAmenities.getAmenityGroupType(), gasStationAmenities.getAuxiliaryUnitId(), gasStationAmenities.getUnitId());
        }
    }

    public GasStationAmenities() {
        this(null, null, null, null, 15, null);
    }

    public final GasStationAmenities copy(@g(name = "UnitId") Integer unitId, @g(name = "AuxiliaryUnitId") Integer auxiliaryUnitId, @g(name = "AmentityType") String amenityType, @g(name = "AmentityGroupType") String amenityGroupType) {
        return new GasStationAmenities(unitId, auxiliaryUnitId, amenityType, amenityGroupType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GasStationAmenities)) {
            return false;
        }
        GasStationAmenities gasStationAmenities = (GasStationAmenities) other;
        return Intrinsics.e(this.unitId, gasStationAmenities.unitId) && Intrinsics.e(this.auxiliaryUnitId, gasStationAmenities.auxiliaryUnitId) && Intrinsics.e(this.amenityType, gasStationAmenities.amenityType) && Intrinsics.e(this.amenityGroupType, gasStationAmenities.amenityGroupType);
    }

    public int hashCode() {
        Integer num = this.unitId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.auxiliaryUnitId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.amenityType;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.amenityGroupType;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GasStationAmenities(unitId=" + this.unitId + ", auxiliaryUnitId=" + this.auxiliaryUnitId + ", amenityType=" + this.amenityType + ", amenityGroupType=" + this.amenityGroupType + ')';
    }

    public GasStationAmenities(@g(name = "UnitId") Integer num, @g(name = "AuxiliaryUnitId") Integer num2, @g(name = "AmentityType") String str, @g(name = "AmentityGroupType") String str2) {
        this.unitId = num;
        this.auxiliaryUnitId = num2;
        this.amenityType = str;
        this.amenityGroupType = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getAmenityGroupType() {
        return this.amenityGroupType;
    }

    /* renamed from: b, reason: from getter */
    public final String getAmenityType() {
        return this.amenityType;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getAuxiliaryUnitId() {
        return this.auxiliaryUnitId;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getUnitId() {
        return this.unitId;
    }

    public /* synthetic */ GasStationAmenities(Integer num, Integer num2, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : num2, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? "" : str2);
    }
}
