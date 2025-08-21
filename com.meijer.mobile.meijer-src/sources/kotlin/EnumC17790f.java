package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lw0/f;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17790f {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17790f f166727a = new EnumC17790f("BEFORE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17790f f166728b = new EnumC17790f("ON", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17790f f166729c = new EnumC17790f("AFTER", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC17790f[] f166730d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f166731e;

    static {
        EnumC17790f[] enumC17790fArrA = a();
        f166730d = enumC17790fArrA;
        f166731e = EnumEntriesKt.a(enumC17790fArrA);
    }

    private static final /* synthetic */ EnumC17790f[] a() {
        return new EnumC17790f[]{f166727a, f166728b, f166729c};
    }

    public static EnumC17790f valueOf(String str) {
        return (EnumC17790f) Enum.valueOf(EnumC17790f.class, str);
    }

    public static EnumC17790f[] values() {
        return (EnumC17790f[]) f166730d.clone();
    }

    private EnumC17790f(String str, int i10) {
    }
}
