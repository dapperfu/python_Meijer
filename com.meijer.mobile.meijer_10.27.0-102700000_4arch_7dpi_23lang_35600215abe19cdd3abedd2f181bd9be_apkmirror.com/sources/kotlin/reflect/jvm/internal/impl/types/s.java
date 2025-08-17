package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope;

/* loaded from: classes13.dex */
final class s extends SimpleType {

    /* renamed from: b, reason: collision with root package name */
    private final TypeConstructor f147030b;

    /* renamed from: c, reason: collision with root package name */
    private final List<TypeProjection> f147031c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f147032d;

    /* renamed from: e, reason: collision with root package name */
    private final MemberScope f147033e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1<KotlinTypeRefiner, SimpleType> f147034f;

    /* JADX WARN: Multi-variable type inference failed */
    public s(TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z10, MemberScope memberScope, Function1<? super KotlinTypeRefiner, ? extends SimpleType> refinedTypeFactory) {
        Intrinsics.j(constructor, "constructor");
        Intrinsics.j(arguments, "arguments");
        Intrinsics.j(memberScope, "memberScope");
        Intrinsics.j(refinedTypeFactory, "refinedTypeFactory");
        this.f147030b = constructor;
        this.f147031c = arguments;
        this.f147032d = z10;
        this.f147033e = memberScope;
        this.f147034f = refinedTypeFactory;
        if (!(n() instanceof ErrorScope) || (n() instanceof ThrowingScope)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + n() + '\n' + K0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> I0() {
        return this.f147031c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes J0() {
        return TypeAttributes.f146740b.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor K0() {
        return this.f147030b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean L0() {
        return this.f147032d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: S0 */
    public SimpleType Q0(TypeAttributes newAttributes) {
        Intrinsics.j(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new t(this, newAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public SimpleType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        SimpleType simpleTypeInvoke = this.f147034f.invoke(kotlinTypeRefiner);
        return simpleTypeInvoke == null ? this : simpleTypeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope n() {
        return this.f147033e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType R0(boolean z10) {
        if (z10 == L0()) {
            return this;
        }
        if (z10) {
            return new r(this);
        }
        return new q(this);
    }
}
