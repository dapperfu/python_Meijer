package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
class m implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f147015a = new m();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DescriptorRendererImpl.u2((KotlinType) obj);
    }
}
