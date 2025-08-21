package fsimpl;

import java.util.Map;
import java.util.UUID;

/* renamed from: fsimpl.fj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14217fj extends AbstractC14216fi {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC14220fm f133501a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f133502b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f133503c;

    /* renamed from: d, reason: collision with root package name */
    private final UUID f133504d;

    public C14217fj(EnumC14220fm enumC14220fm, Map map) {
        this(enumC14220fm, map, false, null);
    }

    public C14217fj(EnumC14220fm enumC14220fm, Map map, boolean z10, UUID uuid) {
        this.f133501a = enumC14220fm;
        this.f133502b = map;
        this.f133503c = z10;
        this.f133504d = uuid;
    }

    @Override // fsimpl.InterfaceC14215fh
    public void a(gh ghVar, fH fHVar) {
        Map map = this.f133502b;
        if (map == null || map.isEmpty()) {
            return;
        }
        int iA = ghVar.a(this.f133501a.f133517c);
        int iA2 = fD.a(ghVar, this.f133502b);
        UUID uuid = this.f133504d;
        fHVar.a(a(ghVar, C14170dq.LIGHTEN, cR.a(ghVar, iA, iA2, this.f133503c, uuid != null ? ghVar.a(uuid.toString()) : 0)));
    }
}
