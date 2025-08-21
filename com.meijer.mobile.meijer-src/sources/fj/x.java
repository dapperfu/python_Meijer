package fj;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lfj/x;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f131996a = new x("PENDING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final x f131997b = new x("APPROVED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final x f131998c = new x("DECLINED", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ x[] f131999d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f132000e;

    static {
        x[] xVarArrA = a();
        f131999d = xVarArrA;
        f132000e = EnumEntriesKt.a(xVarArrA);
    }

    private static final /* synthetic */ x[] a() {
        return new x[]{f131996a, f131997b, f131998c};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f131999d.clone();
    }

    private x(String str, int i10) {
    }
}
