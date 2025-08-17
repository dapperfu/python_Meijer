package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15250o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C15250o f144562a = new C15250o();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(LazyJavaClassMemberScope.z0((JavaMember) obj));
    }
}
