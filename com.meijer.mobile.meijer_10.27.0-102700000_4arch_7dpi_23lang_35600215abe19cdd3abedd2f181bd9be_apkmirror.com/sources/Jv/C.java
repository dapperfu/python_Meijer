package Jv;

import Fv.m;
import Fv.n;
import Iv.AbstractC3761b;
import Jv.C3937u;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.JsonException;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0013\",\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001e0\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006!"}, d2 = {"LFv/f;", "LIv/b;", "json", "", "", "", "b", "(LFv/f;LIv/b;)Ljava/util/Map;", "descriptor", "e", "(LIv/b;LFv/f;)Ljava/util/Map;", "index", "h", "(LFv/f;LIv/b;I)Ljava/lang/String;", "LIv/y;", "k", "(LFv/f;LIv/b;)LIv/y;", "name", "j", "(LFv/f;LIv/b;Ljava/lang/String;)I", "", "d", "(LIv/b;LFv/f;)Z", "i", "LJv/u$a;", "a", "LJv/u$a;", "g", "()LJv/u$a;", "JsonDeserializationNamesKey", "", "getJsonSerializationNamesKey", "JsonSerializationNamesKey", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private static final C3937u.a<Map<String, Integer>> f16163a = new C3937u.a<>();

    /* renamed from: b, reason: collision with root package name */
    private static final C3937u.a<String[]> f16164b = new C3937u.a<>();

    private static final Map<String, Integer> b(Fv.f fVar, AbstractC3761b abstractC3761b) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zD = d(abstractC3761b, fVar);
        k(fVar, abstractC3761b);
        int elementsCount = fVar.getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            List<Annotation> listK = fVar.k(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listK) {
                if (obj instanceof Iv.x) {
                    arrayList.add(obj);
                }
            }
            Iv.x xVar = (Iv.x) CollectionsKt.W0(arrayList);
            if (xVar != null && (strArrNames = xVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zD) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        Intrinsics.i(lowerCase2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, lowerCase2, i10);
                }
            }
            if (zD) {
                lowerCase = fVar.j(i10).toLowerCase(Locale.ROOT);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                c(linkedHashMap, fVar, lowerCase, i10);
            }
        }
        return linkedHashMap.isEmpty() ? MapsKt.k() : linkedHashMap;
    }

    public static final Map<String, Integer> e(final AbstractC3761b abstractC3761b, final Fv.f descriptor) {
        Intrinsics.j(abstractC3761b, "<this>");
        Intrinsics.j(descriptor, "descriptor");
        return (Map) Iv.G.a(abstractC3761b).b(descriptor, f16163a, new Function0() { // from class: Jv.B
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C.f(descriptor, abstractC3761b);
            }
        });
    }

    public static final C3937u.a<Map<String, Integer>> g() {
        return f16163a;
    }

    public static final String h(Fv.f fVar, AbstractC3761b json, int i10) {
        Intrinsics.j(fVar, "<this>");
        Intrinsics.j(json, "json");
        k(fVar, json);
        return fVar.j(i10);
    }

    public static final int i(Fv.f fVar, AbstractC3761b json, String name) {
        Intrinsics.j(fVar, "<this>");
        Intrinsics.j(json, "json");
        Intrinsics.j(name, "name");
        if (d(json, fVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            return j(fVar, json, lowerCase);
        }
        k(fVar, json);
        int iH = fVar.h(name);
        return (iH == -3 && json.getConfiguration().getUseAlternativeNames()) ? j(fVar, json, name) : iH;
    }

    public static final Iv.y k(Fv.f fVar, AbstractC3761b json) {
        Intrinsics.j(fVar, "<this>");
        Intrinsics.j(json, "json");
        if (Intrinsics.e(fVar.getKind(), n.a.f11133a)) {
            json.getConfiguration().l();
        }
        return null;
    }

    private static final void c(Map<String, Integer> map, Fv.f fVar, String str, int i10) {
        String str2;
        if (Intrinsics.e(fVar.getKind(), m.b.f11132a)) {
            str2 = "enum value";
        } else {
            str2 = "property";
        }
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + fVar.j(i10) + " is already one of the names for " + str2 + ' ' + fVar.j(((Number) MapsKt.l(map, str)).intValue()) + " in " + fVar);
    }

    private static final boolean d(AbstractC3761b abstractC3761b, Fv.f fVar) {
        if (abstractC3761b.getConfiguration().getDecodeEnumsCaseInsensitive() && Intrinsics.e(fVar.getKind(), m.b.f11132a)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f(Fv.f fVar, AbstractC3761b abstractC3761b) {
        return b(fVar, abstractC3761b);
    }

    private static final int j(Fv.f fVar, AbstractC3761b abstractC3761b, String str) {
        Integer num = e(abstractC3761b, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }
}
