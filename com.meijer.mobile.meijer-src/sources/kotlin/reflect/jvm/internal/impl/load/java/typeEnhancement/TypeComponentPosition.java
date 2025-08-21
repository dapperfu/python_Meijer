package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class TypeComponentPosition {

    /* renamed from: a, reason: collision with root package name */
    public static final TypeComponentPosition f145587a = new TypeComponentPosition("FLEXIBLE_LOWER", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final TypeComponentPosition f145588b = new TypeComponentPosition("FLEXIBLE_UPPER", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final TypeComponentPosition f145589c = new TypeComponentPosition("INFLEXIBLE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ TypeComponentPosition[] f145590d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f145591e;

    private static final /* synthetic */ TypeComponentPosition[] a() {
        return new TypeComponentPosition[]{f145587a, f145588b, f145589c};
    }

    static {
        TypeComponentPosition[] typeComponentPositionArrA = a();
        f145590d = typeComponentPositionArrA;
        f145591e = EnumEntriesKt.a(typeComponentPositionArrA);
    }

    public static TypeComponentPosition valueOf(String str) {
        return (TypeComponentPosition) Enum.valueOf(TypeComponentPosition.class, str);
    }

    public static TypeComponentPosition[] values() {
        return (TypeComponentPosition[]) f145590d.clone();
    }

    private TypeComponentPosition(String str, int i10) {
    }
}
