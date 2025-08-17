package Da;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LDa/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5089a = new a("CUSTOM", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f5090b = new a("INTERNAL", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a[] f5091c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5092d;

    static {
        a[] aVarArrA = a();
        f5091c = aVarArrA;
        f5092d = EnumEntriesKt.a(aVarArrA);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f5089a, f5090b};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5091c.clone();
    }

    private a(String str, int i10) {
    }
}
