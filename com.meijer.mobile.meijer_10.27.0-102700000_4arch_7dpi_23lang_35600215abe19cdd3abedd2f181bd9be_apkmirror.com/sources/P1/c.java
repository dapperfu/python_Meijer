package P1;

import O1.e;
import Q1.i;

/* loaded from: classes.dex */
public class c extends O1.c {

    /* renamed from: n0, reason: collision with root package name */
    private e.d f24585n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f24586o0;

    /* renamed from: p0, reason: collision with root package name */
    private Q1.a f24587p0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24588a;

        static {
            int[] iArr = new int[e.d.values().length];
            f24588a = iArr;
            try {
                iArr[e.d.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24588a[e.d.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24588a[e.d.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24588a[e.d.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24588a[e.d.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24588a[e.d.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public c(O1.e eVar) {
        super(eVar, e.EnumC0372e.BARRIER);
    }

    @Override // O1.a
    public O1.a C(int i10) {
        this.f24586o0 = i10;
        return this;
    }

    @Override // O1.a
    public O1.a D(Object obj) {
        C(this.f23022j0.c(obj));
        return this;
    }

    @Override // O1.c
    public i a0() {
        if (this.f24587p0 == null) {
            this.f24587p0 = new Q1.a();
        }
        return this.f24587p0;
    }

    @Override // O1.c, O1.a, O1.d
    public void apply() {
        a0();
        int i10 = a.f24588a[this.f24585n0.ordinal()];
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
        this.f24587p0.g1(i11);
        this.f24587p0.h1(this.f24586o0);
    }
}
