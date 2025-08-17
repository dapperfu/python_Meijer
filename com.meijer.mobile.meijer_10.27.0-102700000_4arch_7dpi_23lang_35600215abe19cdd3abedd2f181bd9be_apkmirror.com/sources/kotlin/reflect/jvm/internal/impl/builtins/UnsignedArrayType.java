package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class UnsignedArrayType {

    /* renamed from: c, reason: collision with root package name */
    public static final UnsignedArrayType f143421c;

    /* renamed from: d, reason: collision with root package name */
    public static final UnsignedArrayType f143422d;

    /* renamed from: e, reason: collision with root package name */
    public static final UnsignedArrayType f143423e;

    /* renamed from: f, reason: collision with root package name */
    public static final UnsignedArrayType f143424f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ UnsignedArrayType[] f143425g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143426h;

    /* renamed from: a, reason: collision with root package name */
    private final ClassId f143427a;

    /* renamed from: b, reason: collision with root package name */
    private final Name f143428b;

    private static final /* synthetic */ UnsignedArrayType[] a() {
        return new UnsignedArrayType[]{f143421c, f143422d, f143423e, f143424f};
    }

    static {
        ClassId.Companion companion = ClassId.f145674d;
        f143421c = new UnsignedArrayType("UBYTEARRAY", 0, ClassId.Companion.b(companion, "kotlin/UByteArray", false, 2, null));
        f143422d = new UnsignedArrayType("USHORTARRAY", 1, ClassId.Companion.b(companion, "kotlin/UShortArray", false, 2, null));
        f143423e = new UnsignedArrayType("UINTARRAY", 2, ClassId.Companion.b(companion, "kotlin/UIntArray", false, 2, null));
        f143424f = new UnsignedArrayType("ULONGARRAY", 3, ClassId.Companion.b(companion, "kotlin/ULongArray", false, 2, null));
        UnsignedArrayType[] unsignedArrayTypeArrA = a();
        f143425g = unsignedArrayTypeArrA;
        f143426h = EnumEntriesKt.a(unsignedArrayTypeArrA);
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) f143425g.clone();
    }

    public final Name b() {
        return this.f143428b;
    }

    private UnsignedArrayType(String str, int i10, ClassId classId) {
        this.f143427a = classId;
        this.f143428b = classId.h();
    }
}
