package g1;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lg1/s;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC14186s {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC14186s f132678a = new EnumC14186s("Initial", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC14186s f132679b = new EnumC14186s("Main", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC14186s f132680c = new EnumC14186s("Final", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC14186s[] f132681d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f132682e;

    static {
        EnumC14186s[] enumC14186sArrA = a();
        f132681d = enumC14186sArrA;
        f132682e = EnumEntriesKt.a(enumC14186sArrA);
    }

    private static final /* synthetic */ EnumC14186s[] a() {
        return new EnumC14186s[]{f132678a, f132679b, f132680c};
    }

    public static EnumC14186s valueOf(String str) {
        return (EnumC14186s) Enum.valueOf(EnumC14186s.class, str);
    }

    public static EnumC14186s[] values() {
        return (EnumC14186s[]) f132681d.clone();
    }

    private EnumC14186s(String str, int i10) {
    }
}
