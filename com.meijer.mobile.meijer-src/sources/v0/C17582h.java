package v0;

import U0.f;
import androidx.compose.foundation.text.P;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.C17774M;
import kotlin.C17809y;
import kotlin.InterfaceC17771J;
import kotlin.InterfaceC17793i;
import kotlin.InterfaceC17806v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw0/J;", "", "selectableId", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/Modifier;", "b", "(Lw0/J;JLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: v0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17582h {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bR(\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0006R(\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"v0/h$a", "Landroidx/compose/foundation/text/P;", "LU0/f;", "point", "", "a", "(J)V", "c", "()V", "startPoint", "b", "delta", "d", "onStop", "onCancel", "J", "getLastPosition", "()J", "setLastPosition", "lastPosition", "getDragTotalDistance", "setDragTotalDistance", "dragTotalDistance", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v0.h$a */
    public static final class a implements P {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long dragTotalDistance;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<LayoutCoordinates> f165324c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC17771J f165325d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f165326e;

        @Override // androidx.compose.foundation.text.P
        public void a(long point) {
        }

        @Override // androidx.compose.foundation.text.P
        public void c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends LayoutCoordinates> function0, InterfaceC17771J interfaceC17771J, long j10) {
            this.f165324c = function0;
            this.f165325d = interfaceC17771J;
            this.f165326e = j10;
            f.Companion companion = U0.f.INSTANCE;
            this.lastPosition = companion.c();
            this.dragTotalDistance = companion.c();
        }

        @Override // androidx.compose.foundation.text.P
        public void b(long startPoint) {
            LayoutCoordinates layoutCoordinatesInvoke = this.f165324c.invoke();
            if (layoutCoordinatesInvoke != null) {
                InterfaceC17771J interfaceC17771J = this.f165325d;
                if (!layoutCoordinatesInvoke.isAttached()) {
                    return;
                }
                interfaceC17771J.c(layoutCoordinatesInvoke, startPoint, InterfaceC17806v.INSTANCE.n(), true);
                this.lastPosition = startPoint;
            }
            if (C17774M.b(this.f165325d, this.f165326e)) {
                this.dragTotalDistance = U0.f.INSTANCE.c();
            }
        }

        @Override // androidx.compose.foundation.text.P
        public void d(long delta) {
            LayoutCoordinates layoutCoordinatesInvoke = this.f165324c.invoke();
            if (layoutCoordinatesInvoke != null) {
                InterfaceC17771J interfaceC17771J = this.f165325d;
                long j10 = this.f165326e;
                if (layoutCoordinatesInvoke.isAttached() && C17774M.b(interfaceC17771J, j10)) {
                    long jQ = U0.f.q(this.dragTotalDistance, delta);
                    this.dragTotalDistance = jQ;
                    long jQ2 = U0.f.q(this.lastPosition, jQ);
                    if (interfaceC17771J.h(layoutCoordinatesInvoke, jQ2, this.lastPosition, false, InterfaceC17806v.INSTANCE.n(), true)) {
                        this.lastPosition = jQ2;
                        this.dragTotalDistance = U0.f.INSTANCE.c();
                    }
                }
            }
        }

        @Override // androidx.compose.foundation.text.P
        public void onCancel() {
            if (C17774M.b(this.f165325d, this.f165326e)) {
                this.f165325d.i();
            }
        }

        @Override // androidx.compose.foundation.text.P
        public void onStop() {
            if (C17774M.b(this.f165325d, this.f165326e)) {
                this.f165325d.i();
            }
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"v0/h$b", "Lw0/i;", "LU0/f;", "downPosition", "", "e", "(J)Z", "dragPosition", "d", "Lw0/v;", "adjustment", "c", "(JLw0/v;)Z", "a", "", "b", "()V", "J", "getLastPosition", "()J", "setLastPosition", "(J)V", "lastPosition", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: v0.h$b */
    public static final class b implements InterfaceC17793i {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long lastPosition = U0.f.INSTANCE.c();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<LayoutCoordinates> f165328b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC17771J f165329c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f165330d;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<? extends LayoutCoordinates> function0, InterfaceC17771J interfaceC17771J, long j10) {
            this.f165328b = function0;
            this.f165329c = interfaceC17771J;
            this.f165330d = j10;
        }

        @Override // kotlin.InterfaceC17793i
        public boolean a(long dragPosition, InterfaceC17806v adjustment) {
            LayoutCoordinates layoutCoordinatesInvoke = this.f165328b.invoke();
            if (layoutCoordinatesInvoke == null) {
                return true;
            }
            InterfaceC17771J interfaceC17771J = this.f165329c;
            long j10 = this.f165330d;
            if (!layoutCoordinatesInvoke.isAttached() || !C17774M.b(interfaceC17771J, j10)) {
                return false;
            }
            if (!interfaceC17771J.h(layoutCoordinatesInvoke, dragPosition, this.lastPosition, false, adjustment, false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // kotlin.InterfaceC17793i
        public void b() {
            this.f165329c.i();
        }

        @Override // kotlin.InterfaceC17793i
        public boolean c(long downPosition, InterfaceC17806v adjustment) {
            LayoutCoordinates layoutCoordinatesInvoke = this.f165328b.invoke();
            if (layoutCoordinatesInvoke == null) {
                return false;
            }
            InterfaceC17771J interfaceC17771J = this.f165329c;
            long j10 = this.f165330d;
            if (!layoutCoordinatesInvoke.isAttached()) {
                return false;
            }
            interfaceC17771J.c(layoutCoordinatesInvoke, downPosition, adjustment, false);
            this.lastPosition = downPosition;
            return C17774M.b(interfaceC17771J, j10);
        }

        @Override // kotlin.InterfaceC17793i
        public boolean d(long dragPosition) {
            LayoutCoordinates layoutCoordinatesInvoke = this.f165328b.invoke();
            if (layoutCoordinatesInvoke == null) {
                return true;
            }
            InterfaceC17771J interfaceC17771J = this.f165329c;
            long j10 = this.f165330d;
            if (!layoutCoordinatesInvoke.isAttached() || !C17774M.b(interfaceC17771J, j10)) {
                return false;
            }
            if (!interfaceC17771J.h(layoutCoordinatesInvoke, dragPosition, this.lastPosition, false, InterfaceC17806v.INSTANCE.l(), false)) {
                return true;
            }
            this.lastPosition = dragPosition;
            return true;
        }

        @Override // kotlin.InterfaceC17793i
        public boolean e(long downPosition) {
            LayoutCoordinates layoutCoordinatesInvoke = this.f165328b.invoke();
            if (layoutCoordinatesInvoke == null) {
                return false;
            }
            InterfaceC17771J interfaceC17771J = this.f165329c;
            long j10 = this.f165330d;
            if (!layoutCoordinatesInvoke.isAttached()) {
                return false;
            }
            if (interfaceC17771J.h(layoutCoordinatesInvoke, downPosition, this.lastPosition, false, InterfaceC17806v.INSTANCE.l(), false)) {
                this.lastPosition = downPosition;
            }
            return C17774M.b(interfaceC17771J, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier b(InterfaceC17771J interfaceC17771J, long j10, Function0<? extends LayoutCoordinates> function0) {
        a aVar = new a(function0, interfaceC17771J, j10);
        return C17809y.i(Modifier.INSTANCE, new b(function0, interfaceC17771J, j10), aVar);
    }
}
