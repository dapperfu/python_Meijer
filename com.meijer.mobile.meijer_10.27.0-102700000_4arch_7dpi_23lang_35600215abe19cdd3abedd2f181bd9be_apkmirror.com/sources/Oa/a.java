package Oa;

import da.C13500b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LOa/a;", "LOa/b;", "", "loggingInstance", "<init>", "(Z)V", "", "pushToken", "LV8/a;", "completionListener", "", "b", "(Ljava/lang/String;LV8/a;)V", "c", "()V", "LW9/a;", "notificationEventHandler", "a", "(LW9/a;)V", "Z", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean loggingInstance;

    public a(boolean z10) {
        this.loggingInstance = z10;
    }

    public /* synthetic */ a(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @Override // Oa.b
    public void a(W9.a notificationEventHandler) {
        Intrinsics.j(notificationEventHandler, "notificationEventHandler");
        (this.loggingInstance ? C13500b.b().f() : C13500b.b().P()).a(notificationEventHandler);
    }

    @Override // Oa.b
    public void b(String pushToken, V8.a completionListener) {
        Intrinsics.j(pushToken, "pushToken");
        (this.loggingInstance ? C13500b.b().f() : C13500b.b().P()).b(pushToken, completionListener);
    }

    @Override // Oa.b
    public void c() {
        (this.loggingInstance ? C13500b.b().f() : C13500b.b().P()).d(null);
    }
}
