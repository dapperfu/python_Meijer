package Pp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LPp/b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26238a = new b("PRODUCT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f26239b = new b("COUPON", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f26240c = new b("PROACTIVE_SUBSTITUTION", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final b f26241d = new b("REACTIVE_SUBSTITUTION", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final b f26242e = new b("OOS_FIND_SIMILAR", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ b[] f26243f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f26244g;

    static {
        b[] bVarArrA = a();
        f26243f = bVarArrA;
        f26244g = EnumEntriesKt.a(bVarArrA);
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f26238a, f26239b, f26240c, f26241d, f26242e};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f26243f.clone();
    }

    private b(String str, int i10) {
    }
}
