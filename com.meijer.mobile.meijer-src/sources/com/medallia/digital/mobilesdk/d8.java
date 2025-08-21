package com.medallia.digital.mobilesdk;

/* loaded from: classes8.dex */
final class d8 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92695a;

        static {
            int[] iArr = new int[c8.values().length];
            f92695a = iArr;
            try {
                iArr[c8.Fade.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92695a[c8.SlideDown.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92695a[c8.SlideUp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92695a[c8.SlideLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92695a[c8.SlideRight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f92695a[c8.None.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    d8() {
    }

    protected static p2 a(c8 c8Var) {
        if (c8Var == null) {
            return new p2(R.anim.medallia_from_fade_in, R.anim.medallia_to_fade_out);
        }
        switch (a.f92695a[c8Var.ordinal()]) {
        }
        return new p2(R.anim.medallia_from_fade_in, R.anim.medallia_to_fade_out);
    }

    protected static p2 b(c8 c8Var) {
        if (c8Var == null) {
            return new p2(R.anim.medallia_from_fade_out, R.anim.medallia_to_fade_in);
        }
        switch (a.f92695a[c8Var.ordinal()]) {
        }
        return new p2(R.anim.medallia_from_fade_out, R.anim.medallia_to_fade_in);
    }
}
