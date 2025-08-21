package aa;

import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R%\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;¨\u0006B"}, d2 = {"Laa/b;", "", "", PreferencesHelper.PREF_ID, "campaignId", "collapseId", "title", "body", "imageUrl", "imageAltText", "", "receivedAt", "updatedAt", "expiresAt", "", "tags", "", "properties", "LX9/a;", "actions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getCampaignId", "c", "getCollapseId", "d", "getTitle", "e", "getBody", "f", "getImageUrl", "g", "getImageAltText", "h", "J", "getReceivedAt", "()J", "i", "Ljava/lang/Long;", "getUpdatedAt", "()Ljava/lang/Long;", "j", "getExpiresAt", "k", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "l", "Ljava/util/Map;", "getProperties", "()Ljava/util/Map;", "m", "getActions", "mobile-engage-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aa.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class Message {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String campaignId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String collapseId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String body;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageAltText;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long receivedAt;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long updatedAt;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long expiresAt;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> tags;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> properties;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<X9.a> actions;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return Intrinsics.e(this.id, message.id) && Intrinsics.e(this.campaignId, message.campaignId) && Intrinsics.e(this.collapseId, message.collapseId) && Intrinsics.e(this.title, message.title) && Intrinsics.e(this.body, message.body) && Intrinsics.e(this.imageUrl, message.imageUrl) && Intrinsics.e(this.imageAltText, message.imageAltText) && this.receivedAt == message.receivedAt && Intrinsics.e(this.updatedAt, message.updatedAt) && Intrinsics.e(this.expiresAt, message.expiresAt) && Intrinsics.e(this.tags, message.tags) && Intrinsics.e(this.properties, message.properties) && Intrinsics.e(this.actions, message.actions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Message(String id2, String campaignId, String str, String title, String body, String str2, String str3, long j10, Long l10, Long l11, List<String> list, Map<String, String> map, List<? extends X9.a> list2) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(campaignId, "campaignId");
        Intrinsics.j(title, "title");
        Intrinsics.j(body, "body");
        this.id = id2;
        this.campaignId = campaignId;
        this.collapseId = str;
        this.title = title;
        this.body = body;
        this.imageUrl = str2;
        this.imageAltText = str3;
        this.receivedAt = j10;
        this.updatedAt = l10;
        this.expiresAt = l11;
        this.tags = list;
        this.properties = map;
        this.actions = list2;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.campaignId.hashCode()) * 31;
        String str = this.collapseId;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.body.hashCode()) * 31;
        String str2 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageAltText;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.receivedAt)) * 31;
        Long l10 = this.updatedAt;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.expiresAt;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.properties;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        List<X9.a> list2 = this.actions;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "Message(id=" + this.id + ", campaignId=" + this.campaignId + ", collapseId=" + this.collapseId + ", title=" + this.title + ", body=" + this.body + ", imageUrl=" + this.imageUrl + ", imageAltText=" + this.imageAltText + ", receivedAt=" + this.receivedAt + ", updatedAt=" + this.updatedAt + ", expiresAt=" + this.expiresAt + ", tags=" + this.tags + ", properties=" + this.properties + ", actions=" + this.actions + ")";
    }
}
