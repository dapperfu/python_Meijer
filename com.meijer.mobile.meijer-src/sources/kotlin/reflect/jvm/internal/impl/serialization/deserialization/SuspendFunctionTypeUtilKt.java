package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.CallableId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public final class SuspendFunctionTypeUtilKt {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final FqName f147345a = new FqName("kotlin.suspend");

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final CallableId f147346b;

    static {
        FqName fqName = StandardNames.f144191A;
        Name nameO = Name.o("suspend");
        Intrinsics.i(nameO, "identifier(...)");
        f147346b = new CallableId(fqName, nameO);
    }
}
