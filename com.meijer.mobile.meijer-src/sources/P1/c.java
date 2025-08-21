package P1;

import O1.e;
import Q1.i;

/* loaded from: classes.dex */
public class c extends O1.c {

    /* renamed from: n0, reason: collision with root package name */
    private e.d f25283n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f25284o0;

    /* renamed from: p0, reason: collision with root package name */
    private Q1.a f25285p0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25286a;

        static {
            int[] iArr = new int[e.d.values().length];
            f25286a = iArr;
            try {
                iArr[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25286a[e.d.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25286a[e.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25286a[e.d.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25286a[e.d.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25286a[e.d.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(O1.e eVar) {
        super(eVar, e.EnumC0378e.BARRIER);
    }

    @Override // O1.a
    public O1.a C(int i10) {
        this.f25284o0 = i10;
        return this;
    }

    @Override // O1.a
    public O1.a D(Object obj) {
        C(this.f23015j0.c(obj));
        return this;
    }

    @Override // O1.c
    public i a0() {
        if (this.f25285p0 == null) {
            this.f25285p0 = new Q1.a();
        }
        return this.f25285p0;
    }

    @Override // O1.c, O1.a, O1.d
    public void apply() {
        a0();
        int i10 = a.f25286a[this.f25283n0.ordinal()];
        int i11 = 3;
        if (i10 != 3 && i10 != 4) {
            if (i10 != 5) {
                if (i10 != 6) {
                    i11 = 0;
                }
            } else {
                i11 = 2;
            }
        } else {
            i11 = 1;
        }
        this.f25285p0.g1(i11);
        this.f25285p0.h1(this.f25284o0);
    }
}
