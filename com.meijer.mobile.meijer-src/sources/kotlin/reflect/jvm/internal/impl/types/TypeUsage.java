package kotlin.reflect.jvm.internal.impl.types;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class TypeUsage {

    /* renamed from: a, reason: collision with root package name */
    public static final TypeUsage f147694a = new TypeUsage("SUPERTYPE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final TypeUsage f147695b = new TypeUsage("COMMON", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ TypeUsage[] f147696c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f147697d;

    private static final /* synthetic */ TypeUsage[] a() {
        return new TypeUsage[]{f147694a, f147695b};
    }

    static {
        TypeUsage[] typeUsageArrA = a();
        f147696c = typeUsageArrA;
        f147697d = EnumEntriesKt.a(typeUsageArrA);
    }

    public static TypeUsage valueOf(String str) {
        return (TypeUsage) Enum.valueOf(TypeUsage.class, str);
    }

    public static TypeUsage[] values() {
        return (TypeUsage[]) f147696c.clone();
    }

    private TypeUsage(String str, int i10) {
    }
}
