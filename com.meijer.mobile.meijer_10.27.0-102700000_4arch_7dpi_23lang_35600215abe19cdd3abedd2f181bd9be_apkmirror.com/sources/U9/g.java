package U9;

import G9.o;
import I9.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LU9/g;", "LU9/j;", "Ljava/lang/Class;", "klass", "<init>", "(Ljava/lang/Class;)V", "", "contactFieldId", "", "contactFieldValue", "LV8/a;", "completionListener", "", "b", "(Ljava/lang/Integer;Ljava/lang/String;LV8/a;)V", "a", "(LV8/a;)V", "Ljava/lang/Class;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> klass;

    @Override // U9.j
    public void a(V8.a completionListener) {
        Map mapG = MapsKt.g(TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = I9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new J9.g(cls, strA, mapG), false, 2, null);
    }

    public g(Class<?> klass) {
        Intrinsics.j(klass, "klass");
        this.klass = klass;
    }

    @Override // U9.j
    public void b(Integer contactFieldId, String contactFieldValue, V8.a completionListener) {
        Map mapO = MapsKt.o(TuplesKt.a("contact_field_id", contactFieldId), TuplesKt.a("contact_field_value", contactFieldValue), TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = I9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new J9.g(cls, strA, mapO), false, 2, null);
    }
}
