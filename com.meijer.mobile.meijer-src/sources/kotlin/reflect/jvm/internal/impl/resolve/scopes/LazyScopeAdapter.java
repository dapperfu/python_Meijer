package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {

    /* renamed from: b, reason: collision with root package name */
    private final NotNullLazyValue<MemberScope> f147196b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LazyScopeAdapter(Function0<? extends MemberScope> getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        Intrinsics.j(getScope, "getScope");
    }

    public /* synthetic */ LazyScopeAdapter(StorageManager storageManager, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? LockBasedStorageManager.f147540e : storageManager, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    protected MemberScope i() {
        return this.f147196b.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope k(Function0 function0) {
        MemberScope memberScope = (MemberScope) function0.invoke();
        if (memberScope instanceof AbstractScopeAdapter) {
            return ((AbstractScopeAdapter) memberScope).h();
        }
        return memberScope;
    }

    @JvmOverloads
    public LazyScopeAdapter(StorageManager storageManager, Function0<? extends MemberScope> getScope) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(getScope, "getScope");
        this.f147196b = storageManager.c(new b(getScope));
    }
}
