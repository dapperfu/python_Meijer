package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes13.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltInClassDescriptorFactory f143561a;

    /* renamed from: b, reason: collision with root package name */
    private final StorageManager f143562b;

    public a(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        this.f143561a = jvmBuiltInClassDescriptorFactory;
        this.f143562b = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInClassDescriptorFactory.h(this.f143561a, this.f143562b);
    }
}
