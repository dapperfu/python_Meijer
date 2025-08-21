package Ba;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 Jæ\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010 J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b,\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b1\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b4\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b3\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010 R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u00109\u001a\u0004\b6\u0010 R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b5\u0010$R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b/\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b8\u0010$R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u0010+\u001a\u0004\b>\u0010$R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00138\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\bD\u0010$R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\b?\u0010$¨\u0006E"}, d2 = {"LBa/k;", "Landroid/os/Parcelable;", "", "imageUrl", "iconImageUrl", "style", "title", "body", "channelId", "campaignId", "sid", "", "smallIconResourceId", "colorResourceId", "collapseId", "operation", "actions", "defaultAction", "inapp", "", "rootParams", "u", "message_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)LBa/k;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "k", "b", "j", "c", "v", "d", "getTitle", "e", "f", "g", "h", "s", "i", "I", "t", "l", "q", "m", "n", "o", "p", "Ljava/util/Map;", "r", "()Ljava/util/Map;", "w", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ba.k, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class NotificationData implements Parcelable {
    public static final Parcelable.Creator<NotificationData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iconImageUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String style;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String body;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String channelId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String campaignId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sid;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int smallIconResourceId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final int colorResourceId;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String collapseId;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String operation;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String actions;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String defaultAction;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String inapp;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> rootParams;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String u;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message_id;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ba.k$a */
    public static final class a implements Parcelable.Creator<NotificationData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NotificationData createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int i13 = 0;
            while (i13 != i12) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                i13++;
                i12 = i12;
            }
            return new NotificationData(string, string2, string3, string4, string5, string6, string7, string8, i10, i11, string9, string10, string11, string12, string13, linkedHashMap, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final NotificationData[] newArray(int i10) {
            return new NotificationData[i10];
        }
    }

    public static /* synthetic */ NotificationData b(NotificationData notificationData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, int i11, String str9, String str10, String str11, String str12, String str13, Map map, String str14, String str15, int i12, Object obj) {
        String str16;
        String str17;
        String str18 = (i12 & 1) != 0 ? notificationData.imageUrl : str;
        String str19 = (i12 & 2) != 0 ? notificationData.iconImageUrl : str2;
        String str20 = (i12 & 4) != 0 ? notificationData.style : str3;
        String str21 = (i12 & 8) != 0 ? notificationData.title : str4;
        String str22 = (i12 & 16) != 0 ? notificationData.body : str5;
        String str23 = (i12 & 32) != 0 ? notificationData.channelId : str6;
        String str24 = (i12 & 64) != 0 ? notificationData.campaignId : str7;
        String str25 = (i12 & 128) != 0 ? notificationData.sid : str8;
        int i13 = (i12 & 256) != 0 ? notificationData.smallIconResourceId : i10;
        int i14 = (i12 & 512) != 0 ? notificationData.colorResourceId : i11;
        String str26 = (i12 & 1024) != 0 ? notificationData.collapseId : str9;
        String str27 = (i12 & RecyclerView.m.FLAG_MOVED) != 0 ? notificationData.operation : str10;
        String str28 = (i12 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? notificationData.actions : str11;
        String str29 = (i12 & 8192) != 0 ? notificationData.defaultAction : str12;
        String str30 = str18;
        String str31 = (i12 & 16384) != 0 ? notificationData.inapp : str13;
        Map map2 = (i12 & 32768) != 0 ? notificationData.rootParams : map;
        String str32 = (i12 & 65536) != 0 ? notificationData.u : str14;
        if ((i12 & 131072) != 0) {
            str17 = str32;
            str16 = notificationData.message_id;
        } else {
            str16 = str15;
            str17 = str32;
        }
        return notificationData.a(str30, str19, str20, str21, str22, str23, str24, str25, i13, i14, str26, str27, str28, str29, str31, map2, str17, str16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationData)) {
            return false;
        }
        NotificationData notificationData = (NotificationData) other;
        return Intrinsics.e(this.imageUrl, notificationData.imageUrl) && Intrinsics.e(this.iconImageUrl, notificationData.iconImageUrl) && Intrinsics.e(this.style, notificationData.style) && Intrinsics.e(this.title, notificationData.title) && Intrinsics.e(this.body, notificationData.body) && Intrinsics.e(this.channelId, notificationData.channelId) && Intrinsics.e(this.campaignId, notificationData.campaignId) && Intrinsics.e(this.sid, notificationData.sid) && this.smallIconResourceId == notificationData.smallIconResourceId && this.colorResourceId == notificationData.colorResourceId && Intrinsics.e(this.collapseId, notificationData.collapseId) && Intrinsics.e(this.operation, notificationData.operation) && Intrinsics.e(this.actions, notificationData.actions) && Intrinsics.e(this.defaultAction, notificationData.defaultAction) && Intrinsics.e(this.inapp, notificationData.inapp) && Intrinsics.e(this.rootParams, notificationData.rootParams) && Intrinsics.e(this.u, notificationData.u) && Intrinsics.e(this.message_id, notificationData.message_id);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.imageUrl);
        dest.writeString(this.iconImageUrl);
        dest.writeString(this.style);
        dest.writeString(this.title);
        dest.writeString(this.body);
        dest.writeString(this.channelId);
        dest.writeString(this.campaignId);
        dest.writeString(this.sid);
        dest.writeInt(this.smallIconResourceId);
        dest.writeInt(this.colorResourceId);
        dest.writeString(this.collapseId);
        dest.writeString(this.operation);
        dest.writeString(this.actions);
        dest.writeString(this.defaultAction);
        dest.writeString(this.inapp);
        Map<String, String> map = this.rootParams;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
        dest.writeString(this.u);
        dest.writeString(this.message_id);
    }

    public NotificationData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String sid, int i10, int i11, String collapseId, String operation, String str8, String str9, String str10, Map<String, String> rootParams, String u10, String message_id) {
        Intrinsics.j(sid, "sid");
        Intrinsics.j(collapseId, "collapseId");
        Intrinsics.j(operation, "operation");
        Intrinsics.j(rootParams, "rootParams");
        Intrinsics.j(u10, "u");
        Intrinsics.j(message_id, "message_id");
        this.imageUrl = str;
        this.iconImageUrl = str2;
        this.style = str3;
        this.title = str4;
        this.body = str5;
        this.channelId = str6;
        this.campaignId = str7;
        this.sid = sid;
        this.smallIconResourceId = i10;
        this.colorResourceId = i11;
        this.collapseId = collapseId;
        this.operation = operation;
        this.actions = str8;
        this.defaultAction = str9;
        this.inapp = str10;
        this.rootParams = rootParams;
        this.u = u10;
        this.message_id = message_id;
    }

    public final NotificationData a(String imageUrl, String iconImageUrl, String style, String title, String body, String channelId, String campaignId, String sid, int smallIconResourceId, int colorResourceId, String collapseId, String operation, String actions, String defaultAction, String inapp, Map<String, String> rootParams, String u10, String message_id) {
        Intrinsics.j(sid, "sid");
        Intrinsics.j(collapseId, "collapseId");
        Intrinsics.j(operation, "operation");
        Intrinsics.j(rootParams, "rootParams");
        Intrinsics.j(u10, "u");
        Intrinsics.j(message_id, "message_id");
        return new NotificationData(imageUrl, iconImageUrl, style, title, body, channelId, campaignId, sid, smallIconResourceId, colorResourceId, collapseId, operation, actions, defaultAction, inapp, rootParams, u10, message_id);
    }

    /* renamed from: c, reason: from getter */
    public final String getActions() {
        return this.actions;
    }

    /* renamed from: d, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: e, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: f, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* renamed from: g, reason: from getter */
    public final String getCollapseId() {
        return this.collapseId;
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final int getColorResourceId() {
        return this.colorResourceId;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconImageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.style;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.body;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.channelId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.campaignId;
        int iHashCode7 = (((((((((((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.sid.hashCode()) * 31) + Integer.hashCode(this.smallIconResourceId)) * 31) + Integer.hashCode(this.colorResourceId)) * 31) + this.collapseId.hashCode()) * 31) + this.operation.hashCode()) * 31;
        String str8 = this.actions;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.defaultAction;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.inapp;
        return ((((((iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.rootParams.hashCode()) * 31) + this.u.hashCode()) * 31) + this.message_id.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final String getDefaultAction() {
        return this.defaultAction;
    }

    /* renamed from: j, reason: from getter */
    public final String getIconImageUrl() {
        return this.iconImageUrl;
    }

    /* renamed from: k, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: n, reason: from getter */
    public final String getInapp() {
        return this.inapp;
    }

    /* renamed from: o, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* renamed from: q, reason: from getter */
    public final String getOperation() {
        return this.operation;
    }

    public final Map<String, String> r() {
        return this.rootParams;
    }

    /* renamed from: s, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* renamed from: t, reason: from getter */
    public final int getSmallIconResourceId() {
        return this.smallIconResourceId;
    }

    public String toString() {
        return "NotificationData(imageUrl=" + this.imageUrl + ", iconImageUrl=" + this.iconImageUrl + ", style=" + this.style + ", title=" + this.title + ", body=" + this.body + ", channelId=" + this.channelId + ", campaignId=" + this.campaignId + ", sid=" + this.sid + ", smallIconResourceId=" + this.smallIconResourceId + ", colorResourceId=" + this.colorResourceId + ", collapseId=" + this.collapseId + ", operation=" + this.operation + ", actions=" + this.actions + ", defaultAction=" + this.defaultAction + ", inapp=" + this.inapp + ", rootParams=" + this.rootParams + ", u=" + this.u + ", message_id=" + this.message_id + ")";
    }

    /* renamed from: v, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* renamed from: w, reason: from getter */
    public final String getU() {
        return this.u;
    }
}
