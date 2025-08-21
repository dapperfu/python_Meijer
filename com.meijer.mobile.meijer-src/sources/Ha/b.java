package Ha;

import I9.o;
import K9.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"LHa/b;", "LHa/e;", "Ljava/lang/Class;", "klass", "<init>", "(Ljava/lang/Class;)V", "", "contactFieldId", "", "contactFieldValue", "", "b", "(ILjava/lang/String;)V", "a", "()V", "Ljava/lang/Class;", "predict_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> klass;

    public b(Class<?> klass) {
        Intrinsics.j(klass, "klass");
        this.klass = klass;
    }

    @Override // Ha.e
    public void b(int contactFieldId, String contactFieldValue) {
        Intrinsics.j(contactFieldValue, "contactFieldValue");
        Map mapO = MapsKt.o(TuplesKt.a("contact_field_value", contactFieldValue), TuplesKt.a("contact_field_id", Integer.valueOf(contactFieldId)));
        String strA = o.a();
        e.Companion companion = K9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new L9.g(cls, strA, mapO), false, 2, null);
    }

    @Override // Ha.e
    public void a() {
        String strA = o.a();
        e.Companion companion = K9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new L9.g(cls, strA, null), false, 2, null);
    }
}
