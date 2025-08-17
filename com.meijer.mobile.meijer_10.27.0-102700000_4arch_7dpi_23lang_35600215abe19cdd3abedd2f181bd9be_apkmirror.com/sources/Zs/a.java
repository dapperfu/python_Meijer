package Zs;

import Iv.C;
import com.okta.authfoundation.client.j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LZs/a;", "", "<init>", "()V", "LIv/C;", "jsonObject", "", "a", "(LIv/C;)Ljava/lang/String;", "json", "b", "(Ljava/lang/String;)LIv/C;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {
    public final String a(C jsonObject) {
        if (jsonObject != null) {
            return j.INSTANCE.b().c(C.INSTANCE.serializer(), jsonObject);
        }
        return null;
    }

    public final C b(String json) {
        if (json != null) {
            return (C) j.INSTANCE.b().b(C.INSTANCE.serializer(), json);
        }
        return null;
    }
}
