package dg;

import com.google.protobuf.C11663y;

/* loaded from: classes8.dex */
public enum l implements C11663y.c {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);


    /* renamed from: d, reason: collision with root package name */
    private static final C11663y.d<l> f128490d = new C11663y.d<l>() { // from class: dg.l.a
        @Override // com.google.protobuf.C11663y.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(int i10) {
            return l.b(i10);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f128492a;

    private static final class b implements C11663y.e {

        /* renamed from: a, reason: collision with root package name */
        static final C11663y.e f128493a = new b();

        private b() {
        }

        @Override // com.google.protobuf.C11663y.e
        public boolean a(int i10) {
            if (l.b(i10) != null) {
                return true;
            }
            return false;
        }
    }

    public static l b(int i10) {
        if (i10 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i10 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static C11663y.e e() {
        return b.f128493a;
    }

    @Override // com.google.protobuf.C11663y.c
    public final int g() {
        return this.f128492a;
    }

    l(int i10) {
        this.f128492a = i10;
    }
}
