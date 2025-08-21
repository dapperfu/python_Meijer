package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00028\u00002\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J3\u0010\u001f\u001a\u00028\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000f2\f\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R.\u0010'\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020# $*\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&RD\u0010+\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\n $*\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010(j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`)0(j\b\u0012\u0004\u0012\u00020\n`)0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\"\u0010.\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010,0,0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010&R.\u00101\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/ $*\n\u0012\u0004\u0012\u00020/\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010&R2\u00103\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 $*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010&R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0006\u0012\u0002\b\u0003098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u0001098&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010;R\u0014\u0010A\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\n0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010L\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020M0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010FR\u0016\u0010S\u001a\u0004\u0018\u00010P8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010T\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010CR\u0014\u0010U\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010CR\u0014\u0010V\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010CR\u0014\u0010X\u001a\u0002058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bW\u0010CR\u0014\u0010\\\u001a\u00020Y8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "<init>", "()V", "", "", "O", "()[Ljava/lang/Object;", "Lkotlin/reflect/KParameter;", "parameter", "", "T", "(Lkotlin/reflect/KParameter;)I", "", "args", "K", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/reflect/KType;", "type", "M", "(Lkotlin/reflect/KType;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "N", "()Ljava/lang/reflect/Type;", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lkotlin/coroutines/Continuation;", "continuationArgument", "L", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "a", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "_annotations", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "_parameters", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "c", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "d", "_typeParameters", "e", "_absentArguments", "Lkotlin/Lazy;", "", "f", "Lkotlin/Lazy;", "parametersNeedMFVCFlattening", "Lkotlin/reflect/jvm/internal/calls/Caller;", "P", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "defaultCaller", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Q", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "V", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lkotlin/reflect/KType;", "returnType", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "U", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal<List<Annotation>> _annotations;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal<ArrayList<KParameter>> _parameters;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal<KTypeImpl> _returnType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> _typeParameters;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal<Object[]> _absentArguments;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy<Boolean> parametersNeedMFVCFlattening;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterDescriptor q(ReceiverParameterDescriptor receiverParameterDescriptor) {
        return receiverParameterDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterDescriptor v(ReceiverParameterDescriptor receiverParameterDescriptor) {
        return receiverParameterDescriptor;
    }

    public abstract Caller<?> P();

    /* renamed from: Q */
    public abstract KDeclarationContainerImpl getContainer();

    public abstract Caller<?> R();

    /* renamed from: S */
    public abstract CallableMemberDescriptor X();

    public abstract boolean V();

    private final Object[] O() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    private final int T(KParameter parameter) {
        if (!this.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!UtilKt.k(parameter.getType())) {
            return 1;
        }
        KType type = parameter.getType();
        Intrinsics.h(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List<Method> listN = ValueClassAwareCallerKt.n(TypeSubstitutionKt.a(((KTypeImpl) type).getType()));
        Intrinsics.g(listN);
        return listN.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KTypeImpl x(KCallableImpl kCallableImpl) {
        KotlinType returnType = kCallableImpl.X().getReturnType();
        Intrinsics.g(returnType);
        return new KTypeImpl(returnType, new r(kCallableImpl));
    }

    public final R L(Map<KParameter, ? extends Object> args, Continuation<?> continuationArgument) throws IllegalCallableAccessException {
        Intrinsics.j(args, "args");
        List<KParameter> parameters = getParameters();
        boolean z10 = false;
        if (parameters.isEmpty()) {
            try {
                return (R) P().call(isSuspend() ? new Continuation[]{continuationArgument} : new Continuation[0]);
            } catch (IllegalAccessException e10) {
                throw new IllegalCallableAccessException(e10);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] objArrO = O();
        if (isSuspend()) {
            objArrO[parameters.size()] = continuationArgument;
        }
        boolean zBooleanValue = this.parametersNeedMFVCFlattening.getValue().booleanValue();
        int i10 = 0;
        for (KParameter kParameter : parameters) {
            int iT = zBooleanValue ? T(kParameter) : 1;
            if (args.containsKey(kParameter)) {
                objArrO[kParameter.getIndex()] = args.get(kParameter);
            } else if (kParameter.l()) {
                if (zBooleanValue) {
                    int i11 = i10 + iT;
                    for (int i12 = i10; i12 < i11; i12++) {
                        int i13 = (i12 / 32) + size;
                        Object obj = objArrO[i13];
                        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArrO[i13] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i12 % 32)));
                    }
                } else {
                    int i14 = (i10 / 32) + size;
                    Object obj2 = objArrO[i14];
                    Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArrO[i14] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i10 % 32)));
                }
                z10 = true;
            } else if (!kParameter.b()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
            }
            if (kParameter.getKind() == KParameter.Kind.f143851c) {
                i10 += iT;
            }
        }
        if (!z10) {
            try {
                Caller<?> callerP = P();
                Object[] objArrCopyOf = Arrays.copyOf(objArrO, size);
                Intrinsics.i(objArrCopyOf, "copyOf(...)");
                return (R) callerP.call(objArrCopyOf);
            } catch (IllegalAccessException e11) {
                throw new IllegalCallableAccessException(e11);
            }
        }
        Caller<?> callerR = R();
        if (callerR != null) {
            try {
                return (R) callerR.call(objArrO);
            } catch (IllegalAccessException e12) {
                throw new IllegalCallableAccessException(e12);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + X());
    }

    @Override // kotlin.reflect.KCallable
    public R call(Object... args) throws IllegalCallableAccessException {
        Intrinsics.j(args, "args");
        try {
            return (R) P().call(args);
        } catch (IllegalAccessException e10) {
            throw new IllegalCallableAccessException(e10);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(Map<KParameter, ? extends Object> args) {
        Intrinsics.j(args, "args");
        return U() ? K(args) : L(args, null);
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this._annotations.invoke();
        Intrinsics.i(listInvoke, "invoke(...)");
        return listInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public List<KParameter> getParameters() {
        ArrayList<KParameter> arrayListInvoke = this._parameters.invoke();
        Intrinsics.i(arrayListInvoke, "invoke(...)");
        return arrayListInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public KType getReturnType() {
        KTypeImpl kTypeImplInvoke = this._returnType.invoke();
        Intrinsics.i(kTypeImplInvoke, "invoke(...)");
        return kTypeImplInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public List<KTypeParameter> getTypeParameters() {
        List<KTypeParameterImpl> listInvoke = this._typeParameters.invoke();
        Intrinsics.i(listInvoke, "invoke(...)");
        return listInvoke;
    }

    public KCallableImpl() {
        ReflectProperties.LazySoftVal<List<Annotation>> lazySoftValC = ReflectProperties.c(new C15338i(this));
        Intrinsics.i(lazySoftValC, "lazySoft(...)");
        this._annotations = lazySoftValC;
        ReflectProperties.LazySoftVal<ArrayList<KParameter>> lazySoftValC2 = ReflectProperties.c(new C15384j(this));
        Intrinsics.i(lazySoftValC2, "lazySoft(...)");
        this._parameters = lazySoftValC2;
        ReflectProperties.LazySoftVal<KTypeImpl> lazySoftValC3 = ReflectProperties.c(new C15385k(this));
        Intrinsics.i(lazySoftValC3, "lazySoft(...)");
        this._returnType = lazySoftValC3;
        ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> lazySoftValC4 = ReflectProperties.c(new C15386l(this));
        Intrinsics.i(lazySoftValC4, "lazySoft(...)");
        this._typeParameters = lazySoftValC4;
        ReflectProperties.LazySoftVal<Object[]> lazySoftValC5 = ReflectProperties.c(new C15387m(this));
        Intrinsics.i(lazySoftValC5, "lazySoft(...)");
        this._absentArguments = lazySoftValC5;
        this.parametersNeedMFVCFlattening = LazyKt.a(LazyThreadSafetyMode.f143287b, new C15388n(this));
    }

    private final R K(Map<KParameter, ? extends Object> args) throws IllegalCallableAccessException, NegativeArraySizeException {
        Object objM;
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (args.containsKey(kParameter)) {
                objM = args.get(kParameter);
                if (objM == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                }
            } else if (kParameter.l()) {
                objM = null;
            } else if (kParameter.b()) {
                objM = M(kParameter.getType());
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
            }
            arrayList.add(objM);
        }
        Caller<?> callerR = R();
        if (callerR != null) {
            try {
                return (R) callerR.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e10) {
                throw new IllegalCallableAccessException(e10);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + X());
    }

    private final Object M(KType type) throws NegativeArraySizeException {
        Class clsB = JvmClassMappingKt.b(KTypesJvm.b(type));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            Intrinsics.i(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    private final Type N() {
        ParameterizedType parameterizedType;
        Type rawType;
        WildcardType wildcardType;
        Type[] lowerBounds;
        if (isSuspend()) {
            Object objF0 = CollectionsKt.F0(P().a());
            if (objF0 instanceof ParameterizedType) {
                parameterizedType = (ParameterizedType) objF0;
            } else {
                parameterizedType = null;
            }
            if (parameterizedType != null) {
                rawType = parameterizedType.getRawType();
            } else {
                rawType = null;
            }
            if (Intrinsics.e(rawType, Continuation.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Intrinsics.i(actualTypeArguments, "getActualTypeArguments(...)");
                Object objR0 = ArraysKt.R0(actualTypeArguments);
                if (objR0 instanceof WildcardType) {
                    wildcardType = (WildcardType) objR0;
                } else {
                    wildcardType = null;
                }
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) ArraysKt.f0(lowerBounds);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean W(KCallableImpl kCallableImpl) {
        List<KParameter> parameters = kCallableImpl.getParameters();
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            return false;
        }
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            if (UtilKt.k(((KParameter) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] k(KCallableImpl kCallableImpl) {
        int i10;
        int iT;
        List<KParameter> parameters = kCallableImpl.getParameters();
        int size = parameters.size() + (kCallableImpl.isSuspend() ? 1 : 0);
        if (kCallableImpl.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            i10 = 0;
            for (KParameter kParameter : parameters) {
                if (kParameter.getKind() == KParameter.Kind.f143851c) {
                    iT = kCallableImpl.T(kParameter);
                } else {
                    iT = 0;
                }
                i10 += iT;
            }
        } else {
            List<KParameter> list = parameters;
            if ((list instanceof Collection) && list.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((KParameter) it.next()).getKind() == KParameter.Kind.f143851c && (i10 = i10 + 1) < 0) {
                        CollectionsKt.v();
                    }
                }
            }
        }
        int i11 = (i10 + 31) / 32;
        Object[] objArr = new Object[size + i11 + 1];
        for (KParameter kParameter2 : parameters) {
            if (kParameter2.l() && !UtilKt.l(kParameter2.getType())) {
                objArr[kParameter2.getIndex()] = UtilKt.g(ReflectJvmMapping.f(kParameter2.getType()));
            } else if (kParameter2.b()) {
                objArr[kParameter2.getIndex()] = kCallableImpl.M(kParameter2.getType());
            }
        }
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[size + i12] = 0;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o(KCallableImpl kCallableImpl) {
        return UtilKt.e(kCallableImpl.X());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList p(KCallableImpl kCallableImpl) {
        int i10;
        CallableMemberDescriptor callableMemberDescriptorS = kCallableImpl.X();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (!kCallableImpl.V()) {
            ReceiverParameterDescriptor receiverParameterDescriptorI = UtilKt.i(callableMemberDescriptorS);
            if (receiverParameterDescriptorI != null) {
                arrayList.add(new KParameterImpl(kCallableImpl, 0, KParameter.Kind.f143849a, new C15389o(receiverParameterDescriptorI)));
                i10 = 1;
            } else {
                i10 = 0;
            }
            ReceiverParameterDescriptor receiverParameterDescriptorN = callableMemberDescriptorS.N();
            if (receiverParameterDescriptorN != null) {
                arrayList.add(new KParameterImpl(kCallableImpl, i10, KParameter.Kind.f143850b, new C15390p(receiverParameterDescriptorN)));
                i10++;
            }
        } else {
            i10 = 0;
        }
        int size = callableMemberDescriptorS.h().size();
        while (i11 < size) {
            arrayList.add(new KParameterImpl(kCallableImpl, i10, KParameter.Kind.f143851c, new C15391q(callableMemberDescriptorS, i11)));
            i11++;
            i10++;
        }
        if (kCallableImpl.U() && (callableMemberDescriptorS instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
            CollectionsKt.B(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$lambda$5$$inlined$sortBy$1
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return ComparisonsKt.d(((KParameter) t10).getName(), ((KParameter) t11).getName());
                }
            });
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParameterDescriptor w(CallableMemberDescriptor callableMemberDescriptor, int i10) {
        ValueParameterDescriptor valueParameterDescriptor = callableMemberDescriptor.h().get(i10);
        Intrinsics.i(valueParameterDescriptor, "get(...)");
        return valueParameterDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type y(KCallableImpl kCallableImpl) {
        Type typeN = kCallableImpl.N();
        if (typeN == null) {
            return kCallableImpl.P().getReturnType();
        }
        return typeN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List z(KCallableImpl kCallableImpl) {
        List<TypeParameterDescriptor> typeParameters = kCallableImpl.X().getTypeParameters();
        Intrinsics.i(typeParameters, "getTypeParameters(...)");
        List<TypeParameterDescriptor> list = typeParameters;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            Intrinsics.g(typeParameterDescriptor);
            arrayList.add(new KTypeParameterImpl(kCallableImpl, typeParameterDescriptor));
        }
        return arrayList;
    }

    protected final boolean U() {
        if (Intrinsics.e(getName(), "<init>") && getContainer().h().isAnnotation()) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KCallable
    public KVisibility getVisibility() {
        DescriptorVisibility visibility = X().getVisibility();
        Intrinsics.i(visibility, "getVisibility(...)");
        return UtilKt.r(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        if (X().q() == Modality.f144529e) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        if (X().q() == Modality.f144526b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        if (X().q() == Modality.f144528d) {
            return true;
        }
        return false;
    }
}
