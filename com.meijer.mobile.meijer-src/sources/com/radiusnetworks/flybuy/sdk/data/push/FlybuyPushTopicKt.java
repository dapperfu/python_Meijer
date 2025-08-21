package com.radiusnetworks.flybuy.sdk.data.push;

import com.radiusnetworks.flybuy.api.model.PushTopic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toFlybuyPushTopic", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushTopic;", "Lcom/radiusnetworks/flybuy/api/model/PushTopic;", "toFlybuyPushTopics", "", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FlybuyPushTopicKt {
    public static final FlybuyPushTopic toFlybuyPushTopic(PushTopic pushTopic) {
        Intrinsics.j(pushTopic, "<this>");
        return new FlybuyPushTopic(pushTopic.getId(), pushTopic.getType(), pushTopic.getTopic(), pushTopic.getTimeZone(), PushServicesTopicsKt.toPushServicesTopics(pushTopic.getPushServicesTopics()));
    }

    public static final List<FlybuyPushTopic> toFlybuyPushTopics(List<PushTopic> list) {
        Intrinsics.j(list, "<this>");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toFlybuyPushTopic((PushTopic) it.next()));
        }
        return arrayList;
    }
}
