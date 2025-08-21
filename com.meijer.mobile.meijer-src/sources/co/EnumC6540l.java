package co;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lco/l;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: co.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC6540l {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6540l f62796a = new EnumC6540l("UNDEFINED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6540l f62797b = new EnumC6540l("PURCHASE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6540l f62798c = new EnumC6540l("NON_PURCHASE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC6540l[] f62799d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f62800e;

    static {
        EnumC6540l[] enumC6540lArrA = a();
        f62799d = enumC6540lArrA;
        f62800e = EnumEntriesKt.a(enumC6540lArrA);
    }

    private static final /* synthetic */ EnumC6540l[] a() {
        return new EnumC6540l[]{f62796a, f62797b, f62798c};
    }

    public static EnumC6540l valueOf(String str) {
        return (EnumC6540l) Enum.valueOf(EnumC6540l.class, str);
    }

    public static EnumC6540l[] values() {
        return (EnumC6540l[]) f62799d.clone();
    }

    private EnumC6540l(String str, int i10) {
    }
}
