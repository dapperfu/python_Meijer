package ia;

import G9.o;
import I9.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ9\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lia/g;", "Lia/f;", "Ljava/lang/Class;", "klass", "<init>", "(Ljava/lang/Class;)V", "", "eventName", "", "eventAttributes", "LV8/a;", "completionListener", "e", "(Ljava/lang/String;Ljava/util/Map;LV8/a;)Ljava/lang/String;", "c", "", "a", "(Ljava/lang/String;Ljava/util/Map;LV8/a;)V", "d", "Ljava/lang/Class;", "LW9/a;", "value", "b", "()LW9/a;", "setEventHandler", "(LW9/a;)V", "eventHandler", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> klass;

    public g(Class<?> klass) {
        Intrinsics.j(klass, "klass");
        this.klass = klass;
    }

    @Override // fa.InterfaceC13862c
    public void a(String eventName, Map<String, String> eventAttributes, V8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        Map mapO = MapsKt.o(TuplesKt.a("event_name", eventName), TuplesKt.a("event_attributes", eventAttributes), TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = I9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new J9.g(cls, strA, mapO), false, 2, null);
    }

    @Override // fa.InterfaceC13862c
    public String c(String eventName, Map<String, String> eventAttributes, V8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        Map mapO = MapsKt.o(TuplesKt.a("event_name", eventName), TuplesKt.a("event_attributes", eventAttributes), TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = I9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new J9.g(cls, strA, mapO), false, 2, null);
        return null;
    }

    @Override // fa.InterfaceC13862c
    public void d(String eventName, Map<String, String> eventAttributes, V8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        Map mapO = MapsKt.o(TuplesKt.a("event_name", eventName), TuplesKt.a("event_attributes", eventAttributes), TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = I9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new J9.g(cls, strA, mapO), false, 2, null);
    }

    @Override // fa.InterfaceC13862c
    public String e(String eventName, Map<String, String> eventAttributes, V8.a completionListener) {
        Intrinsics.j(eventName, "eventName");
        Map mapO = MapsKt.o(TuplesKt.a("event_name", eventName), TuplesKt.a("event_attributes", eventAttributes), TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = I9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new J9.g(cls, strA, mapO), false, 2, null);
        return null;
    }

    @Override // ia.d
    public W9.a b() {
        String strA = o.a();
        e.Companion companion = I9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new J9.g(cls, strA, null), false, 2, null);
        return null;
    }
}
