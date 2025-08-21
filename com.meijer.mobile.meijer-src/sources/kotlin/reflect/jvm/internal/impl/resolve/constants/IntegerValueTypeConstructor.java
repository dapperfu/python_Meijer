package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public final class IntegerValueTypeConstructor implements TypeConstructor {

    /* renamed from: a, reason: collision with root package name */
    private final long f147097a;

    /* renamed from: b, reason: collision with root package name */
    private final ModuleDescriptor f147098b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<KotlinType> f147099c;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public TypeConstructor b(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean e() {
        return false;
    }

    public Void f() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public Collection<KotlinType> a() {
        return this.f147099c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns l() {
        return this.f147098b.l();
    }

    public String toString() {
        return "IntegerValueType(" + this.f147097a + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public /* bridge */ /* synthetic */ ClassifierDescriptor d() {
        return (ClassifierDescriptor) f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.m();
    }
}
