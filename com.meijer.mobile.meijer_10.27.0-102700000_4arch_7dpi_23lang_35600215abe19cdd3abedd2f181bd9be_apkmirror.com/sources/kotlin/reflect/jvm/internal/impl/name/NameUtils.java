package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes13.dex */
public final class NameUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final NameUtils f145691a = new NameUtils();

    /* renamed from: b, reason: collision with root package name */
    private static final Regex f145692b = new Regex("[^\\p{L}\\p{Digit}]");

    /* renamed from: c, reason: collision with root package name */
    private static final String f145693c = "$context_receiver";

    @JvmStatic
    public static final Name a(int i10) {
        Name nameO = Name.o(f145693c + '_' + i10);
        Intrinsics.i(nameO, "identifier(...)");
        return nameO;
    }

    @JvmStatic
    public static final String b(String name) {
        Intrinsics.j(name, "name");
        return f145692b.k(name, "_");
    }

    private NameUtils() {
    }
}
