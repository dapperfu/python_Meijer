package com.adobe.marketing.mobile.assurance.internal;

import com.adobe.marketing.mobile.InterfaceC6418a;
import com.adobe.marketing.mobile.assurance.internal.W;
import f6.C13847c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u000eB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B1\b\u0016\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0001¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/J;", "", "Lcom/adobe/marketing/mobile/a;", "Lcom/adobe/marketing/mobile/assurance/internal/l;", "notifier", "<init>", "(Lcom/adobe/marketing/mobile/a;)V", "", "", "", "queue", "(Ljava/util/Map;Lcom/adobe/marketing/mobile/a;)V", "event", "", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/l;)V", "chunkedEvents", "Lcom/adobe/marketing/mobile/assurance/internal/W;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "b", "(Ljava/util/List;)Lcom/adobe/marketing/mobile/assurance/internal/W;", "Ljava/util/Map;", "Lcom/adobe/marketing/mobile/a;", "c", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class J {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<C6430l>> queue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6418a<C6430l> notifier;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/J$a;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/assurance/internal/l;", "event", "", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/l;)Z", "", "LOG_TAG", "Ljava/lang/String;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.adobe.marketing.mobile.assurance.internal.J$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmName
        public final boolean a(C6430l event) {
            Intrinsics.j(event, "event");
            Map<String, Object> map = event.f62278d;
            if (map == null) {
                return false;
            }
            return (((String) map.get("chunkId")) == null || ((Integer) event.f62278d.get("chunkSequenceNumber")) == null) ? false : true;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Object obj = ((C6430l) t10).f62278d.get("chunkSequenceNumber");
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
            Object obj2 = ((C6430l) t11).f62278d.get("chunkSequenceNumber");
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Int");
            return ComparisonsKt.d((Integer) obj, (Integer) obj2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J(InterfaceC6418a<C6430l> notifier) {
        this(new LinkedHashMap(), notifier);
        Intrinsics.j(notifier, "notifier");
    }

    public J(Map<String, List<C6430l>> queue, InterfaceC6418a<C6430l> notifier) {
        Intrinsics.j(queue, "queue");
        Intrinsics.j(notifier, "notifier");
        this.queue = queue;
        this.notifier = notifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmName
    public final void a(C6430l event) {
        Integer num;
        Intrinsics.j(event, "event");
        if (!INSTANCE.a(event)) {
            this.notifier.a(event);
            return;
        }
        String str = (String) event.f62278d.get("chunkId");
        if (str == null || (num = (Integer) event.f62278d.get("chunkTotal")) == null) {
            return;
        }
        int iIntValue = num.intValue();
        List<C6430l> arrayList = this.queue.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(event);
        if (arrayList.size() != iIntValue) {
            this.queue.put(str, arrayList);
            return;
        }
        W<C6430l, Exception> wB = b(arrayList);
        if (wB instanceof W.b) {
            this.notifier.a(((W.b) wB).a());
        } else if (wB instanceof W.a) {
            Q5.t.b("Assurance", "EventStitcher", "Failed to stitch events for chunkId: " + str + " due to: " + ((Exception) ((W.a) wB).a()).getMessage(), new Object[0]);
        }
        this.queue.remove(str);
    }

    public final W<C6430l, Exception> b(List<C6430l> chunkedEvents) {
        Intrinsics.j(chunkedEvents, "chunkedEvents");
        if (chunkedEvents.isEmpty()) {
            return new W.a(new Exception("No events to stitch"));
        }
        Q5.t.e("Assurance", "EventStitcher", "Stitching " + chunkedEvents.size() + " events", new Object[0]);
        if (chunkedEvents.size() > 1) {
            CollectionsKt.B(chunkedEvents, new b());
        }
        String strC = chunkedEvents.get(0).c();
        String str = chunkedEvents.get(0).f62276b;
        long j10 = chunkedEvents.get(0).f62280f;
        StringBuilder sb2 = new StringBuilder();
        Iterator<T> it = chunkedEvents.iterator();
        while (it.hasNext()) {
            String str2 = (String) ((C6430l) it.next()).f62279e.get("chunkData");
            if (str2 != null) {
                Charset charset = Charsets.UTF_8;
                byte[] bytes = str2.getBytes(charset);
                Intrinsics.i(bytes, "this as java.lang.String).getBytes(charset)");
                sb2.append(new String(bytes, charset));
            }
        }
        try {
            return new W.b(new C6430l(str, strC, null, C13847c.e(new JSONObject(sb2.toString())), j10));
        } catch (JSONException e10) {
            return new W.a(e10);
        }
    }
}
