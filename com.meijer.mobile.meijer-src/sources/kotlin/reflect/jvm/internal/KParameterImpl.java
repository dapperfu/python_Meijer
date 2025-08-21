package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB1\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R!\u00101\u001a\b\u0012\u0004\u0012\u00020-0,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u00100R\u0016\u00103\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001bR\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u00109¨\u0006<"}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "callable", "", "index", "Lkotlin/reflect/KParameter$Kind;", "kind", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "computeDescriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "", "Ljava/lang/reflect/Type;", "types", "k", "([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "m", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "b", "I", "getIndex", "c", "Lkotlin/reflect/KParameter$Kind;", "f", "()Lkotlin/reflect/KParameter$Kind;", "d", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor", "", "", "e", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "name", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "type", "l", "()Z", "isOptional", "isVararg", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KParameterImpl implements KParameter {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f143991f = {Reflection.j(new PropertyReference1Impl(KParameterImpl.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0)), Reflection.j(new PropertyReference1Impl(KParameterImpl.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KCallableImpl<?> callable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int index;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final KParameter.Kind kind;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal descriptor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal annotations;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bR\u001f\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl$a;", "Ljava/lang/reflect/Type;", "", "types", "<init>", "([Ljava/lang/reflect/Type;)V", "", "getTypeName", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "[Ljava/lang/reflect/Type;", "getTypes", "()[Ljava/lang/reflect/Type;", "b", "I", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a implements Type {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Type[] types;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int hashCode;

        public a(Type[] types) {
            Intrinsics.j(types, "types");
            this.types = types;
            this.hashCode = Arrays.hashCode(types);
        }

        public boolean equals(Object other) {
            return (other instanceof a) && Arrays.equals(this.types, ((a) other).types);
        }

        @Override // java.lang.reflect.Type
        public String getTypeName() {
            return ArraysKt.C0(this.types, ", ", "[", "]", 0, null, null, 56, null);
        }

        /* renamed from: hashCode, reason: from getter */
        public int getHashCode() {
            return this.hashCode;
        }

        public String toString() {
            return getTypeName();
        }
    }

    private final Type k(Type... types) {
        int length = types.length;
        if (length != 0) {
            return length != 1 ? new a(types) : (Type) ArraysKt.R0(types);
        }
        throw new KotlinReflectionNotSupportedError("Expected at least 1 type for compound type");
    }

    public KParameterImpl(KCallableImpl<?> callable, int i10, KParameter.Kind kind, Function0<? extends ParameterDescriptor> computeDescriptor) {
        Intrinsics.j(callable, "callable");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(computeDescriptor, "computeDescriptor");
        this.callable = callable;
        this.index = i10;
        this.kind = kind;
        this.descriptor = ReflectProperties.c(computeDescriptor);
        this.annotations = ReflectProperties.c(new f0(this));
    }

    private final ParameterDescriptor o() {
        T tB = this.descriptor.b(this, f143991f[0]);
        Intrinsics.i(tB, "getValue(...)");
        return (ParameterDescriptor) tB;
    }

    public boolean equals(Object other) {
        if (!(other instanceof KParameterImpl)) {
            return false;
        }
        KParameterImpl kParameterImpl = (KParameterImpl) other;
        return Intrinsics.e(this.callable, kParameterImpl.callable) && getIndex() == kParameterImpl.getIndex();
    }

    @Override // kotlin.reflect.KParameter
    /* renamed from: f, reason: from getter */
    public KParameter.Kind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.KParameter
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.KParameter
    public KType getType() {
        KotlinType type = o().getType();
        Intrinsics.i(type, "getType(...)");
        return new KTypeImpl(type, new g0(this));
    }

    public int hashCode() {
        return (this.callable.hashCode() * 31) + Integer.hashCode(getIndex());
    }

    public final KCallableImpl<?> m() {
        return this.callable;
    }

    public String toString() {
        return ReflectionObjectRenderer.f144042a.j(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type a(KParameterImpl kParameterImpl) {
        List listX0;
        ParameterDescriptor parameterDescriptorO = kParameterImpl.o();
        if ((parameterDescriptorO instanceof ReceiverParameterDescriptor) && Intrinsics.e(UtilKt.i(kParameterImpl.callable.X()), parameterDescriptorO) && kParameterImpl.callable.X().f() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            DeclarationDescriptor declarationDescriptorB = kParameterImpl.callable.X().b();
            Intrinsics.h(declarationDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> clsQ = UtilKt.q((ClassDescriptor) declarationDescriptorB);
            if (clsQ != null) {
                return clsQ;
            }
            throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + parameterDescriptorO);
        }
        Caller<?> callerP = kParameterImpl.callable.P();
        if (callerP instanceof ValueClassAwareCaller) {
            if (kParameterImpl.callable.V()) {
                ValueClassAwareCaller valueClassAwareCaller = (ValueClassAwareCaller) callerP;
                IntRange intRangeF = valueClassAwareCaller.f(kParameterImpl.getIndex() + 1);
                int last = valueClassAwareCaller.f(0).getLast() + 1;
                listX0 = CollectionsKt.X0(valueClassAwareCaller.a(), new IntRange(intRangeF.getFirst() - last, intRangeF.getLast() - last));
            } else {
                ValueClassAwareCaller valueClassAwareCaller2 = (ValueClassAwareCaller) callerP;
                listX0 = CollectionsKt.X0(valueClassAwareCaller2.a(), valueClassAwareCaller2.f(kParameterImpl.getIndex()));
            }
            Type[] typeArr = (Type[]) listX0.toArray(new Type[0]);
            return kParameterImpl.k((Type[]) Arrays.copyOf(typeArr, typeArr.length));
        }
        if (callerP instanceof ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller) {
            Class[] clsArr = (Class[]) ((ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller) callerP).e().get(kParameterImpl.getIndex()).toArray(new Class[0]);
            return kParameterImpl.k((Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
        return callerP.a().get(kParameterImpl.getIndex());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(KParameterImpl kParameterImpl) {
        return UtilKt.e(kParameterImpl.o());
    }

    @Override // kotlin.reflect.KParameter
    public boolean b() {
        ParameterDescriptor parameterDescriptorO = o();
        if ((parameterDescriptorO instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) parameterDescriptorO).s0() != null) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    public String getName() {
        ValueParameterDescriptor valueParameterDescriptor;
        ParameterDescriptor parameterDescriptorO = o();
        if (parameterDescriptorO instanceof ValueParameterDescriptor) {
            valueParameterDescriptor = (ValueParameterDescriptor) parameterDescriptorO;
        } else {
            valueParameterDescriptor = null;
        }
        if (valueParameterDescriptor == null || valueParameterDescriptor.b().d0()) {
            return null;
        }
        Name name = valueParameterDescriptor.getName();
        Intrinsics.i(name, "getName(...)");
        if (name.p()) {
            return null;
        }
        return name.b();
    }

    @Override // kotlin.reflect.KParameter
    public boolean l() {
        ValueParameterDescriptor valueParameterDescriptor;
        ParameterDescriptor parameterDescriptorO = o();
        if (parameterDescriptorO instanceof ValueParameterDescriptor) {
            valueParameterDescriptor = (ValueParameterDescriptor) parameterDescriptorO;
        } else {
            valueParameterDescriptor = null;
        }
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.f(valueParameterDescriptor);
        }
        return false;
    }
}
