package hj;

import Co.Image;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b1\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010 \u001a\u0004\b-\u0010\u0019R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010 \u001a\u0004\b:\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u0010 \u001a\u0004\b@\u0010\u0019R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u0010 \u001a\u0004\bB\u0010\u0019¨\u0006C"}, d2 = {"Lhj/g;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "", "couldFireMessages", "description", "", "enabled", "endDate", "firedMessages", "", "priority", "LCo/e;", "productBanner", "promotionGroup", "promotionType", "Lhj/i;", "restrictions", "startDate", "title", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;ILCo/e;Ljava/lang/String;Ljava/lang/String;Lhj/i;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "b", "Ljava/util/List;", "getCouldFireMessages", "()Ljava/util/List;", "c", "getDescription", "d", "Z", "getEnabled", "()Z", "e", "getEndDate", "f", "getFiredMessages", "g", "I", "getPriority", "h", "LCo/e;", "getProductBanner", "()LCo/e;", "i", "getPromotionGroup", "j", "getPromotionType", "k", "Lhj/i;", "getRestrictions", "()Lhj/i;", "l", "getStartDate", "m", "getTitle", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hj.g, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class Promotion {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> couldFireMessages;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String endDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> firedMessages;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int priority;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image productBanner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promotionGroup;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promotionType;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final PromotionRestriction restrictions;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startDate;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    public Promotion() {
        this(null, null, null, false, null, null, 0, null, null, null, null, null, null, 8191, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Promotion)) {
            return false;
        }
        Promotion promotion = (Promotion) other;
        return Intrinsics.e(this.code, promotion.code) && Intrinsics.e(this.couldFireMessages, promotion.couldFireMessages) && Intrinsics.e(this.description, promotion.description) && this.enabled == promotion.enabled && Intrinsics.e(this.endDate, promotion.endDate) && Intrinsics.e(this.firedMessages, promotion.firedMessages) && this.priority == promotion.priority && Intrinsics.e(this.productBanner, promotion.productBanner) && Intrinsics.e(this.promotionGroup, promotion.promotionGroup) && Intrinsics.e(this.promotionType, promotion.promotionType) && Intrinsics.e(this.restrictions, promotion.restrictions) && Intrinsics.e(this.startDate, promotion.startDate) && Intrinsics.e(this.title, promotion.title);
    }

    public Promotion(String code, List<String> list, String str, boolean z10, String str2, List<String> list2, int i10, Image image, String str3, String str4, PromotionRestriction promotionRestriction, String str5, String str6) {
        Intrinsics.j(code, "code");
        this.code = code;
        this.couldFireMessages = list;
        this.description = str;
        this.enabled = z10;
        this.endDate = str2;
        this.firedMessages = list2;
        this.priority = i10;
        this.productBanner = image;
        this.promotionGroup = str3;
        this.promotionType = str4;
        this.restrictions = promotionRestriction;
        this.startDate = str5;
        this.title = str6;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        List<String> list = this.couldFireMessages;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.description;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str2 = this.endDate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list2 = this.firedMessages;
        int iHashCode5 = (((iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + Integer.hashCode(this.priority)) * 31;
        Image image = this.productBanner;
        int iHashCode6 = (iHashCode5 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.promotionGroup;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promotionType;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PromotionRestriction promotionRestriction = this.restrictions;
        int iHashCode9 = (iHashCode8 + (promotionRestriction == null ? 0 : promotionRestriction.hashCode())) * 31;
        String str5 = this.startDate;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.title;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "Promotion(code=" + this.code + ", couldFireMessages=" + this.couldFireMessages + ", description=" + this.description + ", enabled=" + this.enabled + ", endDate=" + this.endDate + ", firedMessages=" + this.firedMessages + ", priority=" + this.priority + ", productBanner=" + this.productBanner + ", promotionGroup=" + this.promotionGroup + ", promotionType=" + this.promotionType + ", restrictions=" + this.restrictions + ", startDate=" + this.startDate + ", title=" + this.title + ')';
    }

    public /* synthetic */ Promotion(String str, List list, String str2, boolean z10, String str3, List list2, int i10, Image image, String str4, String str5, PromotionRestriction promotionRestriction, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "-1" : str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : list2, (i11 & 64) == 0 ? i10 : 0, (i11 & 128) != 0 ? null : image, (i11 & 256) != 0 ? null : str4, (i11 & 512) != 0 ? null : str5, (i11 & 1024) != 0 ? null : promotionRestriction, (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str6, (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str7);
    }
}
