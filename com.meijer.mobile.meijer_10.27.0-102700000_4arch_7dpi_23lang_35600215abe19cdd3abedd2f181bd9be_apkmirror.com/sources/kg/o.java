package kg;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkg/o;", "", "", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/Duration;", "b", "()Lkotlin/time/Duration;", "sessionRestartTimeout", "", "c", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface o {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public static Object a(o oVar, Continuation<? super Unit> continuation) {
            return Unit.f142422a;
        }
    }

    Boolean a();

    Duration b();

    Double c();

    Object d(Continuation<? super Unit> continuation);
}
