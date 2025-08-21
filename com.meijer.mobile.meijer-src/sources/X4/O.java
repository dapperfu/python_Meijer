package X4;

import O4.AbstractC4373v;
import O4.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o2.InterfaceC16068a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lo2/a;", "LO4/Q;", "info", "", "tag", "", "a", "(Lo2/a;LO4/Q;Ljava/lang/String;)V", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class O {
    public static final void a(InterfaceC16068a<Q> interfaceC16068a, Q info, String tag) {
        Intrinsics.j(interfaceC16068a, "<this>");
        Intrinsics.j(info, "info");
        Intrinsics.j(tag, "tag");
        try {
            interfaceC16068a.accept(info);
        } catch (Throwable th2) {
            AbstractC4373v.e().d(tag, "Exception handler threw an exception", th2);
        }
    }
}
