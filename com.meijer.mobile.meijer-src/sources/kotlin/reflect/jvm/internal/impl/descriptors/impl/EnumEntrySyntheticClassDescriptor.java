package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public class EnumEntrySyntheticClassDescriptor extends ClassDescriptorBase {

    /* renamed from: i, reason: collision with root package name */
    private final TypeConstructor f144739i;

    /* renamed from: j, reason: collision with root package name */
    private final MemberScope f144740j;

    /* renamed from: k, reason: collision with root package name */
    private final NotNullLazyValue<Set<Name>> f144741k;

    /* renamed from: l, reason: collision with root package name */
    private final Annotations f144742l;

    private class a extends MemberScopeImpl {

        /* renamed from: b, reason: collision with root package name */
        private final MemoizedFunctionToNotNull<Name, Collection<? extends SimpleFunctionDescriptor>> f144743b;

        /* renamed from: c, reason: collision with root package name */
        private final MemoizedFunctionToNotNull<Name, Collection<? extends PropertyDescriptor>> f144744c;

        /* renamed from: d, reason: collision with root package name */
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> f144745d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EnumEntrySyntheticClassDescriptor f144746e;

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor$a$a, reason: collision with other inner class name */
        class C2272a implements Function1<Name, Collection<? extends SimpleFunctionDescriptor>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EnumEntrySyntheticClassDescriptor f144747a;

            C2272a(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor) {
                this.f144747a = enumEntrySyntheticClassDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends SimpleFunctionDescriptor> invoke(Name name) {
                return a.this.m(name);
            }
        }

        class b implements Function1<Name, Collection<? extends PropertyDescriptor>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EnumEntrySyntheticClassDescriptor f144749a;

            b(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor) {
                this.f144749a = enumEntrySyntheticClassDescriptor;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends PropertyDescriptor> invoke(Name name) {
                return a.this.n(name);
            }
        }

        class c implements Function0<Collection<DeclarationDescriptor>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ EnumEntrySyntheticClassDescriptor f144751a;

            c(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor) {
                this.f144751a = enumEntrySyntheticClassDescriptor;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<DeclarationDescriptor> invoke() {
                return a.this.l();
            }
        }

        class d extends NonReportingOverrideStrategy {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f144753a;

            private static /* synthetic */ void f(int i10) {
                Object[] objArr = new Object[3];
                if (i10 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i10 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i10 == 1 || i10 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
            protected void e(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                if (callableMemberDescriptor == null) {
                    f(1);
                }
                if (callableMemberDescriptor2 == null) {
                    f(2);
                }
            }

            d(Set set) {
                this.f144753a = set;
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            public void a(CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    f(0);
                }
                OverridingUtil.K(callableMemberDescriptor, null);
                this.f144753a.add(callableMemberDescriptor);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.a.h(int):void");
        }

        public a(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, StorageManager storageManager) {
            if (storageManager == null) {
                h(0);
            }
            this.f144746e = enumEntrySyntheticClassDescriptor;
            this.f144743b = storageManager.i(new C2272a(enumEntrySyntheticClassDescriptor));
            this.f144744c = storageManager.i(new b(enumEntrySyntheticClassDescriptor));
            this.f144745d = storageManager.c(new c(enumEntrySyntheticClassDescriptor));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<DeclarationDescriptor> l() {
            HashSet hashSet = new HashSet();
            for (Name name : (Set) this.f144746e.f144741k.invoke()) {
                NoLookupLocation noLookupLocation = NoLookupLocation.f145037p;
                hashSet.addAll(b(name, noLookupLocation));
                hashSet.addAll(c(name, noLookupLocation));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<? extends SimpleFunctionDescriptor> m(Name name) {
            if (name == null) {
                h(8);
            }
            return p(name, o().b(name, NoLookupLocation.f145037p));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<? extends PropertyDescriptor> n(Name name) {
            if (name == null) {
                h(4);
            }
            return p(name, o().c(name, NoLookupLocation.f145037p));
        }

        private MemberScope o() {
            MemberScope memberScopeN = this.f144746e.i().a().iterator().next().n();
            if (memberScopeN == null) {
                h(9);
            }
            return memberScopeN;
        }

        private <D extends CallableMemberDescriptor> Collection<? extends D> p(Name name, Collection<? extends D> collection) {
            if (name == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.f147039f.v(name, collection, Collections.EMPTY_SET, this.f144746e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> a() {
            Set<Name> set = (Set) this.f144746e.f144741k.invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Collection<? extends SimpleFunctionDescriptor> b(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                h(5);
            }
            if (lookupLocation == null) {
                h(6);
            }
            Collection<? extends SimpleFunctionDescriptor> collectionInvoke = this.f144743b.invoke(name);
            if (collectionInvoke == null) {
                h(7);
            }
            return collectionInvoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Collection<? extends PropertyDescriptor> c(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                h(1);
            }
            if (lookupLocation == null) {
                h(2);
            }
            Collection<? extends PropertyDescriptor> collectionInvoke = this.f144744c.invoke(name);
            if (collectionInvoke == null) {
                h(3);
            }
            return collectionInvoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> d() {
            Set<Name> set = (Set) this.f144746e.f144741k.invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> e() {
            Set<Name> set = Collections.EMPTY_SET;
            if (set == null) {
                h(18);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public Collection<DeclarationDescriptor> g(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
            if (descriptorKindFilter == null) {
                h(13);
            }
            if (function1 == null) {
                h(14);
            }
            Collection<DeclarationDescriptor> collectionInvoke = this.f144745d.invoke();
            if (collectionInvoke == null) {
                h(15);
            }
            return collectionInvoke;
        }
    }

    private static /* synthetic */ void B0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 23:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassConstructorDescriptor C() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean F0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> S() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean V() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean Z() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean b0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassDescriptor k0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean r() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean y() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private EnumEntrySyntheticClassDescriptor(StorageManager storageManager, ClassDescriptor classDescriptor, KotlinType kotlinType, Name name, NotNullLazyValue<Set<Name>> notNullLazyValue, Annotations annotations, SourceElement sourceElement) {
        super(storageManager, classDescriptor, name, sourceElement, false);
        if (storageManager == null) {
            B0(6);
        }
        if (classDescriptor == null) {
            B0(7);
        }
        if (kotlinType == null) {
            B0(8);
        }
        if (name == null) {
            B0(9);
        }
        if (notNullLazyValue == null) {
            B0(10);
        }
        if (annotations == null) {
            B0(11);
        }
        if (sourceElement == null) {
            B0(12);
        }
        this.f144742l = annotations;
        this.f144739i = new ClassTypeConstructorImpl(this, Collections.EMPTY_LIST, Collections.singleton(kotlinType), storageManager);
        this.f144740j = new a(this, storageManager);
        this.f144741k = notNullLazyValue;
    }

    public static EnumEntrySyntheticClassDescriptor I0(StorageManager storageManager, ClassDescriptor classDescriptor, Name name, NotNullLazyValue<Set<Name>> notNullLazyValue, Annotations annotations, SourceElement sourceElement) {
        if (storageManager == null) {
            B0(0);
        }
        if (classDescriptor == null) {
            B0(1);
        }
        if (name == null) {
            B0(2);
        }
        if (notNullLazyValue == null) {
            B0(3);
        }
        if (annotations == null) {
            B0(4);
        }
        if (sourceElement == null) {
            B0(5);
        }
        return new EnumEntrySyntheticClassDescriptor(storageManager, classDescriptor, classDescriptor.o(), name, notNullLazyValue, annotations, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind f() {
        ClassKind classKind = ClassKind.f144495e;
        if (classKind == null) {
            B0(18);
        }
        return classKind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope g0(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            B0(13);
        }
        MemberScope memberScope = this.f144740j;
        if (memberScope == null) {
            B0(14);
        }
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.f144742l;
        if (annotations == null) {
            B0(21);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.f144507e;
        if (descriptorVisibility == null) {
            B0(20);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor i() {
        TypeConstructor typeConstructor = this.f144739i;
        if (typeConstructor == null) {
            B0(17);
        }
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> j() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            B0(16);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope j0() {
        MemberScope.Empty empty = MemberScope.Empty.f147200b;
        if (empty == null) {
            B0(15);
        }
        return empty;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> p() {
        List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            B0(22);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality q() {
        Modality modality = Modality.f144526b;
        if (modality == null) {
            B0(19);
        }
        return modality;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> w() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            B0(23);
        }
        return list;
    }
}
