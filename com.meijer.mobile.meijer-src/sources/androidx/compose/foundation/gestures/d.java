package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/d;", "", "<init>", "()V", "a", "b", "c", "d", "Landroidx/compose/foundation/gestures/d$a;", "Landroidx/compose/foundation/gestures/d$b;", "Landroidx/compose/foundation/gestures/d$c;", "Landroidx/compose/foundation/gestures/d$d;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/d$a;", "Landroidx/compose/foundation/gestures/d;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f48446a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/d$b;", "Landroidx/compose/foundation/gestures/d;", "LU0/f;", "delta", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long delta;

        public /* synthetic */ b(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        private b(long j10) {
            super(null);
            this.delta = j10;
        }

        /* renamed from: a, reason: from getter */
        public final long getDelta() {
            return this.delta;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/d$c;", "Landroidx/compose/foundation/gestures/d;", "LU0/f;", "startPoint", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long startPoint;

        public /* synthetic */ c(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        private c(long j10) {
            super(null);
            this.startPoint = j10;
        }

        /* renamed from: a, reason: from getter */
        public final long getStartPoint() {
            return this.startPoint;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/d$d;", "Landroidx/compose/foundation/gestures/d;", "LH1/y;", "velocity", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "()J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.d$d, reason: collision with other inner class name */
    public static final class C1002d extends d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long velocity;

        public /* synthetic */ C1002d(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        private C1002d(long j10) {
            super(null);
            this.velocity = j10;
        }

        /* renamed from: a, reason: from getter */
        public final long getVelocity() {
            return this.velocity;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
