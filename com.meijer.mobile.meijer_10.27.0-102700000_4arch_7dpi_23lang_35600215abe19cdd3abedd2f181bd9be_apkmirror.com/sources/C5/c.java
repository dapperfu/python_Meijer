package C5;

import V0.C5346q0;
import V0.C5349s0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import v5.AbstractC17511c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00132\u00020\u0001:\u0004\u000b\u000f\u0011\u0014B0\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\u0082\u0001\u0003\u0017\u0018\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"LC5/c;", "", "", "text", "LV0/q0;", "backgroundColor", "foregroundColor", "", "clickable", "<init>", "(IJJZ)V", "a", "I", "f", "()I", "b", "J", "c", "()J", "e", "d", "Z", "()Z", "LC5/c$b;", "LC5/c$c;", "LC5/c$d;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final long f3632f = C5349s0.d(4278619364L);

    /* renamed from: g, reason: collision with root package name */
    private static final long f3633g = C5349s0.d(4282928720L);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long foregroundColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean clickable;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"LC5/c$a;", "", "<init>", "()V", "Lv5/c;", "connectionState", "LC5/c;", "a", "(Lv5/c;)LC5/c;", "LV0/q0;", "activeBackgroundColor", "J", "b", "()J", "inactiveBackgroundColor", "c", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: C5.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final c a(AbstractC17511c connectionState) {
            Intrinsics.j(connectionState, "connectionState");
            if (connectionState instanceof AbstractC17511c.Disconnected) {
                if (((AbstractC17511c.Disconnected) connectionState).getError() != null) {
                    return new C0063c(0L, 0L, false, 7, null);
                }
                return new b(0L, 0L, false, 7, null);
            }
            if (connectionState instanceof AbstractC17511c.b) {
                return new d(0L, 0L, false, 7, null);
            }
            return new b(0L, 0L, false, 7, null);
        }

        public final long b() {
            return c.f3632f;
        }

        public final long c() {
            return c.f3633g;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B(\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"LC5/c$b;", "LC5/c;", "LV0/q0;", "backgroundColor", "foregroundColor", "", "clickable", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends c {
        public /* synthetic */ b(long j10, long j11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10);
        }

        public /* synthetic */ b(long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? c.INSTANCE.b() : j10, (i10 & 2) != 0 ? C5346q0.INSTANCE.k() : j11, (i10 & 4) != 0 ? true : z10, null);
        }

        private b(long j10, long j11, boolean z10) {
            super(t5.b.f161451D, j10, j11, z10, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B(\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"LC5/c$c;", "LC5/c;", "LV0/q0;", "backgroundColor", "foregroundColor", "", "clickable", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: C5.c$c, reason: collision with other inner class name */
    public static final class C0063c extends c {
        public /* synthetic */ C0063c(long j10, long j11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10);
        }

        public /* synthetic */ C0063c(long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? c.INSTANCE.b() : j10, (i10 & 2) != 0 ? C5346q0.INSTANCE.k() : j11, (i10 & 4) != 0 ? true : z10, null);
        }

        private C0063c(long j10, long j11, boolean z10) {
            super(t5.b.f161452E, j10, j11, z10, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B(\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"LC5/c$d;", "LC5/c;", "LV0/q0;", "backgroundColor", "foregroundColor", "", "clickable", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class d extends c {
        public /* synthetic */ d(long j10, long j11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10);
        }

        public /* synthetic */ d(long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? c.INSTANCE.c() : j10, (i10 & 2) != 0 ? C5346q0.INSTANCE.k() : j11, (i10 & 4) != 0 ? false : z10, null);
        }

        private d(long j10, long j11, boolean z10) {
            super(t5.b.f161453F, j10, j11, z10, null);
        }
    }

    public /* synthetic */ c(int i10, long j10, long j11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, j10, j11, z10);
    }

    private c(int i10, long j10, long j11, boolean z10) {
        this.text = i10;
        this.backgroundColor = j10;
        this.foregroundColor = j11;
        this.clickable = z10;
    }

    /* renamed from: c, reason: from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getClickable() {
        return this.clickable;
    }

    /* renamed from: e, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: f, reason: from getter */
    public final int getText() {
        return this.text;
    }
}
