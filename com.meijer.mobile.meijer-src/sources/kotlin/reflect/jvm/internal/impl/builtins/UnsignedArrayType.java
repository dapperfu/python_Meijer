package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class UnsignedArrayType {

    /* renamed from: c, reason: collision with root package name */
    public static final UnsignedArrayType f144328c;

    /* renamed from: d, reason: collision with root package name */
    public static final UnsignedArrayType f144329d;

    /* renamed from: e, reason: collision with root package name */
    public static final UnsignedArrayType f144330e;

    /* renamed from: f, reason: collision with root package name */
    public static final UnsignedArrayType f144331f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ UnsignedArrayType[] f144332g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144333h;

    /* renamed from: a, reason: collision with root package name */
    private final ClassId f144334a;

    /* renamed from: b, reason: collision with root package name */
    private final Name f144335b;

    private static final /* synthetic */ UnsignedArrayType[] a() {
        return new UnsignedArrayType[]{f144328c, f144329d, f144330e, f144331f};
    }

    static {
        ClassId.Companion companion = ClassId.f146581d;
        f144328c = new UnsignedArrayType("UBYTEARRAY", 0, ClassId.Companion.b(companion, "kotlin/UByteArray", false, 2, null));
        f144329d = new UnsignedArrayType("USHORTARRAY", 1, ClassId.Companion.b(companion, "kotlin/UShortArray", false, 2, null));
        f144330e = new UnsignedArrayType("UINTARRAY", 2, ClassId.Companion.b(companion, "kotlin/UIntArray", false, 2, null));
        f144331f = new UnsignedArrayType("ULONGARRAY", 3, ClassId.Companion.b(companion, "kotlin/ULongArray", false, 2, null));
        UnsignedArrayType[] unsignedArrayTypeArrA = a();
        f144332g = unsignedArrayTypeArrA;
        f144333h = EnumEntriesKt.a(unsignedArrayTypeArrA);
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) f144332g.clone();
    }

    public final Name b() {
        return this.f144335b;
    }

    private UnsignedArrayType(String str, int i10, ClassId classId) {
        this.f144334a = classId;
        this.f144335b = classId.h();
    }
}
