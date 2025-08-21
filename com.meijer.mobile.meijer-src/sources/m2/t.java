package m2;

import java.util.Locale;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final s f150531a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final s f150532b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final s f150533c;

    /* renamed from: d, reason: collision with root package name */
    public static final s f150534d;

    /* renamed from: e, reason: collision with root package name */
    public static final s f150535e;

    /* renamed from: f, reason: collision with root package name */
    public static final s f150536f;

    private interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    private static abstract class d implements s {

        /* renamed from: a, reason: collision with root package name */
        private final c f150540a;

        protected abstract boolean a();

        private boolean b(CharSequence charSequence, int i10, int i11) {
            int iA = this.f150540a.a(charSequence, i10, i11);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return a();
            }
            return false;
        }

        @Override // m2.s
        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null || i10 < 0 || i11 < 0 || charSequence.length() - i11 < i10) {
                throw new IllegalArgumentException();
            }
            return this.f150540a == null ? a() : b(charSequence, i10, i11);
        }

        d(c cVar) {
            this.f150540a = cVar;
        }
    }

    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f150541b;

        @Override // m2.t.d
        protected boolean a() {
            return this.f150541b;
        }

        e(c cVar, boolean z10) {
            super(cVar);
            this.f150541b = z10;
        }
    }

    static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }

    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f150537b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f150538a;

        @Override // m2.t.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int iA = t.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i10++;
                        z10 = z10;
                    } else if (!this.f150538a) {
                        return 1;
                    }
                } else if (this.f150538a) {
                    return 0;
                }
                z10 = true;
                i10++;
                z10 = z10;
            }
            if (z10) {
                return this.f150538a ? 1 : 0;
            }
            return 2;
        }

        private a(boolean z10) {
            this.f150538a = z10;
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f150539a = new b();

        @Override // m2.t.c
        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int iB = 2;
            while (i10 < i12 && iB == 2) {
                iB = t.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return iB;
        }

        private b() {
        }
    }

    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f150542b = new f();

        f() {
            super(null);
        }

        @Override // m2.t.d
        protected boolean a() {
            if (u.a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        b bVar = b.f150539a;
        f150533c = new e(bVar, false);
        f150534d = new e(bVar, true);
        f150535e = new e(a.f150537b, false);
        f150536f = f.f150542b;
    }
}
