package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* loaded from: classes13.dex */
public abstract class DescriptorKindExclude {

    public static final class NonExtensions extends DescriptorKindExclude {

        /* renamed from: a, reason: collision with root package name */
        public static final NonExtensions f146252a = new NonExtensions();

        /* renamed from: b, reason: collision with root package name */
        private static final int f146253b;

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.f146255c;
            f146253b = (~(companion.i() | companion.d())) & companion.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int a() {
            return f146253b;
        }

        private NonExtensions() {
        }
    }

    public abstract int a();

    public static final class TopLevelPackages extends DescriptorKindExclude {

        /* renamed from: a, reason: collision with root package name */
        public static final TopLevelPackages f146254a = new TopLevelPackages();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int a() {
            return 0;
        }

        private TopLevelPackages() {
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
