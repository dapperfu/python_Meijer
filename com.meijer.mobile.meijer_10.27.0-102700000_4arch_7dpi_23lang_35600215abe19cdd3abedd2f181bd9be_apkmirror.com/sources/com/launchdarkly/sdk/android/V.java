package com.launchdarkly.sdk.android;

import android.util.Log;
import com.fullstory.FS;
import ih.AbstractC14729h;
import ih.EnumC14723b;
import ih.InterfaceC14722a;

/* loaded from: classes7.dex */
public abstract class V {

    static final class b implements InterfaceC14722a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f91102a;

        private final class a extends c {
            public a(String str) {
                super(str);
            }

            private int g(EnumC14723b enumC14723b) {
                int i10 = a.f91101a[enumC14723b.ordinal()];
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

            @Override // ih.InterfaceC14722a.InterfaceC2175a
            public boolean d(EnumC14723b enumC14723b) {
                return b.this.f91102a || Log.isLoggable(this.f91104a, g(enumC14723b));
            }

            @Override // com.launchdarkly.sdk.android.V.c
            protected void f(EnumC14723b enumC14723b, String str) {
                int i10 = a.f91101a[enumC14723b.ordinal()];
                if (i10 == 1) {
                    FS.log_d(this.f91104a, str);
                    return;
                }
                if (i10 == 2) {
                    FS.log_i(this.f91104a, str);
                } else if (i10 == 3) {
                    FS.log_w(this.f91104a, str);
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    FS.log_e(this.f91104a, str);
                }
            }
        }

        @Override // ih.InterfaceC14722a
        public InterfaceC14722a.InterfaceC2175a a(String str) {
            return new a(str);
        }

        b(boolean z10) {
            this.f91102a = z10;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91101a;

        static {
            int[] iArr = new int[EnumC14723b.values().length];
            f91101a = iArr;
            try {
                iArr[EnumC14723b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91101a[EnumC14723b.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91101a[EnumC14723b.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91101a[EnumC14723b.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static abstract class c implements InterfaceC14722a.InterfaceC2175a {

        /* renamed from: a, reason: collision with root package name */
        protected final String f91104a;

        protected abstract void f(EnumC14723b enumC14723b, String str);

        public c(String str) {
            this.f91104a = str;
        }

        @Override // ih.InterfaceC14722a.InterfaceC2175a
        public void a(EnumC14723b enumC14723b, String str, Object obj, Object obj2) {
            if (d(enumC14723b)) {
                f(enumC14723b, AbstractC14729h.b(str, obj, obj2));
            }
        }

        @Override // ih.InterfaceC14722a.InterfaceC2175a
        public void b(EnumC14723b enumC14723b, String str, Object... objArr) {
            if (d(enumC14723b)) {
                f(enumC14723b, AbstractC14729h.c(str, objArr));
            }
        }

        @Override // ih.InterfaceC14722a.InterfaceC2175a
        public void c(EnumC14723b enumC14723b, String str, Object obj) {
            if (d(enumC14723b)) {
                f(enumC14723b, AbstractC14729h.a(str, obj));
            }
        }

        @Override // ih.InterfaceC14722a.InterfaceC2175a
        public void e(EnumC14723b enumC14723b, Object obj) {
            String string;
            if (d(enumC14723b)) {
                if (obj == null) {
                    string = null;
                } else {
                    string = obj.toString();
                }
                f(enumC14723b, string);
            }
        }
    }

    public static InterfaceC14722a a() {
        return new b(false);
    }
}
