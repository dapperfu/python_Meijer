package com.launchdarkly.sdk.android;

import android.util.Log;
import com.fullstory.FS;
import jh.AbstractC15039h;
import jh.EnumC15033b;
import jh.InterfaceC15032a;

/* loaded from: classes8.dex */
public abstract class V {

    static final class b implements InterfaceC15032a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f91941a;

        private final class a extends c {
            public a(String str) {
                super(str);
            }

            private int g(EnumC15033b enumC15033b) {
                int i10 = a.f91940a[enumC15033b.ordinal()];
                if (i10 == 1) {
                    return 3;
                }
                if (i10 == 2) {
                    return 4;
                }
                if (i10 != 3) {
                    return i10 != 4 ? 2 : 6;
                }
                return 5;
            }

            @Override // jh.InterfaceC15032a.InterfaceC2226a
            public boolean a(EnumC15033b enumC15033b) {
                return b.this.f91941a || Log.isLoggable(this.f91943a, g(enumC15033b));
            }

            @Override // com.launchdarkly.sdk.android.V.c
            protected void f(EnumC15033b enumC15033b, String str) {
                int i10 = a.f91940a[enumC15033b.ordinal()];
                if (i10 == 1) {
                    FS.log_d(this.f91943a, str);
                    return;
                }
                if (i10 == 2) {
                    FS.log_i(this.f91943a, str);
                } else if (i10 == 3) {
                    FS.log_w(this.f91943a, str);
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    FS.log_e(this.f91943a, str);
                }
            }
        }

        @Override // jh.InterfaceC15032a
        public InterfaceC15032a.InterfaceC2226a a(String str) {
            return new a(str);
        }

        b(boolean z10) {
            this.f91941a = z10;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91940a;

        static {
            int[] iArr = new int[EnumC15033b.values().length];
            f91940a = iArr;
            try {
                iArr[EnumC15033b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91940a[EnumC15033b.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91940a[EnumC15033b.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91940a[EnumC15033b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static abstract class c implements InterfaceC15032a.InterfaceC2226a {

        /* renamed from: a, reason: collision with root package name */
        protected final String f91943a;

        protected abstract void f(EnumC15033b enumC15033b, String str);

        public c(String str) {
            this.f91943a = str;
        }

        @Override // jh.InterfaceC15032a.InterfaceC2226a
        public void b(EnumC15033b enumC15033b, String str, Object obj) {
            if (a(enumC15033b)) {
                f(enumC15033b, AbstractC15039h.a(str, obj));
            }
        }

        @Override // jh.InterfaceC15032a.InterfaceC2226a
        public void c(EnumC15033b enumC15033b, String str, Object... objArr) {
            if (a(enumC15033b)) {
                f(enumC15033b, AbstractC15039h.c(str, objArr));
            }
        }

        @Override // jh.InterfaceC15032a.InterfaceC2226a
        public void d(EnumC15033b enumC15033b, String str, Object obj, Object obj2) {
            if (a(enumC15033b)) {
                f(enumC15033b, AbstractC15039h.b(str, obj, obj2));
            }
        }

        @Override // jh.InterfaceC15032a.InterfaceC2226a
        public void e(EnumC15033b enumC15033b, Object obj) {
            String string;
            if (a(enumC15033b)) {
                if (obj == null) {
                    string = null;
                } else {
                    string = obj.toString();
                }
                f(enumC15033b, string);
            }
        }
    }

    public static InterfaceC15032a a() {
        return new b(false);
    }
}
