package n1;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f150964a;

    /* renamed from: b, reason: collision with root package name */
    private final View f150965b;

    private static class a {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        static void c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static void d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    public static d g(ContentCaptureSession contentCaptureSession, View view) {
        return new d(contentCaptureSession, view);
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionA = c.a(this.f150964a);
            b bVarA = e.a(this.f150965b);
            Objects.requireNonNull(bVarA);
            a.f(contentCaptureSessionA, bVarA.a(), new long[]{Long.MIN_VALUE});
        }
    }

    public AutofillId b(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionA = c.a(this.f150964a);
        b bVarA = e.a(this.f150965b);
        Objects.requireNonNull(bVarA);
        return a.a(contentCaptureSessionA, bVarA.a(), j10);
    }

    public f c(AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f.i(a.b(c.a(this.f150964a), autofillId, j10));
        }
        return null;
    }

    public void d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.c(c.a(this.f150964a), viewStructure);
        }
    }

    public void e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(c.a(this.f150964a), autofillId);
        }
    }

    public void f(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.e(c.a(this.f150964a), autofillId, charSequence);
        }
    }

    private d(ContentCaptureSession contentCaptureSession, View view) {
        this.f150964a = contentCaptureSession;
        this.f150965b = view;
    }
}
