package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes14.dex */
public final class NameUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final NameUtils f146598a = new NameUtils();

    /* renamed from: b, reason: collision with root package name */
    private static final Regex f146599b = new Regex("[^\\p{L}\\p{Digit}]");

    /* renamed from: c, reason: collision with root package name */
    private static final String f146600c = "$context_receiver";

    @JvmStatic
    public static final Name a(int i10) {
        Name nameO = Name.o(f146600c + '_' + i10);
        Intrinsics.i(nameO, "identifier(...)");
        return nameO;
    }

    @JvmStatic
    public static final String b(String name) {
        Intrinsics.j(name, "name");
        return f146599b.k(name, "_");
    }

    private NameUtils() {
    }
}
