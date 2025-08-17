package qv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lqv/m;", "Lqv/P0;", "", "cause", "", "c", "(Ljava/lang/Throwable;)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC16652m extends P0 {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B,\u0012#\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR1\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lqv/m$a;", "Lqv/m;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "c", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "a", "Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qv.m$a */
    public static final class a implements InterfaceC16652m {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<Throwable, Unit> handler;

        @Override // qv.InterfaceC16652m
        public void c(Throwable cause) {
            this.handler.invoke(cause);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + C16626T.a(this.handler) + '@' + C16626T.b(this) + ']';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Throwable, Unit> function1) {
            this.handler = function1;
        }
    }

    void c(Throwable cause);
}
