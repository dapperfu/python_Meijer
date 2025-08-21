package com.radiusnetworks.flybuy.sdk.data.push;

import com.google.firebase.messaging.FirebaseMessaging;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.b;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/push/FirebaseTopicSubscriber;", "Lcom/radiusnetworks/flybuy/sdk/data/push/PushTopicSubscriber;", "()V", "subscribeToTopics", "", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushTopic;", "newTopics", "storedTopics", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FirebaseTopicSubscriber implements PushTopicSubscriber {
    @Override // com.radiusnetworks.flybuy.sdk.data.push.PushTopicSubscriber
    public Set<FlybuyPushTopic> subscribeToTopics(Set<FlybuyPushTopic> newTopics, Set<FlybuyPushTopic> storedTopics) {
        Intrinsics.j(newTopics, "newTopics");
        Intrinsics.j(storedTopics, "storedTopics");
        try {
            Set<FlybuyPushTopic> setN1 = CollectionsKt.n1(CollectionsKt.x0(newTopics, storedTopics));
            Set setA1 = CollectionsKt.a1(storedTopics, setN1);
            Set<FlybuyPushTopic> setA12 = CollectionsKt.a1(newTopics, setN1);
            Iterator it = setA1.iterator();
            while (it.hasNext()) {
                FirebaseMessaging.p().I(((FlybuyPushTopic) it.next()).getPushServicesTopics().getFcmTopic());
            }
            LogExtensionsKt.logd(this, true, "Successfully removed topics for Firebase: " + setA1);
            for (FlybuyPushTopic flybuyPushTopic : setA12) {
                FirebaseMessaging.p().F(flybuyPushTopic.getPushServicesTopics().getFcmTopic());
                setN1.add(flybuyPushTopic);
            }
            LogExtensionsKt.logd(this, true, "Successfully subscribed to topics for Firebase: " + setA12);
            LogExtensionsKt.logd(this, true, "Current subscribed topics for Firebase: " + setN1);
            return setN1;
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndRelease caught exception", new Object[0]);
            b.a(FlyBuyCore.INSTANCE, "catchAndRelease caught exception", e10);
            return null;
        }
    }
}
