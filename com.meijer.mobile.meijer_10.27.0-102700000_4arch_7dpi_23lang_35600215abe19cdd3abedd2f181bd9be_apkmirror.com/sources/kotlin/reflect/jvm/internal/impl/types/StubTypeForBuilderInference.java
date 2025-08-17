package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;

/* loaded from: classes13.dex */
public final class StubTypeForBuilderInference extends AbstractStubType implements StubTypeMarker {

    /* renamed from: f, reason: collision with root package name */
    private final TypeConstructor f146728f;

    /* renamed from: g, reason: collision with root package name */
    private final MemberScope f146729g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubTypeForBuilderInference(NewTypeVariableConstructor originalTypeVariable, boolean z10, TypeConstructor constructor) {
        super(originalTypeVariable, z10);
        Intrinsics.j(originalTypeVariable, "originalTypeVariable");
        Intrinsics.j(constructor, "constructor");
        this.f146728f = constructor;
        this.f146729g = originalTypeVariable.l().i().n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor K0() {
        return this.f146728f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    public AbstractStubType U0(boolean z10) {
        return new StubTypeForBuilderInference(T0(), z10, K0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractStubType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return this.f146729g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stub (BI): ");
        sb2.append(T0());
        sb2.append(L0() ? "?" : "");
        return sb2.toString();
    }
}
