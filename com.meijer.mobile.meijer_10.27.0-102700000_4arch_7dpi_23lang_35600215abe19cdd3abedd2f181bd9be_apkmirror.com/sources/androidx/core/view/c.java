package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f53918a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f53919b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f53920c;

    /* renamed from: d, reason: collision with root package name */
    private static Field f53921d;

    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    public static boolean e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.superDispatchKeyEvent(keyEvent) : callback instanceof Activity ? b((Activity) callback, keyEvent) : callback instanceof Dialog ? c((Dialog) callback, keyEvent) : (view != null && ViewCompat.i(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent);
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!f53918a) {
            try {
                f53919b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f53918a = true;
        }
        Method method = f53919b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static DialogInterface.OnKeyListener f(Dialog dialog) throws NoSuchFieldException, SecurityException {
        if (!f53920c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f53921d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f53920c = true;
        }
        Field field = f53921d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }

    private static boolean b(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.i(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            keyDispatcherState = decorView.getKeyDispatcherState();
        } else {
            keyDispatcherState = null;
        }
        return keyEvent.dispatch(activity, keyDispatcherState, activity);
    }

    private static boolean c(Dialog dialog, KeyEvent keyEvent) throws NoSuchFieldException, SecurityException {
        KeyEvent.DispatcherState keyDispatcherState;
        DialogInterface.OnKeyListener onKeyListenerF = f(dialog);
        if (onKeyListenerF != null && onKeyListenerF.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ViewCompat.i(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            keyDispatcherState = decorView.getKeyDispatcherState();
        } else {
            keyDispatcherState = null;
        }
        return keyEvent.dispatch(dialog, keyDispatcherState, dialog);
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        return ViewCompat.j(view, keyEvent);
    }
}
