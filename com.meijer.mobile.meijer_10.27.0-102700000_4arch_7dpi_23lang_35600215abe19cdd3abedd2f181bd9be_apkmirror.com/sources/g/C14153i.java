package g;

import g.C14152h;
import h.C14317d;
import h.C14319f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh/f$f;", "mediaType", "", "maxItems", "", "isOrderedSelection", "Lh/f$b;", "defaultTab", "Lg/h;", "a", "(Lh/f$f;IZLh/f$b;)Lg/h;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: g.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14153i {
    public static final C14152h a(C14319f.InterfaceC2119f mediaType, int i10, boolean z10, C14319f.b defaultTab) {
        Intrinsics.j(mediaType, "mediaType");
        Intrinsics.j(defaultTab, "defaultTab");
        return new C14152h.a().d(mediaType).c(i10).e(z10).b(defaultTab).a();
    }

    public static /* synthetic */ C14152h b(C14319f.InterfaceC2119f interfaceC2119f, int i10, boolean z10, C14319f.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC2119f = C14319f.c.f134141a;
        }
        if ((i11 & 2) != 0) {
            i10 = C14317d.INSTANCE.a();
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        if ((i11 & 8) != 0) {
            bVar = C14319f.b.a.f134139a;
        }
        return a(interfaceC2119f, i10, z10, bVar);
    }
}
