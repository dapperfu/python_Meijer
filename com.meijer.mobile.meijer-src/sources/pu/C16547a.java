package pu;

import android.content.Context;
import java.util.Set;
import nu.d;

/* renamed from: pu.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16547a {

    /* renamed from: pu.a$a, reason: collision with other inner class name */
    public interface InterfaceC2435a {
        Set<Boolean> m();
    }

    public static boolean a(Context context) {
        Set<Boolean> setM = ((InterfaceC2435a) d.a(context, InterfaceC2435a.class)).m();
        wu.d.d(setM.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (setM.isEmpty()) {
            return true;
        }
        return setM.iterator().next().booleanValue();
    }
}
