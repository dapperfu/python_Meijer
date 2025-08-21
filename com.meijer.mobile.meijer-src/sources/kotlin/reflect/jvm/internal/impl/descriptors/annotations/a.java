package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes14.dex */
class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinBuiltIns f144678a;

    public a(KotlinBuiltIns kotlinBuiltIns) {
        this.f144678a = kotlinBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AnnotationUtilKt.d(this.f144678a, (ModuleDescriptor) obj);
    }
}
