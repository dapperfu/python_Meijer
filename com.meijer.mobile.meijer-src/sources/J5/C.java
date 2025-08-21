package J5;

import com.adobe.marketing.mobile.AbstractC6578l;
import com.adobe.marketing.mobile.AbstractC6579m;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\b\u001a%\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\b\"\u001a\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001a\u0010\u000f\u001a\u0004\u0018\u00010\n*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\"\u001a\u0010\u0011\u001a\u0004\u0018\u00010\n*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f\"&\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"(\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\n0\n*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Ljava/lang/Class;", "Lcom/adobe/marketing/mobile/l;", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "f", "(Ljava/lang/Class;Lcom/adobe/marketing/mobile/m;)Lcom/adobe/marketing/mobile/l;", "", "h", "(Lcom/adobe/marketing/mobile/l;)V", "g", "", "c", "(Lcom/adobe/marketing/mobile/l;)Ljava/lang/String;", "extensionName", "e", "extensionVersion", "a", "extensionFriendlyName", "", "b", "(Lcom/adobe/marketing/mobile/l;)Ljava/util/Map;", "extensionMetadata", "kotlin.jvm.PlatformType", "d", "(Ljava/lang/Class;)Ljava/lang/String;", "extensionTypeName", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class C {
    public static final String a(AbstractC6578l abstractC6578l) {
        Intrinsics.j(abstractC6578l, "<this>");
        return com.adobe.marketing.mobile.p.a(abstractC6578l);
    }

    public static final Map<String, String> b(AbstractC6578l abstractC6578l) {
        Intrinsics.j(abstractC6578l, "<this>");
        return com.adobe.marketing.mobile.p.b(abstractC6578l);
    }

    public static final String c(AbstractC6578l abstractC6578l) {
        Intrinsics.j(abstractC6578l, "<this>");
        return com.adobe.marketing.mobile.p.c(abstractC6578l);
    }

    public static final String d(Class<? extends AbstractC6578l> cls) {
        Intrinsics.j(cls, "<this>");
        return cls.getName();
    }

    public static final String e(AbstractC6578l abstractC6578l) {
        Intrinsics.j(abstractC6578l, "<this>");
        return com.adobe.marketing.mobile.p.d(abstractC6578l);
    }

    public static final AbstractC6578l f(Class<? extends AbstractC6578l> cls, AbstractC6579m extensionApi) throws NoSuchMethodException, SecurityException {
        Intrinsics.j(cls, "<this>");
        Intrinsics.j(extensionApi, "extensionApi");
        try {
            Constructor<? extends AbstractC6578l> declaredConstructor = cls.getDeclaredConstructor(AbstractC6579m.class);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(extensionApi);
        } catch (Exception e10) {
            R5.t.a("MobileCore", "ExtensionExt", "Initializing Extension " + cls + " failed with " + e10, new Object[0]);
            return null;
        }
    }

    public static final void g(AbstractC6578l abstractC6578l) {
        Intrinsics.j(abstractC6578l, "<this>");
        com.adobe.marketing.mobile.p.e(abstractC6578l);
    }

    public static final void h(AbstractC6578l abstractC6578l) {
        Intrinsics.j(abstractC6578l, "<this>");
        com.adobe.marketing.mobile.p.f(abstractC6578l);
    }
}
