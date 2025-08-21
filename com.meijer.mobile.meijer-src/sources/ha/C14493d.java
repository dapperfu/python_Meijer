package ha;

import I9.o;
import K9.e;
import L9.g;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ9\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lha/d;", "Lha/c;", "Ljava/lang/Class;", "klass", "<init>", "(Ljava/lang/Class;)V", "", "eventName", "", "eventAttributes", "LX8/a;", "completionListener", "d", "(Ljava/lang/String;Ljava/util/Map;LX8/a;)Ljava/lang/String;", "b", "", "c", "(Ljava/lang/String;Ljava/util/Map;LX8/a;)V", "e", "a", "Ljava/lang/Class;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ha.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14493d implements InterfaceC14492c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> klass;

    public C14493d(Class<?> klass) {
        Intrinsics.j(klass, "klass");
        this.klass = klass;
    }

    @Override // ha.InterfaceC14492c
    public String b(String eventName, Map<String, String> eventAttributes, X8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        Map mapO = MapsKt.o(TuplesKt.a(NotificationsManager.INTENT_EXTRA_EVENT_NAME, eventName), TuplesKt.a("event_attributes", eventAttributes), TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new g(cls, strA, mapO), false, 2, null);
        return null;
    }

    @Override // ha.InterfaceC14492c
    public void c(String eventName, Map<String, String> eventAttributes, X8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        Map mapO = MapsKt.o(TuplesKt.a(NotificationsManager.INTENT_EXTRA_EVENT_NAME, eventName), TuplesKt.a("event_attributes", eventAttributes), TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new g(cls, strA, mapO), false, 2, null);
    }

    @Override // ha.InterfaceC14492c
    public String d(String eventName, Map<String, String> eventAttributes, X8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        Map mapO = MapsKt.o(TuplesKt.a(NotificationsManager.INTENT_EXTRA_EVENT_NAME, eventName), TuplesKt.a("event_attributes", eventAttributes), TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new g(cls, strA, mapO), false, 2, null);
        return null;
    }

    @Override // ha.InterfaceC14492c
    public void e(String eventName, Map<String, String> eventAttributes, X8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        Map mapO = MapsKt.o(TuplesKt.a(NotificationsManager.INTENT_EXTRA_EVENT_NAME, eventName), TuplesKt.a("event_attributes", eventAttributes), TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new g(cls, strA, mapO), false, 2, null);
    }
}
