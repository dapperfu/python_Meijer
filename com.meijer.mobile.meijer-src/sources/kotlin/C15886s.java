package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln0/r;", "", "key", "", "lastKnownIndex", "a", "(Ln0/r;Ljava/lang/Object;I)I", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15886s {
    public static final int a(InterfaceC15885r interfaceC15885r, Object obj, int i10) {
        int iC;
        return (obj == null || interfaceC15885r.a() == 0 || (i10 < interfaceC15885r.a() && Intrinsics.e(obj, interfaceC15885r.d(i10))) || (iC = interfaceC15885r.c(obj)) == -1) ? i10 : iC;
    }
}
