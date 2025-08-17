package com.meijer.mobile.accounts.service.models.network;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016JÊ\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b(\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b+\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010\u001aR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b$\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b!\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b3\u0010\u001aR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b0\u0010\u001aR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\"\u001a\u0004\b/\u0010\u001aR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\"\u001a\u0004\b-\u0010\u001aR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b4\u0010\u001aR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b5\u0010\u001a¨\u00066"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/PreferenceResponseJson;", "", "", "preferenceKey", "", "values", "name", "description", "groupName", "groupKey", "type", "allowedValues", "", "allowMultipleValues", "updatedAt", "displayHint", "minValue", "maxValue", "maxLength", "updatedBy", "updatedVia", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/PreferenceResponseJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "k", "b", "Ljava/util/List;", "p", "()Ljava/util/List;", "c", "j", "d", "e", "f", "g", "l", "h", "i", "Z", "()Z", "m", "n", "o", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PreferenceResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preferenceKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> values;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String groupName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String groupKey;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> allowedValues;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowMultipleValues;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedAt;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayHint;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String minValue;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String maxValue;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String maxLength;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedBy;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedVia;

    public PreferenceResponseJson(@g(name = "preferenceKey") String preferenceKey, @g(name = "values") List<String> values, @g(name = "name") String name, @g(name = "description") String description, @g(name = "groupName") String groupName, @g(name = "groupKey") String groupKey, @g(name = "type") String type, @g(name = "allowedValues") List<String> allowedValues, @g(name = "allowMultipleValues") boolean z10, @g(name = "updatedAt") String str, @g(name = "displayHint") String str2, @g(name = "minValue") String str3, @g(name = "maxValue") String str4, @g(name = "maxLength") String str5, @g(name = "updatedBy") String str6, @g(name = "updatedVia") String str7) {
        Intrinsics.j(preferenceKey, "preferenceKey");
        Intrinsics.j(values, "values");
        Intrinsics.j(name, "name");
        Intrinsics.j(description, "description");
        Intrinsics.j(groupName, "groupName");
        Intrinsics.j(groupKey, "groupKey");
        Intrinsics.j(type, "type");
        Intrinsics.j(allowedValues, "allowedValues");
        this.preferenceKey = preferenceKey;
        this.values = values;
        this.name = name;
        this.description = description;
        this.groupName = groupName;
        this.groupKey = groupKey;
        this.type = type;
        this.allowedValues = allowedValues;
        this.allowMultipleValues = z10;
        this.updatedAt = str;
        this.displayHint = str2;
        this.minValue = str3;
        this.maxValue = str4;
        this.maxLength = str5;
        this.updatedBy = str6;
        this.updatedVia = str7;
    }

    public final PreferenceResponseJson copy(@g(name = "preferenceKey") String preferenceKey, @g(name = "values") List<String> values, @g(name = "name") String name, @g(name = "description") String description, @g(name = "groupName") String groupName, @g(name = "groupKey") String groupKey, @g(name = "type") String type, @g(name = "allowedValues") List<String> allowedValues, @g(name = "allowMultipleValues") boolean allowMultipleValues, @g(name = "updatedAt") String updatedAt, @g(name = "displayHint") String displayHint, @g(name = "minValue") String minValue, @g(name = "maxValue") String maxValue, @g(name = "maxLength") String maxLength, @g(name = "updatedBy") String updatedBy, @g(name = "updatedVia") String updatedVia) {
        Intrinsics.j(preferenceKey, "preferenceKey");
        Intrinsics.j(values, "values");
        Intrinsics.j(name, "name");
        Intrinsics.j(description, "description");
        Intrinsics.j(groupName, "groupName");
        Intrinsics.j(groupKey, "groupKey");
        Intrinsics.j(type, "type");
        Intrinsics.j(allowedValues, "allowedValues");
        return new PreferenceResponseJson(preferenceKey, values, name, description, groupName, groupKey, type, allowedValues, allowMultipleValues, updatedAt, displayHint, minValue, maxValue, maxLength, updatedBy, updatedVia);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferenceResponseJson)) {
            return false;
        }
        PreferenceResponseJson preferenceResponseJson = (PreferenceResponseJson) other;
        return Intrinsics.e(this.preferenceKey, preferenceResponseJson.preferenceKey) && Intrinsics.e(this.values, preferenceResponseJson.values) && Intrinsics.e(this.name, preferenceResponseJson.name) && Intrinsics.e(this.description, preferenceResponseJson.description) && Intrinsics.e(this.groupName, preferenceResponseJson.groupName) && Intrinsics.e(this.groupKey, preferenceResponseJson.groupKey) && Intrinsics.e(this.type, preferenceResponseJson.type) && Intrinsics.e(this.allowedValues, preferenceResponseJson.allowedValues) && this.allowMultipleValues == preferenceResponseJson.allowMultipleValues && Intrinsics.e(this.updatedAt, preferenceResponseJson.updatedAt) && Intrinsics.e(this.displayHint, preferenceResponseJson.displayHint) && Intrinsics.e(this.minValue, preferenceResponseJson.minValue) && Intrinsics.e(this.maxValue, preferenceResponseJson.maxValue) && Intrinsics.e(this.maxLength, preferenceResponseJson.maxLength) && Intrinsics.e(this.updatedBy, preferenceResponseJson.updatedBy) && Intrinsics.e(this.updatedVia, preferenceResponseJson.updatedVia);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.preferenceKey.hashCode() * 31) + this.values.hashCode()) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.groupName.hashCode()) * 31) + this.groupKey.hashCode()) * 31) + this.type.hashCode()) * 31) + this.allowedValues.hashCode()) * 31) + Boolean.hashCode(this.allowMultipleValues)) * 31;
        String str = this.updatedAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayHint;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.minValue;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maxValue;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.maxLength;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.updatedBy;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.updatedVia;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "PreferenceResponseJson(preferenceKey=" + this.preferenceKey + ", values=" + this.values + ", name=" + this.name + ", description=" + this.description + ", groupName=" + this.groupName + ", groupKey=" + this.groupKey + ", type=" + this.type + ", allowedValues=" + this.allowedValues + ", allowMultipleValues=" + this.allowMultipleValues + ", updatedAt=" + this.updatedAt + ", displayHint=" + this.displayHint + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", maxLength=" + this.maxLength + ", updatedBy=" + this.updatedBy + ", updatedVia=" + this.updatedVia + ')';
    }

    /* renamed from: a, reason: from getter */
    public final boolean getAllowMultipleValues() {
        return this.allowMultipleValues;
    }

    public final List<String> b() {
        return this.allowedValues;
    }

    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: d, reason: from getter */
    public final String getDisplayHint() {
        return this.displayHint;
    }

    /* renamed from: e, reason: from getter */
    public final String getGroupKey() {
        return this.groupKey;
    }

    /* renamed from: f, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* renamed from: g, reason: from getter */
    public final String getMaxLength() {
        return this.maxLength;
    }

    /* renamed from: h, reason: from getter */
    public final String getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: i, reason: from getter */
    public final String getMinValue() {
        return this.minValue;
    }

    /* renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: k, reason: from getter */
    public final String getPreferenceKey() {
        return this.preferenceKey;
    }

    /* renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: m, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: n, reason: from getter */
    public final String getUpdatedBy() {
        return this.updatedBy;
    }

    /* renamed from: o, reason: from getter */
    public final String getUpdatedVia() {
        return this.updatedVia;
    }

    public final List<String> p() {
        return this.values;
    }

    public /* synthetic */ PreferenceResponseJson(String str, List list, String str2, String str3, String str4, String str5, String str6, List list2, boolean z10, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2, str3, str4, str5, str6, list2, z10, str7, (i10 & 1024) != 0 ? null : str8, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str9, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str10, (i10 & 8192) != 0 ? null : str11, (i10 & 16384) != 0 ? null : str12, (i10 & 32768) != 0 ? null : str13);
    }
}
