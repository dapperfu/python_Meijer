package X9;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LX9/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "mobile-engage-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f39177a = new c("ENTER", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final c f39178b = new c("EXIT", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final c f39179c = new c("DWELLING", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ c[] f39180d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f39181e;

    static {
        c[] cVarArrA = a();
        f39180d = cVarArrA;
        f39181e = EnumEntriesKt.a(cVarArrA);
    }

    private static final /* synthetic */ c[] a() {
        return new c[]{f39177a, f39178b, f39179c};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f39180d.clone();
    }

    private c(String str, int i10) {
    }
}
