package j2;

import android.os.OutcomeReceiver;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"R", "", "E", "Lkotlin/coroutines/Continuation;", "Landroid/os/OutcomeReceiver;", "a", "(Lkotlin/coroutines/Continuation;)Landroid/os/OutcomeReceiver;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {
    public static final <R, E extends Throwable> OutcomeReceiver a(Continuation<? super R> continuation) {
        return l.a(new ContinuationOutcomeReceiver(continuation));
    }
}
