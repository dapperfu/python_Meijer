package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes14.dex */
public interface LocalClassifierTypeSettings {
    SimpleType a();

    public static final class Default implements LocalClassifierTypeSettings {

        /* renamed from: a, reason: collision with root package name */
        public static final Default f147327a = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings
        public SimpleType a() {
            return null;
        }

        private Default() {
        }
    }
}
