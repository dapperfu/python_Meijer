package t4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z4.InterfaceC18381c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lt4/c;", "Lz4/c;", "LA4/d;", "openHelper", "<init>", "(LA4/d;)V", "", "fileName", "Lt4/a;", "c", "(Ljava/lang/String;)Lt4/a;", "a", "LA4/d;", "b", "()LA4/d;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: t4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17061c implements InterfaceC18381c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final A4.d openHelper;

    public C17061c(A4.d openHelper) {
        Intrinsics.j(openHelper, "openHelper");
        this.openHelper = openHelper;
    }

    /* renamed from: b, reason: from getter */
    public final A4.d getOpenHelper() {
        return this.openHelper;
    }

    @Override // z4.InterfaceC18381c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C17059a a(String fileName) {
        Intrinsics.j(fileName, "fileName");
        return new C17059a(this.openHelper.D2());
    }
}
