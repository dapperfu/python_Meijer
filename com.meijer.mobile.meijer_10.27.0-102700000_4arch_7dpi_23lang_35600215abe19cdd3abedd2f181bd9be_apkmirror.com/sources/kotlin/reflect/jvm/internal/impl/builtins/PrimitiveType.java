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
/* loaded from: classes13.dex */
public final class PrimitiveType {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f143255e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final Set<PrimitiveType> f143256f;

    /* renamed from: g, reason: collision with root package name */
    public static final PrimitiveType f143257g = new PrimitiveType("BOOLEAN", 0, "Boolean");

    /* renamed from: h, reason: collision with root package name */
    public static final PrimitiveType f143258h;

    /* renamed from: i, reason: collision with root package name */
    public static final PrimitiveType f143259i;

    /* renamed from: j, reason: collision with root package name */
    public static final PrimitiveType f143260j;

    /* renamed from: k, reason: collision with root package name */
    public static final PrimitiveType f143261k;

    /* renamed from: l, reason: collision with root package name */
    public static final PrimitiveType f143262l;

    /* renamed from: m, reason: collision with root package name */
    public static final PrimitiveType f143263m;

    /* renamed from: n, reason: collision with root package name */
    public static final PrimitiveType f143264n;

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ PrimitiveType[] f143265o;

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f143266p;

    /* renamed from: a, reason: collision with root package name */
    private final Name f143267a;

    /* renamed from: b, reason: collision with root package name */
    private final Name f143268b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f143269c;

    /* renamed from: d, reason: collision with root package name */
    private final Lazy f143270d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PrimitiveType[] a() {
        return new PrimitiveType[]{f143257g, f143258h, f143259i, f143260j, f143261k, f143262l, f143263m, f143264n};
    }

    static {
        PrimitiveType primitiveType = new PrimitiveType("CHAR", 1, "Char");
        f143258h = primitiveType;
        PrimitiveType primitiveType2 = new PrimitiveType("BYTE", 2, "Byte");
        f143259i = primitiveType2;
        PrimitiveType primitiveType3 = new PrimitiveType("SHORT", 3, "Short");
        f143260j = primitiveType3;
        PrimitiveType primitiveType4 = new PrimitiveType("INT", 4, "Int");
        f143261k = primitiveType4;
        PrimitiveType primitiveType5 = new PrimitiveType("FLOAT", 5, "Float");
        f143262l = primitiveType5;
        PrimitiveType primitiveType6 = new PrimitiveType("LONG", 6, "Long");
        f143263m = primitiveType6;
        PrimitiveType primitiveType7 = new PrimitiveType("DOUBLE", 7, "Double");
        f143264n = primitiveType7;
        PrimitiveType[] primitiveTypeArrA = a();
        f143265o = primitiveTypeArrA;
        f143266p = EnumEntriesKt.a(primitiveTypeArrA);
        f143255e = new Companion(null);
        f143256f = SetsKt.i(primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName l(PrimitiveType primitiveType) {
        return StandardNames.f143284A.b(primitiveType.f143268b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName u(PrimitiveType primitiveType) {
        return StandardNames.f143284A.b(primitiveType.f143267a);
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) f143265o.clone();
    }

    public final FqName m() {
        return (FqName) this.f143270d.getValue();
    }

    public final Name o() {
        return this.f143268b;
    }

    public final FqName p() {
        return (FqName) this.f143269c.getValue();
    }

    public final Name t() {
        return this.f143267a;
    }

    private PrimitiveType(String str, int i10, String str2) {
        Name nameO = Name.o(str2);
        Intrinsics.i(nameO, "identifier(...)");
        this.f143267a = nameO;
        Name nameO2 = Name.o(str2 + "Array");
        Intrinsics.i(nameO2, "identifier(...)");
        this.f143268b = nameO2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f142380b;
        this.f143269c = LazyKt.a(lazyThreadSafetyMode, new c(this));
        this.f143270d = LazyKt.a(lazyThreadSafetyMode, new d(this));
    }
}
