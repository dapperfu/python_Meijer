package wj;

import com.meijer.mobile.core.MMAConfigVersionInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0010\u0010!\"\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b\u001c\u0010!\"\u0004\b%\u0010#R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b&\u0010\u0015R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010'\u001a\u0004\b\u001f\u0010(\"\u0004\b)\u0010*R\"\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b$\u0010(\"\u0004\b,\u0010*¨\u0006-"}, d2 = {"Lwj/b;", "", "", "forceMPerksAccountUpdate", "", "updateAppMessage", "updateAppMessageTitle", "Lcom/meijer/mobile/core/MMAConfigVersionInfo;", "currentAppVersion", "forceAppUpdateVersion", "enableRatingsPrompt", "", "percentChanceOfLoggingRatingsPromptEvent", "ratingsPromptClippedCouponsCount", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/core/MMAConfigVersionInfo;Lcom/meijer/mobile/core/MMAConfigVersionInfo;ZII)V", "a", "Z", "getForceMPerksAccountUpdate", "()Z", "setForceMPerksAccountUpdate", "(Z)V", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "setUpdateAppMessage", "(Ljava/lang/String;)V", "c", "g", "setUpdateAppMessageTitle", "d", "Lcom/meijer/mobile/core/MMAConfigVersionInfo;", "()Lcom/meijer/mobile/core/MMAConfigVersionInfo;", "setCurrentAppVersion", "(Lcom/meijer/mobile/core/MMAConfigVersionInfo;)V", "e", "setForceAppUpdateVersion", "setEnableRatingsPrompt", "I", "()I", "setPercentChanceOfLoggingRatingsPromptEvent", "(I)V", "h", "setRatingsPromptClippedCouponsCount", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wj.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C17897b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean forceMPerksAccountUpdate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String updateAppMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String updateAppMessageTitle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private MMAConfigVersionInfo currentAppVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private MMAConfigVersionInfo forceAppUpdateVersion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean enableRatingsPrompt;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int percentChanceOfLoggingRatingsPromptEvent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int ratingsPromptClippedCouponsCount;

    public C17897b(boolean z10, String updateAppMessage, String updateAppMessageTitle, MMAConfigVersionInfo currentAppVersion, MMAConfigVersionInfo forceAppUpdateVersion, boolean z11, int i10, int i11) {
        Intrinsics.j(updateAppMessage, "updateAppMessage");
        Intrinsics.j(updateAppMessageTitle, "updateAppMessageTitle");
        Intrinsics.j(currentAppVersion, "currentAppVersion");
        Intrinsics.j(forceAppUpdateVersion, "forceAppUpdateVersion");
        this.forceMPerksAccountUpdate = z10;
        this.updateAppMessage = updateAppMessage;
        this.updateAppMessageTitle = updateAppMessageTitle;
        this.currentAppVersion = currentAppVersion;
        this.forceAppUpdateVersion = forceAppUpdateVersion;
        this.enableRatingsPrompt = z11;
        this.percentChanceOfLoggingRatingsPromptEvent = i10;
        this.ratingsPromptClippedCouponsCount = i11;
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
    public final MMAConfigVersionInfo getForceAppUpdateVersion() {
        return this.forceAppUpdateVersion;
    }

    /* renamed from: d, reason: from getter */
    public final int getPercentChanceOfLoggingRatingsPromptEvent() {
        return this.percentChanceOfLoggingRatingsPromptEvent;
    }

    /* renamed from: e, reason: from getter */
    public final int getRatingsPromptClippedCouponsCount() {
        return this.ratingsPromptClippedCouponsCount;
    }

    /* renamed from: f, reason: from getter */
    public final String getUpdateAppMessage() {
        return this.updateAppMessage;
    }

    /* renamed from: g, reason: from getter */
    public final String getUpdateAppMessageTitle() {
        return this.updateAppMessageTitle;
    }
}
