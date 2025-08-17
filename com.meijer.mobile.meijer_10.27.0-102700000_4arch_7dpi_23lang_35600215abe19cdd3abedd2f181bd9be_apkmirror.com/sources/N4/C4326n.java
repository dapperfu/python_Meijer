package N4;

import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"", "className", "LN4/l;", "a", "(Ljava/lang/String;)LN4/l;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: N4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4326n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f21419a;

    static {
        String strI = AbstractC4333v.i("InputMerger");
        Intrinsics.i(strI, "tagWithPrefix(\"InputMerger\")");
        f21419a = strI;
    }

    public static final AbstractC4324l a(String className) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(className, "className");
        try {
            Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            Intrinsics.h(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (AbstractC4324l) objNewInstance;
        } catch (Exception e10) {
            AbstractC4333v.e().d(f21419a, "Trouble instantiating " + className, e10);
            return null;
        }
    }
}
