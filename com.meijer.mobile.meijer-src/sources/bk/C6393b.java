package bk;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a$\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbk/a;", "", "a", "(Lbk/a;)Z", "i18n_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: bk.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6393b {
    public static final boolean a(AbstractC6392a abstractC6392a) {
        if (Intrinsics.e(abstractC6392a, AbstractC6392a.b.f60446c) || abstractC6392a == null) {
            return true;
        }
        if (abstractC6392a instanceof AbstractC6392a.Raw) {
            return ((AbstractC6392a.Raw) abstractC6392a).getText().length() == 0;
        }
        if ((abstractC6392a instanceof AbstractC6392a.Res) || (abstractC6392a instanceof AbstractC6392a.Plural)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
