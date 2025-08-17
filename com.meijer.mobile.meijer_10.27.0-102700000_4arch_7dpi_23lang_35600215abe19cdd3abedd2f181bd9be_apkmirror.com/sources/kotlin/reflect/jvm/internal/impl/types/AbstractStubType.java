package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes13.dex */
public abstract class AbstractStubType extends SimpleType {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f146666e = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private final NewTypeVariableConstructor f146667b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f146668c;

    /* renamed from: d, reason: collision with root package name */
    private final MemberScope f146669d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: S0 */
    public SimpleType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return this;
    }

    public abstract AbstractStubType U0(boolean z10);

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public AbstractStubType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    public AbstractStubType(NewTypeVariableConstructor originalTypeVariable, boolean z10) {
        Intrinsics.j(originalTypeVariable, "originalTypeVariable");
        this.f146667b = originalTypeVariable;
        this.f146668c = z10;
        this.f146669d = ErrorUtils.b(ErrorScopeKind.f146884f, originalTypeVariable.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return TypeAttributes.f146740b.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return this.f146668c;
    }

    public final NewTypeVariableConstructor T0() {
        return this.f146667b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return this.f146669d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> I0() {
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType R0(boolean z10) {
        if (z10 == L0()) {
            return this;
        }
        return U0(z10);
    }
}
