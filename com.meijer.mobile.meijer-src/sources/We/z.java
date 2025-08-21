package We;

import com.google.crypto.tink.shaded.protobuf.C11454z;

/* loaded from: classes8.dex */
public enum z implements C11454z.c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private static final C11454z.d<z> f41017g = new C11454z.d<z>() { // from class: We.z.a
        @Override // com.google.crypto.tink.shaded.protobuf.C11454z.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(int i10) {
            return z.a(i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f41019a;

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

    @Override // com.google.crypto.tink.shaded.protobuf.C11454z.c
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.f41019a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    z(int i10) {
        this.f41019a = i10;
    }
}
