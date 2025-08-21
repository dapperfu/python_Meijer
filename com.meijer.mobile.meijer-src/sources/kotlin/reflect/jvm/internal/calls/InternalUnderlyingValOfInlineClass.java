package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u001c\u001dB\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0001\u0002\u001e\u001f¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "", "instance", "", "args", "d", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/reflect/Method;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "f", "()Ljava/lang/reflect/Method;", "member", "Unbound", "Bound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class InternalUnderlyingValOfInlineClass implements Caller<Method> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Method unboxMethod;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Type> parameterTypes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Type returnType;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "Ljava/lang/reflect/Method;", "unboxMethod", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "d", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Bound extends InternalUnderlyingValOfInlineClass implements BoundCaller {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Object boundReceiver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bound(Method unboxMethod, Object obj) {
            super(unboxMethod, CollectionsKt.m(), null);
            Intrinsics.j(unboxMethod, "unboxMethod");
            this.boundReceiver = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public Object call(Object[] args) {
            Intrinsics.j(args, "args");
            e(args);
            return d(this.boundReceiver, args);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "unboxMethod", "Ljava/lang/reflect/Method;", "<init>", "(Ljava/lang/reflect/Method;)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Unbound extends InternalUnderlyingValOfInlineClass {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unbound(Method unboxMethod) {
            super(unboxMethod, CollectionsKt.e(unboxMethod.getDeclaringClass()), null);
            Intrinsics.j(unboxMethod, "unboxMethod");
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public Object call(Object[] args) {
            Intrinsics.j(args, "args");
            e(args);
            Object obj = args[0];
            CallerImpl.Companion companion = CallerImpl.INSTANCE;
            return d(obj, args.length <= 1 ? new Object[0] : ArraysKt.w(args, 1, args.length));
        }
    }

    public /* synthetic */ InternalUnderlyingValOfInlineClass(Method method, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, list);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Method b() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InternalUnderlyingValOfInlineClass(Method method, List<? extends Type> list) {
        this.unboxMethod = method;
        this.parameterTypes = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.i(returnType, "getReturnType(...)");
        this.returnType = returnType;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final List<Type> a() {
        return this.parameterTypes;
    }

    protected final Object d(Object instance, Object[] args) {
        Intrinsics.j(args, "args");
        return this.unboxMethod.invoke(instance, Arrays.copyOf(args, args.length));
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Type getReturnType() {
        return this.returnType;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public boolean c() {
        return Caller.DefaultImpls.b(this);
    }

    public void e(Object[] objArr) {
        Caller.DefaultImpls.a(this, objArr);
    }
}
