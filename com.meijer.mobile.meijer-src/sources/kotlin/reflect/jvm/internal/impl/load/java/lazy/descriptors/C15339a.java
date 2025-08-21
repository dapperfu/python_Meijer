package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C15339a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final ClassDeclaredMemberIndex f145452a;

    public C15339a(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        this.f145452a = classDeclaredMemberIndex;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ClassDeclaredMemberIndex.h(this.f145452a, (JavaMethod) obj));
    }
}
