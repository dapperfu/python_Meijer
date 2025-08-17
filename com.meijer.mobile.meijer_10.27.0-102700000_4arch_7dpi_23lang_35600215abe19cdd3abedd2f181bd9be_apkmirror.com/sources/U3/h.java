package U3;

import U3.r;
import a4.C5578d;
import b4.C6193a;
import c4.C6354a;
import d4.C13483a;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class h implements r.a {
    @Override // U3.r.a
    public boolean a(a3.t tVar) {
        String str = tVar.f43949o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // U3.r.a
    public int b(a3.t tVar) {
        String str = tVar.f43949o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // U3.r.a
    public r c(a3.t tVar) {
        String str = tVar.f43949o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new W3.a(tVar.f43952r);
                case "application/pgs":
                    return new X3.a();
                case "application/x-mp4-vtt":
                    return new C13483a();
                case "text/vtt":
                    return new d4.g();
                case "application/x-quicktime-tx3g":
                    return new C6193a(tVar.f43952r);
                case "text/x-ssa":
                    return new Y3.b(tVar.f43952r);
                case "application/vobsub":
                    return new C6354a(tVar.f43952r);
                case "application/x-subrip":
                    return new Z3.a();
                case "application/ttml+xml":
                    return new C5578d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
