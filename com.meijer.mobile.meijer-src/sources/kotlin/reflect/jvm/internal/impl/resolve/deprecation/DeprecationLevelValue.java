package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class DeprecationLevelValue {

    /* renamed from: a, reason: collision with root package name */
    public static final DeprecationLevelValue f147111a = new DeprecationLevelValue("WARNING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final DeprecationLevelValue f147112b = new DeprecationLevelValue("ERROR", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final DeprecationLevelValue f147113c = new DeprecationLevelValue("HIDDEN", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ DeprecationLevelValue[] f147114d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f147115e;

    private static final /* synthetic */ DeprecationLevelValue[] a() {
        return new DeprecationLevelValue[]{f147111a, f147112b, f147113c};
    }

    static {
        DeprecationLevelValue[] deprecationLevelValueArrA = a();
        f147114d = deprecationLevelValueArrA;
        f147115e = EnumEntriesKt.a(deprecationLevelValueArrA);
    }

    public static DeprecationLevelValue valueOf(String str) {
        return (DeprecationLevelValue) Enum.valueOf(DeprecationLevelValue.class, str);
    }

    public static DeprecationLevelValue[] values() {
        return (DeprecationLevelValue[]) f147114d.clone();
    }

    private DeprecationLevelValue(String str, int i10) {
    }
}
