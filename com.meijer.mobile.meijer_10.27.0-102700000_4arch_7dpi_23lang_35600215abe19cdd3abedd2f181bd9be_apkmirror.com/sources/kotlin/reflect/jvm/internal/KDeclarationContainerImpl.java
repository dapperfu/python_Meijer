package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 K2\u00020\u0001:\u0004LMKNB\u0007¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000f\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012*\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001a\u001a\u00020\u00192\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00152\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00112\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0'2\u0006\u0010\u0006\u001a\u00020&H&¢\u0006\u0004\b,\u0010*J\u0019\u0010.\u001a\u0004\u0018\u00010(2\u0006\u0010-\u001a\u00020!H&¢\u0006\u0004\b.\u0010/J)\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040'2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0004¢\u0006\u0004\b5\u00106J\u001d\u00108\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b8\u00109J\u001d\u0010:\u001a\u00020+2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b<\u0010=J'\u0010?\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\bA\u0010BJ\u001b\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\bC\u0010BR\u0018\u0010F\u001a\u0006\u0012\u0002\b\u00030\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020G0'8&X¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006O"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "<init>", "()V", "Ljava/lang/Class;", "", "name", "", "parameterTypes", "returnType", "", "isStaticDefault", "Ljava/lang/reflect/Method;", "L", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Ljava/lang/reflect/Method;", "P", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;", "", "Ljava/lang/reflect/Constructor;", "O", "(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;", "", "result", "valueParameters", "isConstructor", "", "q", "(Ljava/util/List;Ljava/util/List;Z)V", "desc", "parseReturnType", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$a;", "M", "(Ljava/lang/String;Z)Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$a;", "", "begin", "end", "N", "(Ljava/lang/String;II)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "K", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "G", "index", "H", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "scope", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "belonginess", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "I", "(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;)Ljava/util/Collection;", "signature", "B", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "y", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "A", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;", "isMember", "x", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/reflect/Method;", "v", "(Ljava/lang/String;)Ljava/lang/reflect/Constructor;", "w", "J", "()Ljava/lang/Class;", "methodOwner", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "F", "()Ljava/util/Collection;", "constructorDescriptors", "a", "Data", "MemberBelonginess", "Companion", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class KDeclarationContainerImpl implements ClassBasedDeclarationContainer {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f143050b = DefaultConstructorMarker.class;

    /* renamed from: c, reason: collision with root package name */
    private static final Regex f143051c = new Regex("<v#(\\d+)>");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u0012\u0012\u0002\b\u0003 \n*\b\u0012\u0002\b\u0003\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;", "", "<init>", "()V", "Lkotlin/text/Regex;", "LOCAL_PROPERTY_SIGNATURE", "Lkotlin/text/Regex;", "a", "()Lkotlin/text/Regex;", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Regex a() {
            return KDeclarationContainerImpl.f143051c;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "a", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getModuleData", "()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public abstract class Data {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f143052c = {Reflection.j(new PropertyReference1Impl(Data.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ReflectProperties.LazySoftVal moduleData;

        public Data() {
            this.moduleData = ReflectProperties.c(new S(KDeclarationContainerImpl.this));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final RuntimeModuleData b() {
            T tB = this.moduleData.b(this, f143052c[0]);
            Intrinsics.i(tB, "getValue(...)");
            return (RuntimeModuleData) tB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RuntimeModuleData c(KDeclarationContainerImpl kDeclarationContainerImpl) {
            return ModuleByClassLoaderKt.a(kDeclarationContainerImpl.h());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\u0007¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "<init>", "(Ljava/lang/String;I)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "member", "", "b", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Z", "a", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    protected static final class MemberBelonginess {

        /* renamed from: a, reason: collision with root package name */
        public static final MemberBelonginess f143055a = new MemberBelonginess("DECLARED", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final MemberBelonginess f143056b = new MemberBelonginess("INHERITED", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ MemberBelonginess[] f143057c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f143058d;

        private static final /* synthetic */ MemberBelonginess[] a() {
            return new MemberBelonginess[]{f143055a, f143056b};
        }

        static {
            MemberBelonginess[] memberBelonginessArrA = a();
            f143057c = memberBelonginessArrA;
            f143058d = EnumEntriesKt.a(memberBelonginessArrA);
        }

        public static MemberBelonginess valueOf(String str) {
            return (MemberBelonginess) Enum.valueOf(MemberBelonginess.class, str);
        }

        public static MemberBelonginess[] values() {
            return (MemberBelonginess[]) f143057c.clone();
        }

        public final boolean b(CallableMemberDescriptor member) {
            Intrinsics.j(member, "member");
            return member.f().a() == (this == f143055a);
        }

        private MemberBelonginess(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$a;", "", "", "Ljava/lang/Class;", "parameters", "returnType", "<init>", "(Ljava/util/List;Ljava/lang/Class;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Class;", "()Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<Class<?>> parameters;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<?> returnType;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends Class<?>> parameters, Class<?> cls) {
            Intrinsics.j(parameters, "parameters");
            this.parameters = parameters;
            this.returnType = cls;
        }

        public final List<Class<?>> a() {
            return this.parameters;
        }

        public final Class<?> b() {
            return this.returnType;
        }
    }

    private final Method L(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2, boolean z10) throws NoSuchMethodException, SecurityException {
        String str2;
        Class<?>[] clsArr2;
        Class<?> cls3;
        boolean z11;
        if (z10) {
            clsArr[0] = cls;
        }
        Method methodP = P(cls, str, clsArr, cls2);
        if (methodP != null) {
            return methodP;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            Method methodL = L(superclass, str, clsArr, cls2, z10);
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
            if (methodL != null) {
                return methodL;
            }
        } else {
            str2 = str;
            clsArr2 = clsArr;
            cls3 = cls2;
            z11 = z10;
        }
        Iterator itA = ArrayIteratorKt.a(cls.getInterfaces());
        while (itA.hasNext()) {
            Class<?> cls4 = (Class) itA.next();
            Intrinsics.g(cls4);
            Method methodL2 = L(cls4, str2, clsArr2, cls3, z11);
            if (methodL2 != null) {
                return methodL2;
            }
            if (z11) {
                Class<?> clsA = ReflectJavaClassFinderKt.a(ReflectClassUtilKt.j(cls4), cls4.getName() + "$DefaultImpls");
                if (clsA != null) {
                    clsArr2[0] = cls4;
                    Method methodP2 = P(clsA, str2, clsArr2, cls3);
                    if (methodP2 != null) {
                        return methodP2;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final Method P(Class<?> cls, String str, Class<?>[] clsArr, Class<?> cls2) throws NoSuchMethodException, SecurityException {
        Method declaredMethod;
        try {
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
        }
        if (Intrinsics.e(declaredMethod.getReturnType(), cls2)) {
            return declaredMethod;
        }
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.i(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            if (Intrinsics.e(method.getName(), str) && Intrinsics.e(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    public abstract Collection<ConstructorDescriptor> F();

    public abstract Collection<FunctionDescriptor> G(Name name);

    public abstract PropertyDescriptor H(int index);

    public abstract Collection<PropertyDescriptor> K(Name name);

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence E(PropertyDescriptor descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return DescriptorRenderer.f145995k.N(descriptor) + " | " + RuntimeTypeMapper.f143137a.f(descriptor).getString();
    }

    private final a M(String desc, boolean parseReturnType) {
        String str;
        int iO0;
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        while (true) {
            if (desc.charAt(i10) == ')') {
                String str2 = desc;
                return new a(arrayList, parseReturnType ? N(str2, i10 + 1, str2.length()) : null);
            }
            int i11 = i10;
            while (desc.charAt(i11) == '[') {
                i11++;
            }
            char cCharAt = desc.charAt(i11);
            if (StringsKt.b0("VZCBSIFJD", cCharAt, false, 2, null)) {
                int i12 = i11 + 1;
                str = desc;
                iO0 = i12;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + desc);
                }
                str = desc;
                iO0 = StringsKt.o0(str, ';', i10, false, 4, null) + 1;
            }
            arrayList.add(N(str, i10, iO0));
            i10 = iO0;
            desc = str;
        }
    }

    private final Constructor<?> O(Class<?> cls, List<? extends Class<?>> list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence z(FunctionDescriptor descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return DescriptorRenderer.f145995k.N(descriptor) + " | " + RuntimeTypeMapper.f143137a.g(descriptor).get_signature();
    }

    public final Method A(String name, String desc) throws NoSuchMethodException, SecurityException {
        Method methodL;
        Intrinsics.j(name, "name");
        Intrinsics.j(desc, "desc");
        if (Intrinsics.e(name, "<init>")) {
            return null;
        }
        a aVarM = M(desc, true);
        Class<?>[] clsArr = (Class[]) aVarM.a().toArray(new Class[0]);
        Class<?> clsB = aVarM.b();
        Intrinsics.g(clsB);
        Method methodL2 = L(J(), name, clsArr, clsB, false);
        if (methodL2 != null) {
            return methodL2;
        }
        if (!J().isInterface() || (methodL = L(Object.class, name, clsArr, clsB, false)) == null) {
            return null;
        }
        return methodL;
    }

    public final PropertyDescriptor B(String name, String signature) {
        Intrinsics.j(name, "name");
        Intrinsics.j(signature, "signature");
        MatchResult matchResultI = f143051c.i(signature);
        if (matchResultI != null) {
            String str = matchResultI.a().getMatch().b().get(1);
            PropertyDescriptor propertyDescriptorH = H(Integer.parseInt(str));
            if (propertyDescriptorH != null) {
                return propertyDescriptorH;
            }
            throw new KotlinReflectionInternalError("Local property #" + str + " not found in " + h());
        }
        Name nameO = Name.o(name);
        Intrinsics.i(nameO, "identifier(...)");
        Collection<PropertyDescriptor> collectionK = K(nameO);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionK) {
            if (Intrinsics.e(RuntimeTypeMapper.f143137a.f((PropertyDescriptor) obj).getString(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            throw new KotlinReflectionInternalError("Property '" + name + "' (JVM signature: " + signature + ") not resolved in " + this);
        }
        if (arrayList.size() == 1) {
            return (PropertyDescriptor) CollectionsKt.U0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            DescriptorVisibility visibility = ((PropertyDescriptor) obj2).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        Collection collectionValues = MapsKt.j(linkedHashMap, new O(N.f143128a)).values();
        Intrinsics.i(collectionValues, "<get-values>(...)");
        List list = (List) CollectionsKt.C0(collectionValues);
        if (list.size() == 1) {
            Intrinsics.g(list);
            return (PropertyDescriptor) CollectionsKt.s0(list);
        }
        Name nameO2 = Name.o(name);
        Intrinsics.i(nameO2, "identifier(...)");
        String strB0 = CollectionsKt.B0(K(nameO2), "\n", null, null, 0, null, P.f143130a, 30, null);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property '");
        sb2.append(name);
        sb2.append("' (JVM signature: ");
        sb2.append(signature);
        sb2.append(") not resolved in ");
        sb2.append(this);
        sb2.append(':');
        sb2.append(strB0.length() == 0 ? " no members found" : '\n' + strB0);
        throw new KotlinReflectionInternalError(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.util.Collection<kotlin.reflect.jvm.internal.KCallableImpl<?>> I(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r8, kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.j(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.Intrinsics.j(r9, r0)
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1 r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$getMembers$visitor$1
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.a(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L20:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L4e
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r6 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.f143603h
            boolean r5 = kotlin.jvm.internal.Intrinsics.e(r5, r6)
            if (r5 != 0) goto L4e
            boolean r4 = r9.b(r4)
            if (r4 == 0) goto L4e
            kotlin.Unit r4 = kotlin.Unit.f142422a
            java.lang.Object r3 = r3.x(r0, r4)
            kotlin.reflect.jvm.internal.KCallableImpl r3 = (kotlin.reflect.jvm.internal.KCallableImpl) r3
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r3 == 0) goto L20
            r1.add(r3)
            goto L20
        L55:
            java.util.List r8 = kotlin.collections.CollectionsKt.j1(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.I(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.Collection");
    }

    public final Constructor<?> v(String desc) {
        Intrinsics.j(desc, "desc");
        return O(h(), M(desc, false).a());
    }

    public final Constructor<?> w(String desc) {
        Intrinsics.j(desc, "desc");
        Class<?> clsH = h();
        ArrayList arrayList = new ArrayList();
        q(arrayList, M(desc, false).a(), true);
        Unit unit = Unit.f142422a;
        return O(clsH, arrayList);
    }

    public final Method x(String name, String desc, boolean isMember) {
        Intrinsics.j(name, "name");
        Intrinsics.j(desc, "desc");
        if (Intrinsics.e(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (isMember) {
            arrayList.add(h());
        }
        a aVarM = M(desc, true);
        q(arrayList, aVarM.a(), false);
        Class<?> clsJ = J();
        String str = name + "$default";
        Class<?>[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> clsB = aVarM.b();
        Intrinsics.g(clsB);
        return L(clsJ, str, clsArr, clsB, isMember);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor y(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.y(java.lang.String, java.lang.String):kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int C(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        Integer numD = DescriptorVisibilities.d(descriptorVisibility, descriptorVisibility2);
        if (numD != null) {
            return numD.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int D(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private final Class<?> N(String desc, int begin, int end) throws ClassNotFoundException {
        char cCharAt = desc.charAt(begin);
        if (cCharAt != 'F') {
            if (cCharAt != 'L') {
                if (cCharAt != 'S') {
                    if (cCharAt != 'V') {
                        if (cCharAt != 'I') {
                            if (cCharAt != 'J') {
                                if (cCharAt != 'Z') {
                                    if (cCharAt != '[') {
                                        switch (cCharAt) {
                                            case 'B':
                                                return Byte.TYPE;
                                            case 'C':
                                                return Character.TYPE;
                                            case 'D':
                                                return Double.TYPE;
                                            default:
                                                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: " + desc);
                                        }
                                    }
                                    return UtilKt.f(N(desc, begin + 1, end));
                                }
                                return Boolean.TYPE;
                            }
                            return Long.TYPE;
                        }
                        return Integer.TYPE;
                    }
                    Class<?> TYPE = Void.TYPE;
                    Intrinsics.i(TYPE, "TYPE");
                    return TYPE;
                }
                return Short.TYPE;
            }
            ClassLoader classLoaderJ = ReflectClassUtilKt.j(h());
            String strSubstring = desc.substring(begin + 1, end - 1);
            Intrinsics.i(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderJ.loadClass(StringsKt.P(strSubstring, '/', '.', false, 4, null));
            Intrinsics.i(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        return Float.TYPE;
    }

    private final void q(List<Class<?>> result, List<? extends Class<?>> valueParameters, boolean isConstructor) {
        Class<?> cls;
        if (Intrinsics.e(CollectionsKt.F0(valueParameters), f143050b)) {
            valueParameters = valueParameters.subList(0, valueParameters.size() - 1);
        }
        result.addAll(valueParameters);
        int size = (valueParameters.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class<?> TYPE = Integer.TYPE;
            Intrinsics.i(TYPE, "TYPE");
            result.add(TYPE);
        }
        if (isConstructor) {
            cls = f143050b;
        } else {
            cls = Object.class;
        }
        Intrinsics.g(cls);
        result.add(cls);
    }

    protected Class<?> J() {
        Class<?> clsK = ReflectClassUtilKt.k(h());
        if (clsK == null) {
            return h();
        }
        return clsK;
    }
}
