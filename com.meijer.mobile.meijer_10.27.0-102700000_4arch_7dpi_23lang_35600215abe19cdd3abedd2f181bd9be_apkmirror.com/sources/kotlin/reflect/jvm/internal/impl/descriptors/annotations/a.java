package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;

/* loaded from: classes13.dex */
class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinBuiltIns f143771a;

    public a(KotlinBuiltIns kotlinBuiltIns) {
        this.f143771a = kotlinBuiltIns;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AnnotationUtilKt.d(this.f143771a, (ModuleDescriptor) obj);
    }
}
