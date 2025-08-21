package ro;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lro/b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ro.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC16932b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC16932b f159601a = new EnumC16932b("IN_PROGRESS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC16932b f159602b = new EnumC16932b("AVAILABLE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC16932b f159603c = new EnumC16932b("BOOSTER", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC16932b[] f159604d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f159605e;

    static {
        EnumC16932b[] enumC16932bArrA = a();
        f159604d = enumC16932bArrA;
        f159605e = EnumEntriesKt.a(enumC16932bArrA);
    }

    private static final /* synthetic */ EnumC16932b[] a() {
        return new EnumC16932b[]{f159601a, f159602b, f159603c};
    }

    public static EnumC16932b valueOf(String str) {
        return (EnumC16932b) Enum.valueOf(EnumC16932b.class, str);
    }

    public static EnumC16932b[] values() {
        return (EnumC16932b[]) f159604d.clone();
    }

    private EnumC16932b(String str, int i10) {
    }
}
