package k6;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import g6.C14209i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16678z;
import qv.InterfaceC16674x;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR/\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00048V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\bR/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\t8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\fR\u001b\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001b\u0010%\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b$\u0010 R\u001b\u0010(\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 ¨\u0006)"}, d2 = {"Lk6/l;", "Lk6/k;", "<init>", "()V", "Lg6/i;", "composition", "", "f", "(Lg6/i;)V", "", "error", "k", "(Ljava/lang/Throwable;)V", "Lqv/x;", "a", "Lqv/x;", "compositionDeferred", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "getValue", "()Lg6/i;", "v", "value", "c", "l", "()Ljava/lang/Throwable;", "u", "", "d", "Landroidx/compose/runtime/z1;", "isLoading", "()Z", "e", "m", "isComplete", "i", "isFailure", "g", "p", "isSuccess", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: k6.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15109l implements InterfaceC15108k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16674x<C14209i> compositionDeferred = C16678z.b(null, 1, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 value = t1.e(null, null, 2, null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 error = t1.e(null, null, 2, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z1 isLoading = o1.e(new c());

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z1 isComplete = o1.e(new a());

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z1 isFailure = o1.e(new b());

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final z1 isSuccess = o1.e(new d());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k6.l$a */
    static final class a extends Lambda implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((C15109l.this.getValue() == null && C15109l.this.l() == null) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k6.l$b */
    static final class b extends Lambda implements Function0<Boolean> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C15109l.this.l() != null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k6.l$c */
    static final class c extends Lambda implements Function0<Boolean> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C15109l.this.getValue() == null && C15109l.this.l() == null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: k6.l$d */
    static final class d extends Lambda implements Function0<Boolean> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C15109l.this.getValue() != null);
        }
    }

    public final synchronized void f(C14209i composition) {
        Intrinsics.j(composition, "composition");
        if (m()) {
            return;
        }
        v(composition);
        this.compositionDeferred.Z(composition);
    }

    public final synchronized void k(Throwable error) {
        Intrinsics.j(error, "error");
        if (m()) {
            return;
        }
        u(error);
        this.compositionDeferred.c(error);
    }

    private void u(Throwable th2) {
        this.error.setValue(th2);
    }

    private void v(C14209i c14209i) {
        this.value.setValue(c14209i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.z1
    public C14209i getValue() {
        return (C14209i) this.value.getValue();
    }

    @Override // k6.InterfaceC15108k
    public boolean i() {
        return ((Boolean) this.isFailure.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Throwable l() {
        return (Throwable) this.error.getValue();
    }

    public boolean m() {
        return ((Boolean) this.isComplete.getValue()).booleanValue();
    }

    public boolean p() {
        return ((Boolean) this.isSuccess.getValue()).booleanValue();
    }
}
