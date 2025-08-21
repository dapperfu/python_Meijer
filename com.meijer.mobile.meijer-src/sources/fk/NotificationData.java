package fk;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b'\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b\u001e\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b(\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b!\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b%\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b\u001f\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b#\u0010\u0013¨\u0006,"}, d2 = {"Lfk/a;", "", "", "title", "body", "deepLink", "imageUrl", "soundUrl", "badge", "category", "broadlogId", "deliveryId", "cta1label", "cta2Label", "cta1Action", "cta2Action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "j", "b", "c", "g", "d", "i", "e", "getSoundUrl", "f", "getBadge", "getCategory", "h", "k", "l", "m", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fk.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class NotificationData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("title")
    private final String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("body")
    private final String body;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("uri")
    private final String deepLink;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("media-attachment-url")
    private final String imageUrl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("sound")
    private final String soundUrl;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("badge")
    private final String badge;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("category")
    private final String category;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("_mId")
    private final String broadlogId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("_dId")
    private final String deliveryId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("CTA_1_LABEL")
    private final String cta1label;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("CTA_2_LABEL")
    private final String cta2Label;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("CTA_1_ACTION")
    private final String cta1Action;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    @InterfaceC16127c("CTA_2_ACTION")
    private final String cta2Action;

    public NotificationData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationData)) {
            return false;
        }
        NotificationData notificationData = (NotificationData) other;
        return Intrinsics.e(this.title, notificationData.title) && Intrinsics.e(this.body, notificationData.body) && Intrinsics.e(this.deepLink, notificationData.deepLink) && Intrinsics.e(this.imageUrl, notificationData.imageUrl) && Intrinsics.e(this.soundUrl, notificationData.soundUrl) && Intrinsics.e(this.badge, notificationData.badge) && Intrinsics.e(this.category, notificationData.category) && Intrinsics.e(this.broadlogId, notificationData.broadlogId) && Intrinsics.e(this.deliveryId, notificationData.deliveryId) && Intrinsics.e(this.cta1label, notificationData.cta1label) && Intrinsics.e(this.cta2Label, notificationData.cta2Label) && Intrinsics.e(this.cta1Action, notificationData.cta1Action) && Intrinsics.e(this.cta2Action, notificationData.cta2Action);
    }

    public NotificationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.title = str;
        this.body = str2;
        this.deepLink = str3;
        this.imageUrl = str4;
        this.soundUrl = str5;
        this.badge = str6;
        this.category = str7;
        this.broadlogId = str8;
        this.deliveryId = str9;
        this.cta1label = str10;
        this.cta2Label = str11;
        this.cta1Action = str12;
        this.cta2Action = str13;
    }

    /* renamed from: a, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: b, reason: from getter */
    public final String getBroadlogId() {
        return this.broadlogId;
    }

    /* renamed from: c, reason: from getter */
    public final String getCta1Action() {
        return this.cta1Action;
    }

    /* renamed from: d, reason: from getter */
    public final String getCta1label() {
        return this.cta1label;
    }

    /* renamed from: e, reason: from getter */
    public final String getCta2Action() {
        return this.cta2Action;
    }

    /* renamed from: f, reason: from getter */
    public final String getCta2Label() {
        return this.cta2Label;
    }

    /* renamed from: g, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* renamed from: h, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.body;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deepLink;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.soundUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.badge;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.category;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.broadlogId;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.deliveryId;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cta1label;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.cta2Label;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.cta1Action;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.cta2Action;
        return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        return "NotificationData(title=" + this.title + ", body=" + this.body + ", deepLink=" + this.deepLink + ", imageUrl=" + this.imageUrl + ", soundUrl=" + this.soundUrl + ", badge=" + this.badge + ", category=" + this.category + ", broadlogId=" + this.broadlogId + ", deliveryId=" + this.deliveryId + ", cta1label=" + this.cta1label + ", cta2Label=" + this.cta2Label + ", cta1Action=" + this.cta1Action + ", cta2Action=" + this.cta2Action + ')';
    }

    public /* synthetic */ NotificationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : str11, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str12, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str13);
    }
}
