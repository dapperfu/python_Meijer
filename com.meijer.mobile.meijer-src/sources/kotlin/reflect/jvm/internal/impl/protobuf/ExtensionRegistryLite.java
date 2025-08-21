package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes14.dex */
public class ExtensionRegistryLite {

    /* renamed from: b, reason: collision with root package name */
    private static final ExtensionRegistryLite f146751b = new ExtensionRegistryLite(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, GeneratedMessageLite.GeneratedExtension<?, ?>> f146752a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f146753a;

        /* renamed from: b, reason: collision with root package name */
        private final int f146754b;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f146753a == aVar.f146753a && this.f146754b == aVar.f146754b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f146753a) * 65535) + this.f146754b;
        }

        a(Object obj, int i10) {
            this.f146753a = obj;
            this.f146754b = i10;
        }
    }

    ExtensionRegistryLite() {
        this.f146752a = new HashMap();
    }

    public static ExtensionRegistryLite c() {
        return f146751b;
    }

    public static ExtensionRegistryLite d() {
        return new ExtensionRegistryLite();
    }

    public final void a(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f146752a.put(new a(generatedExtension.b(), generatedExtension.d()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> b(ContainingType containingtype, int i10) {
        return (GeneratedMessageLite.GeneratedExtension) this.f146752a.get(new a(containingtype, i10));
    }

    private ExtensionRegistryLite(boolean z10) {
        this.f146752a = Collections.EMPTY_MAP;
    }
}
