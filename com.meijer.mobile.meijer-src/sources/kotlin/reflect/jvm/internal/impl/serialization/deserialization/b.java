package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer;

/* loaded from: classes14.dex */
class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final ClassDeserializer f147357a;

    public b(ClassDeserializer classDeserializer) {
        this.f147357a = classDeserializer;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ClassDeserializer.c(this.f147357a, (ClassDeserializer.a) obj);
    }
}
