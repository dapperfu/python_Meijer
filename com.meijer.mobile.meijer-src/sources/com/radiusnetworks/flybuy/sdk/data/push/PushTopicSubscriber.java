package com.radiusnetworks.flybuy.sdk.data.push;

import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/push/PushTopicSubscriber;", "", "subscribeToTopics", "", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushTopic;", "newTopics", "storedTopics", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PushTopicSubscriber {
    Set<FlybuyPushTopic> subscribeToTopics(Set<FlybuyPushTopic> newTopics, Set<FlybuyPushTopic> storedTopics);
}
