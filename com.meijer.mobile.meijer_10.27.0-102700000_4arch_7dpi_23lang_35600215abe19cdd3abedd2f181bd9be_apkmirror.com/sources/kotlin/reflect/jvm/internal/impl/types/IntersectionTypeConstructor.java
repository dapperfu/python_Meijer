package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {

    /* renamed from: a, reason: collision with root package name */
    private KotlinType f146709a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<KotlinType> f146710b;

    /* renamed from: c, reason: collision with root package name */
    private final int f146711c;

    public IntersectionTypeConstructor(Collection<? extends KotlinType> typesToIntersect) {
        Intrinsics.j(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<KotlinType> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f146710b = linkedHashSet;
        this.f146711c = linkedHashSet.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public ClassifierDescriptor d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean e() {
        return false;
    }

    public String toString() {
        return o(this, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType k(IntersectionTypeConstructor intersectionTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return intersectionTypeConstructor.b(kotlinTypeRefiner).j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String o(IntersectionTypeConstructor intersectionTypeConstructor, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = l.f147006a;
        }
        return intersectionTypeConstructor.n(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(KotlinType it) {
        Intrinsics.j(it, "it");
        return it.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> a() {
        return this.f146710b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return Intrinsics.e(this.f146710b, ((IntersectionTypeConstructor) obj).f146710b);
        }
        return false;
    }

    public int hashCode() {
        return this.f146711c;
    }

    public final MemberScope i() {
        return TypeIntersectionScope.f146304d.a("member scope for intersection type", this.f146710b);
    }

    public final SimpleType j() {
        return KotlinTypeFactory.n(TypeAttributes.f146740b.k(), this, CollectionsKt.m(), false, i(), new m(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns l() {
        KotlinBuiltIns kotlinBuiltInsL = this.f146710b.iterator().next().K0().l();
        Intrinsics.i(kotlinBuiltInsL, "getBuiltIns(...)");
        return kotlinBuiltInsL;
    }

    public final KotlinType m() {
        return this.f146709a;
    }

    public final String n(final Function1<? super KotlinType, ? extends Object> getProperTypeRelatedToStringify) {
        Intrinsics.j(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt.B0(CollectionsKt.Z0(this.f146710b, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                KotlinType kotlinType = (KotlinType) t10;
                Function1 function1 = getProperTypeRelatedToStringify;
                Intrinsics.g(kotlinType);
                String string = function1.invoke(kotlinType).toString();
                KotlinType kotlinType2 = (KotlinType) t11;
                Function1 function12 = getProperTypeRelatedToStringify;
                Intrinsics.g(kotlinType2);
                return ComparisonsKt.d(string, function12.invoke(kotlinType2).toString());
            }
        }), " & ", "{", "}", 0, null, new k(getProperTypeRelatedToStringify), 24, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public IntersectionTypeConstructor b(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<KotlinType> collectionA = a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionA, 10));
        Iterator<T> it = collectionA.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((KotlinType) it.next()).U0(kotlinTypeRefiner));
            z10 = true;
        }
        IntersectionTypeConstructor intersectionTypeConstructorS = null;
        if (z10) {
            KotlinType kotlinTypeM = m();
            intersectionTypeConstructorS = new IntersectionTypeConstructor(arrayList).s(kotlinTypeM != null ? kotlinTypeM.U0(kotlinTypeRefiner) : null);
        }
        return intersectionTypeConstructorS == null ? this : intersectionTypeConstructorS;
    }

    public final IntersectionTypeConstructor s(KotlinType kotlinType) {
        return new IntersectionTypeConstructor(this.f146710b, kotlinType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence q(Function1 function1, KotlinType kotlinType) {
        Intrinsics.g(kotlinType);
        return function1.invoke(kotlinType).toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.m();
    }

    private IntersectionTypeConstructor(Collection<? extends KotlinType> collection, KotlinType kotlinType) {
        this(collection);
        this.f146709a = kotlinType;
    }
}
