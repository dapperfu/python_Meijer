package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class AbstractSignatureParts<TAnnotation> {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final KotlinTypeMarker f144616a;

        /* renamed from: b, reason: collision with root package name */
        private final JavaTypeQualifiersByElementType f144617b;

        /* renamed from: c, reason: collision with root package name */
        private final TypeParameterMarker f144618c;

        public final JavaTypeQualifiersByElementType a() {
            return this.f144617b;
        }

        public final KotlinTypeMarker b() {
            return this.f144616a;
        }

        public final TypeParameterMarker c() {
            return this.f144618c;
        }

        public a(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType, TypeParameterMarker typeParameterMarker) {
            this.f144616a = kotlinTypeMarker;
            this.f144617b = javaTypeQualifiersByElementType;
            this.f144618c = typeParameterMarker;
        }
    }

    public abstract TypeSystemContext A();

    public abstract boolean B(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean C();

    public abstract boolean D(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean E(TypeParameterMarker typeParameterMarker);

    public boolean F(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.j(kotlinTypeMarker, "<this>");
        return false;
    }

    public abstract boolean l(TAnnotation tannotation, KotlinTypeMarker kotlinTypeMarker);

    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> m();

    public abstract Iterable<TAnnotation> n(KotlinTypeMarker kotlinTypeMarker);

    public abstract Iterable<TAnnotation> p();

    public abstract AnnotationQualifierApplicabilityType q();

    public abstract JavaTypeQualifiersByElementType r();

    public abstract boolean s();

    protected abstract NullabilityQualifierWithMigrationStatus t(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers);

    public abstract boolean u();

    public abstract KotlinTypeMarker v(KotlinTypeMarker kotlinTypeMarker);

    public boolean w() {
        return false;
    }

    public abstract FqNameUnsafe x(KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean z();

    private final NullabilityQualifierWithMigrationStatus G(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
        return nullabilityQualifierWithMigrationStatus == null ? nullabilityQualifierWithMigrationStatus2 : (nullabilityQualifierWithMigrationStatus2 != null && ((nullabilityQualifierWithMigrationStatus.d() && !nullabilityQualifierWithMigrationStatus2.d()) || ((nullabilityQualifierWithMigrationStatus.d() || !nullabilityQualifierWithMigrationStatus2.d()) && (nullabilityQualifierWithMigrationStatus.c().compareTo(nullabilityQualifierWithMigrationStatus2.c()) < 0 || nullabilityQualifierWithMigrationStatus.c().compareTo(nullabilityQualifierWithMigrationStatus2.c()) <= 0)))) ? nullabilityQualifierWithMigrationStatus2 : nullabilityQualifierWithMigrationStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable I(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext, a it) {
        KotlinTypeMarker kotlinTypeMarkerB;
        TypeConstructorMarker typeConstructorMarkerH0;
        List<TypeParameterMarker> listY0;
        KotlinTypeMarker kotlinTypeMarkerB2;
        Intrinsics.j(it, "it");
        if ((abstractSignatureParts.z() && (kotlinTypeMarkerB2 = it.b()) != null && typeSystemContext.z(kotlinTypeMarkerB2)) || (kotlinTypeMarkerB = it.b()) == null || (typeConstructorMarkerH0 = typeSystemContext.h0(kotlinTypeMarkerB)) == null || (listY0 = typeSystemContext.y0(typeConstructorMarkerH0)) == null) {
            return null;
        }
        List<TypeParameterMarker> list = listY0;
        List<TypeArgumentMarker> listD = typeSystemContext.D(it.b());
        Iterator<T> it2 = list.iterator();
        Iterator<T> it3 = listD.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt.x(list, 10), CollectionsKt.x(listD, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            TypeParameterMarker typeParameterMarker = (TypeParameterMarker) it2.next();
            KotlinTypeMarker kotlinTypeMarkerI0 = typeSystemContext.I0((TypeArgumentMarker) it3.next());
            arrayList.add(kotlinTypeMarkerI0 == null ? new a(null, it.a(), typeParameterMarker) : new a(kotlinTypeMarkerI0, abstractSignatureParts.f(kotlinTypeMarkerI0, it.a()), typeParameterMarker));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaTypeQualifiers e(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr, int i10) {
        Map<Integer, JavaTypeQualifiers> mapB;
        JavaTypeQualifiers javaTypeQualifiers;
        return (typeEnhancementInfo == null || (mapB = typeEnhancementInfo.b()) == null || (javaTypeQualifiers = mapB.get(Integer.valueOf(i10))) == null) ? (i10 < 0 || i10 >= javaTypeQualifiersArr.length) ? JavaTypeQualifiers.f144636e.a() : javaTypeQualifiersArr[i10] : javaTypeQualifiers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(AbstractSignatureParts abstractSignatureParts, a aVar, Object extractNullability) {
        Intrinsics.j(extractNullability, "$this$extractNullability");
        return abstractSignatureParts.l(extractNullability, aVar.b());
    }

    private final <T> List<T> j(T t10, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        ArrayList arrayList = new ArrayList(1);
        k(t10, arrayList, function1);
        return arrayList;
    }

    public final Function1<Integer, JavaTypeQualifiers> d(KotlinTypeMarker kotlinTypeMarker, Iterable<? extends KotlinTypeMarker> overrides, TypeEnhancementInfo typeEnhancementInfo, boolean z10) {
        int size;
        KotlinTypeMarker kotlinTypeMarkerB;
        Intrinsics.j(kotlinTypeMarker, "<this>");
        Intrinsics.j(overrides, "overrides");
        List<a> listH = H(kotlinTypeMarker);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(overrides, 10));
        Iterator<? extends KotlinTypeMarker> it = overrides.iterator();
        while (it.hasNext()) {
            arrayList.add(H(it.next()));
        }
        if (w()) {
            size = 1;
            break;
        }
        if (C() && (!(overrides instanceof Collection) || !((Collection) overrides).isEmpty())) {
            Iterator<? extends KotlinTypeMarker> it2 = overrides.iterator();
            while (it2.hasNext()) {
                if (!D(kotlinTypeMarker, it2.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = listH.size();
        JavaTypeQualifiers[] javaTypeQualifiersArr = new JavaTypeQualifiers[size];
        int i10 = 0;
        while (i10 < size) {
            JavaTypeQualifiers javaTypeQualifiersH = h(listH.get(i10));
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a aVar = (a) CollectionsKt.v0((List) it3.next(), i10);
                JavaTypeQualifiers javaTypeQualifiersG = (aVar == null || (kotlinTypeMarkerB = aVar.b()) == null) ? null : g(kotlinTypeMarkerB);
                if (javaTypeQualifiersG != null) {
                    arrayList2.add(javaTypeQualifiersG);
                }
            }
            javaTypeQualifiersArr[i10] = TypeEnhancementUtilsKt.a(javaTypeQualifiersH, arrayList2, i10 == 0 && C(), i10 == 0 && s(), z10);
            i10++;
        }
        return new C15252b(typeEnhancementInfo, javaTypeQualifiersArr);
    }

    private final List<a> H(KotlinTypeMarker kotlinTypeMarker) {
        return j(new a(kotlinTypeMarker, f(kotlinTypeMarker, r()), null), new C15253c(this, A()));
    }

    private final JavaTypeQualifiersByElementType f(KotlinTypeMarker kotlinTypeMarker, JavaTypeQualifiersByElementType javaTypeQualifiersByElementType) {
        return m().d(javaTypeQualifiersByElementType, n(kotlinTypeMarker));
    }

    private final JavaTypeQualifiers g(KotlinTypeMarker kotlinTypeMarker) {
        NullabilityQualifier nullabilityQualifierY;
        boolean z10;
        NullabilityQualifier nullabilityQualifierY2 = y(kotlinTypeMarker);
        MutabilityQualifier mutabilityQualifier = null;
        if (nullabilityQualifierY2 == null) {
            KotlinTypeMarker kotlinTypeMarkerV = v(kotlinTypeMarker);
            if (kotlinTypeMarkerV != null) {
                nullabilityQualifierY = y(kotlinTypeMarkerV);
            } else {
                nullabilityQualifierY = null;
            }
        } else {
            nullabilityQualifierY = nullabilityQualifierY2;
        }
        TypeSystemContext typeSystemContextA = A();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.f143492a;
        if (javaToKotlinClassMap.l(x(typeSystemContextA.A0(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.f144645a;
        } else if (javaToKotlinClassMap.k(x(typeSystemContextA.C(kotlinTypeMarker)))) {
            mutabilityQualifier = MutabilityQualifier.f144646b;
        }
        boolean z11 = true;
        if (!A().l0(kotlinTypeMarker) && !F(kotlinTypeMarker)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (nullabilityQualifierY == nullabilityQualifierY2) {
            z11 = false;
        }
        return new JavaTypeQualifiers(nullabilityQualifierY, mutabilityQualifier, z10, z11);
    }

    private final JavaTypeQualifiers h(a aVar) {
        boolean z10;
        List listM;
        TypeParameterMarker typeParameterMarkerU;
        boolean z11;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityTypeQ;
        JavaDefaultQualifiers javaDefaultQualifiersA;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusO;
        NullabilityQualifier nullabilityQualifierC;
        boolean z12;
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusO2;
        KotlinTypeMarker kotlinTypeMarkerB;
        TypeConstructorMarker typeConstructorMarkerH0;
        TypeVariance typeVarianceY;
        NullabilityQualifier nullabilityQualifierC2 = null;
        if (aVar.b() == null) {
            TypeSystemContext typeSystemContextA = A();
            TypeParameterMarker typeParameterMarkerC = aVar.c();
            if (typeParameterMarkerC != null) {
                typeVarianceY = typeSystemContextA.y(typeParameterMarkerC);
            } else {
                typeVarianceY = null;
            }
            if (typeVarianceY == TypeVariance.f147013b) {
                return JavaTypeQualifiers.f144636e.a();
            }
        }
        boolean z13 = false;
        if (aVar.c() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        KotlinTypeMarker kotlinTypeMarkerB2 = aVar.b();
        if (kotlinTypeMarkerB2 == null || (listM = n(kotlinTypeMarkerB2)) == null) {
            listM = CollectionsKt.m();
        }
        TypeSystemContext typeSystemContextA2 = A();
        KotlinTypeMarker kotlinTypeMarkerB3 = aVar.b();
        if (kotlinTypeMarkerB3 != null && (typeConstructorMarkerH0 = typeSystemContextA2.h0(kotlinTypeMarkerB3)) != null) {
            typeParameterMarkerU = typeSystemContextA2.u(typeConstructorMarkerH0);
        } else {
            typeParameterMarkerU = null;
        }
        if (q() == AnnotationQualifierApplicabilityType.f144156f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            if (!z11 && u() && (kotlinTypeMarkerB = aVar.b()) != null && B(kotlinTypeMarkerB)) {
                Iterable<TAnnotation> iterableP = p();
                ArrayList arrayList = new ArrayList();
                for (TAnnotation tannotation : iterableP) {
                    if (!m().p(tannotation)) {
                        arrayList.add(tannotation);
                    }
                }
                listM = CollectionsKt.P0(arrayList, listM);
            } else {
                listM = CollectionsKt.N0(p(), listM);
            }
        }
        MutabilityQualifier mutabilityQualifierG = m().g(listM);
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusH = m().h(listM, new C15251a(this, aVar));
        if (nullabilityQualifierWithMigrationStatusH != null) {
            NullabilityQualifier nullabilityQualifierC3 = nullabilityQualifierWithMigrationStatusH.c();
            if (nullabilityQualifierWithMigrationStatusH.c() == NullabilityQualifier.f144653c && typeParameterMarkerU != null) {
                z13 = true;
            }
            return new JavaTypeQualifiers(nullabilityQualifierC3, mutabilityQualifierG, z13, nullabilityQualifierWithMigrationStatusH.d());
        }
        if (!z10 && !z11) {
            annotationQualifierApplicabilityTypeQ = AnnotationQualifierApplicabilityType.f144155e;
        } else {
            annotationQualifierApplicabilityTypeQ = q();
        }
        JavaTypeQualifiersByElementType javaTypeQualifiersByElementTypeA = aVar.a();
        if (javaTypeQualifiersByElementTypeA != null) {
            javaDefaultQualifiersA = javaTypeQualifiersByElementTypeA.a(annotationQualifierApplicabilityTypeQ);
        } else {
            javaDefaultQualifiersA = null;
        }
        if (typeParameterMarkerU != null) {
            nullabilityQualifierWithMigrationStatusO = o(typeParameterMarkerU);
        } else {
            nullabilityQualifierWithMigrationStatusO = null;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusT = t(nullabilityQualifierWithMigrationStatusO, javaDefaultQualifiersA);
        if (nullabilityQualifierWithMigrationStatusO != null) {
            nullabilityQualifierC = nullabilityQualifierWithMigrationStatusO.c();
        } else {
            nullabilityQualifierC = null;
        }
        if (nullabilityQualifierC != NullabilityQualifier.f144653c && (typeParameterMarkerU == null || javaDefaultQualifiersA == null || !javaDefaultQualifiersA.c())) {
            z12 = false;
        } else {
            z12 = true;
        }
        TypeParameterMarker typeParameterMarkerC2 = aVar.c();
        if (typeParameterMarkerC2 != null && (nullabilityQualifierWithMigrationStatusO2 = o(typeParameterMarkerC2)) != null) {
            if (nullabilityQualifierWithMigrationStatusO2.c() == NullabilityQualifier.f144652b) {
                nullabilityQualifierWithMigrationStatusO2 = NullabilityQualifierWithMigrationStatus.b(nullabilityQualifierWithMigrationStatusO2, NullabilityQualifier.f144651a, false, 2, null);
            }
        } else {
            nullabilityQualifierWithMigrationStatusO2 = null;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatusG = G(nullabilityQualifierWithMigrationStatusO2, nullabilityQualifierWithMigrationStatusT);
        if (nullabilityQualifierWithMigrationStatusG != null) {
            nullabilityQualifierC2 = nullabilityQualifierWithMigrationStatusG.c();
        }
        if (nullabilityQualifierWithMigrationStatusG != null && nullabilityQualifierWithMigrationStatusG.d()) {
            z13 = true;
        }
        return new JavaTypeQualifiers(nullabilityQualifierC2, mutabilityQualifierG, z12, z13);
    }

    private final <T> void k(T t10, List<T> list, Function1<? super T, ? extends Iterable<? extends T>> function1) {
        list.add(t10);
        Iterable<? extends T> iterableInvoke = function1.invoke(t10);
        if (iterableInvoke != null) {
            Iterator<? extends T> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                k(it.next(), list, function1);
            }
        }
    }

    private final NullabilityQualifierWithMigrationStatus o(TypeParameterMarker typeParameterMarker) {
        List<KotlinTypeMarker> arrayList;
        NullabilityQualifier nullabilityQualifier;
        boolean z10;
        TypeSystemContext typeSystemContextA = A();
        if (!E(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> listU = typeSystemContextA.U(typeParameterMarker);
        List<KotlinTypeMarker> list = listU;
        boolean z11 = list instanceof Collection;
        if (!z11 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!typeSystemContextA.E((KotlinTypeMarker) it.next())) {
                    if (!z11 || !list.isEmpty()) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (y((KotlinTypeMarker) it2.next()) != null) {
                                arrayList = listU;
                                break;
                            }
                        }
                    }
                    if (!z11 || !list.isEmpty()) {
                        Iterator<T> it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (v((KotlinTypeMarker) it3.next()) != null) {
                                arrayList = new ArrayList<>();
                                Iterator<T> it4 = list.iterator();
                                while (it4.hasNext()) {
                                    KotlinTypeMarker kotlinTypeMarkerV = v((KotlinTypeMarker) it4.next());
                                    if (kotlinTypeMarkerV != null) {
                                        arrayList.add(kotlinTypeMarkerV);
                                    }
                                }
                                List<KotlinTypeMarker> list2 = arrayList;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator<T> it5 = list2.iterator();
                                    while (it5.hasNext()) {
                                        if (!typeSystemContextA.O((KotlinTypeMarker) it5.next())) {
                                            nullabilityQualifier = NullabilityQualifier.f144653c;
                                            break;
                                        }
                                    }
                                    nullabilityQualifier = NullabilityQualifier.f144652b;
                                } else {
                                    nullabilityQualifier = NullabilityQualifier.f144652b;
                                }
                                if (arrayList != listU) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, z10);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private final NullabilityQualifier y(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystemContextA = A();
        if (typeSystemContextA.E0(typeSystemContextA.A0(kotlinTypeMarker))) {
            return NullabilityQualifier.f144652b;
        }
        if (!typeSystemContextA.E0(typeSystemContextA.C(kotlinTypeMarker))) {
            return NullabilityQualifier.f144653c;
        }
        return null;
    }
}
