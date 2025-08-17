package Xi;

import android.security.keystore.UserNotAuthenticatedException;
import com.meijer.mobile.authentication.core.model.BearerToken;
import io.reactivex.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0004\b\b\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"LXi/a;", "", "Lio/reactivex/l;", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "a", "()Lio/reactivex/l;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface a {
    l<BearerToken> a();

    Object b(Continuation<? super BearerToken> continuation);

    Object c(Continuation<? super BearerToken> continuation) throws UserNotAuthenticatedException;
}
