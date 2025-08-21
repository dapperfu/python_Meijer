package com.meijer.mobile.mperks.networking.api.models;

import com.medallia.digital.mobilesdk.l3;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0004\u0012\b\b\u0003\u0010\t\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJb\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\t\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/AvailableAutoClaimOptionJson;", "", "", "autoClaimAmount", "", "autoClaimType", "imageURL", "title", "description", "terms", "", "isEnabled", "isSelected", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)V", "copy", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;)Lcom/meijer/mobile/mperks/networking/api/models/AvailableAutoClaimOptionJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Ljava/lang/String;", "c", "d", "f", "e", "g", "Z", "()Z", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AvailableAutoClaimOptionJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double autoClaimAmount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String autoClaimType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String terms;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isSelected;

    public AvailableAutoClaimOptionJson() {
        this(0.0d, null, null, null, null, null, false, null, l3.f93323c, null);
    }

    public final AvailableAutoClaimOptionJson copy(@g(name = "autoClaimAmount") double autoClaimAmount, @g(name = "autoClaimType") String autoClaimType, @g(name = "imageURL") String imageURL, @g(name = "title") String title, @g(name = "description") String description, @g(name = "terms") String terms, @g(name = "isEnabled") boolean isEnabled, @g(name = "isSelected") Boolean isSelected) {
        Intrinsics.j(autoClaimType, "autoClaimType");
        Intrinsics.j(imageURL, "imageURL");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(terms, "terms");
        return new AvailableAutoClaimOptionJson(autoClaimAmount, autoClaimType, imageURL, title, description, terms, isEnabled, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableAutoClaimOptionJson)) {
            return false;
        }
        AvailableAutoClaimOptionJson availableAutoClaimOptionJson = (AvailableAutoClaimOptionJson) other;
        return Double.compare(this.autoClaimAmount, availableAutoClaimOptionJson.autoClaimAmount) == 0 && Intrinsics.e(this.autoClaimType, availableAutoClaimOptionJson.autoClaimType) && Intrinsics.e(this.imageURL, availableAutoClaimOptionJson.imageURL) && Intrinsics.e(this.title, availableAutoClaimOptionJson.title) && Intrinsics.e(this.description, availableAutoClaimOptionJson.description) && Intrinsics.e(this.terms, availableAutoClaimOptionJson.terms) && this.isEnabled == availableAutoClaimOptionJson.isEnabled && Intrinsics.e(this.isSelected, availableAutoClaimOptionJson.isSelected);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Double.hashCode(this.autoClaimAmount) * 31) + this.autoClaimType.hashCode()) * 31) + this.imageURL.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.terms.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        Boolean bool = this.isSelected;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "AvailableAutoClaimOptionJson(autoClaimAmount=" + this.autoClaimAmount + ", autoClaimType=" + this.autoClaimType + ", imageURL=" + this.imageURL + ", title=" + this.title + ", description=" + this.description + ", terms=" + this.terms + ", isEnabled=" + this.isEnabled + ", isSelected=" + this.isSelected + ')';
    }

    public AvailableAutoClaimOptionJson(@g(name = "autoClaimAmount") double d10, @g(name = "autoClaimType") String autoClaimType, @g(name = "imageURL") String imageURL, @g(name = "title") String title, @g(name = "description") String description, @g(name = "terms") String terms, @g(name = "isEnabled") boolean z10, @g(name = "isSelected") Boolean bool) {
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

    /* renamed from: a, reason: from getter */
    public final double getAutoClaimAmount() {
        return this.autoClaimAmount;
    }

    /* renamed from: b, reason: from getter */
    public final String getAutoClaimType() {
        return this.autoClaimType;
    }

    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: d, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: e, reason: from getter */
    public final String getTerms() {
        return this.terms;
    }

    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: h, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    public /* synthetic */ AvailableAutoClaimOptionJson(double d10, String str, String str2, String str3, String str4, String str5, boolean z10, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? "" : str4, (i10 & 32) == 0 ? str5 : "", (i10 & 64) != 0 ? true : z10, (i10 & 128) != 0 ? null : bool);
    }
}
