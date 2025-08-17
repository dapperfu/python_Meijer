package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx0/q1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17969q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17969q1 f168636a = new EnumC17969q1("Dismissed", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17969q1 f168637b = new EnumC17969q1("ActionPerformed", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC17969q1[] f168638c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f168639d;

    static {
        EnumC17969q1[] enumC17969q1ArrA = a();
        f168638c = enumC17969q1ArrA;
        f168639d = EnumEntriesKt.a(enumC17969q1ArrA);
    }

    private static final /* synthetic */ EnumC17969q1[] a() {
        return new EnumC17969q1[]{f168636a, f168637b};
    }

    public static EnumC17969q1 valueOf(String str) {
        return (EnumC17969q1) Enum.valueOf(EnumC17969q1.class, str);
    }

    public static EnumC17969q1[] values() {
        return (EnumC17969q1[]) f168638c.clone();
    }

    private EnumC17969q1(String str, int i10) {
    }
}
