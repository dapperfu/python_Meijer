package fsimpl;

import java.util.Map;

/* renamed from: fsimpl.fg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14089fg extends AbstractC14091fi {

    /* renamed from: a, reason: collision with root package name */
    private final String f132249a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f132250b;

    public C14089fg(String str, Map map) {
        this.f132249a = str;
        this.f132250b = map;
    }

    @Override // fsimpl.InterfaceC14090fh
    public void a(gh ghVar, fH fHVar) {
        fHVar.a(a(ghVar, C14045dq.DARKEN, cQ.a(ghVar, ghVar.a("user"), ghVar.a(this.f132249a), fD.a(ghVar, this.f132250b))));
    }
}
