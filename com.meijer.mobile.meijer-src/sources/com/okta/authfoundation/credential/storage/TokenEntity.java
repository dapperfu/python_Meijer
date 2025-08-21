package com.okta.authfoundation.credential.storage;

import Ev.C;
import Vs.b;
import io.constructor.data.local.PreferencesHelper;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0018Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J|\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b\"\u0010/R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b)\u0010%R\u0011\u00103\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/okta/authfoundation/credential/storage/TokenEntity;", "", "", PreferencesHelper.PREF_ID, "", "encryptedToken", "", "tags", "LEv/C;", "payloadData", "keyAlias", "Lcom/okta/authfoundation/credential/storage/TokenEntity$a;", "tokenEncryptionType", "", "biometricTimeout", "encryptionExtras", "<init>", "(Ljava/lang/String;[BLjava/util/Map;LEv/C;Ljava/lang/String;Lcom/okta/authfoundation/credential/storage/TokenEntity$a;Ljava/lang/Integer;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "(Ljava/lang/String;[BLjava/util/Map;LEv/C;Ljava/lang/String;Lcom/okta/authfoundation/credential/storage/TokenEntity$a;Ljava/lang/Integer;Ljava/util/Map;)Lcom/okta/authfoundation/credential/storage/TokenEntity;", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "f", "b", "[B", "d", "()[B", "c", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "LEv/C;", "h", "()LEv/C;", "e", "g", "Lcom/okta/authfoundation/credential/storage/TokenEntity$a;", "k", "()Lcom/okta/authfoundation/credential/storage/TokenEntity$a;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "LVs/b$c;", "i", "()LVs/b$c;", "security", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TokenEntity {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] encryptedToken;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> tags;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final C payloadData;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String keyAlias;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final a tokenEncryptionType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer biometricTimeout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> encryptionExtras;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\nj\u0002\b\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/okta/authfoundation/credential/storage/TokenEntity$a;", "", "<init>", "(Ljava/lang/String;I)V", "", "keyAlias", "", "biometricTimeout", "LVs/b$c;", "b", "(Ljava/lang/String;Ljava/lang/Integer;)LVs/b$c;", "a", "c", "d", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE;

        /* renamed from: b, reason: collision with root package name */
        public static final a f120748b = new a("DEFAULT", 0);

        /* renamed from: c, reason: collision with root package name */
        public static final a f120749c = new a("BIO_ONLY", 1);

        /* renamed from: d, reason: collision with root package name */
        public static final a f120750d = new a("BIO_AND_PIN", 2);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f120751e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f120752f;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/okta/authfoundation/credential/storage/TokenEntity$a$a;", "", "<init>", "()V", "LVs/b$c;", "security", "Lcom/okta/authfoundation/credential/storage/TokenEntity$a;", "a", "(LVs/b$c;)Lcom/okta/authfoundation/credential/storage/TokenEntity$a;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.okta.authfoundation.credential.storage.TokenEntity$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final a a(b.c security) {
                Intrinsics.j(security, "security");
                if (security instanceof b.c.Default) {
                    return a.f120748b;
                }
                if (security instanceof b.c.BiometricStrong) {
                    return a.f120749c;
                }
                if (security instanceof b.c.BiometricStrongOrDeviceCredential) {
                    return a.f120750d;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.f120748b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.f120749c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.f120750d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f120748b, f120749c, f120750d};
        }

        static {
            a[] aVarArrA = a();
            f120751e = aVarArrA;
            f120752f = EnumEntriesKt.a(aVarArrA);
            INSTANCE = new Companion(null);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f120751e.clone();
        }

        public final b.c b(String keyAlias, Integer biometricTimeout) {
            Intrinsics.j(keyAlias, "keyAlias");
            int i10 = b.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return new b.c.Default(keyAlias);
            }
            if (i10 == 2) {
                if (biometricTimeout != null) {
                    return new b.c.BiometricStrong(biometricTimeout.intValue(), keyAlias);
                }
                throw new IllegalStateException("BIO_ONLY TokenEntity stored without timeout");
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (biometricTimeout != null) {
                return new b.c.BiometricStrongOrDeviceCredential(biometricTimeout.intValue(), keyAlias);
            }
            throw new IllegalStateException("BIO_AND_PIN TokenEntity stored without timeout");
        }

        private a(String str, int i10) {
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(TokenEntity.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.okta.authfoundation.credential.storage.TokenEntity");
        TokenEntity tokenEntity = (TokenEntity) other;
        return Intrinsics.e(this.id, tokenEntity.id) && Arrays.equals(this.encryptedToken, tokenEntity.encryptedToken) && Intrinsics.e(this.tags, tokenEntity.tags) && Intrinsics.e(this.payloadData, tokenEntity.payloadData) && Intrinsics.e(this.keyAlias, tokenEntity.keyAlias) && this.tokenEncryptionType == tokenEntity.tokenEncryptionType && Intrinsics.e(this.encryptionExtras, tokenEntity.encryptionExtras);
    }

    public String toString() {
        return "TokenEntity(id=" + this.id + ", encryptedToken=" + Arrays.toString(this.encryptedToken) + ", tags=" + this.tags + ", payloadData=" + this.payloadData + ", keyAlias=" + this.keyAlias + ", tokenEncryptionType=" + this.tokenEncryptionType + ", biometricTimeout=" + this.biometricTimeout + ", encryptionExtras=" + this.encryptionExtras + ")";
    }

    public TokenEntity(String id2, byte[] encryptedToken, Map<String, String> tags, C c10, String keyAlias, a tokenEncryptionType, Integer num, Map<String, String> encryptionExtras) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(encryptedToken, "encryptedToken");
        Intrinsics.j(tags, "tags");
        Intrinsics.j(keyAlias, "keyAlias");
        Intrinsics.j(tokenEncryptionType, "tokenEncryptionType");
        Intrinsics.j(encryptionExtras, "encryptionExtras");
        this.id = id2;
        this.encryptedToken = encryptedToken;
        this.tags = tags;
        this.payloadData = c10;
        this.keyAlias = keyAlias;
        this.tokenEncryptionType = tokenEncryptionType;
        this.biometricTimeout = num;
        this.encryptionExtras = encryptionExtras;
    }

    public static /* synthetic */ TokenEntity b(TokenEntity tokenEntity, String str, byte[] bArr, Map map, C c10, String str2, a aVar, Integer num, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenEntity.id;
        }
        if ((i10 & 2) != 0) {
            bArr = tokenEntity.encryptedToken;
        }
        if ((i10 & 4) != 0) {
            map = tokenEntity.tags;
        }
        if ((i10 & 8) != 0) {
            c10 = tokenEntity.payloadData;
        }
        if ((i10 & 16) != 0) {
            str2 = tokenEntity.keyAlias;
        }
        if ((i10 & 32) != 0) {
            aVar = tokenEntity.tokenEncryptionType;
        }
        if ((i10 & 64) != 0) {
            num = tokenEntity.biometricTimeout;
        }
        if ((i10 & 128) != 0) {
            map2 = tokenEntity.encryptionExtras;
        }
        Integer num2 = num;
        Map map3 = map2;
        String str3 = str2;
        a aVar2 = aVar;
        return tokenEntity.a(str, bArr, map, c10, str3, aVar2, num2, map3);
    }

    public final TokenEntity a(String id2, byte[] encryptedToken, Map<String, String> tags, C payloadData, String keyAlias, a tokenEncryptionType, Integer biometricTimeout, Map<String, String> encryptionExtras) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(encryptedToken, "encryptedToken");
        Intrinsics.j(tags, "tags");
        Intrinsics.j(keyAlias, "keyAlias");
        Intrinsics.j(tokenEncryptionType, "tokenEncryptionType");
        Intrinsics.j(encryptionExtras, "encryptionExtras");
        return new TokenEntity(id2, encryptedToken, tags, payloadData, keyAlias, tokenEncryptionType, biometricTimeout, encryptionExtras);
    }

    /* renamed from: c, reason: from getter */
    public final Integer getBiometricTimeout() {
        return this.biometricTimeout;
    }

    /* renamed from: d, reason: from getter */
    public final byte[] getEncryptedToken() {
        return this.encryptedToken;
    }

    public final Map<String, String> e() {
        return this.encryptionExtras;
    }

    /* renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: g, reason: from getter */
    public final String getKeyAlias() {
        return this.keyAlias;
    }

    /* renamed from: h, reason: from getter */
    public final C getPayloadData() {
        return this.payloadData;
    }

    public int hashCode() {
        int iHashCode = ((((this.id.hashCode() * 31) + Arrays.hashCode(this.encryptedToken)) * 31) + this.tags.hashCode()) * 31;
        C c10 = this.payloadData;
        return ((((((iHashCode + (c10 != null ? c10.hashCode() : 0)) * 31) + this.keyAlias.hashCode()) * 31) + this.tokenEncryptionType.hashCode()) * 31) + this.encryptionExtras.hashCode();
    }

    public final b.c i() {
        return this.tokenEncryptionType.b(this.keyAlias, this.biometricTimeout);
    }

    public final Map<String, String> j() {
        return this.tags;
    }

    /* renamed from: k, reason: from getter */
    public final a getTokenEncryptionType() {
        return this.tokenEncryptionType;
    }
}
