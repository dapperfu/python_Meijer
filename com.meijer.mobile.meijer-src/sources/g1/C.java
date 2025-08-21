package g1;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Lg1/C;", "", "<init>", "()V", "Lg1/D;", "pointerInputEvent", "Lg1/P;", "positionCalculator", "Lg1/g;", "b", "(Lg1/D;Lg1/P;)Lg1/g;", "", "a", "LZ/C;", "Lg1/C$a;", "LZ/C;", "previousPointerInputData", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class C {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Z.C<a> previousPointerInputData = new Z.C<>(0, 1, null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lg1/C$a;", "", "", "uptime", "LU0/f;", "positionOnScreen", "", "down", "<init>", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "J", "c", "()J", "b", "Z", "()Z", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long uptime;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long positionOnScreen;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean down;

        public /* synthetic */ a(long j10, long j11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10);
        }

        private a(long j10, long j11, boolean z10) {
            this.uptime = j10;
            this.positionOnScreen = j11;
            this.down = z10;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: b, reason: from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        /* renamed from: c, reason: from getter */
        public final long getUptime() {
            return this.uptime;
        }
    }

    public final void a() {
        this.previousPointerInputData.a();
    }

    public final C14304g b(D pointerInputEvent, P positionCalculator) {
        long uptime;
        boolean down;
        long jQ;
        Z.C c10 = new Z.C(pointerInputEvent.b().size());
        List<PointerInputEventData> listB = pointerInputEvent.b();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputEventData pointerInputEventData = listB.get(i10);
            a aVarD = this.previousPointerInputData.d(pointerInputEventData.getId());
            if (aVarD == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                jQ = pointerInputEventData.getPosition();
            } else {
                uptime = aVarD.getUptime();
                down = aVarD.getDown();
                jQ = positionCalculator.q(aVarD.getPositionOnScreen());
            }
            c10.i(pointerInputEventData.getId(), new PointerInputChange(pointerInputEventData.getId(), pointerInputEventData.getUptime(), pointerInputEventData.getPosition(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jQ, down, false, pointerInputEventData.getType(), pointerInputEventData.c(), pointerInputEventData.getScrollDelta(), pointerInputEventData.getOriginalEventPosition(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.i(pointerInputEventData.getId(), new a(pointerInputEventData.getUptime(), pointerInputEventData.getPositionOnScreen(), pointerInputEventData.getDown(), null));
            } else {
                this.previousPointerInputData.k(pointerInputEventData.getId());
            }
        }
        return new C14304g(c10, pointerInputEvent);
    }
}
