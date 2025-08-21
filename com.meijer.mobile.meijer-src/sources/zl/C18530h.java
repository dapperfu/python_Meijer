package zl;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zl.AbstractC18529g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Lzl/g;", "a", "(I)Lzl/g;", "", "b", "(Ljava/lang/Boolean;)Lzl/g;", "featureflag_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: zl.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C18530h {
    public static final AbstractC18529g a(int i10) {
        if (i10 == 0) {
            return AbstractC18529g.c.f172920b;
        }
        if (i10 == 1) {
            return AbstractC18529g.a.f172918b;
        }
        if (i10 != 2) {
            return null;
        }
        return AbstractC18529g.b.f172919b;
    }

    public static final AbstractC18529g b(Boolean bool) {
        if (bool == null) {
            return AbstractC18529g.c.f172920b;
        }
        if (Intrinsics.e(bool, Boolean.TRUE)) {
            return AbstractC18529g.b.f172919b;
        }
        if (Intrinsics.e(bool, Boolean.FALSE)) {
            return AbstractC18529g.a.f172918b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
