package Ue;

import com.google.crypto.tink.shaded.protobuf.C11329z;

/* loaded from: classes7.dex */
public enum z implements C11329z.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private static final C11329z.d<z> f35992g = new C11329z.d<z>() { // from class: Ue.z.a
        @Override // com.google.crypto.tink.shaded.protobuf.C11329z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(int i10) {
            return z.a(i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f35994a;

    public static z a(int i10) {
        if (i10 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i10 == 1) {
            return ENABLED;
        }
        if (i10 == 2) {
            return DISABLED;
        }
        if (i10 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C11329z.c
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.f35994a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    z(int i10) {
        this.f35994a = i10;
    }
}
