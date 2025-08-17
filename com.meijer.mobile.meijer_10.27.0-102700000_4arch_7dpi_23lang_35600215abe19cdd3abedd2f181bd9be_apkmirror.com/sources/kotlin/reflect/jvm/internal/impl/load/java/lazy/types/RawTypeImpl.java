package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class RawTypeImpl extends FlexibleType implements RawType {
    private RawTypeImpl(SimpleType simpleType, SimpleType simpleType2, boolean z10) {
        super(simpleType, simpleType2);
        if (z10) {
            return;
        }
        KotlinTypeChecker.f146816a.d(simpleType, simpleType2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence Y0(String it) {
        Intrinsics.j(it, "it");
        return "(raw) " + it;
    }

    private static final boolean Z0(String str, String str2) {
        return Intrinsics.e(str, StringsKt.J0(str2, "out ")) || Intrinsics.e(str2, "*");
    }

    private static final String b1(String str, String str2) {
        if (!StringsKt.b0(str, '<', false, 2, null)) {
            return str;
        }
        return StringsKt.r1(str, '<', null, 2, null) + '<' + str2 + '>' + StringsKt.n1(str, '>', null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String U0(DescriptorRenderer renderer, DescriptorRendererOptions options) {
        Intrinsics.j(renderer, "renderer");
        Intrinsics.j(options, "options");
        String strT = renderer.T(S0());
        String strT2 = renderer.T(T0());
        if (options.j()) {
            return "raw (" + strT + ".." + strT2 + ')';
        }
        if (T0().I0().isEmpty()) {
            return renderer.Q(strT, strT2, TypeUtilsKt.n(this));
        }
        List<String> listA1 = a1(renderer, S0());
        List<String> listA12 = a1(renderer, T0());
        List<String> list = listA1;
        String strB0 = CollectionsKt.B0(list, ", ", null, null, 0, null, c.f144610a, 30, null);
        List<Pair> listU1 = CollectionsKt.u1(list, listA12);
        if ((listU1 instanceof Collection) && listU1.isEmpty()) {
            strT2 = b1(strT2, strB0);
        } else {
            for (Pair pair : listU1) {
                if (!Z0((String) pair.c(), (String) pair.d())) {
                    break;
                }
            }
            strT2 = b1(strT2, strB0);
        }
        String strB1 = b1(strT, strB0);
        return Intrinsics.e(strB1, strT2) ? strB1 : renderer.Q(strB1, strT2, TypeUtilsKt.n(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public RawTypeImpl R0(boolean z10) {
        return new RawTypeImpl(S0().R0(z10), T0().R0(z10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public FlexibleType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeA = kotlinTypeRefiner.a(S0());
        Intrinsics.h(kotlinTypeA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeA2 = kotlinTypeRefiner.a(T0());
        Intrinsics.h(kotlinTypeA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new RawTypeImpl((SimpleType) kotlinTypeA, (SimpleType) kotlinTypeA2, true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public RawTypeImpl Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return new RawTypeImpl(S0().Q0(newAttributes), T0().Q0(newAttributes));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(SimpleType lowerBound, SimpleType upperBound) {
        this(lowerBound, upperBound, false);
        Intrinsics.j(lowerBound, "lowerBound");
        Intrinsics.j(upperBound, "upperBound");
    }

    private static final List<String> a1(DescriptorRenderer descriptorRenderer, KotlinType kotlinType) {
        List<TypeProjection> listI0 = kotlinType.I0();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listI0, 10));
        Iterator<T> it = listI0.iterator();
        while (it.hasNext()) {
            arrayList.add(descriptorRenderer.U((TypeProjection) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public SimpleType R0() {
        return S0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        ClassDescriptor classDescriptor;
        ClassifierDescriptor classifierDescriptorD = K0().d();
        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = null;
        Object[] objArr = 0;
        if (classifierDescriptorD instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) classifierDescriptorD;
        } else {
            classDescriptor = null;
        }
        if (classDescriptor != null) {
            MemberScope memberScopeN0 = classDescriptor.n0(new RawSubstitution(typeParameterUpperBoundEraser, 1, objArr == true ? 1 : 0));
            Intrinsics.i(memberScopeN0, "getMemberScope(...)");
            return memberScopeN0;
        }
        throw new IllegalStateException(("Incorrect classifier: " + K0().d()).toString());
    }
}
