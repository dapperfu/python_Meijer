package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0015/B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020&0*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010+R\u0014\u0010.\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010-¨\u00060"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "oldCaller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "", "index", "Lkotlin/ranges/IntRange;", "f", "(I)Lkotlin/ranges/IntRange;", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Z", "b", "Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "c", "Ljava/lang/reflect/Member;", "()Ljava/lang/reflect/Member;", "member", "Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$a;", "d", "Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$a;", "data", "e", "[Lkotlin/ranges/IntRange;", "slices", "hasMfvcParameters", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "()Ljava/util/List;", "parameterTypes", "()Z", "isBoundInstanceCallWithValueClasses", "MultiFieldValueClassPrimaryConstructorCaller", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ValueClassAwareCaller<M extends Member> implements Caller<M> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefault;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Caller<M> caller;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final M member;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a data;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final IntRange[] slices;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean hasMfvcParameters;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR'\u0010 \u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\t0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0014\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010#R\u0014\u0010'\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "constructorDesc", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "originalParameters", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/util/List;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "constructorImpl", "b", "boxMethod", "c", "Ljava/util/List;", "parameterUnboxMethods", "Ljava/lang/Class;", "d", "e", "()Ljava/util/List;", "originalParametersGroups", "Ljava/lang/reflect/Type;", "parameterTypes", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class MultiFieldValueClassPrimaryConstructorCaller implements Caller {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Method constructorImpl;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Method boxMethod;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<List<Method>> parameterUnboxMethods;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<List<Class<?>>> originalParametersGroups;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<Type> parameterTypes;

        public Void d() {
            return null;
        }

        public MultiFieldValueClassPrimaryConstructorCaller(FunctionDescriptor descriptor, KDeclarationContainerImpl container, String constructorDesc, List<? extends ParameterDescriptor> originalParameters) throws NoSuchMethodException, SecurityException {
            Collection collectionE;
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(container, "container");
            Intrinsics.j(constructorDesc, "constructorDesc");
            Intrinsics.j(originalParameters, "originalParameters");
            Method methodA = container.A("constructor-impl", constructorDesc);
            Intrinsics.g(methodA);
            this.constructorImpl = methodA;
            Method methodA2 = container.A("box-impl", StringsKt.L0(constructorDesc, "V") + ReflectClassUtilKt.f(container.h()));
            Intrinsics.g(methodA2);
            this.boxMethod = methodA2;
            List<? extends ParameterDescriptor> list = originalParameters;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                KotlinType type = ((ParameterDescriptor) it.next()).getType();
                Intrinsics.i(type, "getType(...)");
                arrayList.add(ValueClassAwareCallerKt.p(TypeSubstitutionKt.a(type), descriptor));
            }
            this.parameterUnboxMethods = arrayList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.w();
                }
                ClassifierDescriptor classifierDescriptorD = ((ParameterDescriptor) obj).getType().K0().d();
                Intrinsics.h(classifierDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorD;
                List<Method> list2 = this.parameterUnboxMethods.get(i10);
                if (list2 != null) {
                    List<Method> list3 = list2;
                    collectionE = new ArrayList(CollectionsKt.x(list3, 10));
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        collectionE.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> clsQ = UtilKt.q(classDescriptor);
                    Intrinsics.g(clsQ);
                    collectionE = CollectionsKt.e(clsQ);
                }
                arrayList2.add(collectionE);
                i10 = i11;
            }
            this.originalParametersGroups = arrayList2;
            this.parameterTypes = CollectionsKt.z(arrayList2);
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public List<Type> a() {
            return this.parameterTypes;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Collection collectionE;
            Intrinsics.j(args, "args");
            List<Pair> listX1 = ArraysKt.x1(args, this.parameterUnboxMethods);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listX1) {
                Object objA = pair.a();
                List list = (List) pair.b();
                if (list != null) {
                    List list2 = list;
                    collectionE = new ArrayList(CollectionsKt.x(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectionE.add(((Method) it.next()).invoke(objA, null));
                    }
                } else {
                    collectionE = CollectionsKt.e(objA);
                }
                CollectionsKt.C(arrayList, collectionE);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.constructorImpl.invoke(null, Arrays.copyOf(array, array.length));
            return this.boxMethod.invoke(null, Arrays.copyOf(array, array.length));
        }

        public final List<List<Class<?>>> e() {
            return this.originalParametersGroups;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public Type getReturnType() {
            Class<?> returnType = this.boxMethod.getReturnType();
            Intrinsics.i(returnType, "getReturnType(...)");
            return returnType;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public /* bridge */ /* synthetic */ Member b() {
            return (Member) d();
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public boolean c() {
            return Caller.DefaultImpls.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$a;", "", "Lkotlin/ranges/IntRange;", "argumentRange", "", "", "Ljava/lang/reflect/Method;", "unboxParameters", "box", "<init>", "(Lkotlin/ranges/IntRange;[Ljava/util/List;Ljava/lang/reflect/Method;)V", "a", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "b", "[Ljava/util/List;", "c", "()[Ljava/util/List;", "Ljava/lang/reflect/Method;", "()Ljava/lang/reflect/Method;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final IntRange argumentRange;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<Method>[] unboxParameters;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Method box;

        public a(IntRange argumentRange, List<Method>[] unboxParameters, Method method) {
            Intrinsics.j(argumentRange, "argumentRange");
            Intrinsics.j(unboxParameters, "unboxParameters");
            this.argumentRange = argumentRange;
            this.unboxParameters = unboxParameters;
            this.box = method;
        }

        /* renamed from: a, reason: from getter */
        public final IntRange getArgumentRange() {
            return this.argumentRange;
        }

        /* renamed from: b, reason: from getter */
        public final Method getBox() {
            return this.box;
        }

        public final List<Method>[] c() {
            return this.unboxParameters;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[LOOP:1: B:25:0x007c->B:27:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ValueClassAwareCaller(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r11, kotlin.reflect.jvm.internal.calls.Caller<? extends M> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller.<init>(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.calls.Caller, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(ClassDescriptor makeKotlinParameterTypes) {
        Intrinsics.j(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
        return InlineClassesUtilsKt.g(makeKotlinParameterTypes);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public List<Type> a() {
        return this.caller.a();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public M b() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public boolean c() {
        return this.caller instanceof CallerImpl.Method.BoundInstance;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        Object objG;
        Object objG2;
        Intrinsics.j(args, "args");
        IntRange argumentRange = this.data.getArgumentRange();
        List<Method>[] listArrC = this.data.c();
        Method box = this.data.getBox();
        if (!argumentRange.isEmpty()) {
            if (this.hasMfvcParameters) {
                List listD = CollectionsKt.d(args.length);
                int first = argumentRange.getFirst();
                for (int i10 = 0; i10 < first; i10++) {
                    listD.add(args[i10]);
                }
                int first2 = argumentRange.getFirst();
                int last = argumentRange.getLast();
                if (first2 <= last) {
                    while (true) {
                        List<Method> list = listArrC[first2];
                        Object obj = args[first2];
                        if (list != null) {
                            for (Method method : list) {
                                List list2 = listD;
                                if (obj != null) {
                                    objG2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    Intrinsics.i(returnType, "getReturnType(...)");
                                    objG2 = UtilKt.g(returnType);
                                }
                                list2.add(objG2);
                            }
                        } else {
                            listD.add(obj);
                        }
                        if (first2 == last) {
                            break;
                        }
                        first2++;
                    }
                }
                int last2 = argumentRange.getLast() + 1;
                int iM0 = ArraysKt.m0(args);
                if (last2 <= iM0) {
                    while (true) {
                        listD.add(args[last2]);
                        if (last2 == iM0) {
                            break;
                        }
                        last2++;
                    }
                }
                args = CollectionsKt.a(listD).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int first3 = argumentRange.getFirst();
                    if (i11 > argumentRange.getLast() || first3 > i11) {
                        objG = args[i11];
                    } else {
                        List<Method> list3 = listArrC[i11];
                        Method method2 = list3 != null ? (Method) CollectionsKt.U0(list3) : null;
                        objG = args[i11];
                        if (method2 != null) {
                            if (objG != null) {
                                objG = method2.invoke(objG, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                Intrinsics.i(returnType2, "getReturnType(...)");
                                objG = UtilKt.g(returnType2);
                            }
                        }
                    }
                    objArr[i11] = objG;
                }
                args = objArr;
            }
        }
        Object objCall = this.caller.call(args);
        return (objCall == IntrinsicsKt.f() || box == null || (objInvoke = box.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final IntRange f(int index) {
        if (index >= 0) {
            IntRange[] intRangeArr = this.slices;
            if (index < intRangeArr.length) {
                return intRangeArr[index];
            }
        }
        IntRange[] intRangeArr2 = this.slices;
        if (intRangeArr2.length == 0) {
            return new IntRange(index, index);
        }
        int length = (index - intRangeArr2.length) + ((IntRange) ArraysKt.D0(intRangeArr2)).getLast() + 1;
        return new IntRange(length, length);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public Type getReturnType() {
        return this.caller.getReturnType();
    }
}
