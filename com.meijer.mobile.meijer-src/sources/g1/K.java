package g1;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0007\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lg1/K;", "Lg1/I;", "<init>", "()V", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "b", "Lkotlin/jvm/functions/Function1;", "e", "()Lkotlin/jvm/functions/Function1;", "n", "(Lkotlin/jvm/functions/Function1;)V", "onTouchEvent", "Lg1/S;", "value", "c", "Lg1/S;", "getRequestDisallowInterceptTouchEvent", "()Lg1/S;", "p", "(Lg1/S;)V", "requestDisallowInterceptTouchEvent", "d", "Z", "()Z", "k", "(Z)V", "disallowIntercept", "Lg1/H;", "Lg1/H;", "v", "()Lg1/H;", "pointerInputFilter", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K implements I {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Function1<? super MotionEvent, Boolean> onTouchEvent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private S requestDisallowInterceptTouchEvent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean disallowIntercept;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final H pointerInputFilter = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lg1/K$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f133865a = new a("Unknown", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f133866b = new a("Dispatching", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f133867c = new a("NotDispatching", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f133868d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f133869e;

        static {
            a[] aVarArrA = a();
            f133868d = aVarArrA;
            f133869e = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f133865a, f133866b, f133867c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f133868d.clone();
        }

        private a(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"g1/K$b", "Lg1/H;", "", "i", "()V", "Lg1/q;", "pointerEvent", "h", "(Lg1/q;)V", "Lg1/s;", "pass", "LH1/r;", "bounds", "e", "(Lg1/q;Lg1/s;J)V", "d", "Lg1/K$a;", "b", "Lg1/K$a;", "state", "", "c", "()Z", "shareWithSiblings", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends H {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private a state = a.f133865a;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends Lambda implements Function1<MotionEvent, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ K f133872f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(K k10) {
                super(1);
                this.f133872f = k10;
            }

            public final void a(MotionEvent motionEvent) {
                this.f133872f.e().invoke(motionEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: g1.K$b$b, reason: collision with other inner class name */
        static final class C2114b extends Lambda implements Function1<MotionEvent, Unit> {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ K f133874g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2114b(K k10) {
                super(1);
                this.f133874g = k10;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return Unit.f143329a;
            }

            public final void a(MotionEvent motionEvent) {
                a aVar;
                if (motionEvent.getActionMasked() == 0) {
                    b bVar = b.this;
                    if (this.f133874g.e().invoke(motionEvent).booleanValue()) {
                        aVar = a.f133866b;
                    } else {
                        aVar = a.f133867c;
                    }
                    bVar.state = aVar;
                    return;
                }
                this.f133874g.e().invoke(motionEvent);
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", "a", "(Landroid/view/MotionEvent;)V"}, k = 3, mv = {1, 9, 0})
        static final class c extends Lambda implements Function1<MotionEvent, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ K f133875f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(K k10) {
                super(1);
                this.f133875f = k10;
            }

            public final void a(MotionEvent motionEvent) {
                this.f133875f.e().invoke(motionEvent);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MotionEvent motionEvent) {
                a(motionEvent);
                return Unit.f143329a;
            }
        }

        @Override // g1.H
        public boolean c() {
            return true;
        }

        b() {
        }

        private final void i() {
            this.state = a.f133865a;
            K.this.k(false);
        }

        @Override // g1.H
        public void d() {
            if (this.state == a.f133866b) {
                M.a(SystemClock.uptimeMillis(), new c(K.this));
                i();
            }
        }

        private final void h(C14314q pointerEvent) {
            List<PointerInputChange> listC = pointerEvent.c();
            List<PointerInputChange> list = listC;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (listC.get(i10).p()) {
                    if (this.state == a.f133866b) {
                        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
                        if (layoutCoordinates != null) {
                            M.b(pointerEvent, layoutCoordinates.r0(U0.f.INSTANCE.c()), new a(K.this));
                        } else {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                    }
                    this.state = a.f133867c;
                    return;
                }
            }
            LayoutCoordinates layoutCoordinates2 = getLayoutCoordinates();
            if (layoutCoordinates2 != null) {
                M.c(pointerEvent, layoutCoordinates2.r0(U0.f.INSTANCE.c()), new C2114b(K.this));
                if (this.state == a.f133866b) {
                    int size2 = list.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        listC.get(i11).a();
                    }
                    C14304g internalPointerEvent = pointerEvent.getInternalPointerEvent();
                    if (internalPointerEvent != null) {
                        internalPointerEvent.e(!K.this.getDisallowIntercept());
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("layoutCoordinates not set");
        }

        @Override // g1.H
        public void e(C14314q pointerEvent, EnumC14315s pass, long bounds) {
            boolean z10;
            List<PointerInputChange> listC = pointerEvent.c();
            if (!K.this.getDisallowIntercept()) {
                int size = listC.size();
                for (int i10 = 0; i10 < size; i10++) {
                    PointerInputChange pointerInputChange = listC.get(i10);
                    if (r.b(pointerInputChange) || r.d(pointerInputChange)) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
            } else {
                z10 = true;
                break;
            }
            if (this.state != a.f133867c) {
                if (pass == EnumC14315s.f133968a && z10) {
                    h(pointerEvent);
                }
                if (pass == EnumC14315s.f133970c && !z10) {
                    h(pointerEvent);
                }
            }
            if (pass == EnumC14315s.f133970c) {
                int size2 = listC.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    if (!r.d(listC.get(i11))) {
                        return;
                    }
                }
                i();
            }
        }
    }

    /* renamed from: b, reason: from getter */
    public final boolean getDisallowIntercept() {
        return this.disallowIntercept;
    }

    public final Function1<MotionEvent, Boolean> e() {
        Function1 function1 = this.onTouchEvent;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.x("onTouchEvent");
        return null;
    }

    public final void k(boolean z10) {
        this.disallowIntercept = z10;
    }

    public final void n(Function1<? super MotionEvent, Boolean> function1) {
        this.onTouchEvent = function1;
    }

    public final void p(S s10) {
        S s11 = this.requestDisallowInterceptTouchEvent;
        if (s11 != null) {
            s11.b(null);
        }
        this.requestDisallowInterceptTouchEvent = s10;
        if (s10 == null) {
            return;
        }
        s10.b(this);
    }

    @Override // g1.I
    /* renamed from: v, reason: from getter */
    public H getPointerInputFilter() {
        return this.pointerInputFilter;
    }
}
