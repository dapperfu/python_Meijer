package kotlin.reflect.jvm.internal;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001/B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010$\u001a\f\u0012\b\u0012\u00060!R\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0006\u0012\u0002\b\u00030\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "K", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "G", "", "index", "H", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "Ljava/lang/Class;", "h", "()Ljava/lang/Class;", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KPackageImpl$a;", "e", "Lkotlin/Lazy;", "data", "J", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "F", "()Ljava/util/Collection;", "constructorDescriptors", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "a", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class KPackageImpl extends KDeclarationContainerImpl {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Class<?> jClass;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy<a> data;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R/\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$a;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/ReflectKotlinClass;", "d", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getKotlinClass", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", "kotlinClass", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "e", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "Ljava/lang/Class;", "f", "Lkotlin/Lazy;", "k", "()Ljava/lang/Class;", "multifileFacade", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/MetadataVersion;", "g", "j", "()Lkotlin/Triple;", "metadata", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "h", "getMembers", "()Ljava/util/Collection;", "members", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class a extends KDeclarationContainerImpl.Data {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f143076j = {Reflection.j(new PropertyReference1Impl(a.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0)), Reflection.j(new PropertyReference1Impl(a.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)), Reflection.j(new PropertyReference1Impl(a.class, "members", "getMembers()Ljava/util/Collection;", 0))};

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal kotlinClass;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal scope;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Lazy multifileFacade;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Lazy metadata;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal members;

        public a() {
            super();
            this.kotlinClass = ReflectProperties.c(new C15225a0(KPackageImpl.this));
            this.scope = ReflectProperties.c(new C15227b0(this));
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f142380b;
            this.multifileFacade = LazyKt.a(lazyThreadSafetyMode, new C15229c0(this, KPackageImpl.this));
            this.metadata = LazyKt.a(lazyThreadSafetyMode, new d0(this));
            this.members = ReflectProperties.c(new e0(KPackageImpl.this, this));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final ReflectKotlinClass i() {
            return (ReflectKotlinClass) this.kotlinClass.b(this, f143076j[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ReflectKotlinClass m(KPackageImpl kPackageImpl) {
            return ReflectKotlinClass.f144040c.a(kPackageImpl.h());
        }

        public final Triple<JvmNameResolver, ProtoBuf.Package, MetadataVersion> j() {
            return (Triple) this.metadata.getValue();
        }

        public final Class<?> k() {
            return (Class) this.multifileFacade.getValue();
        }

        public final MemberScope l() {
            T tB = this.scope.b(this, f143076j[1]);
            Intrinsics.i(tB, "getValue(...)");
            return (MemberScope) tB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection n(KPackageImpl kPackageImpl, a aVar) {
            return kPackageImpl.I(aVar.l(), KDeclarationContainerImpl.MemberBelonginess.f143055a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Triple o(a aVar) {
            KotlinClassHeader kotlinClassHeaderB;
            ReflectKotlinClass reflectKotlinClassI = aVar.i();
            if (reflectKotlinClassI != null && (kotlinClassHeaderB = reflectKotlinClassI.b()) != null) {
                String[] strArrA = kotlinClassHeaderB.a();
                String[] strArrG = kotlinClassHeaderB.g();
                if (strArrA != null && strArrG != null) {
                    Pair<JvmNameResolver, ProtoBuf.Package> pairM = JvmProtoBufUtil.m(strArrA, strArrG);
                    return new Triple(pairM.a(), pairM.b(), kotlinClassHeaderB.d());
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Class p(a aVar, KPackageImpl kPackageImpl) {
            String strE;
            KotlinClassHeader kotlinClassHeaderB;
            ReflectKotlinClass reflectKotlinClassI = aVar.i();
            if (reflectKotlinClassI != null && (kotlinClassHeaderB = reflectKotlinClassI.b()) != null) {
                strE = kotlinClassHeaderB.e();
            } else {
                strE = null;
            }
            if (strE == null || strE.length() <= 0) {
                return null;
            }
            return kPackageImpl.h().getClassLoader().loadClass(StringsKt.P(strE, '/', '.', false, 4, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MemberScope q(a aVar) {
            ReflectKotlinClass reflectKotlinClassI = aVar.i();
            if (reflectKotlinClassI != null) {
                return aVar.b().c().a(reflectKotlinClassI);
            }
            return MemberScope.Empty.f146293b;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends FunctionReferenceImpl implements Function2<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f143083b = new b();

        b() {
            super(2, MemberDeserializer.class, "loadProperty", "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PropertyDescriptor invoke(MemberDeserializer p02, ProtoBuf.Property p12) {
            Intrinsics.j(p02, "p0");
            Intrinsics.j(p12, "p1");
            return p02.u(p12);
        }
    }

    public KPackageImpl(Class<?> jClass) {
        Intrinsics.j(jClass, "jClass");
        this.jClass = jClass;
        this.data = LazyKt.a(LazyThreadSafetyMode.f142380b, new Z(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a R(KPackageImpl kPackageImpl) {
        return kPackageImpl.new a();
    }

    private final MemberScope S() {
        return this.data.getValue().l();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<FunctionDescriptor> G(Name name) {
        Intrinsics.j(name, "name");
        return S().b(name, NoLookupLocation.f144122h);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public PropertyDescriptor H(int index) {
        Triple<JvmNameResolver, ProtoBuf.Package, MetadataVersion> tripleJ = this.data.getValue().j();
        if (tripleJ != null) {
            JvmNameResolver jvmNameResolverA = tripleJ.a();
            ProtoBuf.Package packageB = tripleJ.b();
            MetadataVersion metadataVersionC = tripleJ.c();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable = JvmProtoBuf.f145566n;
            Intrinsics.i(packageLocalVariable, "packageLocalVariable");
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.b(packageB, packageLocalVariable, index);
            if (property != null) {
                Class<?> clsH = h();
                ProtoBuf.TypeTable typeTableW = packageB.W();
                Intrinsics.i(typeTableW, "getTypeTable(...)");
                return (PropertyDescriptor) UtilKt.h(clsH, property, jvmNameResolverA, new TypeTable(typeTableW), metadataVersionC, b.f143083b);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    protected Class<?> J() {
        Class<?> clsK = this.data.getValue().k();
        return clsK == null ? h() : clsK;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<PropertyDescriptor> K(Name name) {
        Intrinsics.j(name, "name");
        return S().c(name, NoLookupLocation.f144122h);
    }

    public boolean equals(Object other) {
        return (other instanceof KPackageImpl) && Intrinsics.e(h(), ((KPackageImpl) other).h());
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public Class<?> h() {
        return this.jClass;
    }

    public String toString() {
        return "file class " + ReflectClassUtilKt.e(h()).a();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<ConstructorDescriptor> F() {
        return CollectionsKt.m();
    }

    public int hashCode() {
        return h().hashCode();
    }
}
