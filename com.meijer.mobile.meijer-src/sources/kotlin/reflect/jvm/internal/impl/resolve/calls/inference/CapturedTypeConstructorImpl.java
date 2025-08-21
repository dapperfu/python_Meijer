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

/* loaded from: classes14.dex */
public final class CapturedTypeConstructorImpl implements CapturedTypeConstructor {

    /* renamed from: a, reason: collision with root package name */
    private final TypeProjection f147074a;

    /* renamed from: b, reason: collision with root package name */
    private NewCapturedTypeConstructor f147075b;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean e() {
        return false;
    }

    public Void f() {
        return null;
    }

    public CapturedTypeConstructorImpl(TypeProjection projection) {
        Intrinsics.j(projection, "projection");
        this.f147074a = projection;
        h0().c();
        Variance variance = Variance.f147703e;
    }

    public final NewCapturedTypeConstructor g() {
        return this.f147075b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public CapturedTypeConstructorImpl b(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionB = h0().b(kotlinTypeRefiner);
        Intrinsics.i(typeProjectionB, "refine(...)");
        return new CapturedTypeConstructorImpl(typeProjectionB);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public TypeProjection h0() {
        return this.f147074a;
    }

    public final void i(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        this.f147075b = newCapturedTypeConstructor;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + h0() + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> a() {
        KotlinType kotlinTypeJ;
        if (h0().c() == Variance.f147705g) {
            kotlinTypeJ = h0().getType();
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
        KotlinBuiltIns kotlinBuiltInsL = h0().getType().K0().l();
        Intrinsics.i(kotlinBuiltInsL, "getBuiltIns(...)");
        return kotlinBuiltInsL;
    }
}
