package Xs;

import com.okta.authfoundation.credential.storage.TokenEntity;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H§@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000e\"\u00020\u0003H§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"LXs/a;", "", "", "Lcom/okta/authfoundation/credential/storage/TokenEntity;", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", PreferencesHelper.PREF_ID, "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenEntity", "", "b", "(Lcom/okta/authfoundation/credential/storage/TokenEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "([Lcom/okta/authfoundation/credential/storage/TokenEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {
    Object a(TokenEntity tokenEntity, Continuation<? super Unit> continuation);

    Object b(TokenEntity tokenEntity, Continuation<? super Unit> continuation);

    Object c(TokenEntity[] tokenEntityArr, Continuation<? super Unit> continuation);

    Object d(Continuation<? super List<TokenEntity>> continuation);

    Object e(String str, Continuation<? super TokenEntity> continuation);
}
