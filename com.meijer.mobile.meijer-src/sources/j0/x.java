package j0;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lj0/x;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f139749a = new x("Min", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final x f139750b = new x("Max", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ x[] f139751c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f139752d;

    static {
        x[] xVarArrA = a();
        f139751c = xVarArrA;
        f139752d = EnumEntriesKt.a(xVarArrA);
    }

    private static final /* synthetic */ x[] a() {
        return new x[]{f139749a, f139750b};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f139751c.clone();
    }

    private x(String str, int i10) {
    }
}
