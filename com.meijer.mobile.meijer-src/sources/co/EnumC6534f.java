package co;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lco/f;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: co.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC6534f {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6534f f62714a = new EnumC6534f("All", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6534f f62715b = new EnumC6534f("InProgress", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6534f f62716c = new EnumC6534f("Available", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC6534f[] f62717d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f62718e;

    static {
        EnumC6534f[] enumC6534fArrA = a();
        f62717d = enumC6534fArrA;
        f62718e = EnumEntriesKt.a(enumC6534fArrA);
    }

    private static final /* synthetic */ EnumC6534f[] a() {
        return new EnumC6534f[]{f62714a, f62715b, f62716c};
    }

    public static EnumC6534f valueOf(String str) {
        return (EnumC6534f) Enum.valueOf(EnumC6534f.class, str);
    }

    public static EnumC6534f[] values() {
        return (EnumC6534f[]) f62717d.clone();
    }

    private EnumC6534f(String str, int i10) {
    }
}
