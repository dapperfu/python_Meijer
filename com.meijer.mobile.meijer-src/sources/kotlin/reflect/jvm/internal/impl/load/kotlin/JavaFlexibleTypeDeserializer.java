package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes14.dex */
public final class JavaFlexibleTypeDeserializer implements FlexibleTypeDeserializer {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaFlexibleTypeDeserializer f145701a = new JavaFlexibleTypeDeserializer();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
    public KotlinType a(ProtoBuf.Type proto, String flexibleId, SimpleType lowerBound, SimpleType upperBound) {
        Intrinsics.j(proto, "proto");
        Intrinsics.j(flexibleId, "flexibleId");
        Intrinsics.j(lowerBound, "lowerBound");
        Intrinsics.j(upperBound, "upperBound");
        return !Intrinsics.e(flexibleId, "kotlin.jvm.PlatformType") ? ErrorUtils.d(ErrorTypeKind.f147826I, flexibleId, lowerBound.toString(), upperBound.toString()) : proto.y(JvmProtoBuf.f146466g) ? new RawTypeImpl(lowerBound, upperBound) : KotlinTypeFactory.e(lowerBound, upperBound);
    }

    private JavaFlexibleTypeDeserializer() {
    }
}
