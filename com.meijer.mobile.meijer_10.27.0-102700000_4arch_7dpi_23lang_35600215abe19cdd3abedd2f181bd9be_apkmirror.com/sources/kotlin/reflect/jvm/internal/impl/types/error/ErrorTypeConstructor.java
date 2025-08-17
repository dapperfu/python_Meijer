package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public final class ErrorTypeConstructor implements TypeConstructor {

    /* renamed from: a, reason: collision with root package name */
    private final ErrorTypeKind f146900a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f146901b;

    /* renamed from: c, reason: collision with root package name */
    private final String f146902c;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor b(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean e() {
        return false;
    }

    public ErrorTypeConstructor(ErrorTypeKind kind, String... formatParams) {
        Intrinsics.j(kind, "kind");
        Intrinsics.j(formatParams, "formatParams");
        this.f146900a = kind;
        this.f146901b = formatParams;
        String strB = ErrorEntity.f146865g.b();
        String strB2 = kind.b();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(strB2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.i(str, "format(...)");
        String str2 = String.format(strB, Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.i(str2, "format(...)");
        this.f146902c = str2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public ClassifierDescriptor d() {
        return ErrorUtils.f146990a.h();
    }

    public final ErrorTypeKind f() {
        return this.f146900a;
    }

    public final String g(int i10) {
        return this.f146901b[i10];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns l() {
        return DefaultBuiltIns.f143238h.a();
    }

    public String toString() {
        return this.f146902c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> a() {
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.m();
    }
}
