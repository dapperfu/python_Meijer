package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class UnsignedType {

    /* renamed from: d, reason: collision with root package name */
    public static final UnsignedType f143429d;

    /* renamed from: e, reason: collision with root package name */
    public static final UnsignedType f143430e;

    /* renamed from: f, reason: collision with root package name */
    public static final UnsignedType f143431f;

    /* renamed from: g, reason: collision with root package name */
    public static final UnsignedType f143432g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ UnsignedType[] f143433h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143434i;

    /* renamed from: a, reason: collision with root package name */
    private final ClassId f143435a;

    /* renamed from: b, reason: collision with root package name */
    private final Name f143436b;

    /* renamed from: c, reason: collision with root package name */
    private final ClassId f143437c;

    private static final /* synthetic */ UnsignedType[] a() {
        return new UnsignedType[]{f143429d, f143430e, f143431f, f143432g};
    }

    static {
        ClassId.Companion companion = ClassId.f145674d;
        f143429d = new UnsignedType("UBYTE", 0, ClassId.Companion.b(companion, "kotlin/UByte", false, 2, null));
        f143430e = new UnsignedType("USHORT", 1, ClassId.Companion.b(companion, "kotlin/UShort", false, 2, null));
        f143431f = new UnsignedType("UINT", 2, ClassId.Companion.b(companion, "kotlin/UInt", false, 2, null));
        f143432g = new UnsignedType("ULONG", 3, ClassId.Companion.b(companion, "kotlin/ULong", false, 2, null));
        UnsignedType[] unsignedTypeArrA = a();
        f143433h = unsignedTypeArrA;
        f143434i = EnumEntriesKt.a(unsignedTypeArrA);
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) f143433h.clone();
    }

    public final ClassId b() {
        return this.f143437c;
    }

    public final ClassId e() {
        return this.f143435a;
    }

    public final Name l() {
        return this.f143436b;
    }

    private UnsignedType(String str, int i10, ClassId classId) {
        this.f143435a = classId;
        Name nameH = classId.h();
        this.f143436b = nameH;
        FqName fqNameF = classId.f();
        Name nameO = Name.o(nameH.b() + "Array");
        Intrinsics.i(nameO, "identifier(...)");
        this.f143437c = new ClassId(fqNameF, nameO);
    }
}
