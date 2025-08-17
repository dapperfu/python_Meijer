package kotlin.reflect.jvm.internal.impl.types;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class TypeUsage {

    /* renamed from: a, reason: collision with root package name */
    public static final TypeUsage f146787a = new TypeUsage("SUPERTYPE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final TypeUsage f146788b = new TypeUsage("COMMON", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ TypeUsage[] f146789c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146790d;

    private static final /* synthetic */ TypeUsage[] a() {
        return new TypeUsage[]{f146787a, f146788b};
    }

    static {
        TypeUsage[] typeUsageArrA = a();
        f146789c = typeUsageArrA;
        f146790d = EnumEntriesKt.a(typeUsageArrA);
    }

    public static TypeUsage valueOf(String str) {
        return (TypeUsage) Enum.valueOf(TypeUsage.class, str);
    }

    public static TypeUsage[] values() {
        return (TypeUsage[]) f146789c.clone();
    }

    private TypeUsage(String str, int i10) {
    }
}
