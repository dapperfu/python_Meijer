package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lx0/m1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17957m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17957m1 f168342a = new EnumC17957m1("Short", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17957m1 f168343b = new EnumC17957m1("Long", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17957m1 f168344c = new EnumC17957m1("Indefinite", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC17957m1[] f168345d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f168346e;

    static {
        EnumC17957m1[] enumC17957m1ArrA = a();
        f168345d = enumC17957m1ArrA;
        f168346e = EnumEntriesKt.a(enumC17957m1ArrA);
    }

    private static final /* synthetic */ EnumC17957m1[] a() {
        return new EnumC17957m1[]{f168342a, f168343b, f168344c};
    }

    public static EnumC17957m1 valueOf(String str) {
        return (EnumC17957m1) Enum.valueOf(EnumC17957m1.class, str);
    }

    public static EnumC17957m1[] values() {
        return (EnumC17957m1[]) f168345d.clone();
    }

    private EnumC17957m1(String str, int i10) {
    }
}
