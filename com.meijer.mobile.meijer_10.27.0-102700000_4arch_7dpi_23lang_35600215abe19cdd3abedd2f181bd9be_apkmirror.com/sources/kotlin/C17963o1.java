package kotlin;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR/\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lx0/o1;", "", "<init>", "()V", "", "message", "actionLabel", "Lx0/m1;", "duration", "Lx0/q1;", "d", "(Ljava/lang/String;Ljava/lang/String;Lx0/m1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LAv/a;", "a", "LAv/a;", "mutex", "Lx0/k1;", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "()Lx0/k1;", "c", "(Lx0/k1;)V", "currentSnackbarData", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17963o1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Av.a mutex = Av.g.b(false, 1, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 currentSnackbarData = t1.e(null, null, 2, null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lx0/o1$a;", "Lx0/k1;", "", "message", "actionLabel", "Lx0/m1;", "duration", "Lqv/n;", "Lx0/q1;", "continuation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lx0/m1;Lqv/n;)V", "", "b", "()V", "dismiss", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "c", "Lx0/m1;", "getDuration", "()Lx0/m1;", "d", "Lqv/n;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.o1$a */
    private static final class a implements InterfaceC17951k1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String actionLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final EnumC17957m1 duration;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC16654n<EnumC17969q1> continuation;

        @Override // kotlin.InterfaceC17951k1
        /* renamed from: a, reason: from getter */
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // kotlin.InterfaceC17951k1
        public void b() {
            if (this.continuation.a()) {
                InterfaceC16654n<EnumC17969q1> interfaceC16654n = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                interfaceC16654n.resumeWith(Result.b(EnumC17969q1.f168637b));
            }
        }

        @Override // kotlin.InterfaceC17951k1
        public void dismiss() {
            if (this.continuation.a()) {
                InterfaceC16654n<EnumC17969q1> interfaceC16654n = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                interfaceC16654n.resumeWith(Result.b(EnumC17969q1.f168636a));
            }
        }

        @Override // kotlin.InterfaceC17951k1
        public EnumC17957m1 getDuration() {
            return this.duration;
        }

        @Override // kotlin.InterfaceC17951k1
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, String str2, EnumC17957m1 enumC17957m1, InterfaceC16654n<? super EnumC17969q1> interfaceC16654n) {
            this.message = str;
            this.actionLabel = str2;
            this.duration = enumC17957m1;
            this.continuation = interfaceC16654n;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", l = {368, 371}, m = "showSnackbar")
    /* renamed from: x0.o1$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f168433a;

        /* renamed from: b, reason: collision with root package name */
        Object f168434b;

        /* renamed from: c, reason: collision with root package name */
        Object f168435c;

        /* renamed from: d, reason: collision with root package name */
        Object f168436d;

        /* renamed from: e, reason: collision with root package name */
        Object f168437e;

        /* renamed from: f, reason: collision with root package name */
        Object f168438f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f168439g;

        /* renamed from: i, reason: collision with root package name */
        int f168441i;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f168439g = obj;
            this.f168441i |= Integer.MIN_VALUE;
            return C17963o1.this.d(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(InterfaceC17951k1 interfaceC17951k1) {
        this.currentSnackbarData.setValue(interfaceC17951k1);
    }

    public static /* synthetic */ Object e(C17963o1 c17963o1, String str, String str2, EnumC17957m1 enumC17957m1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            enumC17957m1 = EnumC17957m1.f168342a;
        }
        return c17963o1.d(str, str2, enumC17957m1, continuation);
    }

    public final InterfaceC17951k1 b() {
        return (InterfaceC17951k1) this.currentSnackbarData.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, java.lang.String r10, kotlin.EnumC17957m1 r11, kotlin.coroutines.Continuation<? super kotlin.EnumC17969q1> r12) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17963o1.d(java.lang.String, java.lang.String, x0.m1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
