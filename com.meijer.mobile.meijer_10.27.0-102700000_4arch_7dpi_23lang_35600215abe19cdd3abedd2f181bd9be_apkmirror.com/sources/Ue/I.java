package Ue;

import com.google.crypto.tink.shaded.protobuf.C11329z;

/* loaded from: classes7.dex */
public enum I implements C11329z.c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    WITH_ID_REQUIREMENT(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private static final C11329z.d<I> f35935i = new C11329z.d<I>() { // from class: Ue.I.a
        @Override // com.google.crypto.tink.shaded.protobuf.C11329z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public I a(int i10) {
            return I.a(i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f35937a;

    public static I a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i10 == 1) {
            return TINK;
        }
        if (i10 == 2) {
            return LEGACY;
        }
        if (i10 == 3) {
            return RAW;
        }
        if (i10 == 4) {
            return CRUNCHY;
        }
        if (i10 != 5) {
            return null;
        }
        return WITH_ID_REQUIREMENT;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C11329z.c
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.f35937a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    I(int i10) {
        this.f35937a = i10;
    }
}
