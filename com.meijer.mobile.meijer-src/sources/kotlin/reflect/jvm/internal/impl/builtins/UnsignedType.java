package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class UnsignedType {

    /* renamed from: d, reason: collision with root package name */
    public static final UnsignedType f144336d;

    /* renamed from: e, reason: collision with root package name */
    public static final UnsignedType f144337e;

    /* renamed from: f, reason: collision with root package name */
    public static final UnsignedType f144338f;

    /* renamed from: g, reason: collision with root package name */
    public static final UnsignedType f144339g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ UnsignedType[] f144340h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144341i;

    /* renamed from: a, reason: collision with root package name */
    private final ClassId f144342a;

    /* renamed from: b, reason: collision with root package name */
    private final Name f144343b;

    /* renamed from: c, reason: collision with root package name */
    private final ClassId f144344c;

    private static final /* synthetic */ UnsignedType[] a() {
        return new UnsignedType[]{f144336d, f144337e, f144338f, f144339g};
    }

    static {
        ClassId.Companion companion = ClassId.f146581d;
        f144336d = new UnsignedType("UBYTE", 0, ClassId.Companion.b(companion, "kotlin/UByte", false, 2, null));
        f144337e = new UnsignedType("USHORT", 1, ClassId.Companion.b(companion, "kotlin/UShort", false, 2, null));
        f144338f = new UnsignedType("UINT", 2, ClassId.Companion.b(companion, "kotlin/UInt", false, 2, null));
        f144339g = new UnsignedType("ULONG", 3, ClassId.Companion.b(companion, "kotlin/ULong", false, 2, null));
        UnsignedType[] unsignedTypeArrA = a();
        f144340h = unsignedTypeArrA;
        f144341i = EnumEntriesKt.a(unsignedTypeArrA);
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) f144340h.clone();
    }

    public final ClassId b() {
        return this.f144344c;
    }

    public final ClassId e() {
        return this.f144342a;
    }

    public final Name l() {
        return this.f144343b;
    }

    private UnsignedType(String str, int i10, ClassId classId) {
        this.f144342a = classId;
        Name nameH = classId.h();
        this.f144343b = nameH;
        FqName fqNameF = classId.f();
        Name nameO = Name.o(nameH.b() + "Array");
        Intrinsics.i(nameO, "identifier(...)");
        this.f144344c = new ClassId(fqNameF, nameO);
    }
}
