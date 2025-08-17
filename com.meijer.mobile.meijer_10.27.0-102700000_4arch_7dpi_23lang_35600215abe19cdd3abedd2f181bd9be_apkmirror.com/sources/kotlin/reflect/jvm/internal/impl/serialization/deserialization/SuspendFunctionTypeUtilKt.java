package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.CallableId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes13.dex */
public final class SuspendFunctionTypeUtilKt {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final FqName f146438a = new FqName("kotlin.suspend");

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final CallableId f146439b;

    static {
        FqName fqName = StandardNames.f143284A;
        Name nameO = Name.o("suspend");
        Intrinsics.i(nameO, "identifier(...)");
        f146439b = new CallableId(fqName, nameO);
    }
}
