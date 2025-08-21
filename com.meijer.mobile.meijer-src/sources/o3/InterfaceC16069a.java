package o3;

import L3.h;
import a3.t;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC16069a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC16069a f153598a = new C2377a();

    /* renamed from: o3.a$a, reason: collision with other inner class name */
    class C2377a implements InterfaceC16069a {
        @Override // o3.InterfaceC16069a
        public boolean a(t tVar) {
            String str = tVar.f44767o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // o3.InterfaceC16069a
        public G3.a b(t tVar) {
            String str = tVar.f44767o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new H3.b();
                    case "application/x-icy":
                        return new K3.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new I3.b();
                    case "application/x-scte35":
                        return new N3.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        C2377a() {
        }
    }

    boolean a(t tVar);

    G3.a b(t tVar);
}
