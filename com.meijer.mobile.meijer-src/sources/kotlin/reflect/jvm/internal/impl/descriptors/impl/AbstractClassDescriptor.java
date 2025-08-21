package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public abstract class AbstractClassDescriptor extends ModuleAwareClassDescriptor {

    /* renamed from: b, reason: collision with root package name */
    private final Name f144695b;

    /* renamed from: c, reason: collision with root package name */
    protected final NotNullLazyValue<SimpleType> f144696c;

    /* renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue<MemberScope> f144697d;

    /* renamed from: e, reason: collision with root package name */
    private final NotNullLazyValue<ReceiverParameterDescriptor> f144698e;

    class a implements Function0<SimpleType> {

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$a$a, reason: collision with other inner class name */
        class C2271a implements Function1<KotlinTypeRefiner, SimpleType> {
            C2271a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SimpleType invoke(KotlinTypeRefiner kotlinTypeRefiner) {
                ClassifierDescriptor classifierDescriptorF = kotlinTypeRefiner.f(AbstractClassDescriptor.this);
                return classifierDescriptorF == null ? AbstractClassDescriptor.this.f144696c.invoke() : classifierDescriptorF instanceof TypeAliasDescriptor ? KotlinTypeFactory.c((TypeAliasDescriptor) classifierDescriptorF, TypeUtils.g(classifierDescriptorF.i().getParameters())) : classifierDescriptorF instanceof ModuleAwareClassDescriptor ? TypeUtils.v(classifierDescriptorF.i().b(kotlinTypeRefiner), ((ModuleAwareClassDescriptor) classifierDescriptorF).g0(kotlinTypeRefiner), this) : classifierDescriptorF.o();
            }
        }

        a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleType invoke() {
            AbstractClassDescriptor abstractClassDescriptor = AbstractClassDescriptor.this;
            return TypeUtils.u(abstractClassDescriptor, abstractClassDescriptor.U(), new C2271a());
        }
    }

    class b implements Function0<MemberScope> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MemberScope invoke() {
            return new InnerClassesScopeWrapper(AbstractClassDescriptor.this.U());
        }
    }

    class c implements Function0<ReceiverParameterDescriptor> {
        c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReceiverParameterDescriptor invoke() {
            return new LazyClassReceiverParameterDescriptor(AbstractClassDescriptor.this);
        }
    }

    private static /* synthetic */ void B0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public ClassDescriptor a() {
        return this;
    }

    public AbstractClassDescriptor(StorageManager storageManager, Name name) {
        if (storageManager == null) {
            B0(0);
        }
        if (name == null) {
            B0(1);
        }
        this.f144695b = name;
        this.f144696c = storageManager.c(new a());
        this.f144697d = storageManager.c(new b());
        this.f144698e = storageManager.c(new c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            B0(18);
        }
        return typeSubstitutor.k() ? this : new LazySubstitutingClassDescriptor(this, typeSubstitutor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ReceiverParameterDescriptor G0() {
        ReceiverParameterDescriptor receiverParameterDescriptorInvoke = this.f144698e.invoke();
        if (receiverParameterDescriptorInvoke == null) {
            B0(5);
        }
        return receiverParameterDescriptorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope R() {
        MemberScope memberScopeInvoke = this.f144697d.invoke();
        if (memberScopeInvoke == null) {
            B0(4);
        }
        return memberScopeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ReceiverParameterDescriptor> W() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            B0(6);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope e0(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            B0(10);
        }
        if (kotlinTypeRefiner == null) {
            B0(11);
        }
        if (!typeSubstitution.f()) {
            return new SubstitutingScope(g0(kotlinTypeRefiner), TypeSubstitutor.g(typeSubstitution));
        }
        MemberScope memberScopeG0 = g0(kotlinTypeRefiner);
        if (memberScopeG0 == null) {
            B0(12);
        }
        return memberScopeG0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        Name name = this.f144695b;
        if (name == null) {
            B0(2);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope n0(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            B0(15);
        }
        MemberScope memberScopeE0 = e0(typeSubstitution, DescriptorUtilsKt.r(DescriptorUtils.g(this)));
        if (memberScopeE0 == null) {
            B0(16);
        }
        return memberScopeE0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType o() {
        SimpleType simpleTypeInvoke = this.f144696c.invoke();
        if (simpleTypeInvoke == null) {
            B0(20);
        }
        return simpleTypeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope U() {
        MemberScope memberScopeG0 = g0(DescriptorUtilsKt.r(DescriptorUtils.g(this)));
        if (memberScopeG0 == null) {
            B0(17);
        }
        return memberScopeG0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.a(this, d10);
    }
}
