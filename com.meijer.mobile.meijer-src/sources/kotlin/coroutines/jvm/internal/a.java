package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/jvm/internal/a;", "", "<init>", "()V", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "continuation", "Lkotlin/coroutines/jvm/internal/a$a;", "a", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Lkotlin/coroutines/jvm/internal/a$a;", "", "b", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/String;", "Lkotlin/coroutines/jvm/internal/a$a;", "notOnJava9", "c", "cache", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f143578a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final C2270a notOnJava9 = new C2270a(null, null, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static C2270a cache;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lkotlin/coroutines/jvm/internal/a$a;", "", "Ljava/lang/reflect/Method;", "getModuleMethod", "getDescriptorMethod", "nameMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "a", "Ljava/lang/reflect/Method;", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlin.coroutines.jvm.internal.a$a, reason: collision with other inner class name */
    private static final class C2270a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Method getModuleMethod;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Method getDescriptorMethod;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Method nameMethod;

        public C2270a(Method method, Method method2, Method method3) {
            this.getModuleMethod = method;
            this.getDescriptorMethod = method2;
            this.nameMethod = method3;
        }
    }

    private final C2270a a(BaseContinuationImpl continuation) {
        try {
            C2270a c2270a = new C2270a(Class.class.getDeclaredMethod("getModule", null), continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            cache = c2270a;
            return c2270a;
        } catch (Exception unused) {
            C2270a c2270a2 = notOnJava9;
            cache = c2270a2;
            return c2270a2;
        }
    }

    public final String b(BaseContinuationImpl continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics.j(continuation, "continuation");
        C2270a c2270aA = cache;
        if (c2270aA == null) {
            c2270aA = a(continuation);
        }
        if (c2270aA != notOnJava9 && (method = c2270aA.getModuleMethod) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = c2270aA.getDescriptorMethod) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = c2270aA.nameMethod;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }

    private a() {
    }
}
