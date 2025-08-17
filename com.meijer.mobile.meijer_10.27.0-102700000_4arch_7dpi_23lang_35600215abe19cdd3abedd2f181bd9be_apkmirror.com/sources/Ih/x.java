package Ih;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LIh/x;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f14036a = new x("NOT_VALIDATED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final x f14037b = new x("NOT_MORE_THAN_ONE_RULE_MET", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final x f14038c = new x("MORE_THAN_ONE_RULE_MET", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final x f14039d = new x("ALL_RULES_MET", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ x[] f14040e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f14041f;

    static {
        x[] xVarArrA = a();
        f14040e = xVarArrA;
        f14041f = EnumEntriesKt.a(xVarArrA);
    }

    private static final /* synthetic */ x[] a() {
        return new x[]{f14036a, f14037b, f14038c, f14039d};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f14040e.clone();
    }

    private x(String str, int i10) {
    }
}
