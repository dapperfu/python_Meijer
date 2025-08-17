package S6;

import S6.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final i.f<Map<String, Object>> f33454a = new a();

    /* renamed from: b, reason: collision with root package name */
    static final i.f<LinkedHashMap> f33455b = new b();

    class a implements i.f<Map<String, Object>> {
        a() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map<String, Object> a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return m.b(iVar);
        }
    }

    class b implements i.f<LinkedHashMap> {
        b() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LinkedHashMap a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return m.b(iVar);
        }
    }

    public static ArrayList<Object> a(i iVar) throws IOException {
        byte bJ;
        if (iVar.n() == 91) {
            if (iVar.j() == 93) {
                return new ArrayList<>(0);
            }
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(c(iVar));
            while (true) {
                bJ = iVar.j();
                if (bJ != 44) {
                    break;
                }
                iVar.j();
                arrayList.add(c(iVar));
            }
            if (bJ == 93) {
                return arrayList;
            }
            throw iVar.p("Expecting ']' for list end");
        }
        throw iVar.p("Expecting '[' for list start");
    }

    public static LinkedHashMap<String, Object> b(i iVar) throws IOException {
        byte bJ;
        if (iVar.n() == 123) {
            if (iVar.j() == 125) {
                return new LinkedHashMap<>(0);
            }
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(iVar.F(), c(iVar));
            while (true) {
                bJ = iVar.j();
                if (bJ != 44) {
                    break;
                }
                iVar.j();
                linkedHashMap.put(iVar.F(), c(iVar));
            }
            if (bJ == 125) {
                return linkedHashMap;
            }
            throw iVar.p("Expecting '}' for map end");
        }
        throw iVar.p("Expecting '{' for map start");
    }

    public static Object c(i iVar) throws IOException {
        byte bN = iVar.n();
        if (bN != 34) {
            if (bN != 91) {
                if (bN != 102) {
                    if (bN != 110) {
                        if (bN != 116) {
                            if (bN != 123) {
                                return l.l(iVar);
                            }
                            return b(iVar);
                        }
                        if (iVar.N()) {
                            return Boolean.TRUE;
                        }
                        throw iVar.r("Expecting 'true' for true constant", 0);
                    }
                    if (iVar.M()) {
                        return null;
                    }
                    throw iVar.r("Expecting 'null' for null constant", 0);
                }
                if (iVar.L()) {
                    return Boolean.FALSE;
                }
                throw iVar.r("Expecting 'false' for false constant", 0);
            }
            return a(iVar);
        }
        return iVar.I();
    }
}
