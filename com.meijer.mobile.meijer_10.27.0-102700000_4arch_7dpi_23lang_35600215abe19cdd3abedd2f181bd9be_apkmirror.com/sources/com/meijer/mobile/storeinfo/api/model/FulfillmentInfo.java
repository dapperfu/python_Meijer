package com.meijer.mobile.storeinfo.api.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ok.FulfillmentInfoModel;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\u0016BO\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJX\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/FulfillmentInfo;", "", "", "unitId", "", "fulfillmentTypeName", "fulfillmentTypeId", "fulfillmentPartnerName", "fulfillmentPartnerId", "", "isEnabled", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/meijer/mobile/storeinfo/api/model/FulfillmentInfo;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "d", "c", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FulfillmentInfo {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer unitId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentTypeName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer fulfillmentTypeId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentPartnerName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer fulfillmentPartnerId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isEnabled;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/FulfillmentInfo$a;", "", "<init>", "()V", "Lcom/meijer/mobile/storeinfo/api/model/FulfillmentInfo;", "Lok/c;", "a", "(Lcom/meijer/mobile/storeinfo/api/model/FulfillmentInfo;)Lok/c;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.storeinfo.api.model.FulfillmentInfo$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FulfillmentInfoModel a(FulfillmentInfo fulfillmentInfo) {
            Intrinsics.j(fulfillmentInfo, "<this>");
            return new FulfillmentInfoModel(fulfillmentInfo.getUnitId(), fulfillmentInfo.getFulfillmentTypeName(), fulfillmentInfo.getFulfillmentTypeId(), fulfillmentInfo.getFulfillmentPartnerName(), fulfillmentInfo.getFulfillmentPartnerId(), fulfillmentInfo.getIsEnabled());
        }
    }

    public FulfillmentInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final FulfillmentInfo copy(@g(name = "UnitId") Integer unitId, @g(name = "FulfillmentTypeName") String fulfillmentTypeName, @g(name = "FulfillmentTypeId") Integer fulfillmentTypeId, @g(name = "FulfillmentPartnerName") String fulfillmentPartnerName, @g(name = "FulfillmentPartnerId") Integer fulfillmentPartnerId, @g(name = "IsEnabled") Boolean isEnabled) {
        return new FulfillmentInfo(unitId, fulfillmentTypeName, fulfillmentTypeId, fulfillmentPartnerName, fulfillmentPartnerId, isEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentInfo)) {
            return false;
        }
        FulfillmentInfo fulfillmentInfo = (FulfillmentInfo) other;
        return Intrinsics.e(this.unitId, fulfillmentInfo.unitId) && Intrinsics.e(this.fulfillmentTypeName, fulfillmentInfo.fulfillmentTypeName) && Intrinsics.e(this.fulfillmentTypeId, fulfillmentInfo.fulfillmentTypeId) && Intrinsics.e(this.fulfillmentPartnerName, fulfillmentInfo.fulfillmentPartnerName) && Intrinsics.e(this.fulfillmentPartnerId, fulfillmentInfo.fulfillmentPartnerId) && Intrinsics.e(this.isEnabled, fulfillmentInfo.isEnabled);
    }

    public int hashCode() {
        Integer num = this.unitId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.fulfillmentTypeName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.fulfillmentTypeId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.fulfillmentPartnerName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.fulfillmentPartnerId;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "FulfillmentInfo(unitId=" + this.unitId + ", fulfillmentTypeName=" + this.fulfillmentTypeName + ", fulfillmentTypeId=" + this.fulfillmentTypeId + ", fulfillmentPartnerName=" + this.fulfillmentPartnerName + ", fulfillmentPartnerId=" + this.fulfillmentPartnerId + ", isEnabled=" + this.isEnabled + ')';
    }

    public FulfillmentInfo(@g(name = "UnitId") Integer num, @g(name = "FulfillmentTypeName") String str, @g(name = "FulfillmentTypeId") Integer num2, @g(name = "FulfillmentPartnerName") String str2, @g(name = "FulfillmentPartnerId") Integer num3, @g(name = "IsEnabled") Boolean bool) {
        this.unitId = num;
        this.fulfillmentTypeName = str;
        this.fulfillmentTypeId = num2;
        this.fulfillmentPartnerName = str2;
        this.fulfillmentPartnerId = num3;
        this.isEnabled = bool;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getFulfillmentPartnerId() {
        return this.fulfillmentPartnerId;
    }

    /* renamed from: b, reason: from getter */
    public final String getFulfillmentPartnerName() {
        return this.fulfillmentPartnerName;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getFulfillmentTypeId() {
        return this.fulfillmentTypeId;
    }

    /* renamed from: d, reason: from getter */
    public final String getFulfillmentTypeName() {
        return this.fulfillmentTypeName;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getUnitId() {
        return this.unitId;
    }

    /* renamed from: f, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public /* synthetic */ FulfillmentInfo(Integer num, String str, Integer num2, String str2, Integer num3, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? 0 : num2, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? 0 : num3, (i10 & 32) != 0 ? Boolean.FALSE : bool);
    }
}
