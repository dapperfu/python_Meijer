package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0015\u001a\u00020\u0003*\u00020\t8BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/KType;", "", "forceWrapper", "Ljava/lang/reflect/Type;", "c", "(Lkotlin/reflect/KType;Z)Ljava/lang/reflect/Type;", "Ljava/lang/Class;", "jClass", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "e", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Type;", "type", "", "h", "(Ljava/lang/reflect/Type;)Ljava/lang/String;", "f", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "javaType", "g", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "(Lkotlin/reflect/KTypeProjection;)V", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class TypesJVMKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.f143859b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.f143858a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.f143860c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Class<?>, Class<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f143869b = new a();

        a() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class<?> invoke(Class<?> p02) {
            Intrinsics.j(p02, "p0");
            return p02.getComponentType();
        }
    }

    static /* synthetic */ Type d(KType kType, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(kType, z10);
    }

    public static final Type f(KType kType) {
        Type typeG;
        Intrinsics.j(kType, "<this>");
        return (!(kType instanceof KTypeBase) || (typeG = ((KTypeBase) kType).g()) == null) ? d(kType, false, 1, null) : typeG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            Intrinsics.i(name, "getName(...)");
            return name;
        }
        Sequence sequenceQ = SequencesKt.q(type, a.f143869b);
        return ((Class) SequencesKt.L(sequenceQ)).getName() + StringsKt.M("[]", SequencesKt.z(sequenceQ));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalStdlibApi
    public static final Type c(KType kType, boolean z10) {
        Class clsB;
        int i10;
        KClassifier kClassifierC = kType.c();
        if (kClassifierC instanceof KTypeParameter) {
            return new c((KTypeParameter) kClassifierC);
        }
        if (kClassifierC instanceof KClass) {
            KClass kClass = (KClass) kClassifierC;
            if (z10) {
                clsB = JvmClassMappingKt.c(kClass);
            } else {
                clsB = JvmClassMappingKt.b(kClass);
            }
            List<KTypeProjection> listD = kType.d();
            if (listD.isEmpty()) {
                return clsB;
            }
            if (clsB.isArray()) {
                if (!clsB.getComponentType().isPrimitive()) {
                    KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.W0(listD);
                    if (kTypeProjection != null) {
                        KVariance variance = kTypeProjection.getVariance();
                        KType type = kTypeProjection.getType();
                        if (variance == null) {
                            i10 = -1;
                        } else {
                            i10 = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
                        }
                        if (i10 != -1 && i10 != 1) {
                            if (i10 != 2 && i10 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Intrinsics.g(type);
                            Type typeD = d(type, false, 1, null);
                            if (!(typeD instanceof Class)) {
                                return new kotlin.reflect.a(typeD);
                            }
                            return clsB;
                        }
                        return clsB;
                    }
                    throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
                }
                return clsB;
            }
            return e(clsB, listD);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
    }

    @ExperimentalStdlibApi
    private static final Type e(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<KTypeProjection> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((KTypeProjection) it.next()));
            }
            return new b(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List<KTypeProjection> list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((KTypeProjection) it2.next()));
            }
            return new b(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((KTypeProjection) it3.next()));
        }
        return new b(cls, typeE, arrayList3);
    }

    private static final Type g(KTypeProjection kTypeProjection) {
        KVariance kVarianceD = kTypeProjection.d();
        if (kVarianceD == null) {
            return WildcardTypeImpl.f143870c.a();
        }
        KType kTypeC = kTypeProjection.c();
        Intrinsics.g(kTypeC);
        int i10 = WhenMappings.$EnumSwitchMapping$0[kVarianceD.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return new WildcardTypeImpl(c(kTypeC, true), null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return c(kTypeC, true);
        }
        return new WildcardTypeImpl(null, c(kTypeC, true));
    }
}
