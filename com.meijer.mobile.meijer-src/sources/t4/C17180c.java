package t4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lt4/c;", "LA4/c;", "LB4/d;", "openHelper", "<init>", "(LB4/d;)V", "", "fileName", "Lt4/a;", "c", "(Ljava/lang/String;)Lt4/a;", "a", "LB4/d;", "b", "()LB4/d;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: t4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17180c implements A4.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B4.d openHelper;

    public C17180c(B4.d openHelper) {
        Intrinsics.j(openHelper, "openHelper");
        this.openHelper = openHelper;
    }

    /* renamed from: b, reason: from getter */
    public final B4.d getOpenHelper() {
        return this.openHelper;
    }

    @Override // A4.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C17178a a(String fileName) {
        Intrinsics.j(fileName, "fileName");
        return new C17178a(this.openHelper.C2());
    }
}
