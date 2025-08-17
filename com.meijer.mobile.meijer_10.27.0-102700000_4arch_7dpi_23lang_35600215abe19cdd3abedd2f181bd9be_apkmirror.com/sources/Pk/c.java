package Pk;

import Ok.g;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u0015j\u0002\b\u0013j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"LPk/c;", "", "", "titleResourceId", "", "areAdsEnabled", "", "trackingName", "<init>", "(Ljava/lang/String;IIZLjava/lang/String;)V", "a", "I", "b", "()I", "Z", "getAreAdsEnabled", "()Z", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final c f28328d = new c("AVAILABLE_COUPONS", 0, g.f24034a, true, "Available");

    /* renamed from: e, reason: collision with root package name */
    public static final c f28329e = new c("CLIPPED_COUPONS", 1, g.f24035b, false, "Clipped");

    /* renamed from: f, reason: collision with root package name */
    public static final c f28330f = new c("SEARCH_COUPONS", 2, 0, false, "Search");

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final c f28331g = new c("RELATED_COUPONS", 3, 0, false, "Related");

    /* renamed from: h, reason: collision with root package name */
    public static final c f28332h = new c("RELATED_COUPONS_PDP", 4, 0, false, "Related PDP");

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final c f28333i = new c("REWARDS_COUPONS", 5, 0, false, "Rewards");

    /* renamed from: j, reason: collision with root package name */
    public static final c f28334j = new c("AD_COUPONS", 6, 0, false, "Ads");

    /* renamed from: k, reason: collision with root package name */
    public static final c f28335k = new c("BUNDLE_COUPONS", 7, 0, false, "Bundle");

    /* renamed from: l, reason: collision with root package name */
    public static final c f28336l = new c("SPECIAL_OFFERS", 8, 0, false, "Special Offers");

    /* renamed from: m, reason: collision with root package name */
    public static final c f28337m = new c("RELATED_SHOPPING_LIST", 9, 0, false, "Related Shopping List");

    /* renamed from: n, reason: collision with root package name */
    @Deprecated
    public static final c f28338n = new c("PERSONALIZED_COUPONS", 10, 0, false, "Personalized");

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ c[] f28339o;

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f28340p;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int titleResourceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean areAdsEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String trackingName;

    static {
        c[] cVarArrA = a();
        f28339o = cVarArrA;
        f28340p = EnumEntriesKt.a(cVarArrA);
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f28328d, f28329e, f28330f, f28331g, f28332h, f28333i, f28334j, f28335k, f28336l, f28337m, f28338n};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f28339o.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getTitleResourceId() {
        return this.titleResourceId;
    }

    /* renamed from: e, reason: from getter */
    public final String getTrackingName() {
        return this.trackingName;
    }

    private c(String str, int i10, int i11, boolean z10, String str2) {
        this.titleResourceId = i11;
        this.areAdsEnabled = z10;
        this.trackingName = str2;
    }
}
