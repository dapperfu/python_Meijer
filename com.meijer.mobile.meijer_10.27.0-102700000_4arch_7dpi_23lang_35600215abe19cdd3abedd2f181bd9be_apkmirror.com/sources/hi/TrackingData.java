package hi;

import hi.AbstractC14482i;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00014B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0019\u0010\u0011J\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0011J\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050#¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b'\u0010(J*\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\n0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010=R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050#8F¢\u0006\u0006\u001a\u0004\b?\u0010;R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0A8G¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lhi/f;", "", "Lhi/h;", "event", "", "Lhi/i;", "contextData", "<init>", "(Lhi/h;Ljava/util/List;)V", "", "Lhi/f$a;", "targets", "m", "([Lhi/f$a;)Lhi/f;", "", "name", "v", "(Ljava/lang/String;)Lhi/f;", "Lhi/i$e;", "section", "u", "(Lhi/i$e;)Lhi/f;", "o", "n", "actionName", "p", "key", "value", "h", "(Ljava/lang/String;Ljava/lang/String;)Lhi/f;", "s", "q", "item", "c", "(Lhi/i;)Lhi/f;", "", "items", "d", "(Ljava/util/List;)Lhi/f;", "e", "([Lhi/i;)Lhi/f;", "f", "(Lhi/h;Ljava/util/List;)Lhi/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhi/h;", "j", "()Lhi/h;", "b", "Ljava/util/List;", "i", "()Ljava/util/List;", "", "Ljava/util/Set;", "_targets", "k", "extras", "", "l", "()Ljava/util/Set;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hi.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class TrackingData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC14481h event;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AbstractC14482i> contextData;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<a> _targets;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lhi/f$a;", "", "<init>", "()V", "a", "b", "Lhi/f$a$a;", "Lhi/f$a$b;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hi.f$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhi/f$a$a;", "Lhi/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hi.f$a$a, reason: collision with other inner class name */
        public static final /* data */ class C2127a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C2127a f135064a = new C2127a();

            private C2127a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C2127a);
            }

            public String toString() {
                return "Adobe";
            }

            public int hashCode() {
                return -636921434;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhi/f$a$b;", "Lhi/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hi.f$a$b */
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f135065a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public String toString() {
                return "FullStory";
            }

            public int hashCode() {
                return -642202659;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @JvmOverloads
    public TrackingData(AbstractC14481h event, List<AbstractC14482i> contextData) {
        Intrinsics.j(event, "event");
        Intrinsics.j(contextData, "contextData");
        this.event = event;
        this.contextData = contextData;
        this._targets = SetsKt.g(a.C2127a.f135064a);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingData)) {
            return false;
        }
        TrackingData trackingData = (TrackingData) other;
        return Intrinsics.e(this.event, trackingData.event) && Intrinsics.e(this.contextData, trackingData.contextData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackingData g(TrackingData trackingData, AbstractC14481h abstractC14481h, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC14481h = trackingData.event;
        }
        if ((i10 & 2) != 0) {
            list = trackingData.contextData;
        }
        return trackingData.f(abstractC14481h, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(String str, AbstractC14482i it) {
        Intrinsics.j(it, "it");
        return Intrinsics.e(it.getKey(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(String str, AbstractC14482i it) {
        Intrinsics.j(it, "it");
        return Intrinsics.e(it.getKey(), str);
    }

    public final TrackingData c(AbstractC14482i item) {
        if (item != null) {
            this.contextData.add(item);
        }
        return this;
    }

    public final TrackingData d(List<? extends AbstractC14482i> items) {
        Intrinsics.j(items, "items");
        this.contextData.addAll(items);
        return this;
    }

    public final TrackingData e(AbstractC14482i[] items) {
        Intrinsics.j(items, "items");
        return d(ArraysKt.i1(items));
    }

    public final TrackingData f(AbstractC14481h event, List<AbstractC14482i> contextData) {
        Intrinsics.j(event, "event");
        Intrinsics.j(contextData, "contextData");
        return new TrackingData(event, contextData);
    }

    public final TrackingData h(String key, String value) {
        Intrinsics.j(key, "key");
        this.contextData.add(C14476c.b(key, value));
        return this;
    }

    public int hashCode() {
        return (this.event.hashCode() * 31) + this.contextData.hashCode();
    }

    public final List<AbstractC14482i> i() {
        return this.contextData;
    }

    /* renamed from: j, reason: from getter */
    public final AbstractC14481h getEvent() {
        return this.event;
    }

    public final List<AbstractC14482i> k() {
        return CollectionsKt.j1(this.contextData);
    }

    public final Set<a> l() {
        return CollectionsKt.o1(this._targets);
    }

    public final TrackingData m(a... targets) {
        Intrinsics.j(targets, "targets");
        this._targets.addAll(ArraysKt.u1(targets));
        return this;
    }

    public final TrackingData n(String name) {
        this.contextData.add(C14476c.c(name));
        return this;
    }

    public final TrackingData o(String name) {
        this.contextData.add(C14476c.d(name));
        return this;
    }

    public final TrackingData q(final String key) {
        Intrinsics.j(key, "key");
        CollectionsKt.J(this.contextData, new Function1() { // from class: hi.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TrackingData.r(key, (AbstractC14482i) obj));
            }
        });
        return this;
    }

    public final TrackingData s(final String key, String value) {
        Intrinsics.j(key, "key");
        CollectionsKt.J(this.contextData, new Function1() { // from class: hi.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TrackingData.t(key, (AbstractC14482i) obj));
            }
        });
        this.contextData.add(C14476c.b(key, value));
        return this;
    }

    public String toString() {
        return "TrackingData(event=" + this.event + ", contextData=" + this.contextData + ')';
    }

    public final TrackingData u(AbstractC14482i.Section section) {
        if (section != null) {
            this.contextData.add(section);
        }
        return this;
    }

    public final TrackingData v(String name) {
        this.contextData.add(C14476c.g(name));
        return this;
    }

    public final TrackingData p(String actionName) {
        c(C14476c.e(actionName));
        return this;
    }

    public /* synthetic */ TrackingData(AbstractC14481h abstractC14481h, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC14481h, (i10 & 2) != 0 ? new ArrayList() : list);
    }
}
