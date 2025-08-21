package Fv;

import Ev.AbstractC3260b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LEv/b;", "json", "LFv/v;", "reader", "", "buffer", "LFv/N;", "a", "(LEv/b;LFv/v;[C)LFv/N;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class O {
    public static final N a(AbstractC3260b json, InterfaceC3611v reader, char[] buffer) {
        Intrinsics.j(json, "json");
        Intrinsics.j(reader, "reader");
        Intrinsics.j(buffer, "buffer");
        return !json.getConfiguration().getAllowComments() ? new N(reader, buffer) : new P(reader, buffer);
    }

    public static /* synthetic */ N b(AbstractC3260b abstractC3260b, InterfaceC3611v interfaceC3611v, char[] cArr, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cArr = C3598h.f11046c.d();
        }
        return a(abstractC3260b, interfaceC3611v, cArr);
    }
}
