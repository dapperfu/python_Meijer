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

/* loaded from: classes14.dex */
public abstract class AbstractStubType extends SimpleType {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f147573e = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private final NewTypeVariableConstructor f147574b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f147575c;

    /* renamed from: d, reason: collision with root package name */
    private final MemberScope f147576d;

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
        this.f147574b = originalTypeVariable;
        this.f147575c = z10;
        this.f147576d = ErrorUtils.b(ErrorScopeKind.f147791f, originalTypeVariable.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return TypeAttributes.f147647b.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return this.f147575c;
    }

    public final NewTypeVariableConstructor T0() {
        return this.f147574b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return this.f147576d;
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
