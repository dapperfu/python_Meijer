package com.fullstory.compose;

import com.fullstory.instrumentation.frameworks.compose.FSTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/fullstory/compose/FullStoryTag;", "Lcom/fullstory/compose/FullStorySingleValue;", "tag", "", "(Ljava/lang/String;)V", "api-compose_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FullStoryTag extends FullStorySingleValue implements FSTag {
    @Override // com.fullstory.instrumentation.frameworks.compose.FSTag
    public final String _fsGetTag() {
        return getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullStoryTag(String tag) {
        super(tag);
        Intrinsics.j(tag, "tag");
    }
}
