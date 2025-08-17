package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes13.dex */
class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltIns f143564a;

    /* renamed from: b, reason: collision with root package name */
    private final StorageManager f143565b;

    public c(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        this.f143564a = jvmBuiltIns;
        this.f143565b = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltIns.J0(this.f143564a, this.f143565b);
    }
}
