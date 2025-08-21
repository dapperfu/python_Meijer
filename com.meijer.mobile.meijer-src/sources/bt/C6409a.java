package bt;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lbt/a;", "", "", "Lbt/a$a;", "keys", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: bt.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6409a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<C1206a> keys;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lbt/a$a;", "", "", "keyId", "use", "keyType", "algorithm", "exponent", "modulus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "f", "d", "e", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: bt.a$a, reason: collision with other inner class name */
    public static final class C1206a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String keyId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String use;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String keyType;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String algorithm;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String exponent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String modulus;

        public C1206a(String keyId, String use, String keyType, String str, String str2, String str3) {
            Intrinsics.j(keyId, "keyId");
            Intrinsics.j(use, "use");
            Intrinsics.j(keyType, "keyType");
            this.keyId = keyId;
            this.use = use;
            this.keyType = keyType;
            this.algorithm = str;
            this.exponent = str2;
            this.modulus = str3;
        }

        /* renamed from: a, reason: from getter */
        public final String getAlgorithm() {
            return this.algorithm;
        }

        /* renamed from: b, reason: from getter */
        public final String getExponent() {
            return this.exponent;
        }

        /* renamed from: c, reason: from getter */
        public final String getKeyId() {
            return this.keyId;
        }

        /* renamed from: d, reason: from getter */
        public final String getKeyType() {
            return this.keyType;
        }

        /* renamed from: e, reason: from getter */
        public final String getModulus() {
            return this.modulus;
        }

        /* renamed from: f, reason: from getter */
        public final String getUse() {
            return this.use;
        }
    }

    public C6409a(List<C1206a> keys) {
        Intrinsics.j(keys, "keys");
        this.keys = keys;
    }

    public final List<C1206a> a() {
        return this.keys;
    }
}
