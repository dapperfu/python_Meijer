package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMappingUtilsKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001JB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0002\u0010\u0011J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R'\u00103\u001a\u0012\u0012\u000e\u0012\f0.R\b\u0012\u0004\u0012\u00028\u00000\u00000-8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002040\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0016\u00109\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010(R\u0016\u0010;\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010(R\u0014\u0010>\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010F¨\u0006K"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", "T", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "U", "(Lkotlin/reflect/jvm/internal/impl/name/ClassId;Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;)Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "K", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "G", "", "index", "H", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "value", "", "s", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "Ljava/lang/Class;", "h", "()Ljava/lang/Class;", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "e", "Lkotlin/Lazy;", "X", "()Lkotlin/Lazy;", "data", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "F", "()Ljava/util/Collection;", "constructorDescriptors", "u", "simpleName", "t", "qualifiedName", "r", "()Z", "isValue", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "Data", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KClassifierImpl, KTypeParameterOwnerImpl {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Class<T> jClass;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy<KClassImpl<T>.Data> data;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u0018R-\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001d8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R%\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010!R#\u0010.\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,R!\u00102\u001a\b\u0012\u0004\u0012\u00020/0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010\u0014R!\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u0014R)\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000%0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b8\u0010\u0014R%\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\f\u001a\u0004\b<\u0010!R%\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b?\u0010!R%\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\f\u001a\u0004\bB\u0010!R%\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\f\u001a\u0004\bE\u0010!R%\u0010I\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\f\u001a\u0004\bH\u0010!R%\u0010L\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\f\u001a\u0004\bK\u0010!R%\u0010O\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\f\u001a\u0004\bN\u0010!R%\u0010R\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\f\u001a\u0004\bQ\u0010!¨\u0006S"}, d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "Ljava/lang/Class;", "jClass", "", "B", "(Ljava/lang/Class;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "d", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "e", "getAnnotations", "()Ljava/util/List;", "annotations", "f", "P", "()Ljava/lang/String;", "simpleName", "g", "O", "qualifiedName", "", "Lkotlin/reflect/KFunction;", "h", "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lkotlin/reflect/KClass;", "i", "getNestedClasses", "nestedClasses", "j", "Lkotlin/Lazy;", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lkotlin/reflect/KTypeParameter;", "k", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KType;", "l", "getSupertypes", "supertypes", "m", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "n", "J", "declaredNonStaticMembers", "o", "K", "declaredStaticMembers", "p", "M", "inheritedNonStaticMembers", "q", "N", "inheritedStaticMembers", "r", "H", "allNonStaticMembers", "s", "I", "allStaticMembers", "t", "getDeclaredMembers", "declaredMembers", "u", "getAllMembers", "allMembers", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public final class Data extends KDeclarationContainerImpl.Data {

        /* renamed from: w, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f143935w = {Reflection.j(new PropertyReference1Impl(Data.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "annotations", "getAnnotations()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "constructors", "getConstructors()Ljava/util/Collection;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "supertypes", "getSupertypes()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0)), Reflection.j(new PropertyReference1Impl(Data.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0))};

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal descriptor;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal annotations;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal simpleName;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal qualifiedName;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal constructors;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal nestedClasses;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final Lazy objectInstance;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal typeParameters;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal supertypes;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal sealedSubclasses;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal declaredNonStaticMembers;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal declaredStaticMembers;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal inheritedNonStaticMembers;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal inheritedStaticMembers;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal allNonStaticMembers;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal allStaticMembers;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal declaredMembers;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal allMembers;

        public Data() {
            super();
            this.descriptor = ReflectProperties.c(new C15393t(KClassImpl.this));
            this.annotations = ReflectProperties.c(new E(this));
            this.simpleName = ReflectProperties.c(new F(KClassImpl.this, this));
            this.qualifiedName = ReflectProperties.c(new G(KClassImpl.this));
            this.constructors = ReflectProperties.c(new H(KClassImpl.this));
            this.nestedClasses = ReflectProperties.c(new I(this));
            this.objectInstance = LazyKt.a(LazyThreadSafetyMode.f143287b, new J(this, KClassImpl.this));
            this.typeParameters = ReflectProperties.c(new K(this, KClassImpl.this));
            this.supertypes = ReflectProperties.c(new L(this, KClassImpl.this));
            this.sealedSubclasses = ReflectProperties.c(new M(this));
            this.declaredNonStaticMembers = ReflectProperties.c(new C15394u(KClassImpl.this));
            this.declaredStaticMembers = ReflectProperties.c(new C15395v(KClassImpl.this));
            this.inheritedNonStaticMembers = ReflectProperties.c(new C15396w(KClassImpl.this));
            this.inheritedStaticMembers = ReflectProperties.c(new C15397x(KClassImpl.this));
            this.allNonStaticMembers = ReflectProperties.c(new C15398y(this));
            this.allStaticMembers = ReflectProperties.c(new C15399z(this));
            this.declaredMembers = ReflectProperties.c(new A(this));
            this.allMembers = ReflectProperties.c(new B(this));
        }

        private final Collection<KCallableImpl<?>> K() {
            T tB = this.declaredStaticMembers.b(this, f143935w[10]);
            Intrinsics.i(tB, "getValue(...)");
            return (Collection) tB;
        }

        private final Collection<KCallableImpl<?>> M() {
            T tB = this.inheritedNonStaticMembers.b(this, f143935w[11]);
            Intrinsics.i(tB, "getValue(...)");
            return (Collection) tB;
        }

        private final Collection<KCallableImpl<?>> N() {
            T tB = this.inheritedStaticMembers.b(this, f143935w[12]);
            Intrinsics.i(tB, "getValue(...)");
            return (Collection) tB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type Z() {
            return Object.class;
        }

        public final Collection<KCallableImpl<?>> H() {
            T tB = this.allNonStaticMembers.b(this, f143935w[13]);
            Intrinsics.i(tB, "getValue(...)");
            return (Collection) tB;
        }

        public final Collection<KCallableImpl<?>> I() {
            T tB = this.allStaticMembers.b(this, f143935w[14]);
            Intrinsics.i(tB, "getValue(...)");
            return (Collection) tB;
        }

        public final Collection<KCallableImpl<?>> J() {
            T tB = this.declaredNonStaticMembers.b(this, f143935w[9]);
            Intrinsics.i(tB, "getValue(...)");
            return (Collection) tB;
        }

        public final ClassDescriptor L() {
            T tB = this.descriptor.b(this, f143935w[0]);
            Intrinsics.i(tB, "getValue(...)");
            return (ClassDescriptor) tB;
        }

        public final String O() {
            return (String) this.qualifiedName.b(this, f143935w[3]);
        }

        public final String P() {
            return (String) this.simpleName.b(this, f143935w[2]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List A(Data data) {
            return UtilKt.e(data.L());
        }

        private final String B(Class<?> jClass) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                Intrinsics.g(simpleName);
                return StringsKt.o1(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                Intrinsics.g(simpleName);
                return StringsKt.o1(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
            }
            Intrinsics.g(simpleName);
            return StringsKt.n1(simpleName, '$', null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List C(KClassImpl kClassImpl) {
            Collection<ConstructorDescriptor> collectionF = kClassImpl.F();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionF, 10));
            Iterator<T> it = collectionF.iterator();
            while (it.hasNext()) {
                arrayList.add(new KFunctionImpl(kClassImpl, (ConstructorDescriptor) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List D(Data data) {
            return CollectionsKt.P0(data.J(), data.K());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection E(KClassImpl kClassImpl) {
            return kClassImpl.I(kClassImpl.Z(), KDeclarationContainerImpl.MemberBelonginess.f143962a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection F(KClassImpl kClassImpl) {
            return kClassImpl.I(kClassImpl.a0(), KDeclarationContainerImpl.MemberBelonginess.f143962a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ClassDescriptor G(KClassImpl kClassImpl) {
            ClassDescriptor classDescriptorB;
            ClassId classIdW = kClassImpl.W();
            RuntimeModuleData runtimeModuleDataB = kClassImpl.X().getValue().b();
            ModuleDescriptor moduleDescriptorB = runtimeModuleDataB.b();
            if (classIdW.i() && kClassImpl.h().isAnnotationPresent(Metadata.class)) {
                classDescriptorB = runtimeModuleDataB.a().b(classIdW);
            } else {
                classDescriptorB = FindClassInModuleKt.b(moduleDescriptorB, classIdW);
            }
            if (classDescriptorB == null) {
                return kClassImpl.U(classIdW, runtimeModuleDataB);
            }
            return classDescriptorB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection Q(KClassImpl kClassImpl) {
            return kClassImpl.I(kClassImpl.Z(), KDeclarationContainerImpl.MemberBelonginess.f143963b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection R(KClassImpl kClassImpl) {
            return kClassImpl.I(kClassImpl.a0(), KDeclarationContainerImpl.MemberBelonginess.f143963b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List S(Data data) {
            ClassDescriptor classDescriptor;
            Class<?> clsQ;
            KClassImpl kClassImpl;
            Collection collectionA = ResolutionScope.DefaultImpls.a(data.L().R(), null, null, 3, null);
            ArrayList<DeclarationDescriptor> arrayList = new ArrayList();
            for (T t10 : collectionA) {
                if (!DescriptorUtils.B((DeclarationDescriptor) t10)) {
                    arrayList.add(t10);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (DeclarationDescriptor declarationDescriptor : arrayList) {
                if (declarationDescriptor instanceof ClassDescriptor) {
                    classDescriptor = (ClassDescriptor) declarationDescriptor;
                } else {
                    classDescriptor = null;
                }
                if (classDescriptor != null) {
                    clsQ = UtilKt.q(classDescriptor);
                } else {
                    clsQ = null;
                }
                if (clsQ != null) {
                    kClassImpl = new KClassImpl(clsQ);
                } else {
                    kClassImpl = null;
                }
                if (kClassImpl != null) {
                    arrayList2.add(kClassImpl);
                }
            }
            return arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object T(Data data, KClassImpl kClassImpl) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
            Field declaredField;
            ClassDescriptor classDescriptorL = data.L();
            if (classDescriptorL.f() != ClassKind.f144497g) {
                return null;
            }
            if (classDescriptorL.Z() && !CompanionObjectMappingUtilsKt.a(CompanionObjectMapping.f144143a, classDescriptorL)) {
                declaredField = kClassImpl.h().getEnclosingClass().getDeclaredField(classDescriptorL.getName().b());
            } else {
                declaredField = kClassImpl.h().getDeclaredField("INSTANCE");
            }
            Object obj = declaredField.get(null);
            Intrinsics.h(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String U(KClassImpl kClassImpl) {
            if (!kClassImpl.h().isAnonymousClass()) {
                ClassId classIdW = kClassImpl.W();
                if (classIdW.i()) {
                    return null;
                }
                return classIdW.a().a();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List V(Data data) {
            KClassImpl kClassImpl;
            Collection<ClassDescriptor> collectionW = data.L().w();
            Intrinsics.i(collectionW, "getSealedSubclasses(...)");
            ArrayList arrayList = new ArrayList();
            for (ClassDescriptor classDescriptor : collectionW) {
                Intrinsics.h(classDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class<?> clsQ = UtilKt.q(classDescriptor);
                if (clsQ != null) {
                    kClassImpl = new KClassImpl(clsQ);
                } else {
                    kClassImpl = null;
                }
                if (kClassImpl != null) {
                    arrayList.add(kClassImpl);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String W(KClassImpl kClassImpl, Data data) {
            if (!kClassImpl.h().isAnonymousClass()) {
                ClassId classIdW = kClassImpl.W();
                if (classIdW.i()) {
                    return data.B(kClassImpl.h());
                }
                String strB = classIdW.h().b();
                Intrinsics.i(strB, "asString(...)");
                return strB;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List X(Data data, KClassImpl kClassImpl) {
            Collection<KotlinType> collectionA = data.L().i().a();
            Intrinsics.i(collectionA, "getSupertypes(...)");
            ArrayList arrayList = new ArrayList(collectionA.size());
            for (KotlinType kotlinType : collectionA) {
                Intrinsics.g(kotlinType);
                arrayList.add(new KTypeImpl(kotlinType, new C(kotlinType, data, kClassImpl)));
            }
            if (!KotlinBuiltIns.v0(data.L())) {
                if (!arrayList.isEmpty()) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        ClassKind classKindF = DescriptorUtils.e(((KTypeImpl) it.next()).getType()).f();
                        Intrinsics.i(classKindF, "getKind(...)");
                        if (classKindF != ClassKind.f144493c && classKindF != ClassKind.f144496f) {
                            break;
                        }
                    }
                    SimpleType simpleTypeI = DescriptorUtilsKt.m(data.L()).i();
                    Intrinsics.i(simpleTypeI, "getAnyType(...)");
                    arrayList.add(new KTypeImpl(simpleTypeI, D.f143896a));
                } else {
                    SimpleType simpleTypeI2 = DescriptorUtilsKt.m(data.L()).i();
                    Intrinsics.i(simpleTypeI2, "getAnyType(...)");
                    arrayList.add(new KTypeImpl(simpleTypeI2, D.f143896a));
                }
            }
            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.c(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type Y(KotlinType kotlinType, Data data, KClassImpl kClassImpl) {
            ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
            if (classifierDescriptorD instanceof ClassDescriptor) {
                Class<?> clsQ = UtilKt.q((ClassDescriptor) classifierDescriptorD);
                if (clsQ != null) {
                    if (Intrinsics.e(kClassImpl.h().getSuperclass(), clsQ)) {
                        Type genericSuperclass = kClassImpl.h().getGenericSuperclass();
                        Intrinsics.g(genericSuperclass);
                        return genericSuperclass;
                    }
                    Class<?>[] interfaces = kClassImpl.h().getInterfaces();
                    Intrinsics.i(interfaces, "getInterfaces(...)");
                    int iT0 = ArraysKt.t0(interfaces, clsQ);
                    if (iT0 >= 0) {
                        Type type = kClassImpl.h().getGenericInterfaces()[iT0];
                        Intrinsics.g(type);
                        return type;
                    }
                    throw new KotlinReflectionInternalError("No superclass of " + data + " in Java reflection for " + classifierDescriptorD);
                }
                throw new KotlinReflectionInternalError("Unsupported superclass of " + data + ": " + classifierDescriptorD);
            }
            throw new KotlinReflectionInternalError("Supertype not a class: " + classifierDescriptorD);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List a0(Data data, KClassImpl kClassImpl) {
            List<TypeParameterDescriptor> listP = data.L().p();
            Intrinsics.i(listP, "getDeclaredTypeParameters(...)");
            List<TypeParameterDescriptor> list = listP;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                Intrinsics.g(typeParameterDescriptor);
                arrayList.add(new KTypeParameterImpl(kClassImpl, typeParameterDescriptor));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List x(Data data) {
            return CollectionsKt.P0(data.H(), data.I());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List y(Data data) {
            return CollectionsKt.P0(data.J(), data.M());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List z(Data data) {
            return CollectionsKt.P0(data.K(), data.N());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.f145776f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.f145778h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.f145779i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KotlinClassHeader.Kind.f145777g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KotlinClassHeader.Kind.f145774d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KotlinClassHeader.Kind.f145775e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function2<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f143955b = new a();

        a() {
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

    public KClassImpl(Class<T> jClass) {
        Intrinsics.j(jClass, "jClass");
        this.jClass = jClass;
        this.data = LazyKt.a(LazyThreadSafetyMode.f143287b, new C15392s(this));
    }

    private final ClassDescriptor T(ClassId classId, RuntimeModuleData moduleData) {
        final ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new EmptyPackageFragmentDescriptor(moduleData.b(), classId.f()), classId.h(), Modality.f144526b, ClassKind.f144492b, CollectionsKt.e(moduleData.b().l().h().o()), SourceElement.f144554a, false, moduleData.a().u());
        final StorageManager storageManagerU = moduleData.a().u();
        classDescriptorImpl.H0(new GivenFunctionsMemberScope(classDescriptorImpl, storageManagerU) { // from class: kotlin.reflect.jvm.internal.KClassImpl$createSyntheticClass$1$1
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
            protected List<FunctionDescriptor> j() {
                return CollectionsKt.m();
            }
        }, SetsKt.e(), null);
        return classDescriptorImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Data V(KClassImpl kClassImpl) {
        return new Data();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassId W() {
        return RuntimeTypeMapper.f144044a.c(h());
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<FunctionDescriptor> G(Name name) {
        Intrinsics.j(name, "name");
        MemberScope memberScopeZ = Z();
        NoLookupLocation noLookupLocation = NoLookupLocation.f145029h;
        return CollectionsKt.P0(memberScopeZ.b(name, noLookupLocation), a0().b(name, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<PropertyDescriptor> K(Name name) {
        Intrinsics.j(name, "name");
        MemberScope memberScopeZ = Z();
        NoLookupLocation noLookupLocation = NoLookupLocation.f145029h;
        return CollectionsKt.P0(memberScopeZ.c(name, noLookupLocation), a0().c(name, noLookupLocation));
    }

    public final Lazy<KClassImpl<T>.Data> X() {
        return this.data;
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor getDescriptor() {
        return this.data.getValue().L();
    }

    public boolean equals(Object other) {
        return (other instanceof KClassImpl) && Intrinsics.e(JvmClassMappingKt.c(this), JvmClassMappingKt.c((KClass) other));
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public Class<T> h() {
        return this.jClass;
    }

    @Override // kotlin.reflect.KClass
    public String t() {
        return this.data.getValue().O();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        ClassId classIdW = W();
        FqName fqNameF = classIdW.f();
        if (fqNameF.c()) {
            str = "";
        } else {
            str = fqNameF.a() + '.';
        }
        sb2.append(str + StringsKt.P(classIdW.g().a(), '.', '$', false, 4, null));
        return sb2.toString();
    }

    @Override // kotlin.reflect.KClass
    public String u() {
        return this.data.getValue().P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor U(ClassId classId, RuntimeModuleData moduleData) {
        KotlinClassHeader.Kind kindC;
        int i10;
        KotlinClassHeader kotlinClassHeaderB;
        if (h().isSynthetic()) {
            return T(classId, moduleData);
        }
        ReflectKotlinClass reflectKotlinClassA = ReflectKotlinClass.f144947c.a(h());
        if (reflectKotlinClassA != null && (kotlinClassHeaderB = reflectKotlinClassA.b()) != null) {
            kindC = kotlinClassHeaderB.c();
        } else {
            kindC = null;
        }
        if (kindC == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[kindC.ordinal()];
        }
        switch (i10) {
            case -1:
            case 6:
                throw new KotlinReflectionInternalError("Unresolved class: " + h() + " (kind = " + kindC + ')');
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
                return T(classId, moduleData);
            case 5:
                throw new KotlinReflectionInternalError("Unknown class: " + h() + " (kind = " + kindC + ')');
        }
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<ConstructorDescriptor> F() {
        ClassDescriptor classDescriptorA = a();
        if (classDescriptorA.f() != ClassKind.f144493c && classDescriptorA.f() != ClassKind.f144497g) {
            Collection<ClassConstructorDescriptor> collectionJ = classDescriptorA.j();
            Intrinsics.i(collectionJ, "getConstructors(...)");
            return collectionJ;
        }
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public PropertyDescriptor H(int index) {
        DeserializedClassDescriptor deserializedClassDescriptor;
        Class<?> declaringClass;
        if (Intrinsics.e(h().getSimpleName(), "DefaultImpls") && (declaringClass = h().getDeclaringClass()) != null && declaringClass.isInterface()) {
            KClass kClassE = JvmClassMappingKt.e(declaringClass);
            Intrinsics.h(kClassE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((KClassImpl) kClassE).H(index);
        }
        ClassDescriptor classDescriptorA = a();
        if (classDescriptorA instanceof DeserializedClassDescriptor) {
            deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptorA;
        } else {
            deserializedClassDescriptor = null;
        }
        if (deserializedClassDescriptor != null) {
            ProtoBuf.Class classB1 = deserializedClassDescriptor.b1();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable = JvmProtoBuf.f146469j;
            Intrinsics.i(classLocalVariable, "classLocalVariable");
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.b(classB1, classLocalVariable, index);
            if (property != null) {
                return (PropertyDescriptor) UtilKt.h(h(), property, deserializedClassDescriptor.a1().g(), deserializedClassDescriptor.a1().j(), deserializedClassDescriptor.d1(), a.f143955b);
            }
        }
        return null;
    }

    public final MemberScope Z() {
        return a().o().n();
    }

    public final MemberScope a0() {
        MemberScope memberScopeJ0 = a().j0();
        Intrinsics.i(memberScopeJ0, "getStaticScope(...)");
        return memberScopeJ0;
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean r() {
        return a().r();
    }

    @Override // kotlin.reflect.KClass
    public boolean s(Object value) {
        Integer numG = ReflectClassUtilKt.g(h());
        if (numG != null) {
            return TypeIntrinsics.m(value, numG.intValue());
        }
        Class clsK = ReflectClassUtilKt.k(h());
        if (clsK == null) {
            clsK = h();
        }
        return clsK.isInstance(value);
    }
}
