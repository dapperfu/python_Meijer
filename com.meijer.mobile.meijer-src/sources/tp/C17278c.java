package tp;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Ltp/c;", "", "<init>", "()V", "", "key", "Ltp/c$a;", "listener", "", "a", "(Ljava/lang/String;Ltp/c$a;)V", "c", "(Ljava/lang/String;)V", "Ltp/b;", "builder", "Ltp/a;", "flowType", "b", "(Ltp/b;Ltp/a;)V", "", "Ljava/util/Map;", "listeners", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: tp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17278c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Map<String, a> listeners = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Ltp/c$a;", "", "Ltp/b;", "builder", "Ltp/a;", "flowType", "", "onUpdateRateAndTip", "(Ltp/b;Ltp/a;)V", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tp.c$a */
    public interface a {
        void onUpdateRateAndTip(Builder builder, EnumC17276a flowType);
    }

    public final void a(String key, a listener) {
        Intrinsics.j(key, "key");
        Intrinsics.j(listener, "listener");
        this.listeners.put(key, listener);
    }

    public final void b(Builder builder, EnumC17276a flowType) {
        Intrinsics.j(builder, "builder");
        Intrinsics.j(flowType, "flowType");
        for (a aVar : this.listeners.values()) {
            if (aVar != null) {
                aVar.onUpdateRateAndTip(builder, flowType);
            }
        }
    }

    public final void c(String key) {
        Intrinsics.j(key, "key");
        this.listeners.put(key, null);
    }
}
