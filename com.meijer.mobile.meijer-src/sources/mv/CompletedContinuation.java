package mv;

import com.radiusnetworks.flybuy.sdk.data.order.OrderState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0084\u0001\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012O\b\u0002\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0095\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042O\b\u0002\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R[\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b'\u0010+¨\u0006-"}, d2 = {"Lmv/B;", "R", "", "result", "Lmv/m;", "cancelHandler", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "value", "Lkotlin/coroutines/CoroutineContext;", "context", "", "onCancellation", "idempotentResume", "cancelCause", "<init>", "(Ljava/lang/Object;Lmv/m;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lmv/p;", "cont", "d", "(Lmv/p;Ljava/lang/Throwable;)V", "a", "(Ljava/lang/Object;Lmv/m;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Throwable;)Lmv/B;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "b", "Lmv/m;", "c", "Lkotlin/jvm/functions/Function3;", "e", "Ljava/lang/Throwable;", "()Z", OrderState.CANCELLED, "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mv.B, reason: case insensitive filesystem and from toString */
/* loaded from: classes14.dex */
final /* data */ class CompletedContinuation<R> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final R result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final InterfaceC15813m cancelHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final Function3<Throwable, R, CoroutineContext, Unit> onCancellation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final Object idempotentResume;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final Throwable cancelCause;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedContinuation(R r10, InterfaceC15813m interfaceC15813m, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3, Object obj, Throwable th2) {
        this.result = r10;
        this.cancelHandler = interfaceC15813m;
        this.onCancellation = function3;
        this.idempotentResume = obj;
        this.cancelCause = th2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) other;
        return Intrinsics.e(this.result, completedContinuation.result) && Intrinsics.e(this.cancelHandler, completedContinuation.cancelHandler) && Intrinsics.e(this.onCancellation, completedContinuation.onCancellation) && Intrinsics.e(this.idempotentResume, completedContinuation.idempotentResume) && Intrinsics.e(this.cancelCause, completedContinuation.cancelCause);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedContinuation b(CompletedContinuation completedContinuation, Object obj, InterfaceC15813m interfaceC15813m, Function3 function3, Object obj2, Throwable th2, int i10, Object obj3) {
        R r10 = obj;
        if ((i10 & 1) != 0) {
            r10 = completedContinuation.result;
        }
        if ((i10 & 2) != 0) {
            interfaceC15813m = completedContinuation.cancelHandler;
        }
        if ((i10 & 4) != 0) {
            function3 = completedContinuation.onCancellation;
        }
        if ((i10 & 8) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        if ((i10 & 16) != 0) {
            th2 = completedContinuation.cancelCause;
        }
        Throwable th3 = th2;
        Function3 function32 = function3;
        return completedContinuation.a(r10, interfaceC15813m, function32, obj2, th3);
    }

    public final CompletedContinuation<R> a(R result, InterfaceC15813m cancelHandler, Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, Object idempotentResume, Throwable cancelCause) {
        return new CompletedContinuation<>(result, cancelHandler, onCancellation, idempotentResume, cancelCause);
    }

    public final boolean c() {
        return this.cancelCause != null;
    }

    public final void d(C15819p<?> cont, Throwable cause) {
        InterfaceC15813m interfaceC15813m = this.cancelHandler;
        if (interfaceC15813m != null) {
            cont.l(interfaceC15813m, cause);
        }
        Function3<Throwable, R, CoroutineContext, Unit> function3 = this.onCancellation;
        if (function3 != null) {
            cont.m(function3, cause, this.result);
        }
    }

    public int hashCode() {
        R r10 = this.result;
        int iHashCode = (r10 == null ? 0 : r10.hashCode()) * 31;
        InterfaceC15813m interfaceC15813m = this.cancelHandler;
        int iHashCode2 = (iHashCode + (interfaceC15813m == null ? 0 : interfaceC15813m.hashCode())) * 31;
        Function3<Throwable, R, CoroutineContext, Unit> function3 = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.cancelCause;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    public /* synthetic */ CompletedContinuation(Object obj, InterfaceC15813m interfaceC15813m, Function3 function3, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC15813m, (i10 & 4) != 0 ? null : function3, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
