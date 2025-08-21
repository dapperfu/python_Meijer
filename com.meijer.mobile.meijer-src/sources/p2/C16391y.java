package p2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import com.fullstory.FS;
import f2.InterfaceMenuItemC13944b;

/* renamed from: p2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16391y {

    /* renamed from: p2.y$a */
    static class a {
        static MenuItem a(MenuItem menuItem, char c10, int i10) {
            return menuItem.setAlphabeticShortcut(c10, i10);
        }

        static MenuItem b(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static MenuItem c(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem d(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static MenuItem e(MenuItem menuItem, char c10, int i10) {
            return menuItem.setNumericShortcut(c10, i10);
        }

        static MenuItem f(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static MenuItem a(MenuItem menuItem, AbstractC16344a abstractC16344a) {
        if (menuItem instanceof InterfaceMenuItemC13944b) {
            return ((InterfaceMenuItemC13944b) menuItem).a(abstractC16344a);
        }
        FS.log_w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC13944b) {
            ((InterfaceMenuItemC13944b) menuItem).setAlphabeticShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.a(menuItem, c10, i10);
        }
    }

    public static void c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC13944b) {
            ((InterfaceMenuItemC13944b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.b(menuItem, charSequence);
        }
    }

    public static void d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC13944b) {
            ((InterfaceMenuItemC13944b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.c(menuItem, colorStateList);
        }
    }

    public static void e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC13944b) {
            ((InterfaceMenuItemC13944b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.d(menuItem, mode);
        }
    }

    public static void f(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof InterfaceMenuItemC13944b) {
            ((InterfaceMenuItemC13944b) menuItem).setNumericShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.e(menuItem, c10, i10);
        }
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC13944b) {
            ((InterfaceMenuItemC13944b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.f(menuItem, charSequence);
        }
    }
}
