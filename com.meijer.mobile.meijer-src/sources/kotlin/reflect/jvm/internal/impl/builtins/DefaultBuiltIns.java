package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes14.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {

    /* renamed from: h, reason: collision with root package name */
    public static final Companion f144145h = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Lazy<DefaultBuiltIns> f144146i = LazyKt.b(b.f144353a);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DefaultBuiltIns a() {
            return (DefaultBuiltIns) DefaultBuiltIns.f144146i.getValue();
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    public DefaultBuiltIns(boolean z10) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z10) {
            f(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultBuiltIns G0() {
        return new DefaultBuiltIns(false, 1, null);
    }

    public /* synthetic */ DefaultBuiltIns(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
