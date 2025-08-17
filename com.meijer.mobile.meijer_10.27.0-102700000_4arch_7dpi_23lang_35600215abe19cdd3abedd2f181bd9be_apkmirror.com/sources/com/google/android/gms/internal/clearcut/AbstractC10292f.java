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
public abstract class AbstractC10292f<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f81416h = new Object();

    /* renamed from: i, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f81417i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f81418j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile Boolean f81419k;

    /* renamed from: l, reason: collision with root package name */
    private static volatile Boolean f81420l;

    /* renamed from: a, reason: collision with root package name */
    private final C10322p f81421a;

    /* renamed from: b, reason: collision with root package name */
    final String f81422b;

    /* renamed from: c, reason: collision with root package name */
    private final String f81423c;

    /* renamed from: d, reason: collision with root package name */
    private final T f81424d;

    /* renamed from: e, reason: collision with root package name */
    private T f81425e;

    /* renamed from: f, reason: collision with root package name */
    private volatile C10283c f81426f;

    /* renamed from: g, reason: collision with root package name */
    private volatile SharedPreferences f81427g;

    private AbstractC10292f(C10322p c10322p, String str, T t10) {
        this.f81425e = null;
        this.f81426f = null;
        this.f81427g = null;
        if (c10322p.f81533a == null && c10322p.f81534b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (c10322p.f81533a != null && c10322p.f81534b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f81421a = c10322p;
        String strValueOf = String.valueOf(c10322p.f81535c);
        String strValueOf2 = String.valueOf(str);
        this.f81423c = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
        String strValueOf3 = String.valueOf(c10322p.f81536d);
        String strValueOf4 = String.valueOf(str);
        this.f81422b = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
        this.f81424d = t10;
    }

    public static void b(Context context) {
        Context applicationContext;
        if (f81417i == null) {
            synchronized (f81416h) {
                try {
                    if (!context.isDeviceProtectedStorage() && (applicationContext = context.getApplicationContext()) != null) {
                        context = applicationContext;
                    }
                    if (f81417i != context) {
                        f81419k = null;
                    }
                    f81417i = context;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f81418j = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> AbstractC10292f<T> c(C10322p c10322p, String str, T t10, InterfaceC10319o<T> interfaceC10319o) {
        return new C10313m(c10322p, str, t10, interfaceC10319o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC10292f<String> d(C10322p c10322p, String str, String str2) {
        return new C10310l(c10322p, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC10292f<Boolean> e(C10322p c10322p, String str, boolean z10) {
        return new C10307k(c10322p, str, Boolean.valueOf(z10));
    }

    private static <V> V g(InterfaceC10316n<V> interfaceC10316n) {
        try {
            return interfaceC10316n.zzp();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC10316n.zzp();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    static boolean h(final String str, boolean z10) {
        final boolean z11 = false;
        if (p()) {
            return ((Boolean) g(new InterfaceC10316n(str, z11) { // from class: com.google.android.gms.internal.clearcut.i

                /* renamed from: a, reason: collision with root package name */
                private final String f81475a;

                /* renamed from: b, reason: collision with root package name */
                private final boolean f81476b = false;

                {
                    this.f81475a = str;
                }

                @Override // com.google.android.gms.internal.clearcut.InterfaceC10316n
                public final Object zzp() {
                    return Boolean.valueOf(v2.h(AbstractC10292f.f81417i.getContentResolver(), this.f81475a, this.f81476b));
                }
            })).booleanValue();
        }
        return false;
    }

    @TargetApi(24)
    private final T n() {
        boolean zBooleanValue;
        if (h("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String strValueOf = String.valueOf(this.f81422b);
            FS.log_w("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new String("Bypass reading Phenotype values for flag: "));
        } else if (this.f81421a.f81534b != null) {
            if (this.f81426f == null) {
                this.f81426f = C10283c.a(f81417i.getContentResolver(), this.f81421a.f81534b);
            }
            final C10283c c10283c = this.f81426f;
            String str = (String) g(new InterfaceC10316n(this, c10283c) { // from class: com.google.android.gms.internal.clearcut.g

                /* renamed from: a, reason: collision with root package name */
                private final AbstractC10292f f81456a;

                /* renamed from: b, reason: collision with root package name */
                private final C10283c f81457b;

                {
                    this.f81456a = this;
                    this.f81457b = c10283c;
                }

                @Override // com.google.android.gms.internal.clearcut.InterfaceC10316n
                public final Object zzp() {
                    return this.f81457b.c().get(this.f81456a.f81422b);
                }
            });
            if (str != null) {
                return m(str);
            }
        } else if (this.f81421a.f81533a != null) {
            if (f81417i.isDeviceProtectedStorage()) {
                zBooleanValue = true;
            } else {
                if (f81420l == null || !f81420l.booleanValue()) {
                    f81420l = Boolean.valueOf(((UserManager) f81417i.getSystemService(UserManager.class)).isUserUnlocked());
                }
                zBooleanValue = f81420l.booleanValue();
            }
            if (!zBooleanValue) {
                return null;
            }
            if (this.f81427g == null) {
                this.f81427g = f81417i.getSharedPreferences(this.f81421a.f81533a, 0);
            }
            SharedPreferences sharedPreferences = this.f81427g;
            if (sharedPreferences.contains(this.f81422b)) {
                return f(sharedPreferences);
            }
        }
        return null;
    }

    private final T o() {
        String str;
        if (this.f81421a.f81537e || !p() || (str = (String) g(new InterfaceC10316n(this) { // from class: com.google.android.gms.internal.clearcut.h

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC10292f f81466a;

            {
                this.f81466a = this;
            }

            @Override // com.google.android.gms.internal.clearcut.InterfaceC10316n
            public final Object zzp() {
                return this.f81466a.q();
            }
        })) == null) {
            return null;
        }
        return m(str);
    }

    private static boolean p() {
        if (f81419k == null) {
            Context context = f81417i;
            if (context == null) {
                return false;
            }
            f81419k = Boolean.valueOf(Z1.e.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f81419k.booleanValue();
    }

    public final T a() {
        if (f81417i == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        if (this.f81421a.f81538f) {
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
        return this.f81424d;
    }

    protected abstract T f(SharedPreferences sharedPreferences);

    protected abstract T m(String str);

    final /* synthetic */ String q() {
        return v2.c(f81417i.getContentResolver(), this.f81423c, null);
    }

    /* synthetic */ AbstractC10292f(C10322p c10322p, String str, Object obj, C10304j c10304j) {
        this(c10322p, str, obj);
    }
}
