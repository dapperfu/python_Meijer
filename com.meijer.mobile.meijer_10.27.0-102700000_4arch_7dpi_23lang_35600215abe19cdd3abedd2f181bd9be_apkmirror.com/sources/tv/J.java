package tv;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ltv/J;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f162128a = new J("START", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final J f162129b = new J("STOP", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final J f162130c = new J("STOP_AND_RESET_REPLAY_CACHE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ J[] f162131d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f162132e;

    static {
        J[] jArrA = a();
        f162131d = jArrA;
        f162132e = EnumEntriesKt.a(jArrA);
    }

    private static final /* synthetic */ J[] a() {
        return new J[]{f162128a, f162129b, f162130c};
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f162131d.clone();
    }

    private J(String str, int i10) {
    }
}
