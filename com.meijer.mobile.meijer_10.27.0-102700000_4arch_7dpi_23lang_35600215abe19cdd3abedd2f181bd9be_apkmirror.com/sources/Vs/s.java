package Vs;

import Vs.b;
import Vs.p;
import androidx.biometric.e;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LVs/s;", "", "", PreferencesHelper.PREF_ID, "LVs/p$c;", "d", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVs/p;", "token", "metadata", "LVs/b$c;", "security", "", "b", "(LVs/p;LVs/p$c;LVs/b$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "e", "(LVs/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/biometric/e$d;", "promptInfo", "a", "(Ljava/lang/String;Landroidx/biometric/e$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface s {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(s sVar, p pVar, p.Metadata metadata, b.c cVar, Continuation continuation, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: add");
            }
            if ((i10 & 4) != 0) {
                cVar = b.c.INSTANCE.b();
            }
            return sVar.b(pVar, metadata, cVar, continuation);
        }
    }

    Object a(String str, e.d dVar, Continuation<? super p> continuation);

    Object b(p pVar, p.Metadata metadata, b.c cVar, Continuation<? super Unit> continuation);

    Object c(String str, Continuation<? super Unit> continuation);

    Object d(String str, Continuation<? super p.Metadata> continuation);

    Object e(p pVar, Continuation<? super Unit> continuation);
}
