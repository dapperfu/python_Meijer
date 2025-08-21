package m8;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lm8/h;", "", "", "maxSubscribers", "", "Lm8/i;", "subscribers", "<init>", "(ILjava/util/Set;)V", "", "", "a", "()Ljava/util/Map;", "", "is3rdGenEnabled", "", "b", "(Ljava/lang/Boolean;)V", "I", "Ljava/util/Set;", "c", "Ljava/lang/Boolean;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m8.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15693h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxSubscribers;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<InterfaceC15694i> subscribers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Boolean is3rdGenEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public C15693h() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public C15693h(int i10, Set<InterfaceC15694i> subscribers) {
        Intrinsics.j(subscribers, "subscribers");
        this.maxSubscribers = i10;
        this.subscribers = subscribers;
    }

    private final Map<String, Object> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.is3rdGenEnabled;
        if (bool != null) {
            linkedHashMap.put("3rd_gen_enabled", bool);
        }
        return MapsKt.A(linkedHashMap);
    }

    public final void b(Boolean is3rdGenEnabled) {
        this.is3rdGenEnabled = is3rdGenEnabled;
        Map<String, ? extends Object> mapA = a();
        Iterator<InterfaceC15694i> it = this.subscribers.iterator();
        while (it.hasNext()) {
            it.next().a(mapA);
        }
    }

    public /* synthetic */ C15693h(int i10, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10, (i11 & 2) != 0 ? new LinkedHashSet() : set);
    }
}
