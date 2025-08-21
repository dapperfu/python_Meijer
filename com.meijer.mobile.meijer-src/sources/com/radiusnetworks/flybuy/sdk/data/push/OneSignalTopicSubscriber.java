package com.radiusnetworks.flybuy.sdk.data.push;

import com.onesignal.OneSignal;
import com.onesignal.user.IUserManager;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.b;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/push/OneSignalTopicSubscriber;", "Lcom/radiusnetworks/flybuy/sdk/data/push/PushTopicSubscriber;", "()V", "subscribeToTopics", "", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushTopic;", "newTopics", "storedTopics", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class OneSignalTopicSubscriber implements PushTopicSubscriber {
    @Override // com.radiusnetworks.flybuy.sdk.data.push.PushTopicSubscriber
    public Set<FlybuyPushTopic> subscribeToTopics(Set<FlybuyPushTopic> newTopics, Set<FlybuyPushTopic> storedTopics) {
        Intrinsics.j(newTopics, "newTopics");
        Intrinsics.j(storedTopics, "storedTopics");
        try {
            LogExtensionsKt.logd(this, true, "OneSignal ID: " + OneSignal.getUser().getOnesignalId());
            LogExtensionsKt.logd(this, true, "Stored topics: " + storedTopics);
            Map tags = OneSignal.getUser().getTags();
            LogExtensionsKt.logd(this, true, "Current topics for OneSignal: " + tags);
            ArrayList arrayList = new ArrayList();
            for (Object obj : storedTopics) {
                if (tags.keySet().contains(((FlybuyPushTopic) obj).getPushServicesTopics().getOnesignalTagKey())) {
                    arrayList.add(obj);
                }
            }
            Set<FlybuyPushTopic> setN1 = CollectionsKt.n1(CollectionsKt.x0(newTopics, CollectionsKt.o1(arrayList)));
            Set setA1 = CollectionsKt.a1(storedTopics, setN1);
            Set setA12 = CollectionsKt.a1(newTopics, setN1);
            IUserManager user = OneSignal.getUser();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(setA1, 10));
            Iterator it = setA1.iterator();
            while (it.hasNext()) {
                arrayList2.add(((FlybuyPushTopic) it.next()).getPushServicesTopics().getOnesignalTagKey());
            }
            user.removeTags(arrayList2);
            LogExtensionsKt.logd(this, true, "Successfully removed topics for OneSignal: " + setA1);
            IUserManager user2 = OneSignal.getUser();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(setA12, 10)), 16));
            for (Object obj2 : setA12) {
                linkedHashMap.put(((FlybuyPushTopic) obj2).getPushServicesTopics().getOnesignalTagKey(), ((FlybuyPushTopic) obj2).getPushServicesTopics().getOnesignalTagValue());
            }
            user2.addTags(linkedHashMap);
            LogExtensionsKt.logd(this, true, "Successfully subscribed to topics for OneSignal: " + setA12);
            setN1.addAll(setA12);
            LogExtensionsKt.logd(this, true, "Current subscribed topics for OneSignal: " + setN1);
            return setN1;
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndRelease caught exception", new Object[0]);
            b.a(FlyBuyCore.INSTANCE, "catchAndRelease caught exception", e10);
            return null;
        }
    }
}
