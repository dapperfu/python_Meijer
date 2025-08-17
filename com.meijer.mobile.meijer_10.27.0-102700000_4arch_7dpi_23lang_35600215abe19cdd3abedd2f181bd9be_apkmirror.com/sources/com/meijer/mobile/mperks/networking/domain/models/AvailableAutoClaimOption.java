package com.meijer.mobile.mperks.networking.domain.models;

import bo.AutoClaimReward;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJb\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010+R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010/R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010/R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010,\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010/R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010,\u001a\u0004\b4\u0010\u0016\"\u0004\b5\u0010/R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010,\u001a\u0004\b6\u0010\u0016\"\u0004\b7\u0010/R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00108\u001a\u0004\b\u000b\u0010\u001c\"\u0004\b9\u0010:R$\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010;\u001a\u0004\b\f\u0010\u001e\"\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/AvailableAutoClaimOption;", "", "", "autoClaimAmount", "", "autoClaimType", "imageURL", "title", "description", "terms", "", "isEnabled", "isSelected", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)V", "Lbo/a;", "toAutoClaimReward$networking_release", "()Lbo/a;", "toAutoClaimReward", "component1", "()D", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Z", "component8", "()Ljava/lang/Boolean;", "copy", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)Lcom/meijer/mobile/mperks/networking/domain/models/AvailableAutoClaimOption;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "D", "getAutoClaimAmount", "setAutoClaimAmount", "(D)V", "Ljava/lang/String;", "getAutoClaimType", "setAutoClaimType", "(Ljava/lang/String;)V", "getImageURL", "setImageURL", "getTitle", "setTitle", "getDescription", "setDescription", "getTerms", "setTerms", "Z", "setEnabled", "(Z)V", "Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AvailableAutoClaimOption {
    private double autoClaimAmount;
    private String autoClaimType;
    private String description;
    private String imageURL;
    private boolean isEnabled;
    private Boolean isSelected;
    private String terms;
    private String title;

    public AvailableAutoClaimOption(@g(name = "autoClaimAmount") double d10, @g(name = "autoClaimType") String autoClaimType, @g(name = "imageURL") String imageURL, @g(name = "title") String title, @g(name = "description") String description, @g(name = "terms") String terms, @g(name = "isEnabled") boolean z10, @g(name = "isSelected") Boolean bool) {
        Intrinsics.j(autoClaimType, "autoClaimType");
        Intrinsics.j(imageURL, "imageURL");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(terms, "terms");
        this.autoClaimAmount = d10;
        this.autoClaimType = autoClaimType;
        this.imageURL = imageURL;
        this.title = title;
        this.description = description;
        this.terms = terms;
        this.isEnabled = z10;
        this.isSelected = bool;
    }

    public static /* synthetic */ AvailableAutoClaimOption copy$default(AvailableAutoClaimOption availableAutoClaimOption, double d10, String str, String str2, String str3, String str4, String str5, boolean z10, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = availableAutoClaimOption.autoClaimAmount;
        }
        double d11 = d10;
        if ((i10 & 2) != 0) {
            str = availableAutoClaimOption.autoClaimType;
        }
        String str6 = str;
        if ((i10 & 4) != 0) {
            str2 = availableAutoClaimOption.imageURL;
        }
        String str7 = str2;
        if ((i10 & 8) != 0) {
            str3 = availableAutoClaimOption.title;
        }
        return availableAutoClaimOption.copy(d11, str6, str7, str3, (i10 & 16) != 0 ? availableAutoClaimOption.description : str4, (i10 & 32) != 0 ? availableAutoClaimOption.terms : str5, (i10 & 64) != 0 ? availableAutoClaimOption.isEnabled : z10, (i10 & 128) != 0 ? availableAutoClaimOption.isSelected : bool);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAutoClaimAmount() {
        return this.autoClaimAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAutoClaimType() {
        return this.autoClaimType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTerms() {
        return this.terms;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    public final AvailableAutoClaimOption copy(@g(name = "autoClaimAmount") double autoClaimAmount, @g(name = "autoClaimType") String autoClaimType, @g(name = "imageURL") String imageURL, @g(name = "title") String title, @g(name = "description") String description, @g(name = "terms") String terms, @g(name = "isEnabled") boolean isEnabled, @g(name = "isSelected") Boolean isSelected) {
        Intrinsics.j(autoClaimType, "autoClaimType");
        Intrinsics.j(imageURL, "imageURL");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(terms, "terms");
        return new AvailableAutoClaimOption(autoClaimAmount, autoClaimType, imageURL, title, description, terms, isEnabled, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableAutoClaimOption)) {
            return false;
        }
        AvailableAutoClaimOption availableAutoClaimOption = (AvailableAutoClaimOption) other;
        return Double.compare(this.autoClaimAmount, availableAutoClaimOption.autoClaimAmount) == 0 && Intrinsics.e(this.autoClaimType, availableAutoClaimOption.autoClaimType) && Intrinsics.e(this.imageURL, availableAutoClaimOption.imageURL) && Intrinsics.e(this.title, availableAutoClaimOption.title) && Intrinsics.e(this.description, availableAutoClaimOption.description) && Intrinsics.e(this.terms, availableAutoClaimOption.terms) && this.isEnabled == availableAutoClaimOption.isEnabled && Intrinsics.e(this.isSelected, availableAutoClaimOption.isSelected);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Double.hashCode(this.autoClaimAmount) * 31) + this.autoClaimType.hashCode()) * 31) + this.imageURL.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.terms.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        Boolean bool = this.isSelected;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "AvailableAutoClaimOption(autoClaimAmount=" + this.autoClaimAmount + ", autoClaimType=" + this.autoClaimType + ", imageURL=" + this.imageURL + ", title=" + this.title + ", description=" + this.description + ", terms=" + this.terms + ", isEnabled=" + this.isEnabled + ", isSelected=" + this.isSelected + ')';
    }

    public final double getAutoClaimAmount() {
        return this.autoClaimAmount;
    }

    public final String getAutoClaimType() {
        return this.autoClaimType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getImageURL() {
        return this.imageURL;
    }

    public final String getTerms() {
        return this.terms;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public final void setAutoClaimAmount(double d10) {
        this.autoClaimAmount = d10;
    }

    public final void setAutoClaimType(String str) {
        Intrinsics.j(str, "<set-?>");
        this.autoClaimType = str;
    }

    public final void setDescription(String str) {
        Intrinsics.j(str, "<set-?>");
        this.description = str;
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
    }

    public final void setImageURL(String str) {
        Intrinsics.j(str, "<set-?>");
        this.imageURL = str;
    }

    public final void setSelected(Boolean bool) {
        this.isSelected = bool;
    }

    public final void setTerms(String str) {
        Intrinsics.j(str, "<set-?>");
        this.terms = str;
    }

    public final void setTitle(String str) {
        Intrinsics.j(str, "<set-?>");
        this.title = str;
    }

    public final AutoClaimReward toAutoClaimReward$networking_release() {
        double d10 = this.autoClaimAmount;
        String str = this.autoClaimType;
        String str2 = this.imageURL;
        String str3 = this.title;
        String str4 = this.description;
        String str5 = this.terms;
        boolean z10 = this.isEnabled;
        Boolean bool = this.isSelected;
        return new AutoClaimReward(d10, str, str2, str3, str4, str5, z10, bool != null ? bool.booleanValue() : false, false, false, 768, null);
    }

    public /* synthetic */ AvailableAutoClaimOption(double d10, String str, String str2, String str3, String str4, String str5, boolean z10, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, str, str2, str3, str4, str5, z10, (i10 & 128) != 0 ? null : bool);
    }
}
