package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class ClassKind {

    /* renamed from: b, reason: collision with root package name */
    public static final ClassKind f143585b = new ClassKind("CLASS", 0, "class");

    /* renamed from: c, reason: collision with root package name */
    public static final ClassKind f143586c = new ClassKind("INTERFACE", 1, "interface");

    /* renamed from: d, reason: collision with root package name */
    public static final ClassKind f143587d = new ClassKind("ENUM_CLASS", 2, "enum class");

    /* renamed from: e, reason: collision with root package name */
    public static final ClassKind f143588e = new ClassKind("ENUM_ENTRY", 3, null);

    /* renamed from: f, reason: collision with root package name */
    public static final ClassKind f143589f = new ClassKind("ANNOTATION_CLASS", 4, "annotation class");

    /* renamed from: g, reason: collision with root package name */
    public static final ClassKind f143590g = new ClassKind("OBJECT", 5, "object");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ ClassKind[] f143591h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143592i;

    /* renamed from: a, reason: collision with root package name */
    private final String f143593a;

    private static final /* synthetic */ ClassKind[] a() {
        return new ClassKind[]{f143585b, f143586c, f143587d, f143588e, f143589f, f143590g};
    }

    static {
        ClassKind[] classKindArrA = a();
        f143591h = classKindArrA;
        f143592i = EnumEntriesKt.a(classKindArrA);
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) f143591h.clone();
    }

    public final boolean b() {
        return this == f143590g || this == f143588e;
    }

    private ClassKind(String str, int i10, String str2) {
        this.f143593a = str2;
    }
}
