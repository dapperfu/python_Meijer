package gk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lgk/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gk.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC14271a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC14271a f133707a = new EnumC14271a("OPT_IN_AS_PRIMARY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC14271a f133708b = new EnumC14271a("OPT_IN_TO_SAVE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC14271a f133709c = new EnumC14271a("SAVE_AUTOMATICALLY", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC14271a f133710d = new EnumC14271a("DO_NOT_SAVE", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC14271a[] f133711e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f133712f;

    static {
        EnumC14271a[] enumC14271aArrA = a();
        f133711e = enumC14271aArrA;
        f133712f = EnumEntriesKt.a(enumC14271aArrA);
    }

    private static final /* synthetic */ EnumC14271a[] a() {
        return new EnumC14271a[]{f133707a, f133708b, f133709c, f133710d};
    }

    public static EnumC14271a valueOf(String str) {
        return (EnumC14271a) Enum.valueOf(EnumC14271a.class, str);
    }

    public static EnumC14271a[] values() {
        return (EnumC14271a[]) f133711e.clone();
    }

    private EnumC14271a(String str, int i10) {
    }
}
