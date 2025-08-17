package com.medallia.digital.mobilesdk;

import android.content.DialogInterface;
import androidx.appcompat.app.c;
import com.medallia.digital.mobilesdk.d7;

/* loaded from: classes7.dex */
class v7 {

    /* renamed from: a, reason: collision with root package name */
    private static v7 f93178a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f93179a;

        static {
            int[] iArr = new int[MDAppearanceMode.values().length];
            f93179a = iArr;
            try {
                iArr[MDAppearanceMode.dark.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93179a[MDAppearanceMode.light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected v7() {
    }

    public static v7 c() {
        if (f93178a == null) {
            f93178a = new v7();
        }
        return f93178a;
    }

    protected int a(MDAppearanceMode mDAppearanceMode, MDAppearanceMode mDAppearanceMode2) {
        if (mDAppearanceMode != null && mDAppearanceMode != MDAppearanceMode.unknown) {
            int i10 = a.f93179a[mDAppearanceMode.ordinal()];
            if (i10 == 1) {
                return R.style.MedalliaInvitationDarkDialog;
            }
            if (i10 == 2) {
                return R.style.MedalliaInvitationLightDialog;
            }
        } else if (mDAppearanceMode2 != null) {
            int i11 = a.f93179a[mDAppearanceMode2.ordinal()];
            if (i11 == 1) {
                return R.style.MedalliaInvitationDarkDialog;
            }
            if (i11 == 2) {
                return R.style.MedalliaInvitationLightDialog;
            }
        }
        return R.style.MedalliaInvitationLightDialog;
    }

    protected MDAppearanceMode b() {
        String strA = d7.b().a(d7.a.CUSTOM_APPEARANCE, (String) null);
        if (strA != null) {
            try {
                if (!strA.isEmpty()) {
                    int i10 = a.f93179a[MDAppearanceMode.fromString(strA).ordinal()];
                    if (i10 == 1) {
                        return MDAppearanceMode.dark;
                    }
                    if (i10 == 2) {
                        return MDAppearanceMode.light;
                    }
                }
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
        return MDAppearanceMode.unknown;
    }

    protected MDAppearanceMode d() {
        int i10 = i4.c().b().getResources().getConfiguration().uiMode & 48;
        if (i10 == 16) {
            a4.b("OS Appearance is: Light");
            return MDAppearanceMode.light;
        }
        if (i10 != 32) {
            return MDAppearanceMode.light;
        }
        a4.b("OS Appearance is: Dark");
        return MDAppearanceMode.dark;
    }

    protected void e() {
        int i10 = i4.c().b().getResources().getConfiguration().uiMode & 48;
        if (i10 == 16) {
            a4.b("OS Appearance is: Light");
            d7.b().b(d7.a.OS_APPEARANCE, MDAppearanceMode.light.toString());
        } else if (i10 != 32) {
            return;
        }
        a4.b("OS Appearance is: Dark");
        d7.b().b(d7.a.OS_APPEARANCE, MDAppearanceMode.dark.toString());
    }

    protected c.a a(boolean z10, String str, String str2, String str3, String str4, String str5, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener, boolean z11, MDAppearanceMode mDAppearanceMode) {
        int iA = R.style.MedalliaInvitationLightDialog;
        if (z11 && mDAppearanceMode != null) {
            iA = a(mDAppearanceMode, null);
        } else if (z10) {
            iA = a(b(), d());
        }
        return new z(i4.c().d(), iA, str, str2, str3, str4, str5, onClickListener, onClickListener2, onClickListener3, onCancelListener);
    }

    protected t7 b(String str) {
        if (t0.c().a().getPropertyConfiguration() == null || t0.c().a().getPropertyConfiguration().getThemes() == null) {
            return null;
        }
        return t0.c().a().getPropertyConfiguration().getThemes().get(str);
    }

    protected MDAppearanceMode a() {
        try {
            return (b() == MDAppearanceMode.unknown || b() == d()) ? d() : b();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return MDAppearanceMode.light;
        }
    }

    protected void b(MDAppearanceMode mDAppearanceMode) {
        if (mDAppearanceMode == null) {
            d7.b().b(d7.a.CUSTOM_APPEARANCE, MDAppearanceMode.unknown.toString());
        } else {
            d7.b().b(d7.a.CUSTOM_APPEARANCE, mDAppearanceMode.toString());
        }
    }

    protected v5 a(String str) {
        w5 w5VarA;
        try {
            t7 t7VarB = b(str);
            if (t7VarB == null) {
                return null;
            }
            int i10 = a.f93179a[a().ordinal()];
            if (i10 == 1) {
                w5VarA = t7VarB.a().a();
            } else {
                if (i10 != 2) {
                    return null;
                }
                w5VarA = t7VarB.a().b();
            }
            return w5VarA.a();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }

    protected boolean a(MDAppearanceMode mDAppearanceMode) {
        MDAppearanceMode mDAppearanceModeB = b();
        if (mDAppearanceMode == null || mDAppearanceModeB == null) {
            return false;
        }
        return !mDAppearanceMode.toString().equals(mDAppearanceModeB.toString());
    }
}
