package kotlin.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

@SinceKotlin
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 12\u00020\u0001:\u00013B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b#\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001aR\u001c\u00100\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "platformTypeUpperBound", "", "flags", "<init>", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "", "isMarkedNullable", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "convertPrimitiveToWrapper", "", "i", "(Z)Ljava/lang/String;", "h", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/KClassifier;", "c", "()Lkotlin/reflect/KClassifier;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", "I", "getFlags$kotlin_stdlib", "getFlags$kotlin_stdlib$annotations", "Ljava/lang/Class;", "k", "(Ljava/lang/Class;)Ljava/lang/String;", "arrayClassName", "e", "()Z", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TypeReference implements KType {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KClassifier classifier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<KTypeProjection> arguments;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final KType platformTypeUpperBound;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int flags;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.f143858a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.f143859b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.f143860c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin
    public TypeReference(KClassifier classifier, List<KTypeProjection> arguments, KType kType, int i10) {
        Intrinsics.j(classifier, "classifier");
        Intrinsics.j(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = kType;
        this.flags = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence j(TypeReference typeReference, KTypeProjection it) {
        Intrinsics.j(it, "it");
        return typeReference.h(it);
    }

    private final String k(Class<?> cls) {
        return Intrinsics.e(cls, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.e(cls, char[].class) ? "kotlin.CharArray" : Intrinsics.e(cls, byte[].class) ? "kotlin.ByteArray" : Intrinsics.e(cls, short[].class) ? "kotlin.ShortArray" : Intrinsics.e(cls, int[].class) ? "kotlin.IntArray" : Intrinsics.e(cls, float[].class) ? "kotlin.FloatArray" : Intrinsics.e(cls, long[].class) ? "kotlin.LongArray" : Intrinsics.e(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @Override // kotlin.reflect.KType
    /* renamed from: c, reason: from getter */
    public KClassifier getClassifier() {
        return this.classifier;
    }

    @Override // kotlin.reflect.KType
    public List<KTypeProjection> d() {
        return this.arguments;
    }

    @Override // kotlin.reflect.KType
    public boolean e() {
        return (this.flags & 1) != 0;
    }

    public boolean equals(Object other) {
        if (!(other instanceof TypeReference)) {
            return false;
        }
        TypeReference typeReference = (TypeReference) other;
        return Intrinsics.e(getClassifier(), typeReference.getClassifier()) && Intrinsics.e(d(), typeReference.d()) && Intrinsics.e(this.platformTypeUpperBound, typeReference.platformTypeUpperBound) && this.flags == typeReference.flags;
    }

    public String toString() {
        return i(false) + " (Kotlin reflection is not available)";
    }

    private final String h(KTypeProjection kTypeProjection) {
        TypeReference typeReference;
        String strValueOf;
        int i10;
        if (kTypeProjection.d() == null) {
            return "*";
        }
        KType kTypeC = kTypeProjection.c();
        if (kTypeC instanceof TypeReference) {
            typeReference = (TypeReference) kTypeC;
        } else {
            typeReference = null;
        }
        if (typeReference == null || (strValueOf = typeReference.i(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.c());
        }
        KVariance kVarianceD = kTypeProjection.d();
        if (kVarianceD == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[kVarianceD.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "out " + strValueOf;
                }
                throw new NoWhenBranchMatchedException();
            }
            return "in " + strValueOf;
        }
        return strValueOf;
    }

    private final String i(boolean convertPrimitiveToWrapper) {
        KClass kClass;
        String name;
        String strB0;
        KClassifier classifier = getClassifier();
        Class<?> clsB = null;
        if (classifier instanceof KClass) {
            kClass = (KClass) classifier;
        } else {
            kClass = null;
        }
        if (kClass != null) {
            clsB = JvmClassMappingKt.b(kClass);
        }
        if (clsB == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsB.isArray()) {
            name = k(clsB);
        } else if (convertPrimitiveToWrapper && clsB.isPrimitive()) {
            KClassifier classifier2 = getClassifier();
            Intrinsics.h(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = JvmClassMappingKt.c((KClass) classifier2).getName();
        } else {
            name = clsB.getName();
        }
        String str = "";
        if (d().isEmpty()) {
            strB0 = "";
        } else {
            strB0 = CollectionsKt.B0(d(), ", ", "<", ">", 0, null, new Function1() { // from class: kotlin.jvm.internal.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TypeReference.j(this.f143777a, (KTypeProjection) obj);
                }
            }, 24, null);
        }
        if (e()) {
            str = "?";
        }
        String str2 = name + strB0 + str;
        KType kType = this.platformTypeUpperBound;
        if (kType instanceof TypeReference) {
            String strI = ((TypeReference) kType).i(true);
            if (!Intrinsics.e(strI, str2)) {
                if (Intrinsics.e(strI, str2 + '?')) {
                    return str2 + '!';
                }
                return '(' + str2 + ".." + strI + ')';
            }
            return str2;
        }
        return str2;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + d().hashCode()) * 31) + Integer.hashCode(this.flags);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(KClassifier classifier, List<KTypeProjection> arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        Intrinsics.j(classifier, "classifier");
        Intrinsics.j(arguments, "arguments");
    }
}
