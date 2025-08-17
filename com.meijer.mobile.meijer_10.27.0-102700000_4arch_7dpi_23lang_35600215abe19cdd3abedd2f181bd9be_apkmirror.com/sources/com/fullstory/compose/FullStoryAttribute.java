package com.fullstory.compose;

import com.fullstory.instrumentation.frameworks.compose.FSAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/fullstory/compose/FullStoryAttribute;", "Lcom/fullstory/compose/FullStoryDoubleValue;", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "api-compose_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FullStoryAttribute extends FullStoryDoubleValue implements FSAttribute {
    @Override // com.fullstory.instrumentation.frameworks.compose.FSAttribute
    public final String _fsGetName() {
        return getValue0();
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSAttribute
    public final String _fsGetValue() {
        return getValue1();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullStoryAttribute(String name, String value) {
        super(name, value);
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
    }
}
