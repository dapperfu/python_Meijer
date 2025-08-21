package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;

/* loaded from: classes14.dex */
public interface DeserializationConfiguration {

    public static final class Default implements DeserializationConfiguration {

        /* renamed from: a, reason: collision with root package name */
        public static final Default f147299a = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean a() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean b() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean c() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean e() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean f() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean g() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public MetadataVersion d() {
            return MetadataVersion.f146450i;
        }

        private Default() {
        }
    }

    boolean a();

    boolean b();

    boolean c();

    MetadataVersion d();

    boolean e();

    boolean f();

    boolean g();
}
