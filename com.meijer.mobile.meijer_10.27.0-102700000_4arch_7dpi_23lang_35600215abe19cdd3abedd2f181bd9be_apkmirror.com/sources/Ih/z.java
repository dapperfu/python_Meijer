package Ih;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\b\"#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"", "password", "", "", "passwordRequirementsMap", "Lkotlin/Pair;", "LIh/x;", "a", "(Ljava/lang/String;Ljava/util/Map;)Lkotlin/Pair;", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "defaultPasswordRequirementsMap", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Boolean> f14056a;

    static {
        Boolean bool = Boolean.FALSE;
        f14056a = MapsKt.A(MapsKt.n(TuplesKt.a("8 to 15 characters (12+ recommended)", bool), TuplesKt.a("At least ONE uppercase letter", bool), TuplesKt.a("At least ONE lowercase letter", bool), TuplesKt.a("At least ONE number", bool)));
    }

    public static final Pair<x, Map<String, Boolean>> a(String password, Map<String, Boolean> passwordRequirementsMap) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        x xVar;
        Intrinsics.j(password, "password");
        Intrinsics.j(passwordRequirementsMap, "passwordRequirementsMap");
        Map mapD = MapsKt.D(passwordRequirementsMap);
        if (password.length() <= 0) {
            x xVar2 = x.f14036a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(mapD.size()));
            Iterator it = mapD.entrySet().iterator();
            while (it.hasNext()) {
                linkedHashMap.put(((Map.Entry) it.next()).getKey(), Boolean.FALSE);
            }
            return new Pair<>(xVar2, MapsKt.A(linkedHashMap));
        }
        if (StringsKt.r0(password) || !new Regex("[a-zA-Z0-9\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\.]*").j(password)) {
            x xVar3 = x.f14037b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.f(mapD.size()));
            Iterator it2 = mapD.entrySet().iterator();
            while (it2.hasNext()) {
                linkedHashMap2.put(((Map.Entry) it2.next()).getKey(), Boolean.FALSE);
            }
            return new Pair<>(xVar3, MapsKt.A(linkedHashMap2));
        }
        int length = password.length();
        int i11 = 0;
        mapD.put("8 to 15 characters (12+ recommended)", Boolean.valueOf(8 <= length && length < 16));
        int i12 = 0;
        while (true) {
            if (i12 >= password.length()) {
                z10 = false;
                break;
            }
            if (Character.isUpperCase(password.charAt(i12))) {
                z10 = true;
                break;
            }
            i12++;
        }
        mapD.put("At least ONE uppercase letter", Boolean.valueOf(z10));
        int i13 = 0;
        while (true) {
            if (i13 >= password.length()) {
                z11 = false;
                break;
            }
            if (Character.isLowerCase(password.charAt(i13))) {
                z11 = true;
                break;
            }
            i13++;
        }
        mapD.put("At least ONE lowercase letter", Boolean.valueOf(z11));
        int i14 = 0;
        while (true) {
            if (i14 >= password.length()) {
                z12 = false;
                break;
            }
            if (Character.isDigit(password.charAt(i14))) {
                z12 = true;
                break;
            }
            i14++;
        }
        mapD.put("At least ONE number", Boolean.valueOf(z12));
        if (mapD.isEmpty()) {
            i10 = 0;
        } else {
            Iterator it3 = mapD.entrySet().iterator();
            i10 = 0;
            while (it3.hasNext()) {
                if (((Boolean) ((Map.Entry) it3.next()).getValue()).booleanValue()) {
                    i10++;
                }
            }
        }
        if (i10 == mapD.size()) {
            xVar = x.f14039d;
        } else {
            if (!mapD.isEmpty()) {
                Iterator it4 = mapD.entrySet().iterator();
                while (it4.hasNext()) {
                    if (((Boolean) ((Map.Entry) it4.next()).getValue()).booleanValue()) {
                        i11++;
                    }
                }
            }
            xVar = i11 > 1 ? x.f14038c : x.f14037b;
        }
        return new Pair<>(xVar, MapsKt.A(mapD));
    }

    public static final Map<String, Boolean> b() {
        return f14056a;
    }
}
