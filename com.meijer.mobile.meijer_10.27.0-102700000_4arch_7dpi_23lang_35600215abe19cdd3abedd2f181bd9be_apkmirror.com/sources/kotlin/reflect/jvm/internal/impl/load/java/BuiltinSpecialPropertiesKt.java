package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes13.dex */
public final class BuiltinSpecialPropertiesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName c(FqName fqName, String str) {
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        return fqName.b(nameO);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName d(FqNameUnsafe fqNameUnsafe, String str) {
        Name nameO = Name.o(str);
        Intrinsics.i(nameO, "identifier(...)");
        return fqNameUnsafe.b(nameO).m();
    }
}
