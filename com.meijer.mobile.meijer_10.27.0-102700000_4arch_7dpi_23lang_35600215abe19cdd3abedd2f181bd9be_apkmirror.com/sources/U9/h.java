package U9;

import da.C13500b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LU9/h;", "LU9/i;", "", "loggingInstance", "<init>", "(Z)V", "", "contactFieldId", "", "contactFieldValue", "LV8/a;", "completionListener", "", "b", "(Ljava/lang/Integer;Ljava/lang/String;LV8/a;)V", "a", "(LV8/a;)V", "Z", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean loggingInstance;

    public h(boolean z10) {
        this.loggingInstance = z10;
    }

    public /* synthetic */ h(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @Override // U9.i
    public void a(V8.a completionListener) {
        (this.loggingInstance ? C13500b.b().z() : C13500b.b().F()).a(completionListener);
    }

    @Override // U9.i
    public void b(Integer contactFieldId, String contactFieldValue, V8.a completionListener) {
        (this.loggingInstance ? C13500b.b().z() : C13500b.b().F()).b(contactFieldId, contactFieldValue, completionListener);
    }
}
