package Fa;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"LFa/g;", "LFa/h;", "", "loggingInstance", "<init>", "(Z)V", "", "contactFieldId", "", "contactFieldValue", "", "b", "(ILjava/lang/String;)V", "a", "()V", "Z", "emarsys-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public class g implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean loggingInstance;

    public g(boolean z10) {
        this.loggingInstance = z10;
    }

    public /* synthetic */ g(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @Override // Fa.h
    public void a() {
        (this.loggingInstance ? Ha.b.a().N() : Ha.b.a().e()).a();
    }

    @Override // Fa.h
    public void b(int contactFieldId, String contactFieldValue) {
        Intrinsics.j(contactFieldValue, "contactFieldValue");
        (this.loggingInstance ? Ha.b.a().N() : Ha.b.a().e()).b(contactFieldId, contactFieldValue);
    }
}
