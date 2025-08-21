package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;

/* loaded from: classes14.dex */
class d implements KotlinTypeChecker.TypeConstructorEquality {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f147108a;

    /* renamed from: b, reason: collision with root package name */
    private final CallableDescriptor f147109b;

    /* renamed from: c, reason: collision with root package name */
    private final CallableDescriptor f147110c;

    public d(boolean z10, CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        this.f147108a = z10;
        this.f147109b = callableDescriptor;
        this.f147110c = callableDescriptor2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
    public boolean a(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
        return DescriptorEquivalenceForOverrides.h(this.f147108a, this.f147109b, this.f147110c, typeConstructor, typeConstructor2);
    }
}
