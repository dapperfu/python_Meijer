package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: classes14.dex */
public interface JavaResolverSettings {
    boolean a();

    boolean b();

    boolean c();

    boolean d();

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f145315a = new Companion();

        private Companion() {
        }
    }

    public static final class Default implements JavaResolverSettings {

        /* renamed from: a, reason: collision with root package name */
        public static final Default f145316a = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean a() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean b() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean c() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean d() {
            return false;
        }

        private Default() {
        }
    }
}
