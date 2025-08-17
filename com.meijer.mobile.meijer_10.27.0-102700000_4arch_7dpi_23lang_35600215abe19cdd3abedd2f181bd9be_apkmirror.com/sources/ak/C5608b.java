package ak;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a$\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lak/a;", "", "a", "(Lak/a;)Z", "i18n_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ak.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5608b {
    public static final boolean a(AbstractC5607a abstractC5607a) {
        if (Intrinsics.e(abstractC5607a, AbstractC5607a.b.f45515c) || abstractC5607a == null) {
            return true;
        }
        if (abstractC5607a instanceof AbstractC5607a.Raw) {
            return ((AbstractC5607a.Raw) abstractC5607a).getText().length() == 0;
        }
        if ((abstractC5607a instanceof AbstractC5607a.Res) || (abstractC5607a instanceof AbstractC5607a.Plural)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
