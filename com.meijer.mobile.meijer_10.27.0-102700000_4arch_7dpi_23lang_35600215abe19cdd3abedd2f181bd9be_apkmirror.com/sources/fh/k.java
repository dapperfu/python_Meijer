package fh;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class k implements InterfaceC13899h {

    /* renamed from: a, reason: collision with root package name */
    private Collection<com.google.zxing.a> f131120a;

    /* renamed from: b, reason: collision with root package name */
    private Map<com.google.zxing.d, ?> f131121b;

    /* renamed from: c, reason: collision with root package name */
    private String f131122c;

    /* renamed from: d, reason: collision with root package name */
    private int f131123d;

    public k() {
    }

    public k(Collection<com.google.zxing.a> collection, Map<com.google.zxing.d, ?> map, String str, int i10) {
        this.f131120a = collection;
        this.f131121b = map;
        this.f131122c = str;
        this.f131123d = i10;
    }

    @Override // fh.InterfaceC13899h
    public C13898g a(Map<com.google.zxing.d, ?> map) {
        EnumMap enumMap = new EnumMap(com.google.zxing.d.class);
        enumMap.putAll(map);
        Map<com.google.zxing.d, ?> map2 = this.f131121b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<com.google.zxing.a> collection = this.f131120a;
        if (collection != null) {
            enumMap.put((EnumMap) com.google.zxing.d.POSSIBLE_FORMATS, (com.google.zxing.d) collection);
        }
        String str = this.f131122c;
        if (str != null) {
            enumMap.put((EnumMap) com.google.zxing.d.CHARACTER_SET, (com.google.zxing.d) str);
        }
        com.google.zxing.i iVar = new com.google.zxing.i();
        iVar.e(enumMap);
        int i10 = this.f131123d;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? new C13898g(iVar) : new m(iVar) : new l(iVar) : new C13898g(iVar);
    }
}
