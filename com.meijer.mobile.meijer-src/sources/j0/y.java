package j0;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lj0/y;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f139753a = new y("Horizontal", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final y f139754b = new y("Vertical", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ y[] f139755c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f139756d;

    static {
        y[] yVarArrA = a();
        f139755c = yVarArrA;
        f139756d = EnumEntriesKt.a(yVarArrA);
    }

    private static final /* synthetic */ y[] a() {
        return new y[]{f139753a, f139754b};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f139755c.clone();
    }

    private y(String str, int i10) {
    }
}
