package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class TypeVariance {

    /* renamed from: b, reason: collision with root package name */
    public static final TypeVariance f147920b = new TypeVariance("IN", 0, "in");

    /* renamed from: c, reason: collision with root package name */
    public static final TypeVariance f147921c = new TypeVariance("OUT", 1, "out");

    /* renamed from: d, reason: collision with root package name */
    public static final TypeVariance f147922d = new TypeVariance("INV", 2, "");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ TypeVariance[] f147923e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f147924f;

    /* renamed from: a, reason: collision with root package name */
    private final String f147925a;

    private static final /* synthetic */ TypeVariance[] a() {
        return new TypeVariance[]{f147920b, f147921c, f147922d};
    }

    static {
        TypeVariance[] typeVarianceArrA = a();
        f147923e = typeVarianceArrA;
        f147924f = EnumEntriesKt.a(typeVarianceArrA);
    }

    public static TypeVariance valueOf(String str) {
        return (TypeVariance) Enum.valueOf(TypeVariance.class, str);
    }

    public static TypeVariance[] values() {
        return (TypeVariance[]) f147923e.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f147925a;
    }

    private TypeVariance(String str, int i10, String str2) {
        this.f147925a = str2;
    }
}
