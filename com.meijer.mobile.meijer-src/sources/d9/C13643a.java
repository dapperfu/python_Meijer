package d9;

import j9.ClientIdentification;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Ld9/a;", "", "", "secret", "Ld9/b;", "crypto", "<init>", "(Ljava/lang/String;Ld9/b;)V", "Lj9/a;", "clientIdentification", "b", "(Lj9/a;)Lj9/a;", "encryptedClientId", "salt", "iv", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/String;", "Ld9/b;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: d9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13643a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String secret;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13644b crypto;

    public C13643a(String str, C13644b crypto) {
        Intrinsics.j(crypto, "crypto");
        this.secret = str;
        this.crypto = crypto;
    }

    public String a(String encryptedClientId, String salt, String iv2) {
        Intrinsics.j(encryptedClientId, "encryptedClientId");
        Intrinsics.j(salt, "salt");
        Intrinsics.j(iv2, "iv");
        String str = this.secret;
        if (str != null) {
            return this.crypto.a(encryptedClientId, str, salt, iv2);
        }
        return null;
    }

    public ClientIdentification b(ClientIdentification clientIdentification) {
        Intrinsics.j(clientIdentification, "clientIdentification");
        if (this.secret == null) {
            return clientIdentification;
        }
        C13644b c13644b = this.crypto;
        String clientId = clientIdentification.getClientId();
        String str = this.secret;
        Intrinsics.g(str);
        Map mapC = C13644b.c(c13644b, clientId, str, 0, 4, null);
        return ClientIdentification.b(clientIdentification, null, (String) mapC.get("encryptedValue"), (String) mapC.get("salt"), (String) mapC.get("iv"), 1, null);
    }
}
