package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class PrimitiveType {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f144162e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final Set<PrimitiveType> f144163f;

    /* renamed from: g, reason: collision with root package name */
    public static final PrimitiveType f144164g = new PrimitiveType("BOOLEAN", 0, "Boolean");

    /* renamed from: h, reason: collision with root package name */
    public static final PrimitiveType f144165h;

    /* renamed from: i, reason: collision with root package name */
    public static final PrimitiveType f144166i;

    /* renamed from: j, reason: collision with root package name */
    public static final PrimitiveType f144167j;

    /* renamed from: k, reason: collision with root package name */
    public static final PrimitiveType f144168k;

    /* renamed from: l, reason: collision with root package name */
    public static final PrimitiveType f144169l;

    /* renamed from: m, reason: collision with root package name */
    public static final PrimitiveType f144170m;

    /* renamed from: n, reason: collision with root package name */
    public static final PrimitiveType f144171n;

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ PrimitiveType[] f144172o;

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f144173p;

    /* renamed from: a, reason: collision with root package name */
    private final Name f144174a;

    /* renamed from: b, reason: collision with root package name */
    private final Name f144175b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f144176c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f144177d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PrimitiveType[] a() {
        return new PrimitiveType[]{f144164g, f144165h, f144166i, f144167j, f144168k, f144169l, f144170m, f144171n};
    }

    static {
        PrimitiveType primitiveType = new PrimitiveType("CHAR", 1, "Char");
        f144165h = primitiveType;
        PrimitiveType primitiveType2 = new PrimitiveType("BYTE", 2, "Byte");
        f144166i = primitiveType2;
        PrimitiveType primitiveType3 = new PrimitiveType("SHORT", 3, "Short");
        f144167j = primitiveType3;
        PrimitiveType primitiveType4 = new PrimitiveType("INT", 4, "Int");
        f144168k = primitiveType4;
        PrimitiveType primitiveType5 = new PrimitiveType("FLOAT", 5, "Float");
        f144169l = primitiveType5;
        PrimitiveType primitiveType6 = new PrimitiveType("LONG", 6, "Long");
        f144170m = primitiveType6;
        PrimitiveType primitiveType7 = new PrimitiveType("DOUBLE", 7, "Double");
        f144171n = primitiveType7;
        PrimitiveType[] primitiveTypeArrA = a();
        f144172o = primitiveTypeArrA;
        f144173p = EnumEntriesKt.a(primitiveTypeArrA);
        f144162e = new Companion(null);
        f144163f = SetsKt.i(primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName l(PrimitiveType primitiveType) {
        return StandardNames.f144191A.b(primitiveType.f144175b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName u(PrimitiveType primitiveType) {
        return StandardNames.f144191A.b(primitiveType.f144174a);
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) f144172o.clone();
    }

    public final FqName m() {
        return (FqName) this.f144177d.getValue();
    }

    public final Name o() {
        return this.f144175b;
    }

    public final FqName p() {
        return (FqName) this.f144176c.getValue();
    }

    public final Name t() {
        return this.f144174a;
    }

    private PrimitiveType(String str, int i10, String str2) {
        Name nameO = Name.o(str2);
        Intrinsics.i(nameO, "identifier(...)");
        this.f144174a = nameO;
        Name nameO2 = Name.o(str2 + "Array");
        Intrinsics.i(nameO2, "identifier(...)");
        this.f144175b = nameO2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143287b;
        this.f144176c = LazyKt.a(lazyThreadSafetyMode, new c(this));
        this.f144177d = LazyKt.a(lazyThreadSafetyMode, new d(this));
    }
}
