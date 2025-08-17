package s4;

import androidx.room.X;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0010JB\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Ls4/b;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "R", "", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/X;", "Lkotlin/coroutines/Continuation;", "", "block", "o0", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "a", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: s4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC16865b extends AutoCloseable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Ls4/b$a;", "", "", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "result", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: s4.b$a */
    public static final class a extends Throwable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Object result;

        /* renamed from: a, reason: from getter */
        public final Object getResult() {
            return this.result;
        }
    }

    @Override // java.lang.AutoCloseable
    void close();

    <R> Object o0(boolean z10, Function2<? super X, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation);
}
