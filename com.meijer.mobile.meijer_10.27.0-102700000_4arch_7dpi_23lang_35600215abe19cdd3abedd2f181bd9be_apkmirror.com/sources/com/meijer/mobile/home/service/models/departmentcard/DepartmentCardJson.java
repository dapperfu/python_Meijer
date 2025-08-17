package com.meijer.mobile.home.service.models.departmentcard;

import com.meijer.mobile.home.service.models.homecard.HomeCardErrorResponse;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJL\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, d2 = {"Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardJson;", "", "Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardInfoJson;", "card", "Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentDataJson;", "data", "", "type", PreferencesHelper.PREF_ID, "Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;", "error", "<init>", "(Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardInfoJson;Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentDataJson;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;)V", "copy", "(Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardInfoJson;Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentDataJson;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;)Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardInfoJson;", "()Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardInfoJson;", "b", "Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentDataJson;", "()Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentDataJson;", "c", "Ljava/lang/String;", "e", "d", "Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;", "()Lcom/meijer/mobile/home/service/models/homecard/HomeCardErrorResponse;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DepartmentCardJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DepartmentCardInfoJson card;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final DepartmentDataJson data;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final HomeCardErrorResponse error;

    public DepartmentCardJson() {
        this(null, null, null, null, null, 31, null);
    }

    public final DepartmentCardJson copy(@g(name = "card") DepartmentCardInfoJson card, @g(name = "data") DepartmentDataJson data, @g(name = "type") String type, @g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "error") HomeCardErrorResponse error) {
        return new DepartmentCardJson(card, data, type, id2, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DepartmentCardJson)) {
            return false;
        }
        DepartmentCardJson departmentCardJson = (DepartmentCardJson) other;
        return Intrinsics.e(this.card, departmentCardJson.card) && Intrinsics.e(this.data, departmentCardJson.data) && Intrinsics.e(this.type, departmentCardJson.type) && Intrinsics.e(this.id, departmentCardJson.id) && Intrinsics.e(this.error, departmentCardJson.error);
    }

    public int hashCode() {
        DepartmentCardInfoJson departmentCardInfoJson = this.card;
        int iHashCode = (departmentCardInfoJson == null ? 0 : departmentCardInfoJson.hashCode()) * 31;
        DepartmentDataJson departmentDataJson = this.data;
        int iHashCode2 = (iHashCode + (departmentDataJson == null ? 0 : departmentDataJson.hashCode())) * 31;
        String str = this.type;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HomeCardErrorResponse homeCardErrorResponse = this.error;
        return iHashCode4 + (homeCardErrorResponse != null ? homeCardErrorResponse.hashCode() : 0);
    }

    public String toString() {
        return "DepartmentCardJson(card=" + this.card + ", data=" + this.data + ", type=" + this.type + ", id=" + this.id + ", error=" + this.error + ')';
    }

    public DepartmentCardJson(@g(name = "card") DepartmentCardInfoJson departmentCardInfoJson, @g(name = "data") DepartmentDataJson departmentDataJson, @g(name = "type") String str, @g(name = PreferencesHelper.PREF_ID) String str2, @g(name = "error") HomeCardErrorResponse homeCardErrorResponse) {
        this.card = departmentCardInfoJson;
        this.data = departmentDataJson;
        this.type = str;
        this.id = str2;
        this.error = homeCardErrorResponse;
    }

    /* renamed from: a, reason: from getter */
    public final DepartmentCardInfoJson getCard() {
        return this.card;
    }

    /* renamed from: b, reason: from getter */
    public final DepartmentDataJson getData() {
        return this.data;
    }

    /* renamed from: c, reason: from getter */
    public final HomeCardErrorResponse getError() {
        return this.error;
    }

    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public /* synthetic */ DepartmentCardJson(DepartmentCardInfoJson departmentCardInfoJson, DepartmentDataJson departmentDataJson, String str, String str2, HomeCardErrorResponse homeCardErrorResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : departmentCardInfoJson, (i10 & 2) != 0 ? null : departmentDataJson, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : homeCardErrorResponse);
    }
}
