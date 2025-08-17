package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes13.dex */
class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f143569a;

    /* renamed from: b, reason: collision with root package name */
    private final StorageManager f143570b;

    public f(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        this.f143569a = jvmBuiltInsCustomizer;
        this.f143570b = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInsCustomizer.o(this.f143569a, this.f143570b);
    }
}
