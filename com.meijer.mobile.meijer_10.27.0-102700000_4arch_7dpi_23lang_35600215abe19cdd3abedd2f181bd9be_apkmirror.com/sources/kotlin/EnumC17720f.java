package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lw0/f;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17720f {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17720f f165516a = new EnumC17720f("BEFORE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17720f f165517b = new EnumC17720f("ON", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17720f f165518c = new EnumC17720f("AFTER", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC17720f[] f165519d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f165520e;

    static {
        EnumC17720f[] enumC17720fArrA = a();
        f165519d = enumC17720fArrA;
        f165520e = EnumEntriesKt.a(enumC17720fArrA);
    }

    private static final /* synthetic */ EnumC17720f[] a() {
        return new EnumC17720f[]{f165516a, f165517b, f165518c};
    }

    public static EnumC17720f valueOf(String str) {
        return (EnumC17720f) Enum.valueOf(EnumC17720f.class, str);
    }

    public static EnumC17720f[] values() {
        return (EnumC17720f[]) f165519d.clone();
    }

    private EnumC17720f(String str, int i10) {
    }
}
