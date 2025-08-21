package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class PropertiesConventionUtilKt {
    public static final List<Name> a(Name name) {
        Intrinsics.j(name, "name");
        String strB = name.b();
        Intrinsics.i(strB, "asString(...)");
        return JvmAbi.c(strB) ? CollectionsKt.q(b(name)) : JvmAbi.d(strB) ? f(name) : BuiltinSpecialProperties.f145070a.b(name);
    }

    public static final Name b(Name methodName) {
        Intrinsics.j(methodName, "methodName");
        Name nameE = e(methodName, "get", false, null, 12, null);
        return nameE == null ? e(methodName, "is", false, null, 8, null) : nameE;
    }

    public static final Name c(Name methodName, boolean z10) {
        Intrinsics.j(methodName, "methodName");
        return e(methodName, "set", false, z10 ? "is" : null, 4, null);
    }

    static /* synthetic */ Name e(Name name, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(name, str, z10, str2);
    }

    public static final List<Name> f(Name methodName) {
        Intrinsics.j(methodName, "methodName");
        return CollectionsKt.r(c(methodName, false), c(methodName, true));
    }

    private static final Name d(Name name, String str, boolean z10, String str2) {
        if (name.p()) {
            return null;
        }
        String strL = name.l();
        Intrinsics.i(strL, "getIdentifier(...)");
        if (!StringsKt.W(strL, str, false, 2, null) || strL.length() == str.length()) {
            return null;
        }
        char cCharAt = strL.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return Name.o(str2 + StringsKt.K0(strL, str));
        }
        if (!z10) {
            return name;
        }
        String strC = CapitalizeDecapitalizeKt.c(StringsKt.K0(strL, str), true);
        if (!Name.t(strC)) {
            return null;
        }
        return Name.o(strC);
    }
}
