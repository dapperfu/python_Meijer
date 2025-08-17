package h9;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0097\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lh9/a;", "", "", "clientId", "encryptedClientId", "salt", "iv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lh9/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "d", "f", "e", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: h9.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public /* data */ class ClientIdentification {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String clientId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String encryptedClientId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String salt;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String iv;

    public ClientIdentification(String clientId, String str, String str2, String str3) {
        Intrinsics.j(clientId, "clientId");
        this.clientId = clientId;
        this.encryptedClientId = str;
        this.salt = str2;
        this.iv = str3;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientIdentification)) {
            return false;
        }
        ClientIdentification clientIdentification = (ClientIdentification) other;
        return Intrinsics.e(getClientId(), clientIdentification.getClientId()) && Intrinsics.e(getEncryptedClientId(), clientIdentification.getEncryptedClientId()) && Intrinsics.e(getSalt(), clientIdentification.getSalt()) && Intrinsics.e(getIv(), clientIdentification.getIv());
    }

    public static /* synthetic */ ClientIdentification b(ClientIdentification clientIdentification, String str, String str2, String str3, String str4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            str = clientIdentification.getClientId();
        }
        if ((i10 & 2) != 0) {
            str2 = clientIdentification.getEncryptedClientId();
        }
        if ((i10 & 4) != 0) {
            str3 = clientIdentification.getSalt();
        }
        if ((i10 & 8) != 0) {
            str4 = clientIdentification.getIv();
        }
        return clientIdentification.a(str, str2, str3, str4);
    }

    public final ClientIdentification a(String clientId, String encryptedClientId, String salt, String iv2) {
        Intrinsics.j(clientId, "clientId");
        return new ClientIdentification(clientId, encryptedClientId, salt, iv2);
    }

    /* renamed from: c, reason: from getter */
    public String getClientId() {
        return this.clientId;
    }

    /* renamed from: d, reason: from getter */
    public String getEncryptedClientId() {
        return this.encryptedClientId;
    }

    /* renamed from: e, reason: from getter */
    public String getIv() {
        return this.iv;
    }

    /* renamed from: f, reason: from getter */
    public String getSalt() {
        return this.salt;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = getClientId().hashCode() * 31;
        int iHashCode4 = 0;
        if (getEncryptedClientId() == null) {
            iHashCode = 0;
        } else {
            iHashCode = getEncryptedClientId().hashCode();
        }
        int i10 = (iHashCode3 + iHashCode) * 31;
        if (getSalt() == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = getSalt().hashCode();
        }
        int i11 = (i10 + iHashCode2) * 31;
        if (getIv() != null) {
            iHashCode4 = getIv().hashCode();
        }
        return i11 + iHashCode4;
    }

    public String toString() {
        return "ClientIdentification(clientId=" + getClientId() + ", encryptedClientId=" + getEncryptedClientId() + ", salt=" + getSalt() + ", iv=" + getIv() + ")";
    }

    public /* synthetic */ ClientIdentification(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
