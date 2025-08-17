package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public final class LazyWrappedType extends WrappedType {

    /* renamed from: b, reason: collision with root package name */
    private final StorageManager f146719b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0<KotlinType> f146720c;

    /* renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue<KotlinType> f146721d;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(StorageManager storageManager, Function0<? extends KotlinType> computation) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(computation, "computation");
        this.f146719b = storageManager;
        this.f146720c = computation;
        this.f146721d = storageManager.c(computation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType S0(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        return kotlinTypeRefiner.a(lazyWrappedType.f146720c.invoke());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    protected KotlinType O0() {
        return this.f146721d.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean P0() {
        return this.f146721d.i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public LazyWrappedType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.f146719b, new p(kotlinTypeRefiner, this));
    }
}
