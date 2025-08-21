package ia;

import K9.e;
import ja.TriggeringEmarsysGeofence;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Lia/q;", "Lia/n;", "Ljava/lang/Class;", "klass", "<init>", "(Ljava/lang/Class;)V", "LX8/a;", "completionListener", "", "a", "(LX8/a;)V", "", "isEnabled", "()Z", "", "Lja/c;", "triggeringEmarsysGeofences", "b", "(Ljava/util/List;)V", "Ljava/lang/Class;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q implements n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> klass;

    @Override // ia.n
    public void a(X8.a completionListener) {
        Map mapG = MapsKt.g(TuplesKt.a("completionListener", Boolean.valueOf(completionListener != null)));
        String strA = I9.o.a();
        e.Companion companion = K9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new L9.g(cls, strA, mapG), false, 2, null);
    }

    public q(Class<?> klass) {
        Intrinsics.j(klass, "klass");
        this.klass = klass;
    }

    @Override // ia.n
    public void b(List<TriggeringEmarsysGeofence> triggeringEmarsysGeofences) {
        Intrinsics.j(triggeringEmarsysGeofences, "triggeringEmarsysGeofences");
        Map mapG = MapsKt.g(TuplesKt.a("triggeringEmarsysGeofences", triggeringEmarsysGeofences));
        String strA = I9.o.a();
        e.Companion companion = K9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new L9.g(cls, strA, mapG), false, 2, null);
    }

    @Override // ia.n
    public boolean isEnabled() {
        String strA = I9.o.a();
        e.Companion companion = K9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new L9.g(cls, strA, null), false, 2, null);
        return false;
    }
}
