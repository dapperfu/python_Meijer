package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes13.dex */
public class ExtensionRegistryLite {

    /* renamed from: b, reason: collision with root package name */
    private static final ExtensionRegistryLite f145844b = new ExtensionRegistryLite(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<a, GeneratedMessageLite.GeneratedExtension<?, ?>> f145845a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f145846a;

        /* renamed from: b, reason: collision with root package name */
        private final int f145847b;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f145846a == aVar.f145846a && this.f145847b == aVar.f145847b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f145846a) * 65535) + this.f145847b;
        }

        a(Object obj, int i10) {
            this.f145846a = obj;
            this.f145847b = i10;
        }
    }

    ExtensionRegistryLite() {
        this.f145845a = new HashMap();
    }

    public static ExtensionRegistryLite c() {
        return f145844b;
    }

    public static ExtensionRegistryLite d() {
        return new ExtensionRegistryLite();
    }

    public final void a(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.f145845a.put(new a(generatedExtension.b(), generatedExtension.d()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> b(ContainingType containingtype, int i10) {
        return (GeneratedMessageLite.GeneratedExtension) this.f145845a.get(new a(containingtype, i10));
    }

    private ExtensionRegistryLite(boolean z10) {
        this.f145845a = Collections.EMPTY_MAP;
    }
}
