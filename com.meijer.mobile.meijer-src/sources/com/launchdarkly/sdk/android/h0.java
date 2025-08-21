package com.launchdarkly.sdk.android;

import com.launchdarkly.sdk.android.V;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.EnumC15033b;
import jh.InterfaceC15032a;
import qw.a;

/* loaded from: classes8.dex */
public abstract class h0 {

    public static final class b implements InterfaceC15032a, InterfaceC15032a.b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f92050a;

        @Override // jh.InterfaceC15032a
        public InterfaceC15032a.InterfaceC2226a a(String str) {
            return new c(str, this.f92050a);
        }

        b(boolean z10) {
            this.f92050a = z10;
        }
    }

    private static final class c extends V.c {

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicBoolean f92051b = new AtomicBoolean(false);

        @Override // jh.InterfaceC15032a.InterfaceC2226a
        public boolean a(EnumC15033b enumC15033b) {
            return true;
        }

        @Override // com.launchdarkly.sdk.android.V.c
        protected void f(EnumC15033b enumC15033b, String str) {
            a.b bVarF = qw.a.f(this.f91943a);
            int i10 = a.f92049a[enumC15033b.ordinal()];
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
                f92051b.getAndSet(true);
            }
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92049a;

        static {
            int[] iArr = new int[EnumC15033b.values().length];
            f92049a = iArr;
            try {
                iArr[EnumC15033b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92049a[EnumC15033b.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92049a[EnumC15033b.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92049a[EnumC15033b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static InterfaceC15032a a() {
        return new b(true);
    }
}
