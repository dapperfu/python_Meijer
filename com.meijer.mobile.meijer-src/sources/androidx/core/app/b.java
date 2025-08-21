package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.b;
import androidx.core.app.x;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b extends Z1.b {

    /* renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    static class C1105b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface e {
        void validateRequestPermissionsRequestCode(int i10);
    }

    static class f extends SharedElementCallback {

        /* renamed from: a, reason: collision with root package name */
        private final x f53888a;

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f53888a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f53888a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f53888a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f53888a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f53888a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f53888a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f53888a.h(list, list2, new x.a() { // from class: androidx.core.app.c
                @Override // androidx.core.app.x.a
                public final void onSharedElementsReady() {
                    b.C1105b.a(onSharedElementsReadyListener);
                }
            });
        }

        f(x xVar) {
            this.f53888a = xVar;
        }
    }

    static class a {
        static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    static class c {
        @SuppressLint({"BanUncheckedReflection"})
        static boolean a(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    static class d {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static void u(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.q(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(Activity activity, String[] strArr, int i10) {
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (TextUtils.isEmpty(strArr[i11])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i11));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < strArr.length; i13++) {
                if (!hashSet.contains(Integer.valueOf(i13))) {
                    strArr2[i12] = strArr[i13];
                    i12++;
                }
            }
        }
        if (activity instanceof e) {
            ((e) activity).validateRequestPermissionsRequestCode(i10);
        }
        C1105b.b(activity, strArr, i10);
    }

    public static void w(Activity activity, x xVar) {
        a.c(activity, xVar != null ? new f(xVar) : null);
    }

    public static void x(Activity activity, x xVar) {
        a.d(activity, xVar != null ? new f(xVar) : null);
    }

    public static boolean y(Activity activity, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i10 >= 32 ? d.a(activity, str) : i10 == 31 ? c.a(activity, str) : C1105b.c(activity, str);
        }
        return false;
    }

    public static void A(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public static void B(Activity activity) {
        a.e(activity);
    }

    public static /* synthetic */ void q(Activity activity) {
        if (!activity.isFinishing() && !androidx.core.app.e.i(activity)) {
            activity.recreate();
        }
    }

    public static void r(Activity activity) {
        activity.finishAffinity();
    }

    public static void s(Activity activity) {
        a.a(activity);
    }

    public static void t(Activity activity) {
        a.b(activity);
    }

    public static void z(Activity activity, Intent intent, int i10, Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }
}
