package e6;

import com.adobe.marketing.mobile.C6449h;
import f6.C13845a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\b\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0006*\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/adobe/marketing/mobile/h;", "", "g", "(Lcom/adobe/marketing/mobile/h;)Z", "f", "e", "", "c", "(Lcom/adobe/marketing/mobile/h;)Ljava/lang/String;", "i", "h", "k", "", "j", "(Lcom/adobe/marketing/mobile/h;)I", "", "", "a", "(Lcom/adobe/marketing/mobile/h;)Ljava/util/Map;", "d", "b", "signal_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: e6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13625a {
    public static final /* synthetic */ String c(C6449h c6449h) {
        Intrinsics.j(c6449h, "<this>");
        String strO = C13845a.o(d(c6449h), "contenttype", "");
        Intrinsics.i(strO, "optString(\n        this.…NT_TYPE,\n        \"\"\n    )");
        return strO;
    }

    public static final /* synthetic */ boolean e(C6449h c6449h) {
        Intrinsics.j(c6449h, "<this>");
        return Intrinsics.e(b(c6449h), "pii");
    }

    public static final /* synthetic */ boolean f(C6449h c6449h) {
        Intrinsics.j(c6449h, "<this>");
        return Intrinsics.e(b(c6449h), "url");
    }

    public static final /* synthetic */ boolean g(C6449h c6449h) {
        Intrinsics.j(c6449h, "<this>");
        return Intrinsics.e(b(c6449h), "pb");
    }

    public static final /* synthetic */ String h(C6449h c6449h) {
        Intrinsics.j(c6449h, "<this>");
        return C13845a.o(d(c6449h), "templatebody", null);
    }

    public static final /* synthetic */ String i(C6449h c6449h) {
        Intrinsics.j(c6449h, "<this>");
        return C13845a.o(d(c6449h), "templateurl", null);
    }

    public static final /* synthetic */ int j(C6449h c6449h) {
        Intrinsics.j(c6449h, "<this>");
        return C13845a.m(d(c6449h), "timeout", 0);
    }

    public static final /* synthetic */ String k(C6449h c6449h) {
        Intrinsics.j(c6449h, "<this>");
        return C13845a.o(d(c6449h), "url", null);
    }

    private static final Map<String, Object> a(C6449h c6449h) {
        if (c6449h.o() == null) {
            return null;
        }
        return C13845a.t(Object.class, c6449h.o(), "triggeredconsequence", null);
    }

    private static final String b(C6449h c6449h) {
        return C13845a.o(a(c6449h), "type", null);
    }

    private static final Map<String, Object> d(C6449h c6449h) {
        return C13845a.t(Object.class, a(c6449h), "detail", null);
    }
}
