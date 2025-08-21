package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.FunctionWithAllInvokes;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.CallerKt;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b&\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B7\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0011B+\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010!J5\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0%2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001f\u0010@\u001a\u0006\u0012\u0002\b\u00030\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R!\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010/R\u0014\u0010K\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010-R\u0014\u0010L\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010GR\u0014\u0010M\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010GR\u0014\u0010N\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010GR\u0014\u0010O\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010GR\u0014\u0010P\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010G¨\u0006Q"}, d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "name", "signature", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptorInitialValue", "rawBoundReceiver", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "descriptor", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "j0", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "Ljava/lang/reflect/Method;", "member", "", "k0", "(Ljava/lang/reflect/Method;)Z", "isCallByToValueClassMangledMethod", "Lkotlin/reflect/jvm/internal/calls/Caller;", "e0", "(Ljava/lang/reflect/Method;Z)Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "d0", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "c0", "Ljava/lang/reflect/Constructor;", "isDefault", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "b0", "(Ljava/lang/reflect/Constructor;Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;Z)Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "g", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Q", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "h", "Ljava/lang/String;", "i", "Ljava/lang/Object;", "j", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "k", "Lkotlin/Lazy;", "P", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "l", "R", "defaultCaller", "h0", "()Ljava/lang/Object;", "V", "()Z", "isBound", "getName", "getArity", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KFunctionImpl extends KCallableImpl<Object> implements FunctionBase<Object>, KFunction<Object>, FunctionWithAllInvokes {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f143968m = {Reflection.j(new PropertyReference1Impl(KFunctionImpl.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final KDeclarationContainerImpl container;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String signature;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Object rawBoundReceiver;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ReflectProperties.LazySoftVal descriptor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy caller;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy defaultCaller;

    /* synthetic */ KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, FunctionDescriptor functionDescriptor, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kDeclarationContainerImpl, str, str2, functionDescriptor, (i10 & 16) != 0 ? CallableReference.NO_RECEIVER : obj);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return FunctionWithAllInvokes.DefaultImpls.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Caller a0(KFunctionImpl kFunctionImpl) throws NoSuchMethodException, SecurityException {
        Object objD;
        Caller<?> callerC0;
        JvmFunctionSignature jvmFunctionSignatureG = RuntimeTypeMapper.f144044a.g(kFunctionImpl.X());
        if (jvmFunctionSignatureG instanceof JvmFunctionSignature.KotlinConstructor) {
            if (kFunctionImpl.U()) {
                Class<?> clsH = kFunctionImpl.getContainer().h();
                List<KParameter> parameters = kFunctionImpl.getParameters();
                ArrayList arrayList = new ArrayList(CollectionsKt.x(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((KParameter) it.next()).getName();
                    Intrinsics.g(name);
                    arrayList.add(name);
                }
                return new AnnotationConstructorCaller(clsH, arrayList, AnnotationConstructorCaller.CallMode.f144071b, AnnotationConstructorCaller.Origin.f144075b, null, 16, null);
            }
            objD = kFunctionImpl.getContainer().v(((JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureG).b());
        } else if (jvmFunctionSignatureG instanceof JvmFunctionSignature.KotlinFunction) {
            FunctionDescriptor functionDescriptorX = kFunctionImpl.X();
            DeclarationDescriptor declarationDescriptorB = functionDescriptorX.b();
            Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
            if (InlineClassesUtilsKt.d(declarationDescriptorB) && (functionDescriptorX instanceof ConstructorDescriptor) && ((ConstructorDescriptor) functionDescriptorX).z()) {
                FunctionDescriptor functionDescriptorX2 = kFunctionImpl.X();
                KDeclarationContainerImpl container = kFunctionImpl.getContainer();
                String strB = ((JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureG).b();
                List<ValueParameterDescriptor> listH = kFunctionImpl.X().h();
                Intrinsics.i(listH, "getValueParameters(...)");
                return new ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller(functionDescriptorX2, container, strB, listH);
            }
            JvmFunctionSignature.KotlinFunction kotlinFunction = (JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureG;
            objD = kFunctionImpl.getContainer().A(kotlinFunction.c(), kotlinFunction.b());
        } else if (jvmFunctionSignatureG instanceof JvmFunctionSignature.JavaMethod) {
            objD = ((JvmFunctionSignature.JavaMethod) jvmFunctionSignatureG).getMethod();
            Intrinsics.h(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(jvmFunctionSignatureG instanceof JvmFunctionSignature.JavaConstructor)) {
                if (!(jvmFunctionSignatureG instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<Method> listD = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureG).d();
                Class<?> clsH2 = kFunctionImpl.getContainer().h();
                List<Method> list = listD;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new AnnotationConstructorCaller(clsH2, arrayList2, AnnotationConstructorCaller.CallMode.f144071b, AnnotationConstructorCaller.Origin.f144074a, listD);
            }
            objD = ((JvmFunctionSignature.JavaConstructor) jvmFunctionSignatureG).d();
            Intrinsics.h(objD, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (objD instanceof Constructor) {
            callerC0 = kFunctionImpl.b0((Constructor) objD, kFunctionImpl.X(), false);
        } else {
            if (!(objD instanceof Method)) {
                throw new KotlinReflectionInternalError("Could not compute caller for function: " + kFunctionImpl.X() + " (member = " + objD + ')');
            }
            Method method = (Method) objD;
            callerC0 = !Modifier.isStatic(method.getModifiers()) ? kFunctionImpl.c0(method) : kFunctionImpl.X().getAnnotations().i(UtilKt.j()) != null ? kFunctionImpl.d0(method) : kFunctionImpl.e0(method, false);
        }
        return ValueClassAwareCallerKt.j(callerC0, kFunctionImpl.X(), false, 2, null);
    }

    private final CallerImpl<Constructor<?>> b0(Constructor<?> member, FunctionDescriptor descriptor, boolean isDefault) {
        return (isDefault || !InlineClassManglingRulesKt.f(descriptor)) ? V() ? new CallerImpl.BoundConstructor(member, h0()) : new CallerImpl.Constructor(member) : V() ? new CallerImpl.AccessorForHiddenBoundConstructor(member, h0()) : new CallerImpl.AccessorForHiddenConstructor(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.calls.Caller f0(kotlin.reflect.jvm.internal.KFunctionImpl r11) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KFunctionImpl.f0(kotlin.reflect.jvm.internal.KFunctionImpl):kotlin.reflect.jvm.internal.calls.Caller");
    }

    private final Object h0() {
        return ValueClassAwareCallerKt.h(this.rawBoundReceiver, X());
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public Caller<?> P() {
        return (Caller) this.caller.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: Q, reason: from getter */
    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public Caller<?> R() {
        return (Caller) this.defaultCaller.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public boolean V() {
        return this.rawBoundReceiver != CallableReference.NO_RECEIVER;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public FunctionDescriptor X() {
        T tB = this.descriptor.b(this, f143968m[0]);
        Intrinsics.i(tB, "getValue(...)");
        return (FunctionDescriptor) tB;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return FunctionWithAllInvokes.DefaultImpls.b(this, obj);
    }

    public String toString() {
        return ReflectionObjectRenderer.f144042a.f(X());
    }

    private KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, FunctionDescriptor functionDescriptor, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor = ReflectProperties.b(functionDescriptor, new T(this, str));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143287b;
        this.caller = LazyKt.a(lazyThreadSafetyMode, new U(this));
        this.defaultCaller = LazyKt.a(lazyThreadSafetyMode, new V(this));
    }

    private final CallerImpl.Method c0(Method member) {
        if (V()) {
            return new CallerImpl.Method.BoundInstance(member, h0());
        }
        return new CallerImpl.Method.Instance(member);
    }

    private final CallerImpl.Method d0(Method member) {
        if (V()) {
            return new CallerImpl.Method.BoundJvmStaticInObject(member);
        }
        return new CallerImpl.Method.JvmStaticInObject(member);
    }

    private final Caller<?> e0(Method member, boolean isCallByToValueClassMangledMethod) {
        Object objH0;
        if (V()) {
            if (k0(member)) {
                objH0 = this.rawBoundReceiver;
            } else {
                objH0 = h0();
            }
            return new CallerImpl.Method.BoundStatic(member, isCallByToValueClassMangledMethod, objH0);
        }
        return new CallerImpl.Method.Static(member);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FunctionDescriptor g0(KFunctionImpl kFunctionImpl, String str) {
        return kFunctionImpl.getContainer().y(str, kFunctionImpl.signature);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor j0(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.h()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L1a
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1a
            goto L32
        L1a:
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r2
            boolean r2 = r2.x0()
            if (r2 == 0) goto L1e
            goto La2
        L32:
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r6.b()
            java.lang.String r2 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r2)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.g(r0)
            if (r0 == 0) goto La2
            kotlin.reflect.jvm.internal.calls.Caller r0 = r5.P()
            java.lang.reflect.Member r0 = r0.b()
            kotlin.jvm.internal.Intrinsics.g(r0)
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto La2
            r0 = 0
            kotlin.sequences.Sequence r6 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.z(r6, r0)
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r6.next()
            r2 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
            java.util.List r2 = r2.h()
            kotlin.jvm.internal.Intrinsics.i(r2, r1)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L83
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L83
            goto L5f
        L83:
            java.util.Iterator r2 = r2.iterator()
        L87:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5f
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r4
            boolean r4 = r4.x0()
            if (r4 == 0) goto L87
            goto L9b
        L9a:
            r0 = r3
        L9b:
            boolean r6 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r6 == 0) goto La2
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r0
            return r0
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KFunctionImpl.j0(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor):kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor");
    }

    private final boolean k0(Method member) {
        KotlinType type;
        ReceiverParameterDescriptor receiverParameterDescriptorJ = X().J();
        if (receiverParameterDescriptorJ != null && (type = receiverParameterDescriptorJ.getType()) != null && InlineClassesUtilsKt.c(type)) {
            Class<?>[] parameterTypes = member.getParameterTypes();
            Intrinsics.i(parameterTypes, "getParameterTypes(...)");
            Class cls = (Class) ArraysKt.g0(parameterTypes);
            if (cls != null && cls.isInterface()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean equals(Object other) {
        KFunctionImpl kFunctionImplC = UtilKt.c(other);
        if (kFunctionImplC == null || !Intrinsics.e(getContainer(), kFunctionImplC.getContainer()) || !Intrinsics.e(getName(), kFunctionImplC.getName()) || !Intrinsics.e(this.signature, kFunctionImplC.signature) || !Intrinsics.e(this.rawBoundReceiver, kFunctionImplC.rawBoundReceiver)) {
            return false;
        }
        return true;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return CallerKt.a(P());
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        String strB = X().getName().b();
        Intrinsics.i(strB, "asString(...)");
        return strB;
    }

    @Override // kotlin.jvm.functions.Function6
    public Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return FunctionWithAllInvokes.DefaultImpls.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return FunctionWithAllInvokes.DefaultImpls.c(this, obj, obj2);
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
        return X().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
        return X().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
        return X().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
        return X().isOperator();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return X().isSuspend();
    }

    @Override // kotlin.jvm.functions.Function5
    public Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return FunctionWithAllInvokes.DefaultImpls.f(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function3
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return FunctionWithAllInvokes.DefaultImpls.d(this, obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return FunctionWithAllInvokes.DefaultImpls.e(this, obj, obj2, obj3, obj4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.j(container, "container");
        Intrinsics.j(name, "name");
        Intrinsics.j(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KFunctionImpl(KDeclarationContainerImpl container, FunctionDescriptor descriptor) {
        Intrinsics.j(container, "container");
        Intrinsics.j(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        Intrinsics.i(strB, "asString(...)");
        this(container, strB, RuntimeTypeMapper.f144044a.g(descriptor).get_signature(), descriptor, null, 16, null);
    }
}
