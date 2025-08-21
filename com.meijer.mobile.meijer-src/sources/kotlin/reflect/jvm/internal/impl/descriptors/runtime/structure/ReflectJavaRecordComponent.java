package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReflectJavaRecordComponent extends ReflectJavaMember implements JavaRecordComponent {

    /* renamed from: a, reason: collision with root package name */
    private final Object f145006a;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public boolean b() {
        return false;
    }

    public ReflectJavaRecordComponent(Object recordComponent) {
        Intrinsics.j(recordComponent, "recordComponent");
        this.f145006a = recordComponent;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public Member R() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method methodC = Java16RecordComponentsLoader.f144961a.c(this.f145006a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public JavaType getType() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsD = Java16RecordComponentsLoader.f144961a.d(this.f145006a);
        if (clsD != null) {
            return new ReflectJavaClassifierType(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
