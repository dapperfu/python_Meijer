package Eh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LEh/p;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final p f7584b = new p("MEIJER_NEWS_COMMUNICATION", 0, "my-meijer-news-communication");

    /* renamed from: c, reason: collision with root package name */
    public static final p f7585c = new p("MPERKS_REWARDS_COMMUNICATION", 1, "mperks-rewards-communication");

    /* renamed from: d, reason: collision with root package name */
    public static final p f7586d = new p("SAVINGS_OFFERS_COMMUNICATION", 2, "savings-and-offers-communication");

    /* renamed from: e, reason: collision with root package name */
    public static final p f7587e = new p("DIGITAL_RECEIPTS_EMAIL", 3, "digital-receipts-email");

    /* renamed from: f, reason: collision with root package name */
    public static final p f7588f = new p("AUTO_LINK_CARD_TO_MPERKS", 4, "auto-link-card-to-mPerks");

    /* renamed from: g, reason: collision with root package name */
    public static final p f7589g = new p("NOTIFICATIONS", 5, "notifications");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ p[] f7590h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f7591i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String key;

    static {
        p[] pVarArrA = a();
        f7590h = pVarArrA;
        f7591i = EnumEntriesKt.a(pVarArrA);
    }

    private static final /* synthetic */ p[] a() {
        return new p[]{f7584b, f7585c, f7586d, f7587e, f7588f, f7589g};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f7590h.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    private p(String str, int i10, String str2) {
        this.key = str2;
    }
}
