package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/s;", "", "<init>", "()V", "Landroid/adservices/topics/GetTopicsResponse;", "response", "Landroidx/privacysandbox/ads/adservices/topics/h;", "a", "(Landroid/adservices/topics/GetTopicsResponse;)Landroidx/privacysandbox/ads/adservices/topics/h;", "b", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f58004a = new s();

    public final h a(GetTopicsResponse response) {
        Intrinsics.j(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicA = j.a(it.next());
            arrayList.add(new t(topicA.getTaxonomyVersion(), topicA.getModelVersion(), topicA.getTopicId()));
        }
        return new h(arrayList);
    }

    public final h b(GetTopicsResponse response) {
        Intrinsics.j(response, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = response.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicA = j.a(it.next());
            arrayList.add(new t(topicA.getTaxonomyVersion(), topicA.getModelVersion(), topicA.getTopicId()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = response.getEncryptedTopics().iterator();
        while (it2.hasNext()) {
            EncryptedTopic encryptedTopicA = o.a(it2.next());
            byte[] encryptedTopic = encryptedTopicA.getEncryptedTopic();
            Intrinsics.i(encryptedTopic, "encryptedTopic.encryptedTopic");
            String keyIdentifier = encryptedTopicA.getKeyIdentifier();
            Intrinsics.i(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopicA.getEncapsulatedKey();
            Intrinsics.i(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new C6244a(encryptedTopic, keyIdentifier, encapsulatedKey));
        }
        return new h(arrayList, arrayList2);
    }

    private s() {
    }
}
