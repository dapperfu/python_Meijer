package i9;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Li9/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: i9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC14699a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC14699a f137416a = new EnumC14699a("INSERT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC14699a f137417b = new EnumC14699a("DELETE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC14699a f137418c = new EnumC14699a("UPDATE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC14699a[] f137419d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f137420e;

    static {
        EnumC14699a[] enumC14699aArrA = a();
        f137419d = enumC14699aArrA;
        f137420e = EnumEntriesKt.a(enumC14699aArrA);
    }

    private static final /* synthetic */ EnumC14699a[] a() {
        return new EnumC14699a[]{f137416a, f137417b, f137418c};
    }

    public static EnumC14699a valueOf(String str) {
        return (EnumC14699a) Enum.valueOf(EnumC14699a.class, str);
    }

    public static EnumC14699a[] values() {
        return (EnumC14699a[]) f137419d.clone();
    }

    private EnumC14699a(String str, int i10) {
    }
}
