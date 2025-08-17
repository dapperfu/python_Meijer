package n1;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes.dex */
public class e {

    static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    private static class b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    private static class c {
        static void a(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }
    }

    public static n1.b a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return n1.b.b(a.a(view));
        }
        return null;
    }

    public static d b(View view) {
        ContentCaptureSession contentCaptureSessionA;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionA = b.a(view)) == null) {
            return null;
        }
        return d.g(contentCaptureSessionA, view);
    }

    public static void c(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i10);
        }
    }
}
