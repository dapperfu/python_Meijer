package gh;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class k implements InterfaceC14372h {

    /* renamed from: a, reason: collision with root package name */
    private Collection<com.google.zxing.a> f134219a;

    /* renamed from: b, reason: collision with root package name */
    private Map<com.google.zxing.d, ?> f134220b;

    /* renamed from: c, reason: collision with root package name */
    private String f134221c;

    /* renamed from: d, reason: collision with root package name */
    private int f134222d;

    public k() {
    }

    public k(Collection<com.google.zxing.a> collection, Map<com.google.zxing.d, ?> map, String str, int i10) {
        this.f134219a = collection;
        this.f134220b = map;
        this.f134221c = str;
        this.f134222d = i10;
    }

    @Override // gh.InterfaceC14372h
    public C14371g a(Map<com.google.zxing.d, ?> map) {
        EnumMap enumMap = new EnumMap(com.google.zxing.d.class);
        enumMap.putAll(map);
        Map<com.google.zxing.d, ?> map2 = this.f134220b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection<com.google.zxing.a> collection = this.f134219a;
        if (collection != null) {
            enumMap.put((EnumMap) com.google.zxing.d.POSSIBLE_FORMATS, (com.google.zxing.d) collection);
        }
        String str = this.f134221c;
        if (str != null) {
            enumMap.put((EnumMap) com.google.zxing.d.CHARACTER_SET, (com.google.zxing.d) str);
        }
        com.google.zxing.i iVar = new com.google.zxing.i();
        iVar.e(enumMap);
        int i10 = this.f134222d;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? new C14371g(iVar) : new m(iVar) : new l(iVar) : new C14371g(iVar);
    }
}
