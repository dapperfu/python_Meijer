package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public final class JvmBuiltInsCustomizerKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Name f144457a;

    /* renamed from: b, reason: collision with root package name */
    private static final Name f144458b;

    static {
        Name nameO = Name.o("getFirst");
        Intrinsics.i(nameO, "identifier(...)");
        f144457a = nameO;
        Name nameO2 = Name.o("getLast");
        Intrinsics.i(nameO2, "identifier(...)");
        f144458b = nameO2;
    }
}
