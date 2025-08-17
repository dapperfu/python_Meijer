package com.meijer.mobile.core;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vj.C17589b;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 &2\u00020\u0001:\u00021\u001eBg\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\t\u001a\u00020\b\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\b\b\u0003\u0010\u000e\u001a\u00020\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014Jp\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001e\u0010/R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b%\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b'\u0010\u0018R\u0011\u00100\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001a¨\u00062"}, d2 = {"Lcom/meijer/mobile/core/GetMMAConfigResponse;", "", "", "forceUserAccountsToUpdate", "", "updateAppMessage", "updateAppMessageTitle", "enableRatingsPrompt", "", "percentChanceOfLoggingRatingsPromptEvent", "Lcom/meijer/mobile/core/GetMMAConfigResponse$RatingsPromptCriteria;", "ratingsPromptCriteria", "Lcom/meijer/mobile/core/MMAConfigVersionInfo;", "currentAppVersion", "forceAppVersionAndroid", "launchDarklyVariation", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ZILcom/meijer/mobile/core/GetMMAConfigResponse$RatingsPromptCriteria;Lcom/meijer/mobile/core/MMAConfigVersionInfo;Lcom/meijer/mobile/core/MMAConfigVersionInfo;Ljava/lang/String;)V", "Lvj/b;", "k", "()Lvj/b;", "copy", "(ZLjava/lang/String;Ljava/lang/String;ZILcom/meijer/mobile/core/GetMMAConfigResponse$RatingsPromptCriteria;Lcom/meijer/mobile/core/MMAConfigVersionInfo;Lcom/meijer/mobile/core/MMAConfigVersionInfo;Ljava/lang/String;)Lcom/meijer/mobile/core/GetMMAConfigResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "Ljava/lang/String;", "i", "c", "j", "e", "I", "f", "Lcom/meijer/mobile/core/GetMMAConfigResponse$RatingsPromptCriteria;", "h", "()Lcom/meijer/mobile/core/GetMMAConfigResponse$RatingsPromptCriteria;", "g", "Lcom/meijer/mobile/core/MMAConfigVersionInfo;", "()Lcom/meijer/mobile/core/MMAConfigVersionInfo;", "ratingsClippedCouponsCount", "RatingsPromptCriteria", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GetMMAConfigResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean forceUserAccountsToUpdate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updateAppMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updateAppMessageTitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enableRatingsPrompt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int percentChanceOfLoggingRatingsPromptEvent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final RatingsPromptCriteria ratingsPromptCriteria;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final MMAConfigVersionInfo currentAppVersion;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final MMAConfigVersionInfo forceAppVersionAndroid;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String launchDarklyVariation;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/core/GetMMAConfigResponse$RatingsPromptCriteria;", "", "", "clippedCouponsCount", "<init>", "(I)V", "copy", "(I)Lcom/meijer/mobile/core/GetMMAConfigResponse$RatingsPromptCriteria;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RatingsPromptCriteria {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int clippedCouponsCount;

        public RatingsPromptCriteria() {
            this(0, 1, null);
        }

        public final RatingsPromptCriteria copy(@g(name = "clippedCouponsCount") int clippedCouponsCount) {
            return new RatingsPromptCriteria(clippedCouponsCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RatingsPromptCriteria) && this.clippedCouponsCount == ((RatingsPromptCriteria) other).clippedCouponsCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.clippedCouponsCount);
        }

        public String toString() {
            return "RatingsPromptCriteria(clippedCouponsCount=" + this.clippedCouponsCount + ')';
        }

        public RatingsPromptCriteria(@g(name = "clippedCouponsCount") int i10) {
            this.clippedCouponsCount = i10;
        }

        /* renamed from: a, reason: from getter */
        public final int getClippedCouponsCount() {
            return this.clippedCouponsCount;
        }

        public /* synthetic */ RatingsPromptCriteria(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0 : i10);
        }
    }

    public GetMMAConfigResponse() {
        this(false, null, null, false, 0, null, null, null, null, 511, null);
    }

    public final GetMMAConfigResponse copy(@g(name = "forceUserAccountsToUpdate") boolean forceUserAccountsToUpdate, @g(name = "updateAppMessage") String updateAppMessage, @g(name = "updateAppMessageTitle") String updateAppMessageTitle, @g(name = "enableRatingsPrompt") boolean enableRatingsPrompt, @g(name = "percentChanceOfLoggingRatingsPromptEvent") int percentChanceOfLoggingRatingsPromptEvent, @g(name = "ratingsPromptCriteria") RatingsPromptCriteria ratingsPromptCriteria, @g(name = "currentAppVersionAndroid") MMAConfigVersionInfo currentAppVersion, @g(name = "forceAppVersionAndroid") MMAConfigVersionInfo forceAppVersionAndroid, @g(name = "ld_variation") String launchDarklyVariation) {
        Intrinsics.j(ratingsPromptCriteria, "ratingsPromptCriteria");
        Intrinsics.j(currentAppVersion, "currentAppVersion");
        Intrinsics.j(forceAppVersionAndroid, "forceAppVersionAndroid");
        return new GetMMAConfigResponse(forceUserAccountsToUpdate, updateAppMessage, updateAppMessageTitle, enableRatingsPrompt, percentChanceOfLoggingRatingsPromptEvent, ratingsPromptCriteria, currentAppVersion, forceAppVersionAndroid, launchDarklyVariation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetMMAConfigResponse)) {
            return false;
        }
        GetMMAConfigResponse getMMAConfigResponse = (GetMMAConfigResponse) other;
        return this.forceUserAccountsToUpdate == getMMAConfigResponse.forceUserAccountsToUpdate && Intrinsics.e(this.updateAppMessage, getMMAConfigResponse.updateAppMessage) && Intrinsics.e(this.updateAppMessageTitle, getMMAConfigResponse.updateAppMessageTitle) && this.enableRatingsPrompt == getMMAConfigResponse.enableRatingsPrompt && this.percentChanceOfLoggingRatingsPromptEvent == getMMAConfigResponse.percentChanceOfLoggingRatingsPromptEvent && Intrinsics.e(this.ratingsPromptCriteria, getMMAConfigResponse.ratingsPromptCriteria) && Intrinsics.e(this.currentAppVersion, getMMAConfigResponse.currentAppVersion) && Intrinsics.e(this.forceAppVersionAndroid, getMMAConfigResponse.forceAppVersionAndroid) && Intrinsics.e(this.launchDarklyVariation, getMMAConfigResponse.launchDarklyVariation);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.forceUserAccountsToUpdate) * 31;
        String str = this.updateAppMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updateAppMessageTitle;
        int iHashCode3 = (((((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.enableRatingsPrompt)) * 31) + Integer.hashCode(this.percentChanceOfLoggingRatingsPromptEvent)) * 31) + this.ratingsPromptCriteria.hashCode()) * 31) + this.currentAppVersion.hashCode()) * 31) + this.forceAppVersionAndroid.hashCode()) * 31;
        String str3 = this.launchDarklyVariation;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "GetMMAConfigResponse(forceUserAccountsToUpdate=" + this.forceUserAccountsToUpdate + ", updateAppMessage=" + this.updateAppMessage + ", updateAppMessageTitle=" + this.updateAppMessageTitle + ", enableRatingsPrompt=" + this.enableRatingsPrompt + ", percentChanceOfLoggingRatingsPromptEvent=" + this.percentChanceOfLoggingRatingsPromptEvent + ", ratingsPromptCriteria=" + this.ratingsPromptCriteria + ", currentAppVersion=" + this.currentAppVersion + ", forceAppVersionAndroid=" + this.forceAppVersionAndroid + ", launchDarklyVariation=" + this.launchDarklyVariation + ')';
    }

    public GetMMAConfigResponse(@g(name = "forceUserAccountsToUpdate") boolean z10, @g(name = "updateAppMessage") String str, @g(name = "updateAppMessageTitle") String str2, @g(name = "enableRatingsPrompt") boolean z11, @g(name = "percentChanceOfLoggingRatingsPromptEvent") int i10, @g(name = "ratingsPromptCriteria") RatingsPromptCriteria ratingsPromptCriteria, @g(name = "currentAppVersionAndroid") MMAConfigVersionInfo currentAppVersion, @g(name = "forceAppVersionAndroid") MMAConfigVersionInfo forceAppVersionAndroid, @g(name = "ld_variation") String str3) {
        Intrinsics.j(ratingsPromptCriteria, "ratingsPromptCriteria");
        Intrinsics.j(currentAppVersion, "currentAppVersion");
        Intrinsics.j(forceAppVersionAndroid, "forceAppVersionAndroid");
        this.forceUserAccountsToUpdate = z10;
        this.updateAppMessage = str;
        this.updateAppMessageTitle = str2;
        this.enableRatingsPrompt = z11;
        this.percentChanceOfLoggingRatingsPromptEvent = i10;
        this.ratingsPromptCriteria = ratingsPromptCriteria;
        this.currentAppVersion = currentAppVersion;
        this.forceAppVersionAndroid = forceAppVersionAndroid;
        this.launchDarklyVariation = str3;
    }

    /* renamed from: a, reason: from getter */
    public final MMAConfigVersionInfo getCurrentAppVersion() {
        return this.currentAppVersion;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getEnableRatingsPrompt() {
        return this.enableRatingsPrompt;
    }

    /* renamed from: c, reason: from getter */
    public final MMAConfigVersionInfo getForceAppVersionAndroid() {
        return this.forceAppVersionAndroid;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getForceUserAccountsToUpdate() {
        return this.forceUserAccountsToUpdate;
    }

    /* renamed from: e, reason: from getter */
    public final String getLaunchDarklyVariation() {
        return this.launchDarklyVariation;
    }

    /* renamed from: f, reason: from getter */
    public final int getPercentChanceOfLoggingRatingsPromptEvent() {
        return this.percentChanceOfLoggingRatingsPromptEvent;
    }

    public final int g() {
        if (this.ratingsPromptCriteria.getClippedCouponsCount() == 0) {
            return 11;
        }
        return this.ratingsPromptCriteria.getClippedCouponsCount();
    }

    /* renamed from: h, reason: from getter */
    public final RatingsPromptCriteria getRatingsPromptCriteria() {
        return this.ratingsPromptCriteria;
    }

    /* renamed from: i, reason: from getter */
    public final String getUpdateAppMessage() {
        return this.updateAppMessage;
    }

    /* renamed from: j, reason: from getter */
    public final String getUpdateAppMessageTitle() {
        return this.updateAppMessageTitle;
    }

    public final C17589b k() {
        boolean z10 = this.forceUserAccountsToUpdate;
        String str = this.updateAppMessage;
        if (str == null) {
            str = "";
        }
        String str2 = this.updateAppMessageTitle;
        return new C17589b(z10, str, str2 != null ? str2 : "", this.currentAppVersion, this.forceAppVersionAndroid, this.enableRatingsPrompt, this.percentChanceOfLoggingRatingsPromptEvent, g());
    }

    public /* synthetic */ GetMMAConfigResponse(boolean z10, String str, String str2, boolean z11, int i10, RatingsPromptCriteria ratingsPromptCriteria, MMAConfigVersionInfo mMAConfigVersionInfo, MMAConfigVersionInfo mMAConfigVersionInfo2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? 0 : i10, (i11 & 32) != 0 ? new RatingsPromptCriteria(0, 1, null) : ratingsPromptCriteria, (i11 & 64) != 0 ? new MMAConfigVersionInfo(0, 0, 0, 0, 15, null) : mMAConfigVersionInfo, (i11 & 128) != 0 ? new MMAConfigVersionInfo(0, 0, 0, 0, 15, null) : mMAConfigVersionInfo2, (i11 & 256) != 0 ? null : str3);
    }
}
