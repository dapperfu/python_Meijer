package fsimpl;

import java.util.Map;

/* renamed from: fsimpl.fg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14214fg extends AbstractC14216fi {

    /* renamed from: a, reason: collision with root package name */
    private final String f133499a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f133500b;

    public C14214fg(String str, Map map) {
        this.f133499a = str;
        this.f133500b = map;
    }

    @Override // fsimpl.InterfaceC14215fh
    public void a(gh ghVar, fH fHVar) {
        fHVar.a(a(ghVar, C14170dq.DARKEN, cQ.a(ghVar, ghVar.a("user"), ghVar.a(this.f133499a), fD.a(ghVar, this.f133500b))));
    }
}
