package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lx0/m1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC18023m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC18023m1 f169430a = new EnumC18023m1("Short", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC18023m1 f169431b = new EnumC18023m1("Long", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC18023m1 f169432c = new EnumC18023m1("Indefinite", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC18023m1[] f169433d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f169434e;

    static {
        EnumC18023m1[] enumC18023m1ArrA = a();
        f169433d = enumC18023m1ArrA;
        f169434e = EnumEntriesKt.a(enumC18023m1ArrA);
    }

    private static final /* synthetic */ EnumC18023m1[] a() {
        return new EnumC18023m1[]{f169430a, f169431b, f169432c};
    }

    public static EnumC18023m1 valueOf(String str) {
        return (EnumC18023m1) Enum.valueOf(EnumC18023m1.class, str);
    }

    public static EnumC18023m1[] values() {
        return (EnumC18023m1[]) f169433d.clone();
    }

    private EnumC18023m1(String str, int i10) {
    }
}
