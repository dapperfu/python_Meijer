package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

/* loaded from: classes13.dex */
public final class CapturedTypeConstructorImpl implements CapturedTypeConstructor {

    /* renamed from: a, reason: collision with root package name */
    private final TypeProjection f146167a;

    /* renamed from: b, reason: collision with root package name */
    private NewCapturedTypeConstructor f146168b;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean e() {
        return false;
    }

    public Void f() {
        return null;
    }

    public CapturedTypeConstructorImpl(TypeProjection projection) {
        Intrinsics.j(projection, "projection");
        this.f146167a = projection;
        f0().c();
        Variance variance = Variance.f146796e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public TypeProjection f0() {
        return this.f146167a;
    }

    public final NewCapturedTypeConstructor g() {
        return this.f146168b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public CapturedTypeConstructorImpl b(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionB = f0().b(kotlinTypeRefiner);
        Intrinsics.i(typeProjectionB, "refine(...)");
        return new CapturedTypeConstructorImpl(typeProjectionB);
    }

    public final void i(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f146168b = newCapturedTypeConstructor;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + f0() + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> a() {
        KotlinType kotlinTypeJ;
        if (f0().c() == Variance.f146798g) {
            kotlinTypeJ = f0().getType();
        } else {
            kotlinTypeJ = l().J();
        }
        Intrinsics.g(kotlinTypeJ);
        return CollectionsKt.e(kotlinTypeJ);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public /* bridge */ /* synthetic */ ClassifierDescriptor d() {
        return (ClassifierDescriptor) f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns l() {
        KotlinBuiltIns kotlinBuiltInsL = f0().getType().K0().l();
        Intrinsics.i(kotlinBuiltInsL, "getBuiltIns(...)");
        return kotlinBuiltInsL;
    }
}
