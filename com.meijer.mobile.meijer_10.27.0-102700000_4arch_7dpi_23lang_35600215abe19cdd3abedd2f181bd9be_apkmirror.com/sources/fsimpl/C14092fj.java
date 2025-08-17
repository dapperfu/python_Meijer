package fsimpl;

import java.util.Map;
import java.util.UUID;

/* renamed from: fsimpl.fj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14092fj extends AbstractC14091fi {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC14095fm f132251a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f132252b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f132253c;

    /* renamed from: d, reason: collision with root package name */
    private final UUID f132254d;

    public C14092fj(EnumC14095fm enumC14095fm, Map map) {
        this(enumC14095fm, map, false, null);
    }

    public C14092fj(EnumC14095fm enumC14095fm, Map map, boolean z10, UUID uuid) {
        this.f132251a = enumC14095fm;
        this.f132252b = map;
        this.f132253c = z10;
        this.f132254d = uuid;
    }

    @Override // fsimpl.InterfaceC14090fh
    public void a(gh ghVar, fH fHVar) {
        Map map = this.f132252b;
        if (map == null || map.isEmpty()) {
            return;
        }
        int iA = ghVar.a(this.f132251a.f132267c);
        int iA2 = fD.a(ghVar, this.f132252b);
        UUID uuid = this.f132254d;
        fHVar.a(a(ghVar, C14045dq.LIGHTEN, cR.a(ghVar, iA, iA2, this.f132253c, uuid != null ? ghVar.a(uuid.toString()) : 0)));
    }
}
