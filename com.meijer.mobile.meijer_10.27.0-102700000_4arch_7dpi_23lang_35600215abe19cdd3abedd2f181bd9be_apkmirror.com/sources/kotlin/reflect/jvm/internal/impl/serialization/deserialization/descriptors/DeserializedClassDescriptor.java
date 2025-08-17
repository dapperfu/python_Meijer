package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ScopesHolderForClass;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextClassReceiver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlagsUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ValueClassUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class DeserializedClassDescriptor extends AbstractClassDescriptor implements DeserializedDescriptor {

    /* renamed from: f, reason: collision with root package name */
    private final ProtoBuf.Class f146470f;

    /* renamed from: g, reason: collision with root package name */
    private final BinaryVersion f146471g;

    /* renamed from: h, reason: collision with root package name */
    private final SourceElement f146472h;

    /* renamed from: i, reason: collision with root package name */
    private final ClassId f146473i;

    /* renamed from: j, reason: collision with root package name */
    private final Modality f146474j;

    /* renamed from: k, reason: collision with root package name */
    private final DescriptorVisibility f146475k;

    /* renamed from: l, reason: collision with root package name */
    private final ClassKind f146476l;

    /* renamed from: m, reason: collision with root package name */
    private final DeserializationContext f146477m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f146478n;

    /* renamed from: o, reason: collision with root package name */
    private final MemberScopeImpl f146479o;

    /* renamed from: p, reason: collision with root package name */
    private final a f146480p;

    /* renamed from: q, reason: collision with root package name */
    private final ScopesHolderForClass<DeserializedClassMemberScope> f146481q;

    /* renamed from: r, reason: collision with root package name */
    private final b f146482r;

    /* renamed from: s, reason: collision with root package name */
    private final DeclarationDescriptor f146483s;

    /* renamed from: t, reason: collision with root package name */
    private final NullableLazyValue<ClassConstructorDescriptor> f146484t;

    /* renamed from: u, reason: collision with root package name */
    private final NotNullLazyValue<Collection<ClassConstructorDescriptor>> f146485u;

    /* renamed from: v, reason: collision with root package name */
    private final NullableLazyValue<ClassDescriptor> f146486v;

    /* renamed from: w, reason: collision with root package name */
    private final NotNullLazyValue<Collection<ClassDescriptor>> f146487w;

    /* renamed from: x, reason: collision with root package name */
    private final NullableLazyValue<ValueClassRepresentation<SimpleType>> f146488x;

    /* renamed from: y, reason: collision with root package name */
    private final ProtoContainer.Class f146489y;

    /* renamed from: z, reason: collision with root package name */
    private final Annotations f146490z;

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension
    final class DeserializedClassMemberScope extends DeserializedMemberScope {

        /* renamed from: g, reason: collision with root package name */
        private final KotlinTypeRefiner f146491g;

        /* renamed from: h, reason: collision with root package name */
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> f146492h;

        /* renamed from: i, reason: collision with root package name */
        private final NotNullLazyValue<Collection<KotlinType>> f146493i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ DeserializedClassDescriptor f146494j;

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(List list) {
            return list;
        }

        public DeserializedClassMemberScope(DeserializedClassDescriptor deserializedClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
            Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f146494j = deserializedClassDescriptor;
            DeserializationContext deserializationContextA1 = deserializedClassDescriptor.a1();
            List<ProtoBuf.Function> listN0 = deserializedClassDescriptor.b1().N0();
            Intrinsics.i(listN0, "getFunctionList(...)");
            List<ProtoBuf.Property> listB1 = deserializedClassDescriptor.b1().b1();
            Intrinsics.i(listB1, "getPropertyList(...)");
            List<ProtoBuf.TypeAlias> listJ1 = deserializedClassDescriptor.b1().j1();
            Intrinsics.i(listJ1, "getTypeAliasList(...)");
            List<Integer> listY0 = deserializedClassDescriptor.b1().Y0();
            Intrinsics.i(listY0, "getNestedClassNameList(...)");
            List<Integer> list = listY0;
            NameResolver nameResolverG = deserializedClassDescriptor.a1().g();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(NameResolverUtilKt.b(nameResolverG, ((Number) it.next()).intValue()));
            }
            super(deserializationContextA1, listN0, listB1, listJ1, new g(arrayList));
            this.f146491g = kotlinTypeRefiner;
            this.f146492h = s().h().c(new h(this));
            this.f146493i = s().h().c(new i(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection F(DeserializedClassMemberScope deserializedClassMemberScope) {
            return deserializedClassMemberScope.m(DescriptorKindFilter.f146267o, MemberScope.f146290a.c(), NoLookupLocation.f144127m);
        }

        private final <D extends CallableMemberDescriptor> void G(Name name, Collection<? extends D> collection, final List<D> list) {
            s().c().n().a().v(name, collection, new ArrayList(list), H(), new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public void a(CallableMemberDescriptor fakeOverride) {
                    Intrinsics.j(fakeOverride, "fakeOverride");
                    OverridingUtil.K(fakeOverride, null);
                    list.add(fakeOverride);
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                protected void e(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
                    Intrinsics.j(fromSuper, "fromSuper");
                    Intrinsics.j(fromCurrent, "fromCurrent");
                    if (fromCurrent instanceof FunctionDescriptorImpl) {
                        ((FunctionDescriptorImpl) fromCurrent).R0(DeserializedDeclarationsFromSupertypeConflictDataKey.f143613a, fromSuper);
                    }
                }
            });
        }

        private final DeserializedClassDescriptor H() {
            return this.f146494j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection J(DeserializedClassMemberScope deserializedClassMemberScope) {
            return deserializedClassMemberScope.f146491g.g(deserializedClassMemberScope.H());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected boolean A(SimpleFunctionDescriptor function) {
            Intrinsics.j(function, "function");
            return s().c().t().b(this.f146494j, function);
        }

        public void I(Name name, LookupLocation location) {
            Intrinsics.j(name, "name");
            Intrinsics.j(location, "location");
            UtilsKt.a(s().c().p(), location, H(), name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Collection<SimpleFunctionDescriptor> b(Name name, LookupLocation location) {
            Intrinsics.j(name, "name");
            Intrinsics.j(location, "location");
            I(name, location);
            return super.b(name, location);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Collection<PropertyDescriptor> c(Name name, LookupLocation location) {
            Intrinsics.j(name, "name");
            Intrinsics.j(location, "location");
            I(name, location);
            return super.c(name, location);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public ClassifierDescriptor f(Name name, LookupLocation location) {
            ClassDescriptor classDescriptorI;
            Intrinsics.j(name, "name");
            Intrinsics.j(location, "location");
            I(name, location);
            b bVar = H().f146482r;
            return (bVar == null || (classDescriptorI = bVar.i(name)) == null) ? super.f(name, location) : classDescriptorI;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public Collection<DeclarationDescriptor> g(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
            Intrinsics.j(kindFilter, "kindFilter");
            Intrinsics.j(nameFilter, "nameFilter");
            return this.f146492h.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void j(Collection<DeclarationDescriptor> result, Function1<? super Name, Boolean> nameFilter) {
            Intrinsics.j(result, "result");
            Intrinsics.j(nameFilter, "nameFilter");
            b bVar = H().f146482r;
            List listD = bVar != null ? bVar.d() : null;
            if (listD == null) {
                listD = CollectionsKt.m();
            }
            result.addAll(listD);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void n(Name name, List<SimpleFunctionDescriptor> functions) {
            Intrinsics.j(name, "name");
            Intrinsics.j(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = this.f146493i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().n().b(name, NoLookupLocation.f144126l));
            }
            functions.addAll(s().c().c().a(name, this.f146494j));
            G(name, arrayList, functions);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected void o(Name name, List<PropertyDescriptor> descriptors) {
            Intrinsics.j(name, "name");
            Intrinsics.j(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator<KotlinType> it = this.f146493i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().n().c(name, NoLookupLocation.f144126l));
            }
            G(name, arrayList, descriptors);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected ClassId p(Name name) {
            Intrinsics.j(name, "name");
            return this.f146494j.f146473i.d(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected Set<Name> v() {
            List<KotlinType> listA = H().f146480p.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                Set<Name> setE = ((KotlinType) it.next()).n().e();
                if (setE == null) {
                    return null;
                }
                CollectionsKt.C(linkedHashSet, setE);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected Set<Name> w() {
            List<KotlinType> listA = H().f146480p.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                CollectionsKt.C(linkedHashSet, ((KotlinType) it.next()).n().a());
            }
            linkedHashSet.addAll(s().c().c().e(this.f146494j));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
        protected Set<Name> x() {
            List<KotlinType> listA = H().f146480p.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                CollectionsKt.C(linkedHashSet, ((KotlinType) it.next()).n().d());
            }
            return linkedHashSet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension
    final class a extends AbstractClassTypeConstructor {

        /* renamed from: d, reason: collision with root package name */
        private final NotNullLazyValue<List<TypeParameterDescriptor>> f146496d;

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean e() {
            return true;
        }

        public a() {
            super(DeserializedClassDescriptor.this.a1().h());
            this.f146496d = DeserializedClassDescriptor.this.a1().h().c(new j(DeserializedClassDescriptor.this));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public DeserializedClassDescriptor d() {
            return DeserializedClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            return this.f146496d.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected Collection<KotlinType> r() {
            String strB;
            FqName fqNameA;
            List<ProtoBuf.Type> listO = ProtoTypeTableUtilKt.o(DeserializedClassDescriptor.this.b1(), DeserializedClassDescriptor.this.a1().j());
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(listO, 10));
            Iterator<T> it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(deserializedClassDescriptor.a1().i().u((ProtoBuf.Type) it.next()));
            }
            List listP0 = CollectionsKt.P0(arrayList, DeserializedClassDescriptor.this.a1().c().c().d(DeserializedClassDescriptor.this));
            ArrayList<NotFoundClasses.MockClassDescriptor> arrayList2 = new ArrayList();
            Iterator it2 = listP0.iterator();
            while (it2.hasNext()) {
                ClassifierDescriptor classifierDescriptorD = ((KotlinType) it2.next()).K0().d();
                NotFoundClasses.MockClassDescriptor mockClassDescriptor = classifierDescriptorD instanceof NotFoundClasses.MockClassDescriptor ? (NotFoundClasses.MockClassDescriptor) classifierDescriptorD : null;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporterJ = DeserializedClassDescriptor.this.a1().c().j();
                DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.x(arrayList2, 10));
                for (NotFoundClasses.MockClassDescriptor mockClassDescriptor2 : arrayList2) {
                    ClassId classIdN = DescriptorUtilsKt.n(mockClassDescriptor2);
                    if (classIdN == null || (fqNameA = classIdN.a()) == null || (strB = fqNameA.a()) == null) {
                        strB = mockClassDescriptor2.getName().b();
                        Intrinsics.i(strB, "asString(...)");
                    }
                    arrayList3.add(strB);
                }
                errorReporterJ.b(deserializedClassDescriptor2, arrayList3);
            }
            return CollectionsKt.j1(listP0);
        }

        public String toString() {
            String string = DeserializedClassDescriptor.this.getName().toString();
            Intrinsics.i(string, "toString(...)");
            return string;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected SupertypeLoopChecker v() {
            return SupertypeLoopChecker.EMPTY.f143649a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List L(DeserializedClassDescriptor deserializedClassDescriptor) {
            return TypeParameterUtilsKt.g(deserializedClassDescriptor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension
    final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Name, ProtoBuf.EnumEntry> f146498a;

        /* renamed from: b, reason: collision with root package name */
        private final MemoizedFunctionToNullable<Name, ClassDescriptor> f146499b;

        /* renamed from: c, reason: collision with root package name */
        private final NotNullLazyValue<Set<Name>> f146500c;

        public b() {
            List<ProtoBuf.EnumEntry> listI0 = DeserializedClassDescriptor.this.b1().I0();
            Intrinsics.i(listI0, "getEnumEntryList(...)");
            List<ProtoBuf.EnumEntry> list = listI0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(NameResolverUtilKt.b(DeserializedClassDescriptor.this.a1().g(), ((ProtoBuf.EnumEntry) obj).G()), obj);
            }
            this.f146498a = linkedHashMap;
            this.f146499b = DeserializedClassDescriptor.this.a1().h().g(new k(this, DeserializedClassDescriptor.this));
            this.f146500c = DeserializedClassDescriptor.this.a1().h().c(new l(this));
        }

        private final Set<Name> e() {
            HashSet hashSet = new HashSet();
            Iterator<KotlinType> it = DeserializedClassDescriptor.this.i().a().iterator();
            while (it.hasNext()) {
                for (DeclarationDescriptor declarationDescriptor : ResolutionScope.DefaultImpls.a(it.next().n(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                        hashSet.add(((CallableMemberDescriptor) declarationDescriptor).getName());
                    }
                }
            }
            List<ProtoBuf.Function> listN0 = DeserializedClassDescriptor.this.b1().N0();
            Intrinsics.i(listN0, "getFunctionList(...)");
            DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
            Iterator<T> it2 = listN0.iterator();
            while (it2.hasNext()) {
                hashSet.add(NameResolverUtilKt.b(deserializedClassDescriptor.a1().g(), ((ProtoBuf.Function) it2.next()).i0()));
            }
            List<ProtoBuf.Property> listB1 = DeserializedClassDescriptor.this.b1().b1();
            Intrinsics.i(listB1, "getPropertyList(...)");
            DeserializedClassDescriptor deserializedClassDescriptor2 = DeserializedClassDescriptor.this;
            Iterator<T> it3 = listB1.iterator();
            while (it3.hasNext()) {
                hashSet.add(NameResolverUtilKt.b(deserializedClassDescriptor2.a1().g(), ((ProtoBuf.Property) it3.next()).h0()));
            }
            return SetsKt.l(hashSet, hashSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ClassDescriptor f(b bVar, DeserializedClassDescriptor deserializedClassDescriptor, Name name) {
            Intrinsics.j(name, "name");
            ProtoBuf.EnumEntry enumEntry = bVar.f146498a.get(name);
            if (enumEntry != null) {
                return EnumEntrySyntheticClassDescriptor.I0(deserializedClassDescriptor.a1().h(), deserializedClassDescriptor, name, bVar.f146500c, new DeserializedAnnotations(deserializedClassDescriptor.a1().h(), new m(deserializedClassDescriptor, enumEntry)), SourceElement.f143647a);
            }
            return null;
        }

        public final Collection<ClassDescriptor> d() {
            Set<Name> setKeySet = this.f146498a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                ClassDescriptor classDescriptorI = i((Name) it.next());
                if (classDescriptorI != null) {
                    arrayList.add(classDescriptorI);
                }
            }
            return arrayList;
        }

        public final ClassDescriptor i(Name name) {
            Intrinsics.j(name, "name");
            return this.f146499b.invoke(name);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(DeserializedClassDescriptor deserializedClassDescriptor, ProtoBuf.EnumEntry enumEntry) {
            return CollectionsKt.j1(deserializedClassDescriptor.a1().c().d().d(deserializedClassDescriptor.f1(), enumEntry));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set h(b bVar) {
            return bVar.e();
        }
    }

    /* synthetic */ class c extends AdaptedFunctionReference implements Function1<ProtoBuf.Type, SimpleType> {
        c(Object obj) {
            super(1, obj, TypeDeserializer.class, "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleType invoke(ProtoBuf.Type p02) {
            Intrinsics.j(p02, "p0");
            return TypeDeserializer.q((TypeDeserializer) this.f142801a, p02, false, 2, null);
        }
    }

    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Name, SimpleType> {
        d(Object obj) {
            super(1, obj, DeserializedClassDescriptor.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleType invoke(Name p02) {
            Intrinsics.j(p02, "p0");
            return ((DeserializedClassDescriptor) this.receiver).g1(p02);
        }
    }

    /* synthetic */ class e extends FunctionReferenceImpl implements Function1<KotlinTypeRefiner, DeserializedClassMemberScope> {
        e(Object obj) {
            super(1, obj, DeserializedClassMemberScope.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeserializedClassMemberScope invoke(KotlinTypeRefiner p02) {
            Intrinsics.j(p02, "p0");
            return new DeserializedClassMemberScope((DeserializedClassDescriptor) this.receiver, p02);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean V() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedClassDescriptor(DeserializationContext outerContext, ProtoBuf.Class classProto, NameResolver nameResolver, BinaryVersion metadataVersion, SourceElement sourceElement) {
        MemberScopeImpl staticScopeForKotlinEnum;
        super(outerContext.h(), NameResolverUtilKt.a(nameResolver, classProto.K0()).h());
        Intrinsics.j(outerContext, "outerContext");
        Intrinsics.j(classProto, "classProto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(metadataVersion, "metadataVersion");
        Intrinsics.j(sourceElement, "sourceElement");
        this.f146470f = classProto;
        this.f146471g = metadataVersion;
        this.f146472h = sourceElement;
        this.f146473i = NameResolverUtilKt.a(nameResolver, classProto.K0());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.f146437a;
        this.f146474j = protoEnumFlags.b(Flags.f145517e.d(classProto.J0()));
        this.f146475k = ProtoEnumFlagsUtilsKt.a(protoEnumFlags, Flags.f145516d.d(classProto.J0()));
        ClassKind classKindA = protoEnumFlags.a(Flags.f145518f.d(classProto.J0()));
        this.f146476l = classKindA;
        List<ProtoBuf.TypeParameter> listM1 = classProto.m1();
        Intrinsics.i(listM1, "getTypeParameterList(...)");
        ProtoBuf.TypeTable typeTableN1 = classProto.n1();
        Intrinsics.i(typeTableN1, "getTypeTable(...)");
        TypeTable typeTable = new TypeTable(typeTableN1);
        VersionRequirementTable.Companion companion = VersionRequirementTable.f145550b;
        ProtoBuf.VersionRequirementTable versionRequirementTableP1 = classProto.p1();
        Intrinsics.i(versionRequirementTableP1, "getVersionRequirementTable(...)");
        DeserializationContext deserializationContextA = outerContext.a(this, listM1, nameResolver, typeTable, companion.a(versionRequirementTableP1), metadataVersion);
        this.f146477m = deserializationContextA;
        Boolean boolD = Flags.f145525m.d(classProto.J0());
        Intrinsics.i(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        this.f146478n = zBooleanValue;
        ClassKind classKind = ClassKind.f143587d;
        if (classKindA == classKind) {
            staticScopeForKotlinEnum = new StaticScopeForKotlinEnum(deserializationContextA.h(), this, zBooleanValue || Intrinsics.e(deserializationContextA.c().i().a(), Boolean.TRUE));
        } else {
            staticScopeForKotlinEnum = MemberScope.Empty.f146293b;
        }
        this.f146479o = staticScopeForKotlinEnum;
        this.f146480p = new a();
        this.f146481q = ScopesHolderForClass.f143641e.a(this, deserializationContextA.h(), deserializationContextA.c().n().c(), new e(this));
        this.f146482r = classKindA == classKind ? new b() : null;
        DeclarationDescriptor declarationDescriptorE = outerContext.e();
        this.f146483s = declarationDescriptorE;
        this.f146484t = deserializationContextA.h().e(new C15276a(this));
        this.f146485u = deserializationContextA.h().c(new C15277b(this));
        this.f146486v = deserializationContextA.h().e(new C15278c(this));
        this.f146487w = deserializationContextA.h().c(new C15279d(this));
        this.f146488x = deserializationContextA.h().e(new C15280e(this));
        NameResolver nameResolverG = deserializationContextA.g();
        TypeTable typeTableJ = deserializationContextA.j();
        DeserializedClassDescriptor deserializedClassDescriptor = declarationDescriptorE instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) declarationDescriptorE : null;
        this.f146489y = new ProtoContainer.Class(classProto, nameResolverG, typeTableJ, sourceElement, deserializedClassDescriptor != null ? deserializedClassDescriptor.f146489y : null);
        this.f146490z = !Flags.f145515c.d(classProto.J0()).booleanValue() ? Annotations.f143689s3.b() : new NonEmptyDeserializedAnnotations(deserializationContextA.h(), new f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List R0(DeserializedClassDescriptor deserializedClassDescriptor) {
        return CollectionsKt.j1(deserializedClassDescriptor.f146477m.c().d().b(deserializedClassDescriptor.f146489y));
    }

    private final ClassDescriptor T0() {
        if (!this.f146470f.q1()) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorF = c1().f(NameResolverUtilKt.b(this.f146477m.g(), this.f146470f.u0()), NoLookupLocation.f144132r);
        if (classifierDescriptorF instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorF;
        }
        return null;
    }

    private final ClassConstructorDescriptor V0() {
        Object next;
        if (this.f146476l.b()) {
            ClassConstructorDescriptorImpl classConstructorDescriptorImplL = DescriptorFactory.l(this, SourceElement.f143647a);
            classConstructorDescriptorImplL.d1(o());
            return classConstructorDescriptorImplL;
        }
        List<ProtoBuf.Constructor> listZ0 = this.f146470f.z0();
        Intrinsics.i(listZ0, "getConstructorList(...)");
        Iterator<T> it = listZ0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!Flags.f145526n.d(((ProtoBuf.Constructor) next).O()).booleanValue()) {
                break;
            }
        }
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
        if (constructor != null) {
            return this.f146477m.f().r(constructor, true);
        }
        return null;
    }

    private final List<ClassConstructorDescriptor> W0() {
        List<ProtoBuf.Constructor> listZ0 = this.f146470f.z0();
        Intrinsics.i(listZ0, "getConstructorList(...)");
        ArrayList<ProtoBuf.Constructor> arrayList = new ArrayList();
        for (Object obj : listZ0) {
            Boolean boolD = Flags.f145526n.d(((ProtoBuf.Constructor) obj).O());
            Intrinsics.i(boolD, "get(...)");
            if (boolD.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        for (ProtoBuf.Constructor constructor : arrayList) {
            MemberDeserializer memberDeserializerF = this.f146477m.f();
            Intrinsics.g(constructor);
            arrayList2.add(memberDeserializerF.r(constructor, false));
        }
        return arrayList2;
    }

    private final Collection<ClassDescriptor> X0() {
        if (this.f146474j != Modality.f143620c) {
            return CollectionsKt.m();
        }
        List<Integer> listC1 = this.f146470f.c1();
        Intrinsics.g(listC1);
        if (listC1.isEmpty()) {
            return CliSealedClassInheritorsProvider.f146115a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : listC1) {
            DeserializationComponents deserializationComponentsC = this.f146477m.c();
            NameResolver nameResolverG = this.f146477m.g();
            Intrinsics.g(num);
            ClassDescriptor classDescriptorB = deserializationComponentsC.b(NameResolverUtilKt.a(nameResolverG, num.intValue()));
            if (classDescriptorB != null) {
                arrayList.add(classDescriptorB);
            }
        }
        return arrayList;
    }

    private final DeserializedClassMemberScope c1() {
        return (DeserializedClassMemberScope) this.f146481q.c(this.f146477m.c().n().c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassConstructorDescriptor C() {
        return this.f146484t.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean F0() {
        Boolean boolD = Flags.f145520h.d(this.f146470f.J0());
        Intrinsics.i(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> S() {
        return this.f146488x.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ReceiverParameterDescriptor> W() {
        List<ProtoBuf.Type> listB = ProtoTypeTableUtilKt.b(this.f146470f, this.f146477m.j());
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReceiverParameterDescriptorImpl(G0(), new ContextClassReceiver(this, this.f146477m.i().u((ProtoBuf.Type) it.next()), null, null), Annotations.f143689s3.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean Z() {
        return Flags.f145518f.d(this.f146470f.J0()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    public final DeserializationContext a1() {
        return this.f146477m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor b() {
        return this.f146483s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean b0() {
        Boolean boolD = Flags.f145524l.d(this.f146470f.J0());
        Intrinsics.i(boolD, "get(...)");
        return boolD.booleanValue();
    }

    public final ProtoBuf.Class b1() {
        return this.f146470f;
    }

    public final BinaryVersion d1() {
        return this.f146471g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public MemberScopeImpl j0() {
        return this.f146479o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind f() {
        return this.f146476l;
    }

    public final ProtoContainer.Class f1() {
        return this.f146489y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement g() {
        return this.f146472h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    protected MemberScope g0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f146481q.c(kotlinTypeRefiner);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f146490z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        return this.f146475k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean h0() {
        Boolean boolD = Flags.f145522j.d(this.f146470f.J0());
        Intrinsics.i(boolD, "get(...)");
        return boolD.booleanValue();
    }

    public final boolean h1(Name name) {
        Intrinsics.j(name, "name");
        return c1().t().contains(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor i() {
        return this.f146480p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean boolD = Flags.f145521i.d(this.f146470f.J0());
        Intrinsics.i(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return Flags.f145523k.d(this.f146470f.J0()).booleanValue() && this.f146471g.e(1, 4, 1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> j() {
        return this.f146485u.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassDescriptor k0() {
        return this.f146486v.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> p() {
        return this.f146477m.i().m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality q() {
        return this.f146474j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean r() {
        return Flags.f145523k.d(this.f146470f.J0()).booleanValue() && this.f146471g.c(1, 4, 2);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deserialized ");
        sb2.append(h0() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> w() {
        return this.f146487w.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean y() {
        Boolean boolD = Flags.f145519g.d(this.f146470f.J0());
        Intrinsics.i(boolD, "get(...)");
        return boolD.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor S0(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.T0();
    }

    private final Collection<ClassConstructorDescriptor> U0() {
        return CollectionsKt.P0(CollectionsKt.P0(W0(), CollectionsKt.q(C())), this.f146477m.c().c().c(this));
    }

    private final ValueClassRepresentation<SimpleType> Y0() {
        if (!isInline() && !r()) {
            return null;
        }
        ValueClassRepresentation<SimpleType> valueClassRepresentationB = ValueClassUtilKt.b(this.f146470f, this.f146477m.g(), this.f146477m.j(), new c(this.f146477m.i()), new d(this));
        if (valueClassRepresentationB != null) {
            return valueClassRepresentationB;
        }
        if (this.f146471g.c(1, 5, 1)) {
            return null;
        }
        ClassConstructorDescriptor classConstructorDescriptorC = C();
        if (classConstructorDescriptorC != null) {
            List<ValueParameterDescriptor> listH = classConstructorDescriptorC.h();
            Intrinsics.i(listH, "getValueParameters(...)");
            Name name = ((ValueParameterDescriptor) CollectionsKt.s0(listH)).getName();
            Intrinsics.i(name, "getName(...)");
            SimpleType simpleTypeG1 = g1(name);
            if (simpleTypeG1 != null) {
                return new InlineClassRepresentation(name, simpleTypeG1);
            }
            throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
        }
        throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection Z0(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.U0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleType g1(Name name) {
        Iterator<T> it = c1().c(name, NoLookupLocation.f144132r).iterator();
        KotlinType type = null;
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((PropertyDescriptor) next).N() == null) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj = next;
                }
            } else if (!z10) {
                break;
            }
        }
        obj = null;
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
        if (propertyDescriptor != null) {
            type = propertyDescriptor.getType();
        }
        return (SimpleType) type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassConstructorDescriptor i1(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection j1(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueClassRepresentation k1(DeserializedClassDescriptor deserializedClassDescriptor) {
        return deserializedClassDescriptor.Y0();
    }
}
