package Jh;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LJh/x;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f15868a = new x("NOT_VALIDATED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final x f15869b = new x("NOT_MORE_THAN_ONE_RULE_MET", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final x f15870c = new x("MORE_THAN_ONE_RULE_MET", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final x f15871d = new x("ALL_RULES_MET", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ x[] f15872e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f15873f;

    static {
        x[] xVarArrA = a();
        f15872e = xVarArrA;
        f15873f = EnumEntriesKt.a(xVarArrA);
    }

    private static final /* synthetic */ x[] a() {
        return new x[]{f15868a, f15869b, f15870c, f15871d};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f15872e.clone();
    }

    private x(String str, int i10) {
    }
}
