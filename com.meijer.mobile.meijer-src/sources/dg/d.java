package dg;

import com.google.protobuf.C11663y;

/* loaded from: classes8.dex */
public enum d implements C11663y.c {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);


    /* renamed from: f, reason: collision with root package name */
    private static final C11663y.d<d> f128457f = new C11663y.d<d>() { // from class: dg.d.a
        @Override // com.google.protobuf.C11663y.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(int i10) {
            return d.b(i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f128459a;

    private static final class b implements C11663y.e {

        /* renamed from: a, reason: collision with root package name */
        static final C11663y.e f128460a = new b();

        private b() {
        }

        @Override // com.google.protobuf.C11663y.e
        public boolean a(int i10) {
            if (d.b(i10) != null) {
                return true;
            }
            return false;
        }
    }

    public static d b(int i10) {
        if (i10 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i10 == 1) {
            return FOREGROUND;
        }
        if (i10 == 2) {
            return BACKGROUND;
        }
        if (i10 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static C11663y.e e() {
        return b.f128460a;
    }

    @Override // com.google.protobuf.C11663y.c
    public final int g() {
        return this.f128459a;
    }

    d(int i10) {
        this.f128459a = i10;
    }
}
