package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltInsCustomizer f144476a;

    /* renamed from: b, reason: collision with root package name */
    private final StorageManager f144477b;

    public f(JvmBuiltInsCustomizer jvmBuiltInsCustomizer, StorageManager storageManager) {
        this.f144476a = jvmBuiltInsCustomizer;
        this.f144477b = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltInsCustomizer.o(this.f144476a, this.f144477b);
    }
}
