package kotlin;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15815n;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR/\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lx0/o1;", "", "<init>", "()V", "", "message", "actionLabel", "Lx0/m1;", "duration", "Lx0/q1;", "d", "(Ljava/lang/String;Ljava/lang/String;Lx0/m1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwv/a;", "a", "Lwv/a;", "mutex", "Lx0/k1;", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "()Lx0/k1;", "c", "(Lx0/k1;)V", "currentSnackbarData", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18029o1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a mutex = wv.g.b(false, 1, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 currentSnackbarData = t1.e(null, null, 2, null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lx0/o1$a;", "Lx0/k1;", "", "message", "actionLabel", "Lx0/m1;", "duration", "Lmv/n;", "Lx0/q1;", "continuation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lx0/m1;Lmv/n;)V", "", "b", "()V", "dismiss", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "c", "Lx0/m1;", "getDuration", "()Lx0/m1;", "d", "Lmv/n;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.o1$a */
    private static final class a implements InterfaceC18017k1 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String actionLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final EnumC18023m1 duration;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC15815n<EnumC18035q1> continuation;

        @Override // kotlin.InterfaceC18017k1
        /* renamed from: a, reason: from getter */
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // kotlin.InterfaceC18017k1
        public void b() {
            if (this.continuation.a()) {
                InterfaceC15815n<EnumC18035q1> interfaceC15815n = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                interfaceC15815n.resumeWith(Result.b(EnumC18035q1.f169725b));
            }
        }

        @Override // kotlin.InterfaceC18017k1
        public void dismiss() {
            if (this.continuation.a()) {
                InterfaceC15815n<EnumC18035q1> interfaceC15815n = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                interfaceC15815n.resumeWith(Result.b(EnumC18035q1.f169724a));
            }
        }

        @Override // kotlin.InterfaceC18017k1
        public EnumC18023m1 getDuration() {
            return this.duration;
        }

        @Override // kotlin.InterfaceC18017k1
        public String getMessage() {
            return this.message;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, String str2, EnumC18023m1 enumC18023m1, InterfaceC15815n<? super EnumC18035q1> interfaceC15815n) {
            this.message = str;
            this.actionLabel = str2;
            this.duration = enumC18023m1;
            this.continuation = interfaceC15815n;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SnackbarHostState", f = "SnackbarHost.kt", l = {368, 371}, m = "showSnackbar")
    /* renamed from: x0.o1$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f169521a;

        /* renamed from: b, reason: collision with root package name */
        Object f169522b;

        /* renamed from: c, reason: collision with root package name */
        Object f169523c;

        /* renamed from: d, reason: collision with root package name */
        Object f169524d;

        /* renamed from: e, reason: collision with root package name */
        Object f169525e;

        /* renamed from: f, reason: collision with root package name */
        Object f169526f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f169527g;

        /* renamed from: i, reason: collision with root package name */
        int f169529i;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f169527g = obj;
            this.f169529i |= Integer.MIN_VALUE;
            return C18029o1.this.d(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(InterfaceC18017k1 interfaceC18017k1) {
        this.currentSnackbarData.setValue(interfaceC18017k1);
    }

    public static /* synthetic */ Object e(C18029o1 c18029o1, String str, String str2, EnumC18023m1 enumC18023m1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            enumC18023m1 = EnumC18023m1.f169430a;
        }
        return c18029o1.d(str, str2, enumC18023m1, continuation);
    }

    public final InterfaceC18017k1 b() {
        return (InterfaceC18017k1) this.currentSnackbarData.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, java.lang.String r10, kotlin.EnumC18023m1 r11, kotlin.coroutines.Continuation<? super kotlin.EnumC18035q1> r12) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18029o1.d(java.lang.String, java.lang.String, x0.m1, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
