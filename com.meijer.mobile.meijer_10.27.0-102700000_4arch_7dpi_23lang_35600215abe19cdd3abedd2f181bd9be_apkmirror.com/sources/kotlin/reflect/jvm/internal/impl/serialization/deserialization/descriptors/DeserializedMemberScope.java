package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* loaded from: classes13.dex */
public abstract class DeserializedMemberScope extends MemberScopeImpl {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f146506f = {Reflection.j(new PropertyReference1Impl(DeserializedMemberScope.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0)), Reflection.j(new PropertyReference1Impl(DeserializedMemberScope.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0))};

    /* renamed from: b, reason: collision with root package name */
    private final DeserializationContext f146507b;

    /* renamed from: c, reason: collision with root package name */
    private final a f146508c;

    /* renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue f146509d;

    /* renamed from: e, reason: collision with root package name */
    private final NullableLazyValue f146510e;

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension
    final class OptimizedImplementation implements a {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f146511j = {Reflection.j(new PropertyReference1Impl(OptimizedImplementation.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), Reflection.j(new PropertyReference1Impl(OptimizedImplementation.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* renamed from: a, reason: collision with root package name */
        private final Map<Name, byte[]> f146512a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Name, byte[]> f146513b;

        /* renamed from: c, reason: collision with root package name */
        private final Map<Name, byte[]> f146514c;

        /* renamed from: d, reason: collision with root package name */
        private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> f146515d;

        /* renamed from: e, reason: collision with root package name */
        private final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> f146516e;

        /* renamed from: f, reason: collision with root package name */
        private final MemoizedFunctionToNullable<Name, TypeAliasDescriptor> f146517f;

        /* renamed from: g, reason: collision with root package name */
        private final NotNullLazyValue f146518g;

        /* renamed from: h, reason: collision with root package name */
        private final NotNullLazyValue f146519h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ DeserializedMemberScope f146520i;

        public OptimizedImplementation(DeserializedMemberScope deserializedMemberScope, List<ProtoBuf.Function> functionList, List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) throws IOException {
            Map<Name, byte[]> mapK;
            Intrinsics.j(functionList, "functionList");
            Intrinsics.j(propertyList, "propertyList");
            Intrinsics.j(typeAliasList, "typeAliasList");
            this.f146520i = deserializedMemberScope;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                Name nameB = NameResolverUtilKt.b(deserializedMemberScope.s().g(), ((ProtoBuf.Function) ((MessageLite) obj)).i0());
                Object arrayList = linkedHashMap.get(nameB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(nameB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f146512a = r(linkedHashMap);
            DeserializedMemberScope deserializedMemberScope2 = this.f146520i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : propertyList) {
                Name nameB2 = NameResolverUtilKt.b(deserializedMemberScope2.s().g(), ((ProtoBuf.Property) ((MessageLite) obj2)).h0());
                Object arrayList2 = linkedHashMap2.get(nameB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(nameB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f146513b = r(linkedHashMap2);
            if (this.f146520i.s().c().g().c()) {
                DeserializedMemberScope deserializedMemberScope3 = this.f146520i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : typeAliasList) {
                    Name nameB3 = NameResolverUtilKt.b(deserializedMemberScope3.s().g(), ((ProtoBuf.TypeAlias) ((MessageLite) obj3)).b0());
                    Object arrayList3 = linkedHashMap3.get(nameB3);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap3.put(nameB3, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                mapK = r(linkedHashMap3);
            } else {
                mapK = MapsKt.k();
            }
            this.f146514c = mapK;
            this.f146515d = this.f146520i.s().h().i(new z(this));
            this.f146516e = this.f146520i.s().h().i(new A(this));
            this.f146517f = this.f146520i.s().h().g(new B(this));
            this.f146518g = this.f146520i.s().h().c(new C(this, this.f146520i));
            this.f146519h = this.f146520i.s().h().c(new D(this, this.f146520i));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> m(kotlin.reflect.jvm.internal.impl.name.Name r6) {
            /*
                r5 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> r0 = r5.f146512a
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.f145134x
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.Intrinsics.i(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r2 = r5.f146520i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r3 = r5.f146520i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                r0.<init>(r1, r4, r3)
                kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.r(r0)
                java.util.List r0 = kotlin.sequences.SequencesKt.W(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = kotlin.collections.CollectionsKt.m()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6b
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r4 = r2.s()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r4 = r4.f()
                kotlin.jvm.internal.Intrinsics.g(r1)
                kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r1 = r4.s(r1)
                boolean r4 = r2.A(r1)
                if (r4 == 0) goto L64
                goto L65
            L64:
                r1 = 0
            L65:
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L6b:
                r2.n(r6, r3)
                java.util.List r6 = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation.m(kotlin.reflect.jvm.internal.impl.name.Name):java.util.Collection");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> n(kotlin.reflect.jvm.internal.impl.name.Name r6) {
            /*
                r5 = this;
                java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> r0 = r5.f146513b
                kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.f145218x
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.Intrinsics.i(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r2 = r5.f146520i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope r3 = r5.f146520i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1
                r0.<init>(r1, r4, r3)
                kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.r(r0)
                java.util.List r0 = kotlin.sequences.SequencesKt.W(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = kotlin.collections.CollectionsKt.m()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L63
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r1
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r4 = r2.s()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r4 = r4.f()
                kotlin.jvm.internal.Intrinsics.g(r1)
                kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r1 = r4.u(r1)
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L63:
                r2.o(r6, r3)
                java.util.List r6 = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.OptimizedImplementation.n(kotlin.reflect.jvm.internal.impl.name.Name):java.util.Collection");
        }

        private final TypeAliasDescriptor o(Name name) {
            ProtoBuf.TypeAlias typeAliasT0;
            byte[] bArr = this.f146514c.get(name);
            if (bArr == null || (typeAliasT0 = ProtoBuf.TypeAlias.t0(new ByteArrayInputStream(bArr), this.f146520i.s().c().k())) == null) {
                return null;
            }
            return this.f146520i.s().f().z(typeAliasT0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set p(OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
            return SetsKt.l(optimizedImplementation.f146512a.keySet(), deserializedMemberScope.w());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection q(OptimizedImplementation optimizedImplementation, Name it) {
            Intrinsics.j(it, "it");
            return optimizedImplementation.m(it);
        }

        private final Map<Name, byte[]> r(Map<Name, ? extends Collection<? extends AbstractMessageLite>> map) throws IOException {
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((AbstractMessageLite) it2.next()).i(byteArrayOutputStream);
                    arrayList.add(Unit.f142422a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection s(OptimizedImplementation optimizedImplementation, Name it) {
            Intrinsics.j(it, "it");
            return optimizedImplementation.n(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TypeAliasDescriptor t(OptimizedImplementation optimizedImplementation, Name it) {
            Intrinsics.j(it, "it");
            return optimizedImplementation.o(it);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set u(OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
            return SetsKt.l(optimizedImplementation.f146513b.keySet(), deserializedMemberScope.x());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> a() {
            return (Set) StorageKt.a(this.f146518g, this, f146511j[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Collection<SimpleFunctionDescriptor> b(Name name, LookupLocation location) {
            Intrinsics.j(name, "name");
            Intrinsics.j(location, "location");
            return !a().contains(name) ? CollectionsKt.m() : this.f146515d.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Collection<PropertyDescriptor> c(Name name, LookupLocation location) {
            Intrinsics.j(name, "name");
            Intrinsics.j(location, "location");
            return !d().contains(name) ? CollectionsKt.m() : this.f146516e.invoke(name);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> d() {
            return (Set) StorageKt.a(this.f146519h, this, f146511j[1]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> e() {
            return this.f146514c.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public void f(Collection<DeclarationDescriptor> result, DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter, LookupLocation location) {
            Intrinsics.j(result, "result");
            Intrinsics.j(kindFilter, "kindFilter");
            Intrinsics.j(nameFilter, "nameFilter");
            Intrinsics.j(location, "location");
            if (kindFilter.a(DescriptorKindFilter.f146255c.i())) {
                Set<Name> setD = d();
                ArrayList arrayList = new ArrayList();
                for (Name name : setD) {
                    if (nameFilter.invoke(name).booleanValue()) {
                        arrayList.addAll(c(name, location));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator INSTANCE = MemberComparator.NameAndTypeMemberComparator.f146130a;
                Intrinsics.i(INSTANCE, "INSTANCE");
                CollectionsKt.B(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.a(DescriptorKindFilter.f146255c.d())) {
                Set<Name> setA = a();
                ArrayList arrayList2 = new ArrayList();
                for (Name name2 : setA) {
                    if (nameFilter.invoke(name2).booleanValue()) {
                        arrayList2.addAll(b(name2, location));
                    }
                }
                MemberComparator.NameAndTypeMemberComparator INSTANCE2 = MemberComparator.NameAndTypeMemberComparator.f146130a;
                Intrinsics.i(INSTANCE2, "INSTANCE");
                CollectionsKt.B(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public TypeAliasDescriptor g(Name name) {
            Intrinsics.j(name, "name");
            return this.f146517f.invoke(name);
        }
    }

    private interface a {
        Set<Name> a();

        Collection<SimpleFunctionDescriptor> b(Name name, LookupLocation lookupLocation);

        Collection<PropertyDescriptor> c(Name name, LookupLocation lookupLocation);

        Set<Name> d();

        Set<Name> e();

        void f(Collection<DeclarationDescriptor> collection, DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1, LookupLocation lookupLocation);

        TypeAliasDescriptor g(Name name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SourceDebugExtension
    final class b implements a {

        /* renamed from: o, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f146524o = {Reflection.j(new PropertyReference1Impl(b.class, "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(b.class, "declaredProperties", "getDeclaredProperties()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(b.class, "allTypeAliases", "getAllTypeAliases()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(b.class, "allFunctions", "getAllFunctions()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(b.class, "allProperties", "getAllProperties()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(b.class, "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;", 0)), Reflection.j(new PropertyReference1Impl(b.class, "functionsByName", "getFunctionsByName()Ljava/util/Map;", 0)), Reflection.j(new PropertyReference1Impl(b.class, "propertiesByName", "getPropertiesByName()Ljava/util/Map;", 0)), Reflection.j(new PropertyReference1Impl(b.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0)), Reflection.j(new PropertyReference1Impl(b.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0))};

        /* renamed from: a, reason: collision with root package name */
        private final List<ProtoBuf.Function> f146525a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ProtoBuf.Property> f146526b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ProtoBuf.TypeAlias> f146527c;

        /* renamed from: d, reason: collision with root package name */
        private final NotNullLazyValue f146528d;

        /* renamed from: e, reason: collision with root package name */
        private final NotNullLazyValue f146529e;

        /* renamed from: f, reason: collision with root package name */
        private final NotNullLazyValue f146530f;

        /* renamed from: g, reason: collision with root package name */
        private final NotNullLazyValue f146531g;

        /* renamed from: h, reason: collision with root package name */
        private final NotNullLazyValue f146532h;

        /* renamed from: i, reason: collision with root package name */
        private final NotNullLazyValue f146533i;

        /* renamed from: j, reason: collision with root package name */
        private final NotNullLazyValue f146534j;

        /* renamed from: k, reason: collision with root package name */
        private final NotNullLazyValue f146535k;

        /* renamed from: l, reason: collision with root package name */
        private final NotNullLazyValue f146536l;

        /* renamed from: m, reason: collision with root package name */
        private final NotNullLazyValue f146537m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ DeserializedMemberScope f146538n;

        public b(DeserializedMemberScope deserializedMemberScope, List<ProtoBuf.Function> functionList, List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) {
            Intrinsics.j(functionList, "functionList");
            Intrinsics.j(propertyList, "propertyList");
            Intrinsics.j(typeAliasList, "typeAliasList");
            this.f146538n = deserializedMemberScope;
            this.f146525a = functionList;
            this.f146526b = propertyList;
            this.f146527c = deserializedMemberScope.s().c().g().c() ? typeAliasList : CollectionsKt.m();
            this.f146528d = deserializedMemberScope.s().h().c(new p(this));
            this.f146529e = deserializedMemberScope.s().h().c(new q(this));
            this.f146530f = deserializedMemberScope.s().h().c(new r(this));
            this.f146531g = deserializedMemberScope.s().h().c(new s(this));
            this.f146532h = deserializedMemberScope.s().h().c(new t(this));
            this.f146533i = deserializedMemberScope.s().h().c(new u(this));
            this.f146534j = deserializedMemberScope.s().h().c(new v(this));
            this.f146535k = deserializedMemberScope.s().h().c(new w(this));
            this.f146536l = deserializedMemberScope.s().h().c(new x(this, deserializedMemberScope));
            this.f146537m = deserializedMemberScope.s().h().c(new y(this, deserializedMemberScope));
        }

        private final List<TypeAliasDescriptor> A() {
            List<ProtoBuf.TypeAlias> list = this.f146527c;
            DeserializedMemberScope deserializedMemberScope = this.f146538n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TypeAliasDescriptor typeAliasDescriptorZ = deserializedMemberScope.s().f().z((ProtoBuf.TypeAlias) ((MessageLite) it.next()));
                if (typeAliasDescriptorZ != null) {
                    arrayList.add(typeAliasDescriptorZ);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set D(b bVar, DeserializedMemberScope deserializedMemberScope) {
            List<ProtoBuf.Function> list = bVar.f146525a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope2 = bVar.f146538n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.b(deserializedMemberScope2.s().g(), ((ProtoBuf.Function) ((MessageLite) it.next())).i0()));
            }
            return SetsKt.l(linkedHashSet, deserializedMemberScope.w());
        }

        private final List<SimpleFunctionDescriptor> F() {
            return (List) StorageKt.a(this.f146531g, this, f146524o[3]);
        }

        private final List<PropertyDescriptor> G() {
            return (List) StorageKt.a(this.f146532h, this, f146524o[4]);
        }

        private final List<TypeAliasDescriptor> H() {
            return (List) StorageKt.a(this.f146530f, this, f146524o[2]);
        }

        private final List<SimpleFunctionDescriptor> I() {
            return (List) StorageKt.a(this.f146528d, this, f146524o[0]);
        }

        private final List<PropertyDescriptor> J() {
            return (List) StorageKt.a(this.f146529e, this, f146524o[1]);
        }

        private final Map<Name, Collection<SimpleFunctionDescriptor>> K() {
            return (Map) StorageKt.a(this.f146534j, this, f146524o[6]);
        }

        private final Map<Name, Collection<PropertyDescriptor>> L() {
            return (Map) StorageKt.a(this.f146535k, this, f146524o[7]);
        }

        private final Map<Name, TypeAliasDescriptor> M() {
            return (Map) StorageKt.a(this.f146533i, this, f146524o[5]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set P(b bVar, DeserializedMemberScope deserializedMemberScope) {
            List<ProtoBuf.Property> list = bVar.f146526b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope2 = bVar.f146538n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.b(deserializedMemberScope2.s().g(), ((ProtoBuf.Property) ((MessageLite) it.next())).h0()));
            }
            return SetsKt.l(linkedHashSet, deserializedMemberScope.x());
        }

        private final List<SimpleFunctionDescriptor> u() {
            Set<Name> setW = this.f146538n.w();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setW.iterator();
            while (it.hasNext()) {
                CollectionsKt.C(arrayList, x((Name) it.next()));
            }
            return arrayList;
        }

        private final List<PropertyDescriptor> v() {
            Set<Name> setX = this.f146538n.x();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setX.iterator();
            while (it.hasNext()) {
                CollectionsKt.C(arrayList, y((Name) it.next()));
            }
            return arrayList;
        }

        private final List<SimpleFunctionDescriptor> w() {
            List<ProtoBuf.Function> list = this.f146525a;
            DeserializedMemberScope deserializedMemberScope = this.f146538n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SimpleFunctionDescriptor simpleFunctionDescriptorS = deserializedMemberScope.s().f().s((ProtoBuf.Function) ((MessageLite) it.next()));
                if (!deserializedMemberScope.A(simpleFunctionDescriptorS)) {
                    simpleFunctionDescriptorS = null;
                }
                if (simpleFunctionDescriptorS != null) {
                    arrayList.add(simpleFunctionDescriptorS);
                }
            }
            return arrayList;
        }

        private final List<PropertyDescriptor> z() {
            List<ProtoBuf.Property> list = this.f146526b;
            DeserializedMemberScope deserializedMemberScope = this.f146538n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                PropertyDescriptor propertyDescriptorU = deserializedMemberScope.s().f().u((ProtoBuf.Property) ((MessageLite) it.next()));
                if (propertyDescriptorU != null) {
                    arrayList.add(propertyDescriptorU);
                }
            }
            return arrayList;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> a() {
            return (Set) StorageKt.a(this.f146536l, this, f146524o[8]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Collection<SimpleFunctionDescriptor> b(Name name, LookupLocation location) {
            Intrinsics.j(name, "name");
            Intrinsics.j(location, "location");
            if (!a().contains(name)) {
                return CollectionsKt.m();
            }
            Collection<SimpleFunctionDescriptor> collection = K().get(name);
            return collection == null ? CollectionsKt.m() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Collection<PropertyDescriptor> c(Name name, LookupLocation location) {
            Intrinsics.j(name, "name");
            Intrinsics.j(location, "location");
            if (!d().contains(name)) {
                return CollectionsKt.m();
            }
            Collection<PropertyDescriptor> collection = L().get(name);
            return collection == null ? CollectionsKt.m() : collection;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> d() {
            return (Set) StorageKt.a(this.f146537m, this, f146524o[9]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public Set<Name> e() {
            List<ProtoBuf.TypeAlias> list = this.f146527c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            DeserializedMemberScope deserializedMemberScope = this.f146538n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NameResolverUtilKt.b(deserializedMemberScope.s().g(), ((ProtoBuf.TypeAlias) ((MessageLite) it.next())).b0()));
            }
            return linkedHashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public void f(Collection<DeclarationDescriptor> result, DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter, LookupLocation location) {
            Intrinsics.j(result, "result");
            Intrinsics.j(kindFilter, "kindFilter");
            Intrinsics.j(nameFilter, "nameFilter");
            Intrinsics.j(location, "location");
            if (kindFilter.a(DescriptorKindFilter.f146255c.i())) {
                for (Object obj : G()) {
                    Name name = ((PropertyDescriptor) obj).getName();
                    Intrinsics.i(name, "getName(...)");
                    if (nameFilter.invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.a(DescriptorKindFilter.f146255c.d())) {
                for (Object obj2 : F()) {
                    Name name2 = ((SimpleFunctionDescriptor) obj2).getName();
                    Intrinsics.i(name2, "getName(...)");
                    if (nameFilter.invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.a
        public TypeAliasDescriptor g(Name name) {
            Intrinsics.j(name, "name");
            return M().get(name);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(b bVar) {
            return bVar.w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List C(b bVar) {
            return bVar.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map E(b bVar) {
            List<SimpleFunctionDescriptor> listF = bVar.F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listF) {
                Name name = ((SimpleFunctionDescriptor) obj).getName();
                Intrinsics.i(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map N(b bVar) {
            List<PropertyDescriptor> listG = bVar.G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listG) {
                Name name = ((PropertyDescriptor) obj).getName();
                Intrinsics.i(name, "getName(...)");
                Object arrayList = linkedHashMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(name, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map O(b bVar) {
            List<TypeAliasDescriptor> listH = bVar.H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(listH, 10)), 16));
            for (Object obj : listH) {
                Name name = ((TypeAliasDescriptor) obj).getName();
                Intrinsics.i(name, "getName(...)");
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List r(b bVar) {
            return CollectionsKt.P0(bVar.I(), bVar.u());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List s(b bVar) {
            return CollectionsKt.P0(bVar.J(), bVar.v());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List t(b bVar) {
            return bVar.A();
        }

        private final List<SimpleFunctionDescriptor> x(Name name) {
            List<SimpleFunctionDescriptor> listI = I();
            DeserializedMemberScope deserializedMemberScope = this.f146538n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                if (Intrinsics.e(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.n(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        private final List<PropertyDescriptor> y(Name name) {
            List<PropertyDescriptor> listJ = J();
            DeserializedMemberScope deserializedMemberScope = this.f146538n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listJ) {
                if (Intrinsics.e(((DeclarationDescriptor) obj).getName(), name)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            deserializedMemberScope.o(name, arrayList);
            return arrayList.subList(size, arrayList.size());
        }
    }

    protected boolean A(SimpleFunctionDescriptor function) {
        Intrinsics.j(function, "function");
        return true;
    }

    protected abstract void j(Collection<DeclarationDescriptor> collection, Function1<? super Name, Boolean> function1);

    protected void n(Name name, List<SimpleFunctionDescriptor> functions) {
        Intrinsics.j(name, "name");
        Intrinsics.j(functions, "functions");
    }

    protected void o(Name name, List<PropertyDescriptor> descriptors) {
        Intrinsics.j(name, "name");
        Intrinsics.j(descriptors, "descriptors");
    }

    protected abstract ClassId p(Name name);

    protected abstract Set<Name> v();

    protected abstract Set<Name> w();

    protected abstract Set<Name> x();

    protected DeserializedMemberScope(DeserializationContext c10, List<ProtoBuf.Function> functionList, List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList, Function0<? extends Collection<Name>> classNames) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(functionList, "functionList");
        Intrinsics.j(propertyList, "propertyList");
        Intrinsics.j(typeAliasList, "typeAliasList");
        Intrinsics.j(classNames, "classNames");
        this.f146507b = c10;
        this.f146508c = q(functionList, propertyList, typeAliasList);
        this.f146509d = c10.h().c(new n(classNames));
        this.f146510e = c10.h().e(new o(this));
    }

    private final a q(List<ProtoBuf.Function> list, List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
        return this.f146507b.c().g().a() ? new b(this, list, list2, list3) : new OptimizedImplementation(this, list, list2, list3);
    }

    private final ClassDescriptor r(Name name) {
        return this.f146507b.c().b(p(name));
    }

    private final Set<Name> u() {
        return (Set) StorageKt.b(this.f146510e, this, f146506f[1]);
    }

    private final TypeAliasDescriptor y(Name name) {
        return this.f146508c.g(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> a() {
        return this.f146508c.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<SimpleFunctionDescriptor> b(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return this.f146508c.b(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> c(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        return this.f146508c.c(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> d() {
        return this.f146508c.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        if (z(name)) {
            return r(name);
        }
        if (this.f146508c.e().contains(name)) {
            return y(name);
        }
        return null;
    }

    protected final Collection<DeclarationDescriptor> m(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter, LookupLocation location) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        Intrinsics.j(location, "location");
        ArrayList arrayList = new ArrayList(0);
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.f146255c;
        if (kindFilter.a(companion.g())) {
            j(arrayList, nameFilter);
        }
        this.f146508c.f(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.a(companion.c())) {
            for (Name name : t()) {
                if (nameFilter.invoke(name).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, r(name));
                }
            }
        }
        if (kindFilter.a(DescriptorKindFilter.f146255c.h())) {
            for (Name name2 : this.f146508c.e()) {
                if (nameFilter.invoke(name2).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.a(arrayList, this.f146508c.g(name2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.c(arrayList);
    }

    protected final DeserializationContext s() {
        return this.f146507b;
    }

    public final Set<Name> t() {
        return (Set) StorageKt.a(this.f146509d, this, f146506f[0]);
    }

    protected boolean z(Name name) {
        Intrinsics.j(name, "name");
        return t().contains(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set k(Function0 function0) {
        return CollectionsKt.o1((Iterable) function0.invoke());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set l(DeserializedMemberScope deserializedMemberScope) {
        Set<Name> setV = deserializedMemberScope.v();
        if (setV == null) {
            return null;
        }
        return SetsKt.l(SetsKt.l(deserializedMemberScope.t(), deserializedMemberScope.f146508c.e()), setV);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> e() {
        return u();
    }
}
