package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.android.V;
import ih.EnumC14723b;
import ih.InterfaceC14722a;
import java.util.concurrent.atomic.AtomicBoolean;
import uw.a;

/* loaded from: classes7.dex */
public abstract class h0 {

    public static final class b implements InterfaceC14722a, InterfaceC14722a.b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f91211a;

        @Override // ih.InterfaceC14722a
        public InterfaceC14722a.InterfaceC2175a a(String str) {
            return new c(str, this.f91211a);
        }

        b(boolean z10) {
            this.f91211a = z10;
        }
    }

    private static final class c extends V.c {

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicBoolean f91212b = new AtomicBoolean(false);

        @Override // ih.InterfaceC14722a.InterfaceC2175a
        public boolean d(EnumC14723b enumC14723b) {
            return true;
        }

        @Override // com.launchdarkly.sdk.android.V.c
        protected void f(EnumC14723b enumC14723b, String str) {
            a.b bVarF = uw.a.f(this.f91104a);
            int i10 = a.f91210a[enumC14723b.ordinal()];
            if (i10 == 1) {
                bVarF.a(str, new Object[0]);
                return;
            }
            if (i10 == 2) {
                bVarF.k(str, new Object[0]);
            } else if (i10 == 3) {
                bVarF.s(str, new Object[0]);
            } else {
                if (i10 != 4) {
                    return;
                }
                bVarF.d(str, new Object[0]);
            }
        }

        c(String str, boolean z10) {
            super(str);
            if (z10) {
                f91212b.getAndSet(true);
            }
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91210a;

        static {
            int[] iArr = new int[EnumC14723b.values().length];
            f91210a = iArr;
            try {
                iArr[EnumC14723b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91210a[EnumC14723b.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91210a[EnumC14723b.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91210a[EnumC14723b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static InterfaceC14722a a() {
        return new b(true);
    }
}
