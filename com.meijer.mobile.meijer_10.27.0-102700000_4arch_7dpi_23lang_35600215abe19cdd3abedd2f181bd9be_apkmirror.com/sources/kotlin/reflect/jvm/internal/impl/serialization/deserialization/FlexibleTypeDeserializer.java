package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes13.dex */
public interface FlexibleTypeDeserializer {

    public static final class ThrowException implements FlexibleTypeDeserializer {

        /* renamed from: a, reason: collision with root package name */
        public static final ThrowException f146412a = new ThrowException();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
        public KotlinType a(ProtoBuf.Type proto, String flexibleId, SimpleType lowerBound, SimpleType upperBound) {
            Intrinsics.j(proto, "proto");
            Intrinsics.j(flexibleId, "flexibleId");
            Intrinsics.j(lowerBound, "lowerBound");
            Intrinsics.j(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }

        private ThrowException() {
        }
    }

    KotlinType a(ProtoBuf.Type type, String str, SimpleType simpleType, SimpleType simpleType2);
}
