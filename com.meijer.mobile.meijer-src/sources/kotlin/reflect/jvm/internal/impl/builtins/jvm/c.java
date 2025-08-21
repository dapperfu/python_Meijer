package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final JvmBuiltIns f144471a;

    /* renamed from: b, reason: collision with root package name */
    private final StorageManager f144472b;

    public c(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        this.f144471a = jvmBuiltIns;
        this.f144472b = storageManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JvmBuiltIns.J0(this.f144471a, this.f144472b);
    }
}
