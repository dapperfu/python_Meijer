package androidx.privacysandbox.ads.adservices.topics;

import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/a;", "", "", "encryptedTopic", "", "keyIdentifier", "encapsulatedKey", "<init>", "([BLjava/lang/String;[B)V", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "[B", "getEncryptedTopic", "()[B", "b", "Ljava/lang/String;", "getKeyIdentifier", "c", "getEncapsulatedKey", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.privacysandbox.ads.adservices.topics.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6102a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] EncryptedTopic;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String KeyIdentifier;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] EncapsulatedKey;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C6102a)) {
            return false;
        }
        C6102a c6102a = (C6102a) other;
        return Arrays.equals(this.EncryptedTopic, c6102a.EncryptedTopic) && this.KeyIdentifier.contentEquals(c6102a.KeyIdentifier) && Arrays.equals(this.EncapsulatedKey, c6102a.EncapsulatedKey);
    }

    public C6102a(byte[] encryptedTopic, String keyIdentifier, byte[] encapsulatedKey) {
        Intrinsics.j(encryptedTopic, "encryptedTopic");
        Intrinsics.j(keyIdentifier, "keyIdentifier");
        Intrinsics.j(encapsulatedKey, "encapsulatedKey");
        this.EncryptedTopic = encryptedTopic;
        this.KeyIdentifier = keyIdentifier;
        this.EncapsulatedKey = encapsulatedKey;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.EncryptedTopic)), this.KeyIdentifier, Integer.valueOf(Arrays.hashCode(this.EncapsulatedKey)));
    }

    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + StringsKt.D(this.EncryptedTopic) + ", KeyIdentifier=" + this.KeyIdentifier + ", EncapsulatedKey=" + StringsKt.D(this.EncapsulatedKey) + " }");
    }
}
