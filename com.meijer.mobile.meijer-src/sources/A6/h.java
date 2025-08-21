package A6;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LA6/h;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f150a = new h("Get", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final h f151b = new h("Post", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ h[] f152c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f153d;

    static {
        h[] hVarArrA = a();
        f152c = hVarArrA;
        f153d = EnumEntriesKt.a(hVarArrA);
    }

    private static final /* synthetic */ h[] a() {
        return new h[]{f150a, f151b};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f152c.clone();
    }

    private h(String str, int i10) {
    }
}
