package com.meijer.mobile.accounts.service.models.network;

import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJb\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001d\u0010\u0010¨\u0006!"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceJson;", "", "", "preferenceTypeName", "owningProgramName", "dataTypeName", "preferenceValue", "", "isPreferenceDiscreteChoice", "preferenceCreateTimestamp", "preferenceUpdateTimeStamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "f", "e", "Z", "g", "()Z", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CustomerPreferenceJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preferenceTypeName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String owningProgramName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dataTypeName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preferenceValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPreferenceDiscreteChoice;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preferenceCreateTimestamp;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preferenceUpdateTimeStamp;

    public CustomerPreferenceJson() {
        this(null, null, null, null, false, null, null, l3.f92485d, null);
    }

    public final CustomerPreferenceJson copy(@g(name = "preferenceTypeName") String preferenceTypeName, @g(name = "owningProgramName") String owningProgramName, @g(name = "dataTypeName") String dataTypeName, @g(name = "preferenceValue") String preferenceValue, @g(name = "isPreferenceDiscreteChoice") boolean isPreferenceDiscreteChoice, @g(name = "preferenceCreateTimestamp") String preferenceCreateTimestamp, @g(name = "preferenceUpdateTimeStamp") String preferenceUpdateTimeStamp) {
        return new CustomerPreferenceJson(preferenceTypeName, owningProgramName, dataTypeName, preferenceValue, isPreferenceDiscreteChoice, preferenceCreateTimestamp, preferenceUpdateTimeStamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerPreferenceJson)) {
            return false;
        }
        CustomerPreferenceJson customerPreferenceJson = (CustomerPreferenceJson) other;
        return Intrinsics.e(this.preferenceTypeName, customerPreferenceJson.preferenceTypeName) && Intrinsics.e(this.owningProgramName, customerPreferenceJson.owningProgramName) && Intrinsics.e(this.dataTypeName, customerPreferenceJson.dataTypeName) && Intrinsics.e(this.preferenceValue, customerPreferenceJson.preferenceValue) && this.isPreferenceDiscreteChoice == customerPreferenceJson.isPreferenceDiscreteChoice && Intrinsics.e(this.preferenceCreateTimestamp, customerPreferenceJson.preferenceCreateTimestamp) && Intrinsics.e(this.preferenceUpdateTimeStamp, customerPreferenceJson.preferenceUpdateTimeStamp);
    }

    public int hashCode() {
        String str = this.preferenceTypeName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.owningProgramName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dataTypeName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.preferenceValue;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.isPreferenceDiscreteChoice)) * 31;
        String str5 = this.preferenceCreateTimestamp;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.preferenceUpdateTimeStamp;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "CustomerPreferenceJson(preferenceTypeName=" + this.preferenceTypeName + ", owningProgramName=" + this.owningProgramName + ", dataTypeName=" + this.dataTypeName + ", preferenceValue=" + this.preferenceValue + ", isPreferenceDiscreteChoice=" + this.isPreferenceDiscreteChoice + ", preferenceCreateTimestamp=" + this.preferenceCreateTimestamp + ", preferenceUpdateTimeStamp=" + this.preferenceUpdateTimeStamp + ')';
    }

    public CustomerPreferenceJson(@g(name = "preferenceTypeName") String str, @g(name = "owningProgramName") String str2, @g(name = "dataTypeName") String str3, @g(name = "preferenceValue") String str4, @g(name = "isPreferenceDiscreteChoice") boolean z10, @g(name = "preferenceCreateTimestamp") String str5, @g(name = "preferenceUpdateTimeStamp") String str6) {
        this.preferenceTypeName = str;
        this.owningProgramName = str2;
        this.dataTypeName = str3;
        this.preferenceValue = str4;
        this.isPreferenceDiscreteChoice = z10;
        this.preferenceCreateTimestamp = str5;
        this.preferenceUpdateTimeStamp = str6;
    }

    /* renamed from: a, reason: from getter */
    public final String getDataTypeName() {
        return this.dataTypeName;
    }

    /* renamed from: b, reason: from getter */
    public final String getOwningProgramName() {
        return this.owningProgramName;
    }

    /* renamed from: c, reason: from getter */
    public final String getPreferenceCreateTimestamp() {
        return this.preferenceCreateTimestamp;
    }

    /* renamed from: d, reason: from getter */
    public final String getPreferenceTypeName() {
        return this.preferenceTypeName;
    }

    /* renamed from: e, reason: from getter */
    public final String getPreferenceUpdateTimeStamp() {
        return this.preferenceUpdateTimeStamp;
    }

    /* renamed from: f, reason: from getter */
    public final String getPreferenceValue() {
        return this.preferenceValue;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsPreferenceDiscreteChoice() {
        return this.isPreferenceDiscreteChoice;
    }

    public /* synthetic */ CustomerPreferenceJson(String str, String str2, String str3, String str4, boolean z10, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6);
    }
}
