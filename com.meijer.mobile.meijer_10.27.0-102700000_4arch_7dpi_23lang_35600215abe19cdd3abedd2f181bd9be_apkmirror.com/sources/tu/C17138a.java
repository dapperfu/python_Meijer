package tu;

import android.content.Context;
import java.util.Set;
import ru.d;

/* renamed from: tu.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17138a {

    /* renamed from: tu.a$a, reason: collision with other inner class name */
    public interface InterfaceC2542a {
        Set<Boolean> m();
    }

    public static boolean a(Context context) {
        Set<Boolean> setM = ((InterfaceC2542a) d.a(context, InterfaceC2542a.class)).m();
        Au.d.d(setM.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setM.isEmpty()) {
            return true;
        }
        return setM.iterator().next().booleanValue();
    }
}
