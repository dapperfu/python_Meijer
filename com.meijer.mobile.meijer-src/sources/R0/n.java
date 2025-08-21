package R0;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LR0/n;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f31548a = new n("VIEW_APPEAR", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final n f31549b = new n("VIEW_DISAPPEAR", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ n[] f31550c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f31551d;

    static {
        n[] nVarArrA = a();
        f31550c = nVarArrA;
        f31551d = EnumEntriesKt.a(nVarArrA);
    }

    private static final /* synthetic */ n[] a() {
        return new n[]{f31548a, f31549b};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f31550c.clone();
    }

    private n(String str, int i10) {
    }
}
