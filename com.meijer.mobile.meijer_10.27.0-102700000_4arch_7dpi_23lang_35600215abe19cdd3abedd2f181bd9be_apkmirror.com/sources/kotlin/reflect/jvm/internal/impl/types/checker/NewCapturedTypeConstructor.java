package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {

    /* renamed from: a, reason: collision with root package name */
    private final TypeProjection f146826a;

    /* renamed from: b, reason: collision with root package name */
    private Function0<? extends List<? extends UnwrappedType>> f146827b;

    /* renamed from: c, reason: collision with root package name */
    private final NewCapturedTypeConstructor f146828c;

    /* renamed from: d, reason: collision with root package name */
    private final TypeParameterDescriptor f146829d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f146830e;

    public NewCapturedTypeConstructor(TypeProjection projection, Function0<? extends List<? extends UnwrappedType>> function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.j(projection, "projection");
        this.f146826a = projection;
        this.f146827b = function0;
        this.f146828c = newCapturedTypeConstructor;
        this.f146829d = typeParameterDescriptor;
        this.f146830e = LazyKt.a(LazyThreadSafetyMode.f142380b, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(List list) {
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public ClassifierDescriptor d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.e(NewCapturedTypeConstructor.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.f146828c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.f146828c;
        if (newCapturedTypeConstructor3 != null) {
            obj = newCapturedTypeConstructor3;
        }
        return newCapturedTypeConstructor2 == obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        Function0<? extends List<? extends UnwrappedType>> function0 = newCapturedTypeConstructor.f146827b;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    private final List<UnwrappedType> n() {
        return (List) this.f146830e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public TypeProjection f0() {
        return this.f146826a;
    }

    public int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f146828c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    public final void o(List<? extends UnwrappedType> supertypes) {
        Intrinsics.j(supertypes, "supertypes");
        this.f146827b = new c(supertypes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public NewCapturedTypeConstructor b(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionB = f0().b(kotlinTypeRefiner);
        Intrinsics.i(typeProjectionB, "refine(...)");
        d dVar = this.f146827b != null ? new d(this, kotlinTypeRefiner) : null;
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.f146828c;
        if (newCapturedTypeConstructor == null) {
            newCapturedTypeConstructor = this;
        }
        return new NewCapturedTypeConstructor(typeProjectionB, dVar, newCapturedTypeConstructor, this.f146829d);
    }

    public String toString() {
        return "CapturedType(" + f0() + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(NewCapturedTypeConstructor newCapturedTypeConstructor, KotlinTypeRefiner kotlinTypeRefiner) {
        List<UnwrappedType> listA = newCapturedTypeConstructor.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((UnwrappedType) it.next()).P0(kotlinTypeRefiner));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns l() {
        KotlinType type = f0().getType();
        Intrinsics.i(type, "getType(...)");
        return TypeUtilsKt.n(type);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public List<UnwrappedType> a() {
        List<UnwrappedType> listN = n();
        if (listN == null) {
            return CollectionsKt.m();
        }
        return listN;
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, Function0 function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i10 & 2) != 0 ? null : function0, (i10 & 4) != 0 ? null : newCapturedTypeConstructor, (i10 & 8) != 0 ? null : typeParameterDescriptor);
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, List list, NewCapturedTypeConstructor newCapturedTypeConstructor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, list, (i10 & 4) != 0 ? null : newCapturedTypeConstructor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(TypeProjection projection, List<? extends UnwrappedType> supertypes, NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this(projection, new b(supertypes), newCapturedTypeConstructor, null, 8, null);
        Intrinsics.j(projection, "projection");
        Intrinsics.j(supertypes, "supertypes");
    }
}
