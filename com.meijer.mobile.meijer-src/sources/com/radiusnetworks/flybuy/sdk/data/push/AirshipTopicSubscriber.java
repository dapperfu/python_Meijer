package com.radiusnetworks.flybuy.sdk.data.push;

import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.b;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.urbanairship.UAirship;
import com.urbanairship.channel.TagEditor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/push/AirshipTopicSubscriber;", "Lcom/radiusnetworks/flybuy/sdk/data/push/PushTopicSubscriber;", "()V", "subscribeToTopics", "", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushTopic;", "newTopics", "storedTopics", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AirshipTopicSubscriber implements PushTopicSubscriber {
    @Override // com.radiusnetworks.flybuy.sdk.data.push.PushTopicSubscriber
    public Set<FlybuyPushTopic> subscribeToTopics(Set<FlybuyPushTopic> newTopics, Set<FlybuyPushTopic> storedTopics) {
        Intrinsics.j(newTopics, "newTopics");
        Intrinsics.j(storedTopics, "storedTopics");
        try {
            Set<FlybuyPushTopic> setN1 = CollectionsKt.n1(CollectionsKt.x0(newTopics, storedTopics));
            Set setA1 = CollectionsKt.a1(storedTopics, setN1);
            Set setA12 = CollectionsKt.a1(newTopics, setN1);
            TagEditor tagEditorEditTags = UAirship.shared().getChannel().editTags();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(setA1, 10));
            Iterator it = setA1.iterator();
            while (it.hasNext()) {
                arrayList.add(((FlybuyPushTopic) it.next()).getPushServicesTopics().getAirshipTag());
            }
            tagEditorEditTags.removeTags(CollectionsKt.o1(arrayList));
            LogExtensionsKt.logd(tagEditorEditTags, true, "Successfully removed topics for Airship: " + setA1);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(setA12, 10));
            Iterator it2 = setA12.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((FlybuyPushTopic) it2.next()).getPushServicesTopics().getAirshipTag());
            }
            tagEditorEditTags.addTags(CollectionsKt.o1(arrayList2)).apply();
            LogExtensionsKt.logd(tagEditorEditTags, true, "Successfully subscribed to topics for Airship: " + setA12);
            setN1.addAll(setA12);
            LogExtensionsKt.logd(this, true, "Current subscribed topics for Airship: " + setN1);
            return setN1;
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndRelease caught exception", new Object[0]);
            b.a(FlyBuyCore.INSTANCE, "catchAndRelease caught exception", e10);
            return null;
        }
    }
}
