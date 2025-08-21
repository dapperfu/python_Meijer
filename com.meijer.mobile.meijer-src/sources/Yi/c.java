package Yi;

import Cs.d;
import bj.UserTokenResponse;
import com.meijer.mobile.authentication.core.model.TokenDetails;
import com.squareup.moshi.t;
import com.squareup.moshi.y;
import gw.C14419h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import yo.k;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006H\u0097@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LYi/c;", "", "<init>", "()V", "Lbj/a;", "userTokenResponse", "", "h", "(Lbj/a;)V", "", "tokenString", "LCs/d;", "d", "(Ljava/lang/String;)LCs/d;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/squareup/moshi/t;", "a", "Lcom/squareup/moshi/t;", "moshi", "Lyo/k;", "e", "()Lyo/k;", "userManager", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t moshi;

    /* renamed from: e */
    protected abstract k getUserManager();

    protected final d d(String tokenString) {
        Intrinsics.j(tokenString, "tokenString");
        List listB1 = StringsKt.b1(tokenString, new String[]{"."}, false, 0, 6, null);
        if (listB1.size() != 3) {
            qw.a.INSTANCE.s("token data is invalid. returning null", new Object[0]);
            return null;
        }
        C14419h c14419hA = C14419h.INSTANCE.a((String) listB1.get(1));
        String strX = c14419hA != null ? c14419hA.X(Charsets.UTF_8) : null;
        if (strX == null) {
            strX = "";
        }
        TokenDetails tokenDetails = (TokenDetails) y.a(this.moshi, Reflection.n(TokenDetails.class)).fromJson(strX);
        if (tokenDetails != null) {
            return TokenDetails.d(tokenDetails, tokenString, null, null, null, 14, null);
        }
        return null;
    }

    public final void h(UserTokenResponse userTokenResponse) {
        Intrinsics.j(userTokenResponse, "userTokenResponse");
        d tokenDetails = userTokenResponse.getTokenDetails();
        if (tokenDetails != null) {
            getUserManager().g0(tokenDetails);
        }
    }

    public c() {
        t tVarD = new t.a().d();
        Intrinsics.i(tVarD, "build(...)");
        this.moshi = tVarD;
    }

    static /* synthetic */ Object g(c cVar, Continuation<? super Unit> continuation) {
        cVar.getUserManager().k();
        return Unit.f143329a;
    }

    public Object f(Continuation<? super Unit> continuation) {
        return g(this, continuation);
    }
}
