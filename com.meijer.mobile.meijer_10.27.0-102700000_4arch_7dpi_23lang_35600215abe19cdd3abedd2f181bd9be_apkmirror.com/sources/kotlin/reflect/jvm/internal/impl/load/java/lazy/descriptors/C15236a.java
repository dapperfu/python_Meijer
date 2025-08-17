package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15236a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final ClassDeclaredMemberIndex f144545a;

    public C15236a(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        this.f144545a = classDeclaredMemberIndex;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ClassDeclaredMemberIndex.h(this.f144545a, (JavaMethod) obj));
    }
}
