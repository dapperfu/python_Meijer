package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* loaded from: classes14.dex */
public interface TypeParameterResolver {
    TypeParameterDescriptor a(JavaTypeParameter javaTypeParameter);

    public static final class EMPTY implements TypeParameterResolver {

        /* renamed from: a, reason: collision with root package name */
        public static final EMPTY f145333a = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        public TypeParameterDescriptor a(JavaTypeParameter javaTypeParameter) {
            Intrinsics.j(javaTypeParameter, "javaTypeParameter");
            return null;
        }

        private EMPTY() {
        }
    }
}
