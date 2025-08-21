package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* loaded from: classes14.dex */
final class FallbackBuiltIns extends KotlinBuiltIns {

    /* renamed from: h, reason: collision with root package name */
    public static final Companion f144397h = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private static final KotlinBuiltIns f144398i = new FallbackBuiltIns();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KotlinBuiltIns a() {
            return FallbackBuiltIns.f144398i;
        }
    }

    private FallbackBuiltIns() {
        super(new LockBasedStorageManager("FallbackBuiltIns"));
        f(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public PlatformDependentDeclarationFilter.All N() {
        return PlatformDependentDeclarationFilter.All.f144686a;
    }
}
