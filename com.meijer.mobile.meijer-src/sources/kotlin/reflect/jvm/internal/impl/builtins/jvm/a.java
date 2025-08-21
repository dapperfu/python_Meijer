package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltInClassDescriptorFactory f144468a;

    /* renamed from: b, reason: collision with root package name */
    private final StorageManager f144469b;

    public a(JvmBuiltInClassDescriptorFactory jvmBuiltInClassDescriptorFactory, StorageManager storageManager) {
        this.f144468a = jvmBuiltInClassDescriptorFactory;
        this.f144469b = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInClassDescriptorFactory.h(this.f144468a, this.f144469b);
    }
}
