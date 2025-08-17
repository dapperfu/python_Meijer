package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/C0;", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/ConcurrentMap;", "moduleByClassLoader", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ModuleByClassLoaderKt {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<C0, WeakReference<RuntimeModuleData>> f143127a = new ConcurrentHashMap();

    public static final RuntimeModuleData a(Class<?> cls) {
        Intrinsics.j(cls, "<this>");
        ClassLoader classLoaderJ = ReflectClassUtilKt.j(cls);
        C0 c02 = new C0(classLoaderJ);
        ConcurrentMap<C0, WeakReference<RuntimeModuleData>> concurrentMap = f143127a;
        WeakReference<RuntimeModuleData> weakReference = concurrentMap.get(c02);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentMap.remove(c02, weakReference);
        }
        RuntimeModuleData runtimeModuleDataA = RuntimeModuleData.f144047c.a(classLoaderJ);
        while (true) {
            try {
                ConcurrentMap<C0, WeakReference<RuntimeModuleData>> concurrentMap2 = f143127a;
                WeakReference<RuntimeModuleData> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(c02, new WeakReference<>(runtimeModuleDataA));
                if (weakReferencePutIfAbsent == null) {
                    return runtimeModuleDataA;
                }
                RuntimeModuleData runtimeModuleData2 = weakReferencePutIfAbsent.get();
                if (runtimeModuleData2 != null) {
                    return runtimeModuleData2;
                }
                concurrentMap2.remove(c02, weakReferencePutIfAbsent);
            } finally {
                c02.a(null);
            }
        }
    }
}
