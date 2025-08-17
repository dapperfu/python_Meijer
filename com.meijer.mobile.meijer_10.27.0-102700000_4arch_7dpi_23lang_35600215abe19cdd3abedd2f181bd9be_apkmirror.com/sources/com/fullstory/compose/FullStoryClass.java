package com.fullstory.compose;

import com.fullstory.instrumentation.frameworks.compose.FSClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/fullstory/compose/FullStoryClass;", "Lcom/fullstory/compose/FullStorySingleValue;", "cls", "", "(Ljava/lang/String;)V", "api-compose_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FullStoryClass extends FullStorySingleValue implements FSClass {
    @Override // com.fullstory.instrumentation.frameworks.compose.FSClass
    public final String _fsGetClass() {
        return getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullStoryClass(String cls) {
        super(cls);
        Intrinsics.j(cls, "cls");
    }
}
