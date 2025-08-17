package m1;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001B}\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001c\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\"\u0010#R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b,\u0010&\"\u0004\b-\u0010.R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010.R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010$\u001a\u0004\b1\u0010&\"\u0004\b2\u0010.R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010.R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010$\u001a\u0004\b5\u0010&\"\u0004\b6\u0010.¨\u00067"}, d2 = {"Lm1/c;", "", "Lkotlin/Function0;", "", "onActionModeDestroy", "Landroidx/compose/ui/geometry/Rect;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/Menu;", "menu", "Lm1/b;", "item", "callback", "b", "(Landroid/view/Menu;Lm1/b;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ActionMode;", "mode", "", "e", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "g", "Landroid/view/MenuItem;", "d", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "f", "()V", "n", "(Landroid/view/Menu;)V", "a", "(Landroid/view/Menu;Lm1/b;)V", "Lkotlin/jvm/functions/Function0;", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/geometry/Rect;", "c", "()Landroidx/compose/ui/geometry/Rect;", "m", "(Landroidx/compose/ui/geometry/Rect;)V", "getOnCopyRequested", "i", "(Lkotlin/jvm/functions/Function0;)V", "getOnPasteRequested", "k", "getOnCutRequested", "j", "getOnSelectAllRequested", "l", "getOnAutofillRequested", "h", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15543c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onActionModeDestroy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Rect rect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onCopyRequested;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onPasteRequested;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onCutRequested;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onSelectAllRequested;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onAutofillRequested;

    public C15543c(Function0<Unit> function0, Rect rect, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06) {
        this.onActionModeDestroy = function0;
        this.rect = rect;
        this.onCopyRequested = function02;
        this.onPasteRequested = function03;
        this.onCutRequested = function04;
        this.onSelectAllRequested = function05;
        this.onAutofillRequested = function06;
    }

    private final void b(Menu menu, EnumC15542b item, Function0<Unit> callback) {
        if (callback != null && menu.findItem(item.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) == null) {
            a(menu, item);
        } else {
            if (callback != null || menu.findItem(item.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) == null) {
                return;
            }
            menu.removeItem(item.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        }
    }

    /* renamed from: c, reason: from getter */
    public final Rect getRect() {
        return this.rect;
    }

    public final boolean e(ActionMode mode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (mode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.onCopyRequested != null) {
            a(menu, EnumC15542b.f149743c);
        }
        if (this.onPasteRequested != null) {
            a(menu, EnumC15542b.f149744d);
        }
        if (this.onCutRequested != null) {
            a(menu, EnumC15542b.f149745e);
        }
        if (this.onSelectAllRequested != null) {
            a(menu, EnumC15542b.f149746f);
        }
        if (this.onAutofillRequested == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        a(menu, EnumC15542b.f149747g);
        return true;
    }

    public final void f() {
        Function0<Unit> function0 = this.onActionModeDestroy;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean g(ActionMode mode, Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        n(menu);
        return true;
    }

    public final void h(Function0<Unit> function0) {
        this.onAutofillRequested = function0;
    }

    public final void i(Function0<Unit> function0) {
        this.onCopyRequested = function0;
    }

    public final void j(Function0<Unit> function0) {
        this.onCutRequested = function0;
    }

    public final void k(Function0<Unit> function0) {
        this.onPasteRequested = function0;
    }

    public final void l(Function0<Unit> function0) {
        this.onSelectAllRequested = function0;
    }

    public final void m(Rect rect) {
        this.rect = rect;
    }

    public final void n(Menu menu) {
        b(menu, EnumC15542b.f149743c, this.onCopyRequested);
        b(menu, EnumC15542b.f149744d, this.onPasteRequested);
        b(menu, EnumC15542b.f149745e, this.onCutRequested);
        b(menu, EnumC15542b.f149746f, this.onSelectAllRequested);
        b(menu, EnumC15542b.f149747g, this.onAutofillRequested);
    }

    public final void a(Menu menu, EnumC15542b item) {
        menu.add(0, item.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), item.getOrder(), item.l()).setShowAsAction(1);
    }

    public final boolean d(ActionMode mode, MenuItem item) {
        Intrinsics.g(item);
        int itemId = item.getItemId();
        if (itemId == EnumC15542b.f149743c.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) {
            Function0<Unit> function0 = this.onCopyRequested;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == EnumC15542b.f149744d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) {
            Function0<Unit> function02 = this.onPasteRequested;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == EnumC15542b.f149745e.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) {
            Function0<Unit> function03 = this.onCutRequested;
            if (function03 != null) {
                function03.invoke();
            }
        } else if (itemId == EnumC15542b.f149746f.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) {
            Function0<Unit> function04 = this.onSelectAllRequested;
            if (function04 != null) {
                function04.invoke();
            }
        } else if (itemId == EnumC15542b.f149747g.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) {
            Function0<Unit> function05 = this.onAutofillRequested;
            if (function05 != null) {
                function05.invoke();
            }
        } else {
            return false;
        }
        if (mode != null) {
            mode.finish();
            return true;
        }
        return true;
    }

    public /* synthetic */ C15543c(Function0 function0, Rect rect, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function0, (i10 & 2) != 0 ? Rect.INSTANCE.a() : rect, (i10 & 4) != 0 ? null : function02, (i10 & 8) != 0 ? null : function03, (i10 & 16) != 0 ? null : function04, (i10 & 32) != 0 ? null : function05, (i10 & 64) != 0 ? null : function06);
    }
}
