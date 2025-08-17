package Gi;

import M0.SnapshotStateList;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import ji.q1;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\u0016\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jr\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R/\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"LGi/i;", "", "<init>", "()V", "", "bodyLabel", "actionLabel", "LGi/e;", "duration", "", "showCloseIcon", "Lji/q1$m$a;", "toastState", "Lkotlin/Function0;", "onLabelClicked", "onCloseClicked", "", "onDismiss", "LGi/r;", "h", "(Ljava/lang/String;Ljava/lang/String;LGi/e;ZLji/q1$m$a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAv/a;", "a", "LAv/a;", "mutex", "LGi/d;", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "f", "()LGi/d;", "g", "(LGi/d;)V", "currentToastData", "c", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static SnapshotStateList<i> f11487d = o1.f();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Av.a mutex = Av.g.b(false, 1, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 currentToastData = t1.e(null, null, 2, null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LGi/i$a;", "", "<init>", "()V", "", "b", "LGi/i;", "toastHostState", "a", "(LGi/i;)V", "LM0/m;", "c", "()LM0/m;", "toastList", "LM0/m;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gi.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void a(i toastHostState) {
            Intrinsics.j(toastHostState, "toastHostState");
            i.f11487d.add(toastHostState);
        }

        public final void b() {
            i.f11487d.clear();
        }

        public final SnapshotStateList<i> c() {
            return i.f11487d;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0001\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b(\u0010)R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b-\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b\u001c\u0010,¨\u0006."}, d2 = {"LGi/i$b;", "LGi/d;", "", "bodyLabel", "actionLabel", "LGi/e;", "duration", "", "showCloseIcon", "Lqv/n;", "LGi/r;", "continuation", "Lji/q1$m$a;", "toastState", "Lkotlin/Function0;", "onLabelClicked", "onCloseClicked", "", "onDismiss", "<init>", "(Ljava/lang/String;Ljava/lang/String;LGi/e;ZLqv/n;Lji/q1$m$a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "triggerDismissAction", "g", "(Z)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "c", "LGi/e;", "getDuration", "()LGi/e;", "d", "Z", "i", "()Z", "e", "Lqv/n;", "Lji/q1$m$a;", "h", "()Lji/q1$m$a;", "Lkotlin/jvm/functions/Function0;", "k", "()Lkotlin/jvm/functions/Function0;", "j", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String bodyLabel;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String actionLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final e duration;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean showCloseIcon;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC16654n<r> continuation;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final q1.m.a toastState;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Function0<Boolean> onLabelClicked;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Function0<Boolean> onCloseClicked;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final Function0<Unit> onDismiss;

        /* JADX WARN: Multi-variable type inference failed */
        public b(String bodyLabel, String str, e duration, boolean z10, InterfaceC16654n<? super r> continuation, q1.m.a toastState, Function0<Boolean> onLabelClicked, Function0<Boolean> onCloseClicked, Function0<Unit> onDismiss) {
            Intrinsics.j(bodyLabel, "bodyLabel");
            Intrinsics.j(duration, "duration");
            Intrinsics.j(continuation, "continuation");
            Intrinsics.j(toastState, "toastState");
            Intrinsics.j(onLabelClicked, "onLabelClicked");
            Intrinsics.j(onCloseClicked, "onCloseClicked");
            Intrinsics.j(onDismiss, "onDismiss");
            this.bodyLabel = bodyLabel;
            this.actionLabel = str;
            this.duration = duration;
            this.showCloseIcon = z10;
            this.continuation = continuation;
            this.toastState = toastState;
            this.onLabelClicked = onLabelClicked;
            this.onCloseClicked = onCloseClicked;
            this.onDismiss = onDismiss;
        }

        @Override // Gi.d
        /* renamed from: a, reason: from getter */
        public String getActionLabel() {
            return this.actionLabel;
        }

        public Function0<Unit> b() {
            return this.onDismiss;
        }

        @Override // Gi.d
        /* renamed from: f, reason: from getter */
        public String getBodyLabel() {
            return this.bodyLabel;
        }

        @Override // Gi.d
        public void g(boolean triggerDismissAction) {
            if (this.continuation.a()) {
                if (triggerDismissAction) {
                    b().invoke();
                }
                InterfaceC16654n<r> interfaceC16654n = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                interfaceC16654n.resumeWith(Result.b(r.f11545a));
            }
        }

        @Override // Gi.d
        public e getDuration() {
            return this.duration;
        }

        @Override // Gi.d
        /* renamed from: h, reason: from getter */
        public q1.m.a getToastState() {
            return this.toastState;
        }

        @Override // Gi.d
        /* renamed from: i, reason: from getter */
        public boolean getShowCloseIcon() {
            return this.showCloseIcon;
        }

        @Override // Gi.d
        public Function0<Boolean> j() {
            return this.onCloseClicked;
        }

        @Override // Gi.d
        public Function0<Boolean> k() {
            return this.onLabelClicked;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.state.ToastHostState", f = "ToastHostState.kt", l = {381, 384}, m = "showToast")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f11499a;

        /* renamed from: b, reason: collision with root package name */
        Object f11500b;

        /* renamed from: c, reason: collision with root package name */
        Object f11501c;

        /* renamed from: d, reason: collision with root package name */
        Object f11502d;

        /* renamed from: e, reason: collision with root package name */
        Object f11503e;

        /* renamed from: f, reason: collision with root package name */
        Object f11504f;

        /* renamed from: g, reason: collision with root package name */
        Object f11505g;

        /* renamed from: h, reason: collision with root package name */
        Object f11506h;

        /* renamed from: i, reason: collision with root package name */
        Object f11507i;

        /* renamed from: j, reason: collision with root package name */
        boolean f11508j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f11509k;

        /* renamed from: m, reason: collision with root package name */
        int f11511m;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11509k = obj;
            this.f11511m |= Integer.MIN_VALUE;
            return i.this.h(null, null, null, false, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(d dVar) {
        this.currentToastData.setValue(dVar);
    }

    public static /* synthetic */ Object i(i iVar, String str, String str2, e eVar, boolean z10, q1.m.a aVar, Function0 function0, Function0 function02, Function0 function03, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            eVar = e.f11481a;
        }
        return iVar.h(str, str3, eVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? q1.m.a.C2217a.f140112a : aVar, (i10 & 32) != 0 ? new Function0() { // from class: Gi.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(i.j());
            }
        } : function0, (i10 & 64) != 0 ? new Function0() { // from class: Gi.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(i.k());
            }
        } : function02, (i10 & 128) != 0 ? new Function0() { // from class: Gi.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.l();
            }
        } : function03, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l() {
        return Unit.f142422a;
    }

    public final d f() {
        return (d) this.currentToastData.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r3v0, types: [Av.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r28, java.lang.String r29, Gi.e r30, boolean r31, ji.q1.m.a r32, kotlin.jvm.functions.Function0<java.lang.Boolean> r33, kotlin.jvm.functions.Function0<java.lang.Boolean> r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, kotlin.coroutines.Continuation<? super Gi.r> r36) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gi.i.h(java.lang.String, java.lang.String, Gi.e, boolean, ji.q1$m$a, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
