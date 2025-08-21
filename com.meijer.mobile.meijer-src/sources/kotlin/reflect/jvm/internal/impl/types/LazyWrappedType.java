package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public final class LazyWrappedType extends WrappedType {

    /* renamed from: b, reason: collision with root package name */
    private final StorageManager f147626b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0<KotlinType> f147627c;

    /* renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue<KotlinType> f147628d;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(StorageManager storageManager, Function0<? extends KotlinType> computation) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(computation, "computation");
        this.f147626b = storageManager;
        this.f147627c = computation;
        this.f147628d = storageManager.c(computation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType S0(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        return kotlinTypeRefiner.a(lazyWrappedType.f147627c.invoke());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    protected KotlinType O0() {
        return this.f147628d.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean P0() {
        return this.f147628d.i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public LazyWrappedType U0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.f147626b, new p(kotlinTypeRefiner, this));
    }
}
