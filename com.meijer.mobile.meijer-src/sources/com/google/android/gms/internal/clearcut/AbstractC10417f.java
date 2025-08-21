package com.google.android.gms.internal.clearcut;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.UserManager;
import com.fullstory.FS;

/* renamed from: com.google.android.gms.internal.clearcut.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10417f<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f82256h = new Object();

    /* renamed from: i, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f82257i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f82258j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile Boolean f82259k;

    /* renamed from: l, reason: collision with root package name */
    private static volatile Boolean f82260l;

    /* renamed from: a, reason: collision with root package name */
    private final C10447p f82261a;

    /* renamed from: b, reason: collision with root package name */
    final String f82262b;

    /* renamed from: c, reason: collision with root package name */
    private final String f82263c;

    /* renamed from: d, reason: collision with root package name */
    private final T f82264d;

    /* renamed from: e, reason: collision with root package name */
    private T f82265e;

    /* renamed from: f, reason: collision with root package name */
    private volatile C10408c f82266f;

    /* renamed from: g, reason: collision with root package name */
    private volatile SharedPreferences f82267g;

    private AbstractC10417f(C10447p c10447p, String str, T t10) {
        this.f82265e = null;
        this.f82266f = null;
        this.f82267g = null;
        if (c10447p.f82373a == null && c10447p.f82374b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (c10447p.f82373a != null && c10447p.f82374b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f82261a = c10447p;
        String strValueOf = String.valueOf(c10447p.f82375c);
        String strValueOf2 = String.valueOf(str);
        this.f82263c = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        String strValueOf3 = String.valueOf(c10447p.f82376d);
        String strValueOf4 = String.valueOf(str);
        this.f82262b = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
        this.f82264d = t10;
    }

    public static void b(Context context) {
        Context applicationContext;
        if (f82257i == null) {
            synchronized (f82256h) {
                try {
                    if (!context.isDeviceProtectedStorage() && (applicationContext = context.getApplicationContext()) != null) {
                        context = applicationContext;
                    }
                    if (f82257i != context) {
                        f82259k = null;
                    }
                    f82257i = context;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f82258j = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> AbstractC10417f<T> c(C10447p c10447p, String str, T t10, InterfaceC10444o<T> interfaceC10444o) {
        return new C10438m(c10447p, str, t10, interfaceC10444o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC10417f<String> d(C10447p c10447p, String str, String str2) {
        return new C10435l(c10447p, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC10417f<Boolean> e(C10447p c10447p, String str, boolean z10) {
        return new C10432k(c10447p, str, Boolean.valueOf(z10));
    }

    private static <V> V g(InterfaceC10441n<V> interfaceC10441n) {
        try {
            return interfaceC10441n.zzp();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC10441n.zzp();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    static boolean h(final String str, boolean z10) {
        final boolean z11 = false;
        if (p()) {
            return ((Boolean) g(new InterfaceC10441n(str, z11) { // from class: com.google.android.gms.internal.clearcut.i

                /* renamed from: a, reason: collision with root package name */
                private final String f82315a;

                /* renamed from: b, reason: collision with root package name */
                private final boolean f82316b = false;

                {
                    this.f82315a = str;
                }

                @Override // com.google.android.gms.internal.clearcut.InterfaceC10441n
                public final Object zzp() {
                    return Boolean.valueOf(v2.h(AbstractC10417f.f82257i.getContentResolver(), this.f82315a, this.f82316b));
                }
            })).booleanValue();
        }
        return false;
    }

    @TargetApi(24)
    private final T n() {
        boolean zBooleanValue;
        if (h("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String strValueOf = String.valueOf(this.f82262b);
            FS.log_w("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else if (this.f82261a.f82374b != null) {
            if (this.f82266f == null) {
                this.f82266f = C10408c.a(f82257i.getContentResolver(), this.f82261a.f82374b);
            }
            final C10408c c10408c = this.f82266f;
            String str = (String) g(new InterfaceC10441n(this, c10408c) { // from class: com.google.android.gms.internal.clearcut.g

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC10417f f82296a;

                /* renamed from: b, reason: collision with root package name */
                private final C10408c f82297b;

                {
                    this.f82296a = this;
                    this.f82297b = c10408c;
                }

                @Override // com.google.android.gms.internal.clearcut.InterfaceC10441n
                public final Object zzp() {
                    return this.f82297b.c().get(this.f82296a.f82262b);
                }
            });
            if (str != null) {
                return m(str);
            }
        } else if (this.f82261a.f82373a != null) {
            if (f82257i.isDeviceProtectedStorage()) {
                zBooleanValue = true;
            } else {
                if (f82260l == null || !f82260l.booleanValue()) {
                    f82260l = Boolean.valueOf(((UserManager) f82257i.getSystemService(UserManager.class)).isUserUnlocked());
                }
                zBooleanValue = f82260l.booleanValue();
            }
            if (!zBooleanValue) {
                return null;
            }
            if (this.f82267g == null) {
                this.f82267g = f82257i.getSharedPreferences(this.f82261a.f82373a, 0);
            }
            SharedPreferences sharedPreferences = this.f82267g;
            if (sharedPreferences.contains(this.f82262b)) {
                return f(sharedPreferences);
            }
        }
        return null;
    }

    private final T o() {
        String str;
        if (this.f82261a.f82377e || !p() || (str = (String) g(new InterfaceC10441n(this) { // from class: com.google.android.gms.internal.clearcut.h

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC10417f f82306a;

            {
                this.f82306a = this;
            }

            @Override // com.google.android.gms.internal.clearcut.InterfaceC10441n
            public final Object zzp() {
                return this.f82306a.q();
            }
        })) == null) {
            return null;
        }
        return m(str);
    }

    private static boolean p() {
        if (f82259k == null) {
            Context context = f82257i;
            if (context == null) {
                return false;
            }
            f82259k = Boolean.valueOf(Z1.e.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f82259k.booleanValue();
    }

    public final T a() {
        if (f82257i == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        if (this.f82261a.f82378f) {
            T tO = o();
            if (tO != null) {
                return tO;
            }
            T tN = n();
            if (tN != null) {
                return tN;
            }
        } else {
            T tN2 = n();
            if (tN2 != null) {
                return tN2;
            }
            T tO2 = o();
            if (tO2 != null) {
                return tO2;
            }
        }
        return this.f82264d;
    }

    protected abstract T f(SharedPreferences sharedPreferences);

    protected abstract T m(String str);

    final /* synthetic */ String q() {
        return v2.c(f82257i.getContentResolver(), this.f82263c, null);
    }

    /* synthetic */ AbstractC10417f(C10447p c10447p, String str, Object obj, C10429j c10429j) {
        this(c10447p, str, obj);
    }
}
