package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* loaded from: classes14.dex */
public abstract class DescriptorKindExclude {

    public static final class NonExtensions extends DescriptorKindExclude {

        /* renamed from: a, reason: collision with root package name */
        public static final NonExtensions f147159a = new NonExtensions();

        /* renamed from: b, reason: collision with root package name */
        private static final int f147160b;

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.f147162c;
            f147160b = (~(companion.i() | companion.d())) & companion.b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        public int a() {
            return f147160b;
        }

        private NonExtensions() {
        }
    }

    public abstract int a();

    public static final class TopLevelPackages extends DescriptorKindExclude {

        /* renamed from: a, reason: collision with root package name */
        public static final TopLevelPackages f147161a = new TopLevelPackages();

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
