package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes14.dex */
class q implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final q f147534a = new q();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Integer.valueOf(TypeDeserializer.A((ProtoBuf.Type) obj));
    }
}
