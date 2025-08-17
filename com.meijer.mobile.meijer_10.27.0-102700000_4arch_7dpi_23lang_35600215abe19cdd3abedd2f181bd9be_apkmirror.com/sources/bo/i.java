package bo;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lbo/i;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f60581a = new i("TO_EARN_REWARDS_TAB", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final i f60582b = new i("TO_CLAIM_REWARDS_TAB", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final i f60583c = new i("TO_VIEW_REWARDS_TAB", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ i[] f60584d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60585e;

    static {
        i[] iVarArrA = a();
        f60584d = iVarArrA;
        f60585e = EnumEntriesKt.a(iVarArrA);
    }

    private static final /* synthetic */ i[] a() {
        return new i[]{f60581a, f60582b, f60583c};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f60584d.clone();
    }

    private i(String str, int i10) {
    }
}
