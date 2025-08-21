package kotlin.reflect.jvm.internal.impl.name;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class FqNamesUtilKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f146715a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f146717c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f146716b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final boolean c(String str, String str2) {
        return StringsKt.W(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        a aVar = a.f146715a;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                aVar = a.f146716b;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (cCharAt == '.') {
                    aVar = a.f146717c;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return aVar != a.f146717c;
    }

    public static final <V> V a(FqName fqName, Map<FqName, ? extends V> values) {
        Object next;
        Intrinsics.j(fqName, "<this>");
        Intrinsics.j(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<FqName, ? extends V> entry : values.entrySet()) {
            FqName key = entry.getKey();
            if (Intrinsics.e(fqName, key) || b(fqName, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((FqName) ((Map.Entry) next).getKey(), fqName).a().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((FqName) ((Map.Entry) next2).getKey(), fqName).a().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final boolean b(FqName fqName, FqName packageName) {
        Intrinsics.j(fqName, "<this>");
        Intrinsics.j(packageName, "packageName");
        return Intrinsics.e(f(fqName), packageName);
    }

    public static final boolean d(FqName fqName, FqName packageName) {
        Intrinsics.j(fqName, "<this>");
        Intrinsics.j(packageName, "packageName");
        if (Intrinsics.e(fqName, packageName) || packageName.c()) {
            return true;
        }
        return c(fqName.a(), packageName.a());
    }

    public static final FqName f(FqName fqName) {
        Intrinsics.j(fqName, "<this>");
        if (fqName.c()) {
            return null;
        }
        return fqName.d();
    }

    public static final FqName g(FqName fqName, FqName prefix) {
        Intrinsics.j(fqName, "<this>");
        Intrinsics.j(prefix, "prefix");
        if (!d(fqName, prefix) || prefix.c()) {
            return fqName;
        }
        if (Intrinsics.e(fqName, prefix)) {
            return FqName.f146586d;
        }
        String strSubstring = fqName.a().substring(prefix.a().length() + 1);
        Intrinsics.i(strSubstring, "substring(...)");
        return new FqName(strSubstring);
    }
}
