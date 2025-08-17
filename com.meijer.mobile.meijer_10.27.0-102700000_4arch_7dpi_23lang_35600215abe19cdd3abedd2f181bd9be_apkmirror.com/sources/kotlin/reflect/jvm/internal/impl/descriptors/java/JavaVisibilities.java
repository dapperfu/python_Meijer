package kotlin.reflect.jvm.internal.impl.descriptors.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* loaded from: classes13.dex */
public final class JavaVisibilities {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaVisibilities f144030a = new JavaVisibilities();

    public static final class PackageVisibility extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final PackageVisibility f144031c = new PackageVisibility();

        private PackageVisibility() {
            super("package", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Integer a(Visibility visibility) {
            Intrinsics.j(visibility, "visibility");
            if (this == visibility) {
                return 0;
            }
            return Visibilities.f143650a.b(visibility) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String b() {
            return "public/*package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Visibility d() {
            return Visibilities.Protected.f143659c;
        }
    }

    public static final class ProtectedAndPackage extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final ProtectedAndPackage f144032c = new ProtectedAndPackage();

        private ProtectedAndPackage() {
            super("protected_and_package", true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Integer a(Visibility visibility) {
            Intrinsics.j(visibility, "visibility");
            if (Intrinsics.e(this, visibility)) {
                return 0;
            }
            if (visibility == Visibilities.Internal.f143654c) {
                return null;
            }
            return Visibilities.f143650a.b(visibility) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String b() {
            return "protected/*protected and package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Visibility d() {
            return Visibilities.Protected.f143659c;
        }
    }

    public static final class ProtectedStaticVisibility extends Visibility {

        /* renamed from: c, reason: collision with root package name */
        public static final ProtectedStaticVisibility f144033c = new ProtectedStaticVisibility();

        private ProtectedStaticVisibility() {
            super("protected_static", true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public String b() {
            return "protected/*protected static*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        public Visibility d() {
            return Visibilities.Protected.f143659c;
        }
    }

    private JavaVisibilities() {
    }
}
