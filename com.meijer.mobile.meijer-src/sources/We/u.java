package We;

import com.google.crypto.tink.shaded.protobuf.C11454z;

/* loaded from: classes8.dex */
public enum u implements C11454z.c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private static final C11454z.d<u> f40996i = new C11454z.d<u>() { // from class: We.u.a
        @Override // com.google.crypto.tink.shaded.protobuf.C11454z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(int i10) {
            return u.a(i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f40998a;

    public static u a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_HASH;
        }
        if (i10 == 1) {
            return SHA1;
        }
        if (i10 == 2) {
            return SHA384;
        }
        if (i10 == 3) {
            return SHA256;
        }
        if (i10 == 4) {
            return SHA512;
        }
        if (i10 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C11454z.c
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.f40998a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    u(int i10) {
        this.f40998a = i10;
    }
}
