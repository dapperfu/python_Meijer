package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class ClassKind {

    /* renamed from: b, reason: collision with root package name */
    public static final ClassKind f144492b = new ClassKind("CLASS", 0, "class");

    /* renamed from: c, reason: collision with root package name */
    public static final ClassKind f144493c = new ClassKind("INTERFACE", 1, "interface");

    /* renamed from: d, reason: collision with root package name */
    public static final ClassKind f144494d = new ClassKind("ENUM_CLASS", 2, "enum class");

    /* renamed from: e, reason: collision with root package name */
    public static final ClassKind f144495e = new ClassKind("ENUM_ENTRY", 3, null);

    /* renamed from: f, reason: collision with root package name */
    public static final ClassKind f144496f = new ClassKind("ANNOTATION_CLASS", 4, "annotation class");

    /* renamed from: g, reason: collision with root package name */
    public static final ClassKind f144497g = new ClassKind("OBJECT", 5, "object");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ ClassKind[] f144498h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144499i;

    /* renamed from: a, reason: collision with root package name */
    private final String f144500a;

    private static final /* synthetic */ ClassKind[] a() {
        return new ClassKind[]{f144492b, f144493c, f144494d, f144495e, f144496f, f144497g};
    }

    static {
        ClassKind[] classKindArrA = a();
        f144498h = classKindArrA;
        f144499i = EnumEntriesKt.a(classKindArrA);
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) f144498h.clone();
    }

    public final boolean b() {
        return this == f144497g || this == f144495e;
    }

    private ClassKind(String str, int i10, String str2) {
        this.f144500a = str2;
    }
}
