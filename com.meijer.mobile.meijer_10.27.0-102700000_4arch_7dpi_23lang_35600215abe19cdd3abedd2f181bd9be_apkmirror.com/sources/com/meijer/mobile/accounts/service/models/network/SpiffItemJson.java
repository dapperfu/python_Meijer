package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJL\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u001b\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001d\u0010\u0019R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u0019R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001c\u0010\r\"\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/SpiffItemJson;", "", "", "name", "description", "displayEndDate", "redemptionEndDate", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/SpiffItemJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "setName", "(Ljava/lang/String;)V", "b", "setDescription", "c", "setDisplayEndDate", "e", "setRedemptionEndDate", "setImageUrl", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SpiffItemJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String displayEndDate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String redemptionEndDate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String imageUrl;

    public SpiffItemJson() {
        this(null, null, null, null, null, 31, null);
    }

    public final SpiffItemJson copy(@g(name = "name") String name, @g(name = "description") String description, @g(name = "displayEndDate") String displayEndDate, @g(name = "redemptionEndDate") String redemptionEndDate, @g(name = "imageUrl") String imageUrl) {
        return new SpiffItemJson(name, description, displayEndDate, redemptionEndDate, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpiffItemJson)) {
            return false;
        }
        SpiffItemJson spiffItemJson = (SpiffItemJson) other;
        return Intrinsics.e(this.name, spiffItemJson.name) && Intrinsics.e(this.description, spiffItemJson.description) && Intrinsics.e(this.displayEndDate, spiffItemJson.displayEndDate) && Intrinsics.e(this.redemptionEndDate, spiffItemJson.redemptionEndDate) && Intrinsics.e(this.imageUrl, spiffItemJson.imageUrl);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayEndDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.redemptionEndDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imageUrl;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "SpiffItemJson(name=" + this.name + ", description=" + this.description + ", displayEndDate=" + this.displayEndDate + ", redemptionEndDate=" + this.redemptionEndDate + ", imageUrl=" + this.imageUrl + ')';
    }

    public SpiffItemJson(@g(name = "name") String str, @g(name = "description") String str2, @g(name = "displayEndDate") String str3, @g(name = "redemptionEndDate") String str4, @g(name = "imageUrl") String str5) {
        this.name = str;
        this.description = str2;
        this.displayEndDate = str3;
        this.redemptionEndDate = str4;
        this.imageUrl = str5;
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getDisplayEndDate() {
        return this.displayEndDate;
    }

    /* renamed from: c, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: e, reason: from getter */
    public final String getRedemptionEndDate() {
        return this.redemptionEndDate;
    }

    public /* synthetic */ SpiffItemJson(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
